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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.nutriclub.co.id/')

WebUI.click(findTestObject('Page_Nutriclub Dukung si Kecil jadi Pemenang/a_Masuk'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/Hyperlink Kembali'), 'Kembali')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/label Field No Handphone'), 'No Handphone')

WebUI.click(findTestObject('Object Repository/Page_Login/Input Field phone number'))

WebUI.setText(findTestObject('Object Repository/Page_Login/Input Field phone number'), '085784018007')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/label Field Kata Sandi'), 'Kata Sandi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/Input field Kata Sandi'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Login/Eye Kata Sandi'))

WebUI.click(findTestObject('Object Repository/Page_Login/Eye Kata Sandi'))

WebUI.click(findTestObject('Object Repository/Page_Login/Eye Kata Sandi'))

WebUI.click(findTestObject('Object Repository/Page_Login/Eye Kata Sandi'))

WebUI.click(findTestObject('Object Repository/Page_Login/Eye Kata Sandi'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/Hyperlink Lupa Kata Sandi'), 'Lupa Kata Sandi')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/button Masuk'), 'Masuk')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/Button Masuk Tanpa Kata Sandi'), 'Masuk Tanpa Kata Sandi')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/Text Belum punya akun Daftar di sini'), 'Belum punya akun? Daftar di sini')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/Text Halaman ini dilindungi oleh Google ReCAPTCHA'), 
    'Halaman ini dilindungi oleh Google ReCAPTCHA.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Login/Text Pelajari lebih lanjut Captcha'), 'Pelajari lebih lanjut.')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Aktifkan Semua Cookie'))

WebUI.click(findTestObject('Object Repository/Page_Login/button Masuk'))

WebUI.verifyElementText(findTestObject('Object Repository/Page Membership Dashboard/Text Login Berhasil'), 'Login Berhasil')

WebUI.click(findTestObject('Object Repository/Page Membership Dashboard/button Tutup popup login berhasil'))

