package google_tests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Testcases {
	
	public void Gettexts()
	{
		//initiating chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jagriti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver obj1=new ChromeDriver();	
	obj1.get("https://www.google.com/");
	obj1.manage().window().maximize();
		
	//specifing the expected  text on Google.com and obtained text from Google.com via Webdriver
	String expectedtext1="Gmail";
    String Obtainedtext1=obj1.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).getText();
String expectedtext2="Images";
    String Obtainedtext2=obj1.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).getText();
    String expectedtext3="Google Search";
    String Obtainedtext3=obj1.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).getAttribute("value");
    String expectedtext4="I'm Feeling Lucky";
    String Obtainedtext4=obj1.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[2]")).getAttribute("value");
    
    //storing above string into arrays
    String[] Arrayexpectedtext=new String[4];
    Arrayexpectedtext[0]=expectedtext1;
    Arrayexpectedtext[1]=expectedtext2;
    Arrayexpectedtext[2]=expectedtext3;
    Arrayexpectedtext[3]=expectedtext4;
    
    String[] ArrayObtainedtext=new String[4];
    ArrayObtainedtext[0]= Obtainedtext1;
    ArrayObtainedtext[1]= Obtainedtext2;
    ArrayObtainedtext[2]= Obtainedtext3;
    ArrayObtainedtext[3]= Obtainedtext4;

  //using arrays to comapre the expected text and obtained text from google.com 
  for(int i=0;i<4;i++)
    {
    	 int a=i+1;
    if(Arrayexpectedtext[i].equalsIgnoreCase(ArrayObtainedtext[i]))
    { 
    	System.out.println("Test Passed! expectedtext"+a+" = ObtainedText"+a);
    	
    }
    else
    {
    	System.out.println("Test Failed! expectedtext"+a+" is not ObtainedText"+a);
    	
    }
    }
    obj1.close();
    }
	
	
	
public void linkcheck() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jagriti\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver obj2=new ChromeDriver();
	obj2.get("https://www.google.com/");
	
	//maximizing the window size 
	obj2.manage().window().maximize();
	
	//getting to element and clicking to naviagte to another URL grom google.com
	 obj2.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).click();
	
	//storing expected values of URL and obtained values of URl into strings
	String obtainedNavigationTo1=obj2.getCurrentUrl();
	 String expectedNavigationTo1="https://www.google.co.in/imghp?hl=en&tab=wi";
	 obj2.findElement(By.xpath("//*[@id=\"fsl\"]/a[1]")).click();
	 String obtainedNavigationTo2=obj2.getCurrentUrl();
	 String expectedNavigationTo2="https://ads.google.com/intl/en_in/home/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1";
	 obj2.navigate().back();
	 obj2.findElement(By.xpath("//*[@id=\"fsl\"]/a[2]")).click();
	 String obtainedNavigationTo3=obj2.getCurrentUrl();
	 String expectedNavigationTo3="https://www.google.co.in/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1#?modal_active=none";
	 
	//navigate back
	obj2.navigate().back();
	 
	//finding textbox on google.com and entering text "redcarpetup delhi" and hitting enter
	obj2.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("redcarpetup delhi",Keys.ENTER);
	 String obtainedNavigationTo4=obj2.getCurrentUrl();
	 String expectedNavigationTo4="https://www.google.co.in/search?hl=en&tbm=isch&source=hp&biw=1366&bih=613&ei=sXFcXNP4FcWMvQSlrI_gAg&q=redcarpetup+delhi&oq=redcarpetup+delhi&gs_l=img.3...210.353..359...0.0..0.0.0.......0....1..gws-wiz-img.";
	 
	//string strings into arrays to compare the expected and obtained value 
	 String[] ArrayexpectedNavigationTo=new String[4];
		ArrayexpectedNavigationTo[0]=expectedNavigationTo1;
		ArrayexpectedNavigationTo[1]=expectedNavigationTo2;
		ArrayexpectedNavigationTo[2]=expectedNavigationTo3;
		ArrayexpectedNavigationTo[3]=expectedNavigationTo4;
		
		String[] ArrayobtainedNavigationTo=new String[4];
		ArrayobtainedNavigationTo[0]=obtainedNavigationTo1;
		ArrayobtainedNavigationTo[1]=obtainedNavigationTo2;
		ArrayobtainedNavigationTo[2]=obtainedNavigationTo3;
		ArrayobtainedNavigationTo[3]=obtainedNavigationTo4;
		
		for(int i=0;i<4;i++)
	    {
	    	 int a=i+1;
	    if(ArrayexpectedNavigationTo[i].equalsIgnoreCase(ArrayobtainedNavigationTo[i]))
	    { 
	    	System.out.println("Test Passed! expectedNavigationTo"+a+" = obtainedNavigationTo"+a);
	    	
	    }
	    else
	    {
	    	System.out.println("Test Failed! expectedNavigationTo"+a+" is not obtainedNavigationTo"+a);
	    	
	    }
	    }
		obj2.close();
}

	}


