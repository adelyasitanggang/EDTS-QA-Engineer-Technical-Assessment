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

Mobile.startApplication('C:\\Users\\Adelya\\Katalon Studio\\QA-Engineer-Technical-Assessment\\androidApk\\elevenia – Yang Kamu Cari Ada_v3.9.1_apkpure.com.apk', 
    true)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/btn - NEXT'), 0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/btn - NEXT'), 0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/btn - NEXT'), 0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/btn - LOGIN'), 0)

Mobile.setText(findTestObject('Payment Method - Bank Transfer/EditText - Email'), 'adelyas1705@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('Payment Method - Bank Transfer/EditText - Password'), 'tE+PEiSUqqjnSBlLR3+MUQ==', 
    0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/TextView - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/Detail Product'), 0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/btn - Beli Sekarang'), 0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/btn - Beli Sekarang2'), 0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/btn - BAYAR'), 0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/btn - Beli Sekarang3'), 0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/add - Alamat'), 0)

Mobile.setText(findTestObject('Object Repository/Payment Method - Bank Transfer/EditText - Label Rumah'), 'Alamat Rumah', 
    0)

Mobile.setText(findTestObject('Object Repository/Payment Method - Bank Transfer/EditText - Penerima'), 'Adelya', 0)

Mobile.setText(findTestObject('Object Repository/Payment Method - Bank Transfer/EditText - Alamat Lengkap'), 'Jalan Mawar 120', 
    0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/EditText- Provinsi'), 0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/TextView - DKI JAKARTA'), 0)

Mobile.tap(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/TextView - Duren Sawit  Kota Administrasi Jakarta Timur DKI JAKARTA'), 
    0)

Mobile.setText(findTestObject('Payment Method - Bank Transfer/txt - Ponsel 1'), '0852', 0)

Mobile.setText(findTestObject('Payment Method - Bank Transfer/txt - Ponsel 2'), '62062330', 0)

Mobile.setText(findTestObject('null'), '21075', 0)

Mobile.setText(findTestObject('Object Repository/Payment Method - Bank Transfer/EditText - Alamat Lengkap'), 'Jalan Mawar 120', 
    0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/TextView - Simpan'), 0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/btn - OK2'), 0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/btn - Lanjut'), 0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/btn - asuransi'), 0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/btn - Lanjut 2'), 0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/TextView - Bank Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/Bank Transfer - BCA'), 0)

Mobile.tap(findTestObject('Object Repository/Payment Method - Bank Transfer/btn - Bayar Sekarang'), 0)

Mobile.tap(findTestObject('Payment Method - Bank Transfer/btn - Periksa pesanan lengkap'), 0)

Mobile.closeApplication()

