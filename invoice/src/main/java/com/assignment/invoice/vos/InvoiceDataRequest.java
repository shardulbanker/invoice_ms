/**
 * 
 */
package com.assignment.invoice.vos;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author SBanker
 *
 */

public class InvoiceDataRequest {


	private String client;
	private long vatRate;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate invoiceDate;

	private List<LineItemData> lineItemData;

	/**
	 * @return the client
	 */
	public String getClient() {
		return client;
	}

	/**
	 * @param client
	 * the client to set
	 */
	public void setClient(String client) {
		this.client = client;
	}

	/**
	 * @return the vatRate
	 */
	public long getVatRate() {
		return vatRate;
	}

	/**
	 * @param vatRate
	 * the vatRate to set
	 */
	public void setVatRate(long vatRate) {
		this.vatRate = vatRate;
	}

	/**
	 * @return the invoiceDate
	 */
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate
	 * the invoiceDate to set
	 */
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the lineItemData
	 */
	public List<LineItemData> getLineItemData() {
		return lineItemData;
	}

	/**
	 * @param lineItemData
	 * the lineItemData to set
	 */
	public void setLineItemData(List<LineItemData> lineItemData) {
		this.lineItemData = lineItemData;
	}

}
