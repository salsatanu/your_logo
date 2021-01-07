
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */\
class Automate
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Webdriver driver = new driver();
			
		//Navigate to various pages and check the existence of header and footer	
		public static void header_footer() throws exception
		{
	    	driver.navigate().to("http://automationpractice.com/index.php");
	    	thread.sleep(3000);
	    	List<WebElement> Header =  driver.findElement(By.xpath('//div[@id='header_logo']'))
	    	if(Header.size() > 0)
            {
                System.out.println("Logo is present in the header");
            }else
            {
            	System.out.println("Header is missing");
           }
		
		driver.execute_script("arguments[0].scrollIntoView()");
	    List<WebElement> Footer =  driver.findElement(By.xpath('//div[@class='footer-container']/footer/div/div[@id='newsletter_block_left']'));
	    	if(Footer.size() > 0)
            {
                System.out.println("Newsletter block is present in the footer");
            }else
            {
            	System.out.println("Footer is missing");
           }
	    
 	    driver.navigate().to("http://automationpractice.com/index.php?id_category=8&controller=category");
		thread.sleep(3000);
	    	List<WebElement> Header =  driver.findElement(By.xpath('//div[@id='header_logo']'))
	    	if(Header.size() > 0)
            {
                System.out.println("Logo is present in the header");
            }else
            {
            	System.out.println("Header is missing");
           }
		driver.execute_script("arguments[0].scrollIntoView()");
	    List<WebElement> Footer =  driver.findElement(By.xpath('//div[@class='footer-container']/footer/div/div[@id='newsletter_block_left']'));
	    	if(Footer.size() > 0)
            {
                System.out.println("Newsletter block is present in the footer");
            }else
            {
            	System.out.println("Footer is missing");
           }
	}
	
	//Automate Newsletter subscription\
	public static void newsletter_subscription() throws exception
	{
		driver.navigate().to("http://automationpractice.com/index.php");
	    thread.sleep(3000);
	    List<WebElement> Footer =  driver.findElement(By.xpath('//div[@class='footer-container']/footer/div/div[@id='newsletter_block_left']'));
		driver.execute_script("arguments[0].scrollIntoView(), Footer");
		driver.findElement(By.xpath('//div[@id='newsletter_block_left']/div/form/div/input')).sendKeys('tarnnum.axelerant@gmail.com');
        driver.findElement(By.xpath('//button[@name='submitNewsletter']')).click();
        List<WebElement> verify_msg = driver.findElement(By.xpath('//p[@class='alert alert-success']')).getText();
        if(verify_msg.equalsIgnorecase(' Newsletter : You have successfully subscribed to this newsletter.')
        {
             System.out.println("Successfully subscribed");
        }else
        {
        	System.out.println("Subscription failed");
       }
   }
    
    // Automate listing page\
    public static void listing_page() throws exception
	{
		driver.navigate().to("http://automationpractice.com/index.php");
	    thread.sleep(3000);
	    //Size filter
	    driver.findElement(By.xpath('//div[@id='uniform-layered_id_attribute_group_3']/label')).click();
	   thread.sleep(5000);
	   List<WebElement> grid_count_text = driver.findElement(By.xpath('//div[@class='product-count']').getText();
	   if(grid_count_text!='')
	   {
	   	System.out.println("Size filter is working");
	  }
	   //Color filter
	   driver.findElement(By.xpath('//ul[@id="ul_layered_id_attribute_group_3"']/li[4]/input')).click();
	   thread.sleep(5000);
	   List<WebElement> grid_count_text = driver.findElement(By.xpath('//div[@class='product-count']').getText();
	   if(grid_count_text!='')
	   {
	   	System.out.println("Size filter is working");
	  }
	   //Sorting filter
	   driver.findElement(By.xpath('//div[@id='uniform-selectProductSort']/select)).click();
	   List<WebElement> options = driver.findElements(By.xpath('//div[@id='uniform-selectProductSort']/select/option'));
	 for(i=0;i<=options.size()-1;i++)
	 {
		 if(options[i].getText().equalsIgnorecase('Product Name: Z to A')
		 {
		 	options[i].click();
		 }else
		 {
		 	break;
		}
   }
    List<WebElement> grid_count_text = driver.findElement(By.xpath('//div[@class='product-count']').getText();
	   if(grid_count_text!='')
	   {
	   	System.out.println("Sorting filter is working");
	  }
}
    //Checkout process\
     public static void checkout() throws exception\
	{
	    driver.navigate().to("http://automationpractice.com/index.php?id_category=11&controller=category");
	    thread.sleep(3000);
        List<WebElement> grid_list = driver.findElements(By.xpath('//ul[@class='product_list grid row']/li));
       for(i=0;i<=grid_list.size()-1;i++)
       {
       	if(grid_list[i].Text().EqualsIgnorecase('Printed Chiffon Dress'))
       	{
       	 Actions actions = new Actions(driver);
       	 actions.moveToElement(grid_list[i]).perform();
       	 driver.findElement(By.xpath('//a[@class='button ajax_add_to_cart_button btn btn-default')).click();
        driver.findElement(By.xpath('//a[@class='btn btn-default button button-medium'])).click();
     }
      }
      }
	}
	}
}