package com.equities.batch;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import com.equities.util.Utils;

public class BhavCopyCashMarketURLBean {
	
	private String todayBhavCopyURL="";
	
	File csvFile;
	
	String csvFileName;
	
	//Sample URL http://www.nseindia.com/content/historical/EQUITIES/2015/OCT/cm21OCT2015bhav.csv.zip
	private static String BASE_URL="http://www.nseindia.com/content/historical/EQUITIES/";
	
	BhavCopyCashMarketURLBean()
	{
		this.todayBhavCopyURL=buildBhavURL();
		this.csvFile=unZipEquityFile();
	}
	
	private File unZipEquityFile()
	{
		String source = this.todayBhavCopyURL;
	    File destination = new File("src/main/resources");

		try {
			csvFile=Utils.unpackArchive(new URL(source), destination);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return csvFile;
		
	}
	
	
	private String buildBhavURL() {
		
		StringBuffer bhavURLBuffer=new StringBuffer(BASE_URL);
		Calendar instance=Calendar.getInstance();

		String year= String.valueOf(instance.get(Calendar.YEAR));
		String month= new SimpleDateFormat("MMM").format(instance.getTime()).toUpperCase();
		String date=new SimpleDateFormat("dd").format(instance.getTime());
		
		bhavURLBuffer.append(year);
		bhavURLBuffer.append('/');
		bhavURLBuffer.append(month);
		bhavURLBuffer.append('/');

		StringBuffer fileNameBuffer=new StringBuffer("cm");

		fileNameBuffer.append(date);
		fileNameBuffer.append(month);
		fileNameBuffer.append(year);
		fileNameBuffer.append("bhav.csv");
		this.setCsvFileName(fileNameBuffer.toString());
		fileNameBuffer.append(".zip");

		return bhavURLBuffer.append(fileNameBuffer).toString();
	}

	public String getBhavCopyURL()
	{
		return this.todayBhavCopyURL;
	}

	/**
	 * @return the csvFileName
	 */
	public String getCsvFileName() {
		return csvFileName;
	}

	/**
	 * @param csvFileName the csvFileName to set
	 */
	public void setCsvFileName(String csvFileName) {
		this.csvFileName = csvFileName;
	}

}
