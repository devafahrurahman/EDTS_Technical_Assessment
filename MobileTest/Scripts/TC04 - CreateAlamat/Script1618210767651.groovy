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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CreateAlamat/android.widget.Button - BAYAR'), 0)

Mobile.tap(findTestObject('CreateAlamat/android.widget.TextView - Beli Sekarang'), 0)

Mobile.delay(15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('CreateAlamat/android.widget.TextView - Tambah Alamat Baru'), 0)

Mobile.setText(findTestObject('CreateAlamat/android.widget.EditText'), 'Coba', 0)

Mobile.setText(findTestObject('CreateAlamat/android.widget.EditText (1)'), 'Nopi', 0)

Mobile.tap(findTestObject('CreateAlamat/android.widget.EditText (2)'), 0)

Mobile.setText(findTestObject('CreateAlamat/android.widget.EditText - Cari Pilih Provinsi'), 'nt', 0)

Mobile.tap(findTestObject('CreateAlamat/android.widget.TextView - NTB'), 0)

Mobile.tap(findTestObject('CreateAlamat/android.widget.EditText - Pilih KabupatenKota'), 0)

Mobile.clearText(findTestObject('CreateAlamat/android.widget.EditText - nt'), 0)

Mobile.setText(findTestObject('CreateAlamat/android.widget.EditText - Cari Pilih KabupatenKota'), 'mata', 0)

Mobile.tap(findTestObject('CreateAlamat/android.widget.TextView - Mataram Kota Mataram NTB'), 0)

Mobile.setText(findTestObject('CreateAlamat/android.widget.EditText (3)'), 'Majapahit No5', 0)

Mobile.swipe(389, 800, 389, 300)

Mobile.setText(findTestObject('CreateAlamat/android.widget.EditText (4)'), '0887', 0)

Mobile.setText(findTestObject('CreateAlamat/android.widget.EditText (5)'), '03070324', 0)

Mobile.setText(findTestObject('CreateAlamat/android.widget.EditText (6)'), '81234', 0)

Mobile.tap(findTestObject('CreateAlamat/android.widget.TextView - Simpan'), 0)

Mobile.verifyElementText(findTestObject('CreateAlamat/android.widget.TextView - Kurir service berhak mengubah service pengiriman tanpa mengubah ongkos kirim bila terjadi kesalahan penulisan kode pos'), 
    'Kurir service berhak mengubah service pengiriman tanpa mengubah ongkos kirim bila terjadi kesalahan penulisan kode pos.')

Mobile.tap(findTestObject('CreateAlamat/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('CreateAlamat/android.view.View'), 0)

