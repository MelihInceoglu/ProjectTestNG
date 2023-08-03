package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashBoard {



    public AdminDashBoard(){


        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@name='username']")
    public WebElement adminEMail;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement adminPassword;

    @FindBy(xpath = "//*[@class='signin']")
    public WebElement adminSignIn;



}
