package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionalMailPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public AdditionalMailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора поля ввода доп почты
     */
    @FindBy(xpath = "//*[contains(@class, 'input-additional_email')]")
    private WebElement emailField;

    /**
     * определение локатора кнопки Позже
     */
    @FindBy(xpath = "//*[contains(@class, 'Button2 Button2_size_l Button2_view_pseudo Button2_width_max')")
    private WebElement laterButton;

    /**
     * метод для осуществления нажатия кнопки пропустить ввод почты
     */
    public void clickLaterBtn() {
        laterButton.click();
    }
}
