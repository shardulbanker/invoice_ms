/**
 * 
 */
package com.assignment.invoice.vos;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author SBanker
 *
 */
public class InvoiceDetails {
	private long invoiceId;
	private String client;
	private LocalDate invoiceDate;
	private BigDecimal totalValueWithoutVat;
	private BigDecimal totalvalueIncVat;

	/**
	 * @return the invoiceId
	 */
	public long getInvoiceId() {
		return invoiceId;
	}

	/**
	 * @param invoiceId
	 * the invoiceId to set
	 */
	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

	/**
	 * @return the totalValueWithoutVat
	 */
	public BigDecimal getTotalValueWithoutVat() {
		return totalValueWithoutVat;
	}

	/**
	 * @param totalValueWithoutVat
	 * the totalValueWithoutVat to set
	 */
	public void setTotalValueWithoutVat(BigDecimal totalValueWithoutVat) {
		this.totalValueWithoutVat = totalValueWithoutVat;
	}

	/**
	 * @return the totalvalueIncVat
	 */
	public BigDecimal getTotalvalueIncVat() {
		return totalvalueIncVat;
	}

	/**
	 * @param totalvalueIncVat
	 * the totalvalueIncVat to set
	 */
	public void setTotalvalueIncVat(BigDecimal totalvalueIncVat) {
		this.totalvalueIncVat = totalvalueIncVat;
	}

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
	 * @return the invoiceDate
	 */
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param localDate
	 * the invoiceDate to set
	 */
	public void setInvoiceDate(LocalDate localDate) {
		this.invoiceDate = localDate;
	}

}
