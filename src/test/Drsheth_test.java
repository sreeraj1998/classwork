package test;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.Drshethslogin;

public class Drsheth_test extends Baseclass  {
@Test
public void testing() throws InterruptedException
{
	Drshethslogin ob =new Drshethslogin(driver);
	ob.a();
	/*ob.b();
	ob.c();
	ob.d();*/
	ob.e();
	Thread.sleep(3000);
	ob.f();
	Thread.sleep(5000);
	ob.search("sunscreen");
	Thread.sleep(3000);
	ob.product();
	Thread.sleep(3000);
	ob.addcart();
	
	
	
}
}
