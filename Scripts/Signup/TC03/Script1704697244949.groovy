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

WebUI.navigateToUrl('https://hoayeuthuong.com/')

WebUI.click(findTestObject('Object Repository/Page_1 tin nhn mi/div_Ti khonSign inBn cha cha c ti khonNhn v_1096e6'))

WebUI.click(findTestObject('Object Repository/Page_Shop hoa ti Hoayeuthuong t hoa online,_070fbc/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_shop hoa  hoa ti  in hoa  hoayeuthuong.com/input_ctl00cphContentucLogintxtEmail'), 
    'tra.y24@student.passerellesnumeriques.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_shop hoa  hoa ti  in hoa  hoayeuthuong.com/input_ctl00cphContentucLogintxtPassword'), 
    'VJ6uNRAKvEsaM3HKuewOwQ==')

WebUI.click(findTestObject('Object Repository/Page_shop hoa  hoa ti  in hoa  hoayeuthuong.com/input_ctl00cphContentucLoginbtnLogin'))

WebUI.closeBrowser()

