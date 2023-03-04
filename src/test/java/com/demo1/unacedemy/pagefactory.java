package com.demo1.unacedemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactory {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"__next\"]/header/div/div[2]/div/button[2]/span")
    WebElement joinForFreeButton;

    @FindBy(xpath = "//input[@placeholder=\"Enter your mobile number\"]")
    WebElement mobileNumberInput;

    @FindBy(xpath = "//button[@class=' css-1uhmx9i-StyledButton e1wp3nh0']")
    WebElement submitButton;

    @FindBy(xpath = "//button[@class=' e52pvpx3 css-1dk3nw2-StyledButton-VerifyButton e1wp3nh0']")
    WebElement verifyButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameInput;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    WebElement emailInput;

    @FindBy(xpath = "//button[@class='dropdown-button css-1lj5w5g-DropDownButton e1v4hctf0']")
    WebElement stateDropdown;

    @FindBy(xpath = "//span[text()='Arunachal Pradesh']")
    WebElement arunachalPradeshOption;

    public pagefactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickJoinForFreeButton() {
        joinForFreeButton.click();
    }

    public void enterMobileNumber(String mobileNumber) {
        mobileNumberInput.sendKeys(mobileNumber);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickVerifyButton() {
        verifyButton.click();
    }

    public void enterName(String name) {
        nameInput.click();
        nameInput.sendKeys(name);
    }

    public void enterEmail(String email) {
        emailInput.click();
        emailInput.sendKeys(email);
    }

    public void clickStateDropdown() {
        stateDropdown.click();
    }

    public void selectArunachalPradesh() {
        arunachalPradeshOption.click();
    }
}
