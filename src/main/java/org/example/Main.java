package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Main {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.shrome.driver", "C:\\Arthur\\Programmes\\Selenium\\selenium-java-4.6.0.zip");

        driver = new ChromeDriver();

        //? https://www.andreyolegovich.ru/qa/selenium/java/#example
        driver.get("https://www.urn.su/qa/ui/basic_test/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        //+ Поиск по id и ввод текста
        /*WebElement searchSite = driver.findElement(By.id("name1"));
        searchSite.sendKeys("https://www.urn.su/");*/

        //+ Поиск по id и нажатие кнопки
        /*WebElement searchSiteBtn = driver.findElement(By.id("submit1"));
        searchSiteBtn.click();*/

        //+ Поиск списка ссылок с текстом Renovation и нажатие на первую из них
        /*WebElement renovationLinks = driver.findElements(By.linkText("Renovation")).get(0);
        renovationLinks.click();*/

        //+ Поиск ссылки по css селектору и нажатие на неё
        /*WebElement march8Link = driver.findElements(By.cssSelector("a[class=march8]")).get(0);
        march8Link.click();*/

        //+ Поиск по тегу картинки с ссылкой и нажатие
        /*WebElement selectImage = driver.findElements(By.tagName("img")).get(1);
        selectImage.click();*/

        //+ Нахождение списка Radio Buttons по имени и переключение на третий элемент
        /*List<WebElement> radioButtons = driver.findElements(By.name("house"));
        radioButtons.get(2).click();*/

        //+ Нахождение списка Checkbox по xpath и выбор элемента Arthur
        /*List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
        checkBoxes.get(2).click();*/

        //+ Выбор элемента из выпадающего списка
        /*WebElement selectElement = driver.findElement(By.id("swords"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Dawn");*/

        //+ В таблице лежит таблица. Нужно в терминал вывести ячейку внутренней таблицы
        /*WebElement outerTable = driver.findElements(By.tagName("table")).get(1);
        WebElement innerTable = outerTable.findElement(By.tagName("table"));
        WebElement tableTableElement = innerTable.findElements(By.tagName("td")).get(1);
        System.out.println(tableTableElement.getText());*/

        //+ Найти элемент по классу и id
        /*WebElement ElementById = driver.findElement(By.id("devhops"));
        System.out.println(ElementById.getText());*/

        //+ Найти элемент по имени класса
        /*WebElement ElementByClass = driver.findElement(By.className("devhops"));
        System.out.println(ElementByClass.getText());*/

        //+ Найти элемент по тексту
        /*WebElement ElementByText = driver.findElement(By.xpath("//div[contains(text(), 'Indexing')]"));
        System.out.println(ElementByText.getText());*/











        /*driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));


        List<WebElement> inputs = driver.findElements(By.className("form-control"));
        WebElement textInput = driver.findElement(By.xpath("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        WebElement range = driver.findElement(By.name("my-range"));

        textInput.sendKeys("Arthur");
        submitButton.click();

        String title = driver.getTitle();
        driver.quit();*/
    }
}