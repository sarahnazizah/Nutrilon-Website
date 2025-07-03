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

WebUI.waitForElementVisible(findTestObject('Login OTP Page/Button REGISTER'), 2)

WebUI.verifyElementText(findTestObject('Login OTP Page/Text Mama,'), 'Mama,')

WebUI.verifyElementText(findTestObject('Login OTP Page/Text No HP Mama Tidak Terdaftar'), 'No HP Mama Tidak Terdaftar')

WebUI.verifyElementText(findTestObject('Login OTP Page/Text Silahkan Lakukan Registrasi'), 'Silahkan Lakukan Registrasi')

WebUI.verifyElementText(findTestObject('Login OTP Page/Button Ok, saya mengerti'), 'Ok, Saya Mengerti!')

WebUI.verifyElementText(findTestObject('Login OTP Page/Button REGISTER'), 'REGISTER')

WebUI.click(findTestObject('Login OTP Page/X button on Modal Popup'))

WebUI.verifyElementText(findTestObject('Login OTP Page/Alert Invalid data'), 'Invalid data')

