import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.sparkroom.com/Sparkroom/')

WebUI.setText(findTestObject('Object Repository/Page_Sparkroom/input_User ID_userId'), 'kpradhan')

WebUI.setText(findTestObject('Object Repository/Page_Sparkroom/input_Company_company'), 'sparkroom')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sparkroom/input_Password_password'), 'Ee5PnYzB70sndkUy6/xryg==')

WebUI.click(findTestObject('Page_Sparkroom/div_Lead Cost'))

WebUI.click(findTestObject('Object Repository/Page_Sparkroom/strong_Karan Pradhan'))

WebUI.closeBrowser()

WebUI.click(findTestObject('Page_Sparkroom/iframe_XVert Migration_gwt-Frame'))

