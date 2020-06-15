/**
 * 
 */
package com.assignment.invoice.vos;

import java.util.List;

/**
 * @author SBanker
 *
 */
public class InvoiceValueDetails {

	private List<InvoiceDetails> invoiceDetails;

	/**
	 * @return the invoiceDetails
	 */
	public List<InvoiceDetails> getInvoiceDetails() {
		return invoiceDetails;
	}

	/**
	 * @param invoiceDetails
	 * the invoiceDetails to set
	 */
	public void setInvoiceDetails(List<InvoiceDetails> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

}
