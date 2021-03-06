import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.213.239.153:8086/')

WebUI.setText(findTestObject('TestAvailableProduct/input_username'), username)

WebUI.setText(findTestObject('TestAvailableProduct/input_password'), password)

WebUI.click(findTestObject('TestAvailableProduct/button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('TestAvailableProduct/h2_Products'), 'Products')

WebUI.verifyElementText(findTestObject('TestAvailableProduct/h5_Garden'), 'Garden')

WebUI.verifyElementText(findTestObject('TestAvailableProduct/h5_Banana'), 'Banana')

WebUI.verifyElementText(findTestObject('TestAvailableProduct/h5_Orange'), 'Orange')

WebUI.verifyElementText(findTestObject('TestAvailableProduct/h5_Papaya'), 'Papaya')

WebUI.verifyElementText(findTestObject('TestAvailableProduct/h5_Rambutan'), 'Rambutan')

WebUI.closeBrowser()

