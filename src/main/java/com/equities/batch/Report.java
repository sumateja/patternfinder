package com.equities.batch;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author Sumateja K
 *
 * This source code is not open and can be used only with permissions.
 *  Report.java 2015
 */
@XmlRootElement(name="record")
public class Report {
	private String 	   ISIN;
	private Date date;
	private String symbol;
	private String series;
	private BigDecimal openPrice;	
	private BigDecimal highPrice;	

	private BigDecimal lowPrice;	
	private BigDecimal closePrice;	
	private BigDecimal prevClosePrice;
	private BigDecimal lastTradedPrice;
	private Integer totalTradedQty;
	private BigDecimal totalTradedValue;
	private Integer    totalTrades;
	/**
	 * @return the date
	 */
	@XmlElement(name="date")
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
	@XmlElement(name="symbol")
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
	@XmlElement(name="series")
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
	@XmlElement(name="open")
	public BigDecimal getOpenPrice() {
		return openPrice;
	}
	/**
	 * @param openPrice the openPrice to set
	 */
	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}
	/**
	 * @return the highPrice
	 */
	@XmlElement(name="high")
	public BigDecimal getHighPrice() {
		return highPrice;
	}
	/**
	 * @param highPrice the highPrice to set
	 */
	public void setHighPrice(BigDecimal highPrice) {
		this.highPrice = highPrice;
	}
	/**
	 * @return the lowPrice
	 */
	@XmlElement(name="low")

	public BigDecimal getLowPrice() {
		return lowPrice;
	}
	/**
	 * @param lowPrice the lowPrice to set
	 */
	public void setLowPrice(BigDecimal lowPrice) {
		this.lowPrice = lowPrice;
	}
	/**
	 * @return the closePrice
	 */
	@XmlElement(name="close")

	public BigDecimal getClosePrice() {
		return closePrice;
	}
	/**
	 * @param closePrice the closePrice to set
	 */
	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}

/**
	 * @return the lastTradedPrice
	 */
	@XmlElement(name="lastTradedPrice")
	public BigDecimal getLastTradedPrice() {
		return lastTradedPrice;
	}
	/**
	 * @param lastTradedPrice the lastTradedPrice to set
	 */
	public void setLastTradedPrice(BigDecimal lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}
	/**
	 * @return the prevClosePrice
	 */
	@XmlElement(name="prevClosePrice")
	public BigDecimal getPrevClosePrice() {
		return prevClosePrice;
	}
	/**
	 * @param prevClosePrice the prevClosePrice to set
	 */
	public void setPrevClosePrice(BigDecimal prevClosePrice) {
		this.prevClosePrice = prevClosePrice;
	}
	/**
	 * @return the totalTradedQty
	 */
	@XmlElement(name="totalTradedQty")
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
	 * @return the totalTrades
	 */
	@XmlElement(name="totalTrades")
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
	 * @return the iSIN
	 */
	@XmlElement(name="ISIN")
	public String getISIN() {
		return ISIN;
	}
	/**
	 * @param iSIN the iSIN to set
	 */
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
@Override
public String toString() {
	
	return "Stock Symbol:"+symbol+"Date:"+date;
}
/**
 * @return the totalTradedValue
 */
@XmlElement(name="totalTradedValue")
public BigDecimal getTotalTradedValue() {
	return totalTradedValue;
}
/**
 * @param totalTradedValue the totalTradedValue to set
 */
public void setTotalTradedValue(BigDecimal totalTradedValue) {
	this.totalTradedValue = totalTradedValue;
}


}


