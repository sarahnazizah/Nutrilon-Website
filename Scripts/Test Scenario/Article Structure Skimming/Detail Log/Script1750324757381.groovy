import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.common.WebUiCommonHelper as Helper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.util.KeywordUtil
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.common.WebUiCommonHelper as Helper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.awt.image.BufferedImage as BufferedImage
import javax.imageio.ImageIO as ImageIO
import java.awt.Color as Color

// ---------- ①  Navigasi ----------
WebUI.comment("🔗Periksa: " + url)
WebUI.setViewPortSize(1080, 1024)
WebUI.navigateToUrl(url)
WebUI.waitForPageLoad(15)

// ---------- ②  Deteksi error page ----------
boolean is403 = WebUI.verifyTextPresent('403', false, FailureHandling.OPTIONAL)
boolean is404 = WebUI.verifyTextPresent('404', false, FailureHandling.OPTIONAL)
boolean is504 = WebUI.verifyTextPresent('504', false, FailureHandling.OPTIONAL)

boolean isError = is403 || is404 || is504

if (isError) {
	WebUI.takeScreenshot("Screenshots/Error_${System.currentTimeMillis()}.png")
	KeywordUtil.markWarning("⚠️ Halaman error (403 / 404 / 504) ditemukan pada: $url")
} else {
	// ---------- ③  Screenshot visual checkpoint (opsional)
	WebUI.takeFullPageScreenshotAsCheckpoint('Desktop - Article Page (1)')

	// ---------- ④  Verifikasi struktur section ----------
	List<String> sections = [
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

	Map<String, WebElement> elMap = [:]

	for (String s : sections) {
		TestObject to = findTestObject("Object Repository/Artikel Template/${s}")
		WebUI.waitForElementVisible(to, 5)
		WebUI.verifyElementVisible(to)
		elMap[s] = Helper.findWebElement(to, 10)
	}

//	for (int i = 0; i < sections.size() - 1; i++) {
//		int y1 = elMap[sections[i]].location.y
//		int y2 = elMap[sections[i + 1]].location.y
//		assert y1 < y2 : "${sections[i]} harus di atas ${sections[i + 1]}, tapi urutannya salah!"
//	}

	WebUI.comment('✅ Struktur halaman valid')
}
