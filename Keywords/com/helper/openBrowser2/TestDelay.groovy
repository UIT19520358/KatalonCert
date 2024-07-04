package com.helper.openBrowser2

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TestDelay {
	@Keyword
	public void Visible() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.google.com/')

		WebUI.waitForPageLoad(30)

		WebUI.maximizeWindow()

		WebUI.setText(findTestObject('google2/Buscar'), 'fer')

		WebUI.waitForElementVisible(findTestObject('google2/Ferrari'), 3)

		WebUI.click(findTestObject('google2/Ferrari'))

		WebUI.delay(4)

		WebUI.closeBrowser()

		println("Funcion Visible")
	}


	@Keyword
	public void Visible_par(String url, String texto, Integer t) {
		WebUI.openBrowser('')

		//WebUI.navigateToUrl('https://www.google.com/')
		WebUI.navigateToUrl(url)

		WebUI.waitForPageLoad(t)

		WebUI.maximizeWindow()

		//WebUI.setText(findTestObject('google2/Buscar'), 'fer')
		WebUI.setText(findTestObject('google2/Buscar'), texto)


		WebUI.waitForElementVisible(findTestObject('google2/Ferrari'), 3)

		WebUI.click(findTestObject('google2/Ferrari'))

		WebUI.delay(t)

		WebUI.closeBrowser()

		println("Funcion Visible con Argumentos, imprimiendo la url" + url)
	}
}
