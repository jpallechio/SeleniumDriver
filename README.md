First I got the needed repositories for the chrome driver.
They were easy enough to find online. At the start I have only needed one dependency.
```        
<dependency>
   <groupId>org.seleniumhq.selenium</groupId>
   <artifactId>selenium-java</artifactId>
   <version>3.6.0</version>
</dependency>
```

After that I started looking at some examples and I used https://www.youtube.com/watch?v=Gum6WvZi20c as a starting point.

First I made sure that I could get the crhome driver running. This is when I found out that 
I needed to put a chromedriver.exe in my project. I did so and added it to the resource folder. After I fixed that I just ran a simple program that verified that the driver was working correctly.

```
System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://rbh.greenrivertech.net/login");
``` 

This simply opened the webpage, but it assured that I was on the right path.

I was trying to test a login page and the developers didn't put an ID on the button. This is something I will note in the future because it made it very difficult to test, eventually I found that the other buttons didn't actually have the class "btn" in them, so it sort of worked as an ID.

I tested the login, to make sure it worked I asserted that the current url was the url that returned when the login worked.

For my failed test I noticed that there is another login link that you can click.
It doesn't actually login, however it has the same symbol that the actual login
button uses.  