import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @BeforeClass
    public void setUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


        wd = new ChromeDriver(options);


        //wd.get("https://google.com/");
        //wd.get("https://trello.com/");
    }

    @Test
    public void start1(){
        //wd = new ChromeDriver();
        wd.navigate().to("https://google.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        wd.close();
        wd.quit();

    }

    @Test

    public void start2(){

        //wd=new ChromeDriver();

        wd.navigate().to("https://trello.com/");

        wd.navigate().back();

        wd.navigate().forward();

        wd.navigate().refresh();





        wd.close();

        wd.quit();





    }


}


