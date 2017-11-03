package com.cn;
/*
 * testNG的参数化案例
 */
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddTest {

  @DataProvider(name="c")
  public Object[][] createDate()               
	{
		return new Object[][]{
				{0,2,2},{2,1,3},{9,3,12}
				};
	}
	
  @Test(dataProvider="c")
  public void add(int x,int y,int result) 
  {
	Add a=new Add();
    Assert.assertEquals(a.add(x, y), result);
  }
}
