package com.equities.pojo;

import java.util.Date;

/**
 * @author Sumateja K
 *
 * This source code is not open and can be used only with permissions.
 *  EodDataBean.java 2015
 */
public class EodDataBean {


	private String 	   ISIN;
	private Date       date;
	private String     symbol;
	private String     series;
	private Double openPrice;	
	private Double highPrice;	

	private Double lowPrice;	
	private Double closePrice;	
	private Double prevClosePrice;
	private Double lastTradedPrice;
	private Integer    totalTradedQty;
	private Double totalTradedValue;
	private Integer    totalTrades;
	
	//Computed Values
	private boolean isInsideDayFormed;
	private Double  trueRange;
	private String  narrowRange;
	/**
	 * @return the iSIN
	 */
	public String getISIN() {
		return ISIN;
	}
	/**
	 * @param iSIN the iSIN to set
	 */
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}
	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	/**
	 * @return the series
	 */
	public String getSeries() {
		return series;
	}
	/**
	 * @param series the series to set
	 */
	public void setSeries(String series) {
		this.series = series;
	}
	/**
	 * @return the openPrice
	 */
	public Double getOpenPrice() {
		return openPrice;
	}
	/**
	 * @param openPrice the openPrice to set
	 */
	public void setOpenPrice(Double openPrice) {
		this.openPrice = openPrice;
	}
	/**
	 * @return the highPrice
	 */
	public Double getHighPrice() {
		return highPrice;
	}
	/**
	 * @param highPrice the highPrice to set
	 */
	public void setHighPrice(Double highPrice) {
		this.highPrice = highPrice;
	}
	/**
	 * @return the lowPrice
	 */
	public Double getLowPrice() {
		return lowPrice;
	}
	/**
	 * @param lowPrice the lowPrice to set
	 */
	public void setLowPrice(Double lowPrice) {
		this.lowPrice = lowPrice;
	}
	/**
	 * @return the closePrice
	 */
	public Double getClosePrice() {
		return closePrice;
	}
	/**
	 * @param closePrice the closePrice to set
	 */
	public void setClosePrice(Double closePrice) {
		this.closePrice = closePrice;
	}
	/**
	 * @return the prevClosePrice
	 */
	public Double getPrevClosePrice() {
		return prevClosePrice;
	}
	/**
	 * @param prevClosePrice the prevClosePrice to set
	 */
	public void setPrevClosePrice(Double prevClosePrice) {
		this.prevClosePrice = prevClosePrice;
	}
	/**
	 * @return the lastTradedPrice
	 */
	public Double getLastTradedPrice() {
		return lastTradedPrice;
	}
	/**
	 * @param lastTradedPrice the lastTradedPrice to set
	 */
	public void setLastTradedPrice(Double lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}
	/**
	 * @return the totalTradedQty
	 */
	public Integer getTotalTradedQty() {
		return totalTradedQty;
	}
	/**
	 * @param totalTradedQty the totalTradedQty to set
	 */
	public void setTotalTradedQty(Integer totalTradedQty) {
		this.totalTradedQty = totalTradedQty;
	}
	/**
	 * @return the totalTradedValue
	 */
	public Double getTotalTradedValue() {
		return totalTradedValue;
	}
	/**
	 * @param totalTradedValue the totalTradedValue to set
	 */
	public void setTotalTradedValue(Double totalTradedValue) {
		this.totalTradedValue = totalTradedValue;
	}
	/**
	 * @return the totalTrades
	 */
	public Integer getTotalTrades() {
		return totalTrades;
	}
	/**
	 * @param totalTrades the totalTrades to set
	 */
	public void setTotalTrades(Integer totalTrades) {
		this.totalTrades = totalTrades;
	}
	/**
	 * @return the isInsideDayFormed
	 */
	public boolean isInsideDayFormed() {
		return isInsideDayFormed;
	}
	/**
	 * @param isInsideDayFormed the isInsideDayFormed to set
	 */
	public void setInsideDayFormed(boolean isInsideDayFormed) {
		this.isInsideDayFormed = isInsideDayFormed;
	}
	/**
	 * @return the trueRange
	 */
	public Double getTrueRange() {
		return trueRange;
	}
	/**
	 * @param trueRange the trueRange to set
	 */
	public void setTrueRange(Double trueRange) {
		this.trueRange = trueRange;
	}
	/**
	 * @return the narrowRange
	 */
	public String getNarrowRange() {
		return narrowRange;
	}
	/**
	 * @param narrowRange the narrowRange to set
	 */
	public void setNarrowRange(String narrowRange) {
		this.narrowRange = narrowRange;
	}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "ISIN:"+this.getISIN()+"Name:"+this.getSymbol();
}
}
