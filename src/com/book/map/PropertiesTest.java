package com.book.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties���԰�key-value����XML�ļ�����ʽ��������
 * Ҳ���Դ�XML�ļ��ж�ȡkey-value��
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
