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

WebUI.navigateToUrl('https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F')

WebUI.click(findTestObject('Object Repository/Page_Your store. Login/button_Log in'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F')

WebUI.click(findTestObject('Object Repository/Page_Your store. Login/button_Log in'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.youtube.com/watch?v=u7fyL8Ft36A')

WebUI.click(findTestObject('Object Repository/Page_Katalon Studio for Complete Beginners _0f8e51/video_2022 Google LLC_video-stream html5-ma_20cfc4'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/Page_Your store. Login/input_Password_RememberMe'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/p_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/a_Help'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/p_Training'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  nopCommerce administration/a_Logout'))

