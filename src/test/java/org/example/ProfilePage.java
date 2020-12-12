package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора меню пользователя
     */
    @FindBy(xpath = "//*[contains(@class, 'user-account_has-accent-letter_yes')]")
    private WebElement userMenu;

    /**
     * определение локатора кнопки выхода из аккаунта
     */
    @FindBy(xpath = "//*[contains(@class, 'menu__item menu__item_type_link legouser__menu-item legouser__menu-item_action_exit')]")
    private WebElement logoutBtn;

    /**
     * метод для получения имени пользователя из меню пользователя
     */
    public String getUserName() {
        String userName = userMenu.getText();
        return userName;
    }

    /**
     * метод для нажатия кнопки меню пользователя
     */
    public void entryMenu() {
        userMenu.click();
    }

    /**
     * метод для нажатия кнопки выхода из аккаунта
     */
    public void userLogout() {
        logoutBtn.click();
    }
}
