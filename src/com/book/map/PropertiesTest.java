package com.book.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties可以把key-value对以XML文件的形式保存起来
 * 也可以从XML文件中读取key-value对
 *
 */

public class PropertiesTest 
{
	public static void main(String[] args) throws IOException
	{
		Properties props = new Properties();
		
		props.setProperty("username", "Jillie");
		props.setProperty("password", "123465");
		
		props.store(new FileOutputStream("D:\\Temp\\PropretiesTest"), "Just test");
		
		Properties props2 = new Properties();
		
		props2.setProperty("gendar", "male");
		props2.load(new FileInputStream("D:\\\\Temp\\\\PropretiesTest"));
		
		System.out.println("props: " + props);
		System.out.println("props2: " + props2);
	}
}
