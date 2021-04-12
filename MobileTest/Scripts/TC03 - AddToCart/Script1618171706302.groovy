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

Mobile.tap(findTestObject('Object Repository/AddTo Cart/android.widget.TextView - Beli Sekarang'), 0)

Mobile.tap(findTestObject('Object Repository/AddTo Cart/android.widget.TextView - Pilih Warna'), 0)

Mobile.tap(findTestObject('Object Repository/AddTo Cart/android.widget.TextView - BlackRed'), 0)

Mobile.tap(findTestObject('Object Repository/AddTo Cart/android.widget.TextView - Pilih Size'), 0)

Mobile.tap(findTestObject('AddTo Cart/size42'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/AddTo Cart/android.widget.TextView - Beli Sekarang (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/AddTo Cart/android.widget.TextView - Produk telah ditambahkan ke dalam Cart Anda'), 
    0)

Mobile.verifyElementText(findTestObject('AddTo Cart/android.widget.TextView - Produk telah ditambahkan ke dalam Cart Anda'), 
    'Produk telah ditambahkan ke dalam Cart Anda.')

