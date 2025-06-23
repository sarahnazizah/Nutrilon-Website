import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.WebElement as WebElement
import java.util.*
import com.kms.katalon.core.testdata.TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData


TestData testData = findTestData('Article Url')
int totalRows = testData.getRowNumbers()

WebUI.comment("🟢 Memulai validasi struktur untuk ${totalRows} halaman")

List<Map<String, String>> resultList = []

for (int row = 1; row <= totalRows; row++) {
    String url = testData.getValue('loc', row)
    WebUI.comment("➡️ (${row}/${totalRows}) Navigasi ke URL: ${url}")
    Map<String, String> resultRow = ['url': url]

    try {
        WebUI.navigateToUrl(url)
        WebUI.waitForPageLoad(15)

        List<String> expectedSections = [
            'Banner Section',
            'Breadcrumb Section',
            'Button Imunitas',
            'Title Artikel Div',
            'EEAT Section',
            'button_Pembahasan dalam artikel',
            'Artikel Content Section',
            'Section Text Pilih Artikel Sesuai Kebutuhan Mama',
            'Section Button Tag',
            'Section Button Topic',
            'Section Temukan Topic',
            'Section Temukan Topic dalam container',
            'Section Artikel Terkait'
        ]

        verifyPageSectionsOrderAndVisibility(expectedSections)
        WebUI.comment("✅ Struktur halaman valid")
        resultRow['status'] = 'Passed'
    } catch (AssertionError ae) {
        WebUI.comment("❌ Struktur halaman TIDAK VALID: ${ae.message}")
        resultRow['status'] = 'Failed'
    } catch (Exception e) {
        WebUI.comment("❌ ERROR saat load page: ${e.message}")
        resultRow['status'] = 'Error'
    }

    resultList.add(resultRow)
}

WebUI.comment("🧾 Testing selesai. ${resultList.size()} halaman sudah diverifikasi.")
// 👉 Di step berikutnya kita akan export resultList ke Google Spreadsheet

// ===== FUNGSI TAMBAHAN =====

TestObject getTestObjectForSection(String sectionName) {
    String objectPath = 'Object Repository/Artikel Template/' + sectionName
    return findTestObject(objectPath)
}

void verifyPageSectionsOrderAndVisibility(List<String> sectionNames) {
    Map<String, WebElement> sectionElements = new LinkedHashMap<>()

    for (String sectionName : sectionNames) {
        TestObject to = getTestObjectForSection(sectionName)
        WebUI.waitForElementVisible(to, 5)
        WebUI.verifyElementVisible(to)
        sectionElements.put(sectionName, WebUiCommonHelper.findWebElement(to, 10))
    }

    for (int i = 0; i < sectionNames.size() - 1; i++) {
        String current = sectionNames[i]
        String next = sectionNames[i + 1]
        int y1 = sectionElements.get(current).getLocation().getY()
        int y2 = sectionElements.get(next).getLocation().getY()
        assert y1 < y2 : "${current} harus di atas ${next}, tapi urutannya salah"
    }
}
