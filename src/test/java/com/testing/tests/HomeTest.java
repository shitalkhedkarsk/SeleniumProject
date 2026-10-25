package com.testing.tests;

import org.jspecify.annotations.Nullable;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testing.base.BaseTest;

public class HomeTest extends BaseTest
{
	@Test
	public void verifyFlipkartTitle()
	{
		@Nullable
		String title = driver.getTitle();
		System.out.println("Page Title: "+title);
		Assert.assertTrue(
				title.toLowerCase().contains("flipkart"),
	            "Flipkart title verification failed."
	        );
		
	}
}
