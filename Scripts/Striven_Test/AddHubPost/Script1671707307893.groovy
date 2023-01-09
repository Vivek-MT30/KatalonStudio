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

WebUI.callTestCase(findTestCase('Striven_Test/Striven Login'), [('URL1') : 'https://login.test.striven.com/Security/Login.aspx?t=Nextappnew&ReturnUrl='
        , ('username1') : 'nextapp@mail.com', ('password1') : 'dODec5gxO+ZPvSoqU+rf6g=='], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Hub/span_Log Out'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Company'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Hub'))

WebUI.navigateToUrl('https://nextappnew.test.striven.com/Collaboration/Hub/Hub.aspx?nav=1&vid=s1')

WebUI.click(findTestObject('Object Repository/Page_Hub/span_General Information_caret'))

WebUI.click(findTestObject('Object Repository/Page_Hub/a_Document'))

WebUI.click(findTestObject('Object Repository/Page_Hub/i_Drop files here_fa fa-cloud-upload fa-3x'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Hub/i_Drop files here_fa fa-cloud-upload fa-3x'), GlobalVariable.FileUpload)

WebUI.setText(findTestObject('Object Repository/Page_Hub/input_Post65_ctl00ctl00mainContentContentPl_e8e66d (1)'), '123')

WebUI.click(findTestObject('Object Repository/Page_Hub/input_select_ctl00ctl00mainContentContentPl_fc3215 (1)'))

