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

WebUI.navigateToUrl('https://www.nutriclub.co.id/artikel/perkembangan-otak/menyusui/makanan-ibu-menyusui-bayi-cerdas-gemuk')

WebUI.waitForElementVisible(findTestObject('Artikel Template/Banner Section'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Banner Section'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Breadcrumb Section'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Breadcrumb Section'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Button Imunitas'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Button Imunitas'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Title Artikel Div'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Title Artikel Div'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/EEAT Section'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/EEAT Section'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/button_Pembahasan dalam artikel'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/button_Pembahasan dalam artikel'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Artikel Content Section'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Artikel Content Section'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Section Text Pilih Artikel Sesuai Kebutuhan Mama'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Section Text Pilih Artikel Sesuai Kebutuhan Mama'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Section Button Tag'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Section Button Tag'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Section Button Topic'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Section Button Topic'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Section Temukan Topic'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Section Temukan Topic'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Section Temukan Topic dalam container'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Section Temukan Topic dalam container'))

WebUI.waitForElementVisible(findTestObject('Artikel Template/Section Artikel Terkait'), 2)

WebUI.verifyElementVisible(findTestObject('Artikel Template/Section Artikel Terkait'))

