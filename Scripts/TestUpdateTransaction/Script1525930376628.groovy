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

WebUI.setText(findTestObject('TestUpdateTransaction/input_username'), admin_username)

WebUI.setText(findTestObject('TestUpdateTransaction/input_password'), admin_password)

WebUI.click(findTestObject('TestUpdateTransaction/button_Login'))

WebUI.click(findTestObject('TestUpdateTransaction/a_Total Transaction'))

//WebUI.click(findTestObject('TestUpdateTransaction/Old admin total price'))
WebUI.delay(5)

def oldTotalPrice = WebUI.getText(findTestObject('TestUpdateTransaction/Old admin total price'))

oldTotalPrice = oldTotalPrice.replaceAll('Total price: ', '')

println(oldTotalPrice)

oldTotalPrice = oldTotalPrice.replaceAll(' THB', '')

println(oldTotalPrice)

oldTotalPrice = oldTotalPrice.replaceAll(',', '')

println(oldTotalPrice)

oldTotalPrice = Integer.parseInt(oldTotalPrice)

println(oldTotalPrice)

WebUI.click(findTestObject('TestUpdateTransaction/button_Logout'))

WebUI.setText(findTestObject('TestUpdateTransaction/input_username'), user_username)

WebUI.setText(findTestObject('TestUpdateTransaction/input_password'), user_password)

WebUI.click(findTestObject('TestUpdateTransaction/button_Login'))

WebUI.click(findTestObject('TestUpdateTransaction/button_add to cart'))

WebUI.click(findTestObject('TestUpdateTransaction/button_add to cart'))

WebUI.click(findTestObject('TestUpdateTransaction/cart'))

WebUI.delay(5)

//WebUI.click(findTestObject('TestUpdateTransaction/User total price'))
def UserTotalPrice = WebUI.getText(findTestObject('TestUpdateTransaction/User total price'))

UserTotalPrice = UserTotalPrice.replaceAll('Total price: ', '')

println(UserTotalPrice)

UserTotalPrice = UserTotalPrice.replaceAll(' THB', '')

println(UserTotalPrice)

UserTotalPrice = UserTotalPrice.replaceAll(',', '')

println(UserTotalPrice)

UserTotalPrice = Integer.parseInt(UserTotalPrice)

println(UserTotalPrice)

WebUI.click(findTestObject('TestUpdateTransaction/button_confirm'))

WebUI.acceptAlert()

WebUI.click(findTestObject('TestUpdateTransaction/button_Logout'))

WebUI.delay(5)

WebUI.setText(findTestObject('TestUpdateTransaction/input_username'), admin_username)

WebUI.setText(findTestObject('TestUpdateTransaction/input_password'), admin_password)

WebUI.click(findTestObject('TestUpdateTransaction/button_Login'))

WebUI.click(findTestObject('TestUpdateTransaction/a_Total Transaction'))

//WebUI.click(findTestObject('TestUpdateTransaction/New admin total price'))
def NewTotalPrice = WebUI.getText(findTestObject('TestUpdateTransaction/New admin total price'))

NewTotalPrice = NewTotalPrice.replaceAll('Total price: ', '')

println(NewTotalPrice)

NewTotalPrice = NewTotalPrice.replaceAll(' THB', '')

println(NewTotalPrice)

NewTotalPrice = NewTotalPrice.replaceAll(',', '')

println(NewTotalPrice)

NewTotalPrice = Integer.parseInt(NewTotalPrice)

println(NewTotalPrice)

WebUI.verifyEqual(NewTotalPrice, UserTotalPrice + oldTotalPrice)

WebUI.closeBrowser()

