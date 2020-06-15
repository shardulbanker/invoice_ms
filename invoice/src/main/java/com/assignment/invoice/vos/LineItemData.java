/**
 * 
 */
package com.assignment.invoice.vos;

import java.math.BigDecimal;

/**
 * @author SBanker
 *
 */
public class LineItemData {

	private long quantity;
	private String description;
	private BigDecimal unitprice;

	/**
	 * @return the quantity
	 */
	public long getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 * the quantity to set
	 */
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 * the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the unitprice
	 */
	public BigDecimal getUnitprice() {
		return unitprice;
	}

	/**
	 * @param unitprice
	 * the unitprice to set
	 */
	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}

}
