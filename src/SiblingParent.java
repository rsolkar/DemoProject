import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingParent {

	public static void main(String[] args) 
	{
		//Parent to child to sibling - //header/div/button[1]/following-sibling::button[2]
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rutuj\\OneDrive\\Documents\\EclipseWorkspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String buttontext = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText();
		System.out.println(buttontext);
		//Child to parent to Grandparent to child -//header/div/button[1]/parent::div/parent::header/a[2]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String buttontext2 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText();
		System.out.println(buttontext2);
		
	}

}
