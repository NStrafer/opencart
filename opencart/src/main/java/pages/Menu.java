package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class Menu extends BasePage {

    @FindBy(xpath = ".//*[text()= 'Desktops']")
    private WebElement desktopsButton;

    @FindBy(xpath = ".//*[text()= 'PC (0)']")
    private WebElement desktopsPCButton;

    @FindBy(xpath = ".//*[text()= 'Mac (1)']")
    private WebElement desktopsMacButton;

    @FindBy(xpath = ".//*[text()= 'Show All Desktops']")
    private WebElement allDesktopsButton;

    @FindBy(xpath = ".//*[text()= 'Laptops & Notebooks']")
    private WebElement laptopsAndNotebooksButton;

    @FindBy(xpath = ".//*[text()= 'Macs (0)']")
    private WebElement laptopsAndNotebooksMacsButton;

    @FindBy(xpath = ".//*[text()= 'Windows (0)']")
    private WebElement laptopsAndNotebooksWindowsButton;

    @FindBy(xpath = ".//*[text()= 'Show All Laptops & Notebooks']")
    private WebElement allLaptopsAndNotebooksButton;

    @FindBy(xpath = ".//*[text()= 'Components']")
    private WebElement componentsButton;

    @FindBy(xpath = ".//*[text()= 'Mice and Trackballs (0)']")
    private WebElement miceAndTrackballsButton;

    @FindBy(xpath = ".//*[text()= 'Monitors (2)']")
    private WebElement monitorsButton;

    @FindBy(xpath = ".//*[text()= 'Printers (0)']")
    private WebElement printersButton;

    @FindBy(xpath = ".//*[text()= 'Scanners (0)']")
    private WebElement scannersButton;

    @FindBy(xpath = ".//*[text()= 'Web Cameras (0)']")
    private WebElement webCamerasButton;

    @FindBy(xpath = ".//*[text()= 'Show All Components']")
    private WebElement allComponentsButton;

    @FindBy(xpath = ".//*[text()= 'Tablets']")
    private WebElement tabletsButton;

    @FindBy(xpath = ".//*[text()= 'Software']")
    private WebElement softwareButton;

    @FindBy(xpath = ".//*[text()= 'Phones & PDAs']")
    private WebElement phonesAndPDAsButton;

    @FindBy(xpath = ".//*[text()= 'Cameras']")
    private WebElement camerasButton;

    @FindBy(xpath = ".//*[text()= 'MP3 Players']")
    private WebElement mp3PlayersButton;

    @FindBy(xpath = ".//*[text()= 'Show All MP3 Players']")
    private WebElement allMp3PlayersButton;
}
