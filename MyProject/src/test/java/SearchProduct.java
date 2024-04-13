import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SearchProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("com.MyData","C:\\Users\\dhabe\\OneDrive\\Desktop\\Project\\edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		driver.findElement(By.id("nav-input nav-progressive-attribute")).click();
		driver.get("https://www.amazon.in/OFF-LIMITS-Mens-Bistro-Casual/dp/B0CV5T5HCG/ref=sr_1_4_sspa?crid=H2VQHAILEN32&dib=eyJ2IjoiMSJ9.0wpITefRHqlBQMtwpi5Cp_HYmlTv97Rzsnaw-KfMErHp-8bieONIGocxSqDqKrDXHEo2o1jKB7iDqUNvzwvcWrBvyNyt5WeJwB5uiUtO5jIw50dlH9hKo7HeHaPuTz6kUvCEZjFFeyF0HdPk7WpiRnZ-IyBFTnsUFvmKkOYOQuH3xg-RGnfeNUqvNCJsq0GtPhf2UE5JU4pTMXv-AKQsbc3FfStYgZelcMlPsHnLUqTPRCX0iPcFSgxm3U0R4Xvr8YopngQHOWmNQH-1ng5Ngy47GBFybLiN4A5Og7WPNz0.7ifFI7Qnqj3f-tmfXCwOFGhabkd4rvDTvEmyHh2pOcE&dib_tag=se&keywords=shoes&qid=1713004997&sprefix=shoes%2Caps%2C261&sr=8-4-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");

	}

}
