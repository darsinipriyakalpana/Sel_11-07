package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("www.amazon.com");
}
}
