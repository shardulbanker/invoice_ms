/**
 * 
 */
package com.assignment.invoice.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * @author SBanker
 *
 */
@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Invoice implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2839890625972122913L;

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String client;

	@Column
	private Long vatrate;

	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate invoicedate;

	@OneToMany(mappedBy = "invoice")
	private List<LineItem> lineItemList;

	/**
	 * @return the lineItemList
	 */
	public List<LineItem> getLineItemList() {
		return lineItemList;
	}

	/**
	 * @param lineItemList
	 * the lineItemList to set
	 */
	public void setLineItemList(List<LineItem> lineItemList) {
		this.lineItemList = lineItemList;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 * the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the invoicedate
	 */
	public LocalDate getInvoicedate() {
		return invoicedate;
	}

	/**
	 * @param localDate
	 * the invoicedate to set
	 */
	public void setInvoicedate(LocalDate localDate) {
		this.invoicedate = localDate;
	}

	/**
	 * @return the vatrate
	 */
	public Long getVatrate() {
		return vatrate;
	}

	/**
	 * @param vatrate
	 * the vatrate to set
	 */
	public void setVatrate(Long vatrate) {
		this.vatrate = vatrate;
	}


}
