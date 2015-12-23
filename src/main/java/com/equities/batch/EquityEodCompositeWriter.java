package com.equities.batch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.equities.pojo.EodDataBean;

/**
 * @author Sumateja K
 *
 * This source code is not open and can be used only with permissions.
 *  EquityEodCompositeWriter.java 2015
 */
public class EquityEodCompositeWriter implements ItemWriter<EodDataBean>{
	
	ItemWriter<EodDataBean> eodDataWriter;
	ItemWriter<EodDataBean> narrowRangeWriter;
	ItemWriter<EodDataBean> insideDayWriter;



	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemWriter#write(java.util.List)
	 */
	@Override
	public void write(List<? extends EodDataBean> items) throws Exception {

		List<EodDataBean> eodData=new ArrayList<EodDataBean>();
		List<EodDataBean> patternInsideDay=new ArrayList<EodDataBean>();
		List<EodDataBean> patternNR=new ArrayList<EodDataBean>();
		
		for(EodDataBean stock:items)
		{
			if(stock.isInsideDayFormed())
			{
				patternInsideDay.add(stock);
			}
		}

		eodDataWriter.write(items);
		insideDayWriter.write(patternInsideDay);
		narrowRangeWriter.write(items);


	}
	
	
	public void setDelegate1(ItemWriter<EodDataBean> eodDataWriter)
	{
		this.eodDataWriter=eodDataWriter;
	}
	public void setDelegate2(ItemWriter<EodDataBean> insideDayWriter)
	{
		this.insideDayWriter=eodDataWriter;
	}
	public void setDelegate3(ItemWriter<EodDataBean> narrowRangeWriter)
	{
		this.narrowRangeWriter=narrowRangeWriter;
	}

}
