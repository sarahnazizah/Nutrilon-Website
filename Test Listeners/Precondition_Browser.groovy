import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class Precondition_Browser {

	@BeforeTestCase
	def setup(TestCaseContext testCaseContext) {
		WebUI.comment("🚀 Mulai precondition untuk: ${testCaseContext.getTestCaseId()}")

		// Step 1–3: Buka dan load page
		WebUI.openBrowser(GlobalVariable.URL)
		WebUI.maximizeWindow()
		WebUI.waitForPageLoad(15)

		// Step 4: Cek apakah halaman berhasil di-load
		if (isPageLoaded()) {
			WebUI.comment('✅ Page loaded dengan benar (tidak 403/404/504)')

			// Step 5: Handle cookie popup
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Popup Cookie/button_Aktifkan Semua Cookie'), 3)) {
				WebUI.click(findTestObject('Object Repository/Popup Cookie/button_Aktifkan Semua Cookie'))
				WebUI.comment('🍪 Cookie popup diklik')
			} else {
				WebUI.comment('🍪 Cookie popup tidak ditemukan, lanjut...')
			}
		} else {
			WebUI.comment('❌ Halaman error (403/404/504)')
			WebUI.takeScreenshot("Screenshots/ErrorPage_${System.currentTimeMillis()}.png")
			KeywordUtil.markWarning("⚠️ Halaman error — akan dilanjutkan ke test berikutnya.")
		}
	}

	/**
	 * Fungsi untuk cek apakah halaman bukan error page (403/404/504)
	 */
	boolean isPageLoaded() {
		boolean not403 = !WebUI.verifyTextPresent('403', false, FailureHandling.OPTIONAL)
		boolean not404 = !WebUI.verifyTextPresent('404', false, FailureHandling.OPTIONAL)
		boolean not504 = !WebUI.verifyTextPresent('504', false, FailureHandling.OPTIONAL)
		return not403 && not404 && not504
	}
}
