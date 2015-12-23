package com.equities.batch;



import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.equities.pojo.EodDataBean;
/**
 * @author Sumateja K
 *
 * This source code is not open and can be used only with permissions.
 *  ReportFieldSetMapper.java 2015
 */
public class ReportFieldSetMapper implements FieldSetMapper<EodDataBean>{

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.file.mapping.FieldSetMapper#mapFieldSet(org.springframework.batch.item.file.transform.FieldSet)
	 */
	public EodDataBean mapFieldSet(FieldSet fieldSet) throws BindException {

		EodDataBean report =new EodDataBean();
		report.setSymbol(fieldSet.readString(0));
		report.setSeries(fieldSet.readString(1));
		report.setOpenPrice(fieldSet.readDouble(2));
		report.setHighPrice(fieldSet.readDouble(3));
		report.setLowPrice(fieldSet.readDouble(4));
		report.setClosePrice(fieldSet.readDouble(5));
		report.setLastTradedPrice(fieldSet.readDouble(6));
		report.setPrevClosePrice(fieldSet.readDouble(7));
		report.setTotalTradedQty(fieldSet.readInt(8));
		report.setTotalTradedValue(fieldSet.readDouble(9));

		String date=fieldSet.readString(10);
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yy");
		
		try {

			report.setDate(formatter.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		report.setTotalTrades(fieldSet.readInt(11));
		report.setISIN(fieldSet.readString(12));

		return report;
	}
	

}
