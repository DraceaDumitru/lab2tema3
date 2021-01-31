import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuySomething {
    private WebDriver driver;

    @Before
    public void commonElements() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://testfasttrackit.info/selenium-test/");
    }

    @Test
    //Ex 5
    public void addObjToCart() {

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent")).click(); // apasa pe sales
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        //comanda de sus apasa pe view la un produs
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click(); // apasa pe culoarea neagra
        driver.findElement(By.cssSelector("#swatch77 > span.swatch-label")).click(); //apasa pe marimea XL
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();//adauga in cos
        WebElement dashboard = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span"));
        Assert.assertTrue(dashboard.isDisplayed());
        String message = dashboard.getText();
        Assert.assertEquals("Slim fit Dobby Oxford Shirt was added to your shopping cart.", message);
    }

    @Test
    public void addOneMoreObjToCart() {

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent")).click(); // apasa pe sales
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        //comanda de sus apasa pe view la un produs
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click(); // apasa pe culoarea neagra
        driver.findElement(By.cssSelector("#swatch77 > span.swatch-label")).click(); //apasa pe marimea XL
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();//adauga in cos
        WebElement confirmationMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span"));
        Assert.assertTrue(confirmationMessage.isDisplayed());
        String message = confirmationMessage.getText();
        Assert.assertEquals("Slim fit Dobby Oxford Shirt was added to your shopping cart.", message);
        WebElement continueButton = driver.findElement(By.cssSelector("#shopping-cart-table > tfoot > tr > td > button.button2.btn-continue > span > span"));
        Assert.assertTrue(continueButton.isDisplayed());
        String button = continueButton.getText();
        Assert.assertEquals("CONTINUE SHOPPING", button);
        driver.findElement(By.cssSelector("#shopping-cart-table > tfoot > tr > td > button.button2.btn-continue > span > span")).click();//face click pe continue shopping
        driver.findElement(By.cssSelector("#header > div > a > img.large")).click();//face click pe homepage
        WebElement returnToMainPage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-title > h2"));
        Assert.assertTrue(returnToMainPage.isDisplayed());
        String continueShopping = returnToMainPage.getText();
        Assert.assertEquals("NEW PRODUCTS", continueShopping);
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(1) > a > img")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click(); // apasa pe negru
        driver.findElement(By.cssSelector("#swatch72 > span.swatch-label")).click(); //apasa pe marimea 10
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
        WebElement confirmMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span"));
        Assert.assertTrue(confirmMessage.isDisplayed());
        String confirm = confirmMessage.getText();
        Assert.assertEquals("Lafayette Convertible Dress was added to your shopping cart.", confirm);
    }

    @Test
    public void deleteAnObjFromCart() {

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent")).click(); // apasa pe sales
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        //comanda de sus apasa pe view la un produs
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click(); // apasa pe culoarea neagra
        driver.findElement(By.cssSelector("#swatch77 > span.swatch-label")).click(); //apasa pe marimea XL
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();//adauga in cos
        WebElement confirmationMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span"));
        Assert.assertTrue(confirmationMessage.isDisplayed());
        String message = confirmationMessage.getText();
        Assert.assertEquals("Slim fit Dobby Oxford Shirt was added to your shopping cart.", message);
        WebElement continueButton = driver.findElement(By.cssSelector("#shopping-cart-table > tfoot > tr > td > button.button2.btn-continue > span > span"));
        Assert.assertTrue(continueButton.isDisplayed());
        String button = continueButton.getText();
        Assert.assertEquals("CONTINUE SHOPPING", button);
        driver.findElement(By.cssSelector("#shopping-cart-table > tfoot > tr > td > button.button2.btn-continue > span > span")).click();//face click pe continue shopping
        driver.findElement(By.cssSelector("#header > div > a > img.large")).click();//face click pe homepage
        WebElement returnToMainPage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-title > h2"));
        Assert.assertTrue(returnToMainPage.isDisplayed());
        String continueShopping = returnToMainPage.getText();
        Assert.assertEquals("NEW PRODUCTS", continueShopping);
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(1) > a > img")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click(); // apasa pe negru
        driver.findElement(By.cssSelector("#swatch72 > span.swatch-label")).click(); //apasa pe marimea 10
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
        WebElement confirmMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span"));
        Assert.assertTrue(confirmMessage.isDisplayed());
        String confirm = confirmMessage.getText();
        Assert.assertEquals("Lafayette Convertible Dress was added to your shopping cart.", confirm);
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.last.even > td.a-center.product-cart-remove.last > a")).click();
        WebElement deleteMessage = driver.findElement(By.cssSelector("#shopping-cart-totals-table > tbody > tr > td:nth-child(2) > span"));
        Assert.assertTrue(deleteMessage.isDisplayed());
        String delete = deleteMessage.getText();
        Assert.assertEquals("140,00 RON", delete);
    }
    @Test
    public void emptyYourCart() {

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent")).click(); // apasa pe sales
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
        //comanda de sus apasa pe view la un produs
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click(); // apasa pe culoarea neagra
        driver.findElement(By.cssSelector("#swatch77 > span.swatch-label")).click(); //apasa pe marimea XL
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();//adauga in cos
        WebElement confirmationMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span"));
        Assert.assertTrue(confirmationMessage.isDisplayed());
        String message = confirmationMessage.getText();
        Assert.assertEquals("Slim fit Dobby Oxford Shirt was added to your shopping cart.", message);
        WebElement continueButton = driver.findElement(By.cssSelector("#shopping-cart-table > tfoot > tr > td > button.button2.btn-continue > span > span"));
        Assert.assertTrue(continueButton.isDisplayed());
        String button = continueButton.getText();
        Assert.assertEquals("CONTINUE SHOPPING", button);
        driver.findElement(By.cssSelector("#shopping-cart-table > tfoot > tr > td > button.button2.btn-continue > span > span")).click();//face click pe continue shopping
        driver.findElement(By.cssSelector("#header > div > a > img.large")).click();//face click pe homepage
        WebElement returnToMainPage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-title > h2"));
        Assert.assertTrue(returnToMainPage.isDisplayed());
        String continueShopping = returnToMainPage.getText();
        Assert.assertEquals("NEW PRODUCTS", continueShopping);
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(1) > a > img")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label > img")).click(); // apasa pe negru
        driver.findElement(By.cssSelector("#swatch72 > span.swatch-label")).click(); //apasa pe marimea 10
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
        WebElement confirmMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span"));
        Assert.assertTrue(confirmMessage.isDisplayed());
        String confirm = confirmMessage.getText();
        Assert.assertEquals("Lafayette Convertible Dress was added to your shopping cart.", confirm);
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.last.even > td.a-center.product-cart-remove.last > a")).click();
        WebElement deleteMessage = driver.findElement(By.cssSelector("#shopping-cart-totals-table > tbody > tr > td:nth-child(2) > span"));
        Assert.assertTrue(deleteMessage.isDisplayed());
        String delete = deleteMessage.getText();
        Assert.assertEquals("140,00 RON", delete);
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.a-center.product-cart-remove.last > a")).click();
        WebElement emptyCart = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.page-title > h1"));
        Assert.assertTrue(emptyCart.isDisplayed());
        String deleteAll = emptyCart.getText();
        Assert.assertEquals("SHOPPING CART IS EMPTY", deleteAll);
    }

    @After
    public void close() {
           driver.close();
    }


}
