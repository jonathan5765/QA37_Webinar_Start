import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login {
    WebDriver wd;

    @Test
    public void test1(){
        WebElement el1 = wd.findElement(By.tagName("div"));
        WebElement el2 = wd.findElement(By.id("user"));
        WebElement el3 = wd.findElement(By.className("form-field"));
        WebElement el4 = wd.findElement(By.linkText("Log in"));

        //css
        WebElement els1 = wd.findElement(By.cssSelector("#user"));
        WebElement els2 = wd.findElement(By.cssSelector(".form-field"));
        WebElement els3 = wd.findElement(By.cssSelector("[data-testid='bignav']"));
        WebElement els4 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement els5 = wd.findElement(By.cssSelector("a[href='/login']"));

        //login_css
        WebElement l1 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement l2 = wd.findElement(By.cssSelector("#user"));
        WebElement l3 = wd.findElement(By.cssSelector("#login"));
        WebElement l4 = wd.findElement(By.cssSelector("#login"));
        WebElement l5 = wd.findElement(By.cssSelector("#login-submit"));

        //assert
        WebElement al1 = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));
        WebElement al2 = wd.findElement(By.cssSelector(".js-open-header-member-menu"));
        WebElement al3 = wd.findElement(By.cssSelector(".js-open-header-member-menu"));

        //log out+logo
        WebElement l6 = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));
        WebElement l7 = wd.findElement(By.cssSelector("[data-testid='account-menu-logout']"));
        WebElement l8 = wd.findElement(By.cssSelector("#logout-submit"));
        WebElement l9 = wd.findElement(By.cssSelector("#logout-submit"));

        //logo
        // [data-testid='logout-button']
        //logo  [data-testid='logo_link']  [href='/home']






    }


}
