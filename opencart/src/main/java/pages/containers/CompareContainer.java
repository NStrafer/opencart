package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CompareContainer extends BasePage {

    private WebElement element;

    public CompareContainer(WebElement element) {
        this.element = element;
    }

    public WebElement getProductDetails() {
        return element.findElement(By.xpath(".//table/thead[1]/tr"));
    }

    public WebElement getProductTitle() {
        return element.findElement(By.xpath(".//table/tbody[1]/tr[1]/td"));
    }

    public WebElement getImage() {
        return element.findElement(By.xpath(".//tr[2]"));
    }

    public WebElement getPrice() {
        return element.findElement(By.xpath(".//tr[3]"));
    }

    public WebElement getModel() {
        return element.findElement(By.xpath(".//tr[4]"));
    }

    public WebElement getBrand() {
        return element.findElement(By.xpath(".//tr[5]"));
    }

    public WebElement getAvailability() {
        return element.findElement(By.xpath(".//tr[6]"));
    }

    public WebElement getRating() {
        return element.findElement(By.xpath(".//tr[7]"));
    }

    public WebElement getSummary() {
        return element.findElement(By.xpath(".//tr[8]"));
    }

    public WebElement getWeight() {
        return element.findElement(By.xpath(".//tr[9]"));
    }

    public WebElement getDimensions() {
        return element.findElement(By.xpath(".//tr[10]"));
    }

    public WebElement getMemory() {
        return element.findElement(By.xpath("//table/thead[2]/tr"));
    }

    public WebElement getTest1() {
        return element.findElement(By.xpath("//table/tbody[2]/tr"));
    }

    public WebElement getProcessor() {
        return element.findElement(By.xpath(".//table/thead[3]/tr"));
    }

    public WebElement getNumberOfCores() {
        return element.findElement(By.xpath(".//table/tbody[3]/tr"));
    }

    public WebElement getAddToCartButton() {
        return element.findElement(By.xpath(".//input[@class= 'btn btn-primary btn-block']"));
    }

    public WebElement getRemoveButton() {
        return element.findElement(By.xpath(".//a[@class= 'btn btn-danger btn-block']"));
    }
}
