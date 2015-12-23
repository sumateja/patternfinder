package com.equities.batch;

import org.springframework.batch.item.ItemProcessor;

import com.equities.pojo.EodDataBean;

/**
 * @author Sumateja K
 *
 * This source code is not open and can be used only with permissions.
 *  CustomeItemProcessor.java 2015
 */
public class EquityEodProcessor implements ItemProcessor<EodDataBean,EodDataBean>{
	
	private static final String EQUITY_SERIES="EQ";

	/* (non-Javadoc)
	 * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object)
	 */
	public EodDataBean process(EodDataBean item) throws Exception {

		if(null!=item && item.getSeries().equals(EQUITY_SERIES))
		{
			System.out.println("Processing "+item);
			
			//TODO Get values from database 
			Double prevHigh=new Double(0);
			Double prevLow=new Double(0);

			//Find Inside Day
			/*if(item.getHighPrice() < prevHigh && item.getLowPrice() > prevLow)
			{*/
			item.setInsideDayFormed(false);
			//}
			
			//Find TR
			Double tr1=item.getHighPrice()-item.getLowPrice();
			Double tr2=item.getPrevClosePrice()-item.getHighPrice();
			Double tr3=item.getPrevClosePrice()-item.getLowPrice();
			Double trueRange=Math.max(Math.max(tr1,tr2),tr3);
			
			item.setTrueRange(trueRange);

			//TODO Get values from database 
			
			item.setNarrowRange("XXX");
			
		
		return item;

		}
		
		return null;
	}
	

}
