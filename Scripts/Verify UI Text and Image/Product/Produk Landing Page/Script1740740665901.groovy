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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.nutriclub.co.id/')

WebUI.callTestCase(findTestCase('Navigation and fill in/Tap button and or hyperlink/Entry Point/Entry to Product page/Entry to Produk page from Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Parent Page/Banner Produk Page'))

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Breadcrumb Home'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Breadcrumb Produk'))

WebUI.click(findTestObject('Object Repository/Popup Cookie/button_Aktifkan Semua Cookie'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Parent Page/img_NR3'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Produk Parent Page/img_NR4'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Nutrilon Royal 3'), 'Nutrilon Royal 3')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Short Desc NR3 - Susu Pertumbuhan Anak'), 'Susu Pertumbuhan Anak')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Usia 1-3 Tahun NR3'), 'Usia 1-3 Tahun')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Nutrilon Royal 4'), 'Nutrilon Royal 4')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Short Desc NR4 - Susu Pertumbuhan Anak'), 'Susu Pertumbuhan Anak')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Usia 3-5Tahun NR4'), 'Usia 3-5 Tahun')

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Button Lihat Produk NR3'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Button Lihat Produt NR 4'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Text Nutrilon Royal, Susu Pertumbuhan Anak'))

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Nutrilon Royal, Susu Pertumbuhan Anak'), 
    'Nutrilon Royal, Susu Pertumbuhan untuk Anak Usia 1-5 Tahun')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Short Desc Nutrilon Royal secara saintifik'), 
    'Nutrilon Royal secara saintifik menggabungkan advanced ingredients: Double Biotics FOS:GOS dan DHA EPA yang lebih tinggi, menjadikannya nutrisi optimal sebagai "The Formula For Winning Child". Teruji klinis perkuat imunitas, siapkan anak untuk maksimalkan inteligensinya.')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Kandungan Nutrilon Royal dan Manfaatnya'), 
    'Kandungan Nutrilon Royal dan Manfaatnya')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Tinggi Double Biotics (FOSGOS)'), 'Tinggi Double Biotics (FOS:GOS)')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Susu formula yang mengandung FOSGOS 19 le_ad3c80'), 
    'Susu formula yang mengandung FOS:GOS 1:9 lebih tinggi. Double Biotics FOS:GOS dalam susu berfungsi untuk bantu perkuat imunitas si Kecil.')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text TinggiDHA  EPA'), 'Tinggi DHA & EPA')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Susu tinggi DHA  EPA untuk dukung perkemb_53f324'), 
    'Susu tinggi DHA & EPA untuk dukung perkembangan kognitif dan daya tangkap si Kecil, maksimalkan inteligensinya agar siap jadi pemenang.')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Susu tinggi Kalsium'), 'Susu tinggi Kalsium')

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Text Susu formula yang mengandung FOSGOS 19 le_ad3c80'))

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Susu tinggi Kalsium yang membantu'), 'Susu tinggi Kalsium yang membantu pertumbuhan dan tumbuh kembang optimal. Didukung oleh beragam vitamin dan mineral.')

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Text Susu tinggi DHA  EPA untuk dukung perkemb_53f324'))

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Tanpa Gula Tambahan'), 'Tanpa Gula Tambahan')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Susu Nutrilon Royal tidak mengandung gula'), 
    'Susu Nutrilon Royal tidak mengandung gula tambahan dengan kandungan 0 gram sukrosa, namun tetap disukai si Kecil.')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/h2_Tahapan Susu Nutrilon Royal'), 'Tahapan Susu Nutrilon Royal')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/h3_Nutrilon Royal 3'), 'Nutrilon Royal 3')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Susu pertumbuhan untuk anak usia'), 'Susu pertumbuhan untuk anak usia 1-3 tahun. Satu-satunya formula yang dirancang secara saintifik untuk imunitas  yang lebih kuat dan memaksimalkan inteligensi, persiapkan anak anda untuk menang.')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/h3_Nutrilon Royal 4'), 'Nutrilon Royal 4')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/strong_Susu pertumbuhan untuk anak usia 3-5_9092dd'), 
    'Susu pertumbuhan untuk anak usia 3-5 tahun. Satu-satunya formula yang dirancang secara saintifik untuk perkuat imunitas dan memaksimalkan inteligensi, persiapkan si Kecil memasuki masa pra-sekolah.')

WebUI.click(findTestObject('Object Repository/Produk Parent Page/section_Tahapan Susu Nutrilon Royal'))

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Card NR 4'))

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/h2_Varian Nutrilon Royal'), 'Varian Nutrilon Royal')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Tersedia dalam 2 varian rasa favorit si'), 
    'Tersedia dalam 2 varian rasa favorit si Kecil yang dapat membantu meningkatkan sistem imun, perkembangan kognitif, dan tumbuh kembang.')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/h3_Nutrilon Royal Rasa Vanila'), 'Nutrilon Royal Rasa Vanila')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/h3_Nutrilon Royal Rasa Madu'), 'Nutrilon Royal Rasa Madu')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/p_Varian rasa vanila tersedia dalam ukuran _c596cf'), 
    'Varian rasa vanila tersedia dalam ukuran 400 gram, 800 gram, dan 1800 gram.')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/p_Varian rasa madu tersedia dalam ukuran 40_2013e0'), 
    'Varian rasa madu tersedia dalam ukuran 400 gram, 800 gram, dan 1800 gram.')

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Card Nutrilon Royal Rasa Madu'))

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Card Nutrilon Royal Rasa Vanila'))

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/h2_Produk Susu Nutrilon Lainnya'), 'Produk Susu Nutrilon Lainnya')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/div_Nutrinidrink'), 'Nutrinidrink')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/div_Neocate Junior'), 'Neocate Junior')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Susu Tinggi Kalori untuk'), 'Susu Tinggi Kalori untuk')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Dukung Kejar Tumbuh'), 'Dukung Kejar Tumbuh')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Susu PKMK Berbasis Asam Amino'), 'Susu PKMK Berbasis Asam Amino untuk Pasien Alergi Susu Sapi')

WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Parent Page/img_Susu Nutrilon Lainnya'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Produk Parent Page/img_produk lainnya_img-fluid image-card'))

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Button Lihat Produk Neocate'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Button Lihat Produk Nutrinidrink'))

WebUI.back()

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Keuntungan Daftar Nutriclub'), 'Keuntungan Daftar Nutriclub')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Winning Parenting Content'), 'Winning Parenting Content')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text NutriclubExpert Advisor'), '24/7 Nutriclub\nExpert Advisor')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Hadiah untuk Mama dan si Kecil'), 'Hadiah untuk Mama dan si Kecil')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Ratusan artikel dan konten tumbuh kembang'), 
    'Ratusan artikel dan konten tumbuh kembang untuk dukung si Kecil jadi juara')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Hubungi ahli untuk pertanyaan seputar'), 
    'Hubungi ahli untuk pertanyaan seputar nutrisi, tumbuh kembang, dan informasi terkait Nutriclub melalui Whatsapp/call center')

WebUI.verifyElementText(findTestObject('Object Repository/Produk Parent Page/Text Beragam exclusive rewards menanti Mama'), 
    'Beragam exclusive rewards menanti Mama dan si Kecil, khusus member Nutriclub')

WebUI.click(findTestObject('Object Repository/Produk Parent Page/Button Daftar Sekarang'))

