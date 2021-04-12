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

Mobile.startApplication('C:\\Users\\USER\\Downloads\\elevenia – Yang Kamu Cari Ada_v3.9.1_apkpure.com.apk', true)

WebUI.delay(5)

Mobile.swipe(500, 758, 100, 758)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Login/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText - Email'), 'deva.aved99@gmail.com', 0)

Mobile.setText(findTestObject('Login/android.widget.EditText - Password'), 'Coba123', 0)

Mobile.tap(findTestObject('Login/android.widget.TextView - Login (1)'), 0)

Mobile.tap(findTestObject('Login/close'), 0)

Mobile.verifyElementVisible(findTestObject('Login/VerifytoHome'), 0)

