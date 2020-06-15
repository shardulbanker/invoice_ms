/**
 * 
 */
package com.assignment.invoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.invoice.entity.Invoice;
import com.assignment.invoice.entity.LineItem;
import com.assignment.invoice.service.InvoiceService;
import com.assignment.invoice.service.LineItemService;
import com.assignment.invoice.vos.InvoiceDataRequest;
import com.assignment.invoice.vos.InvoiceValueDetails;
import com.assignment.invoice.vos.LineItemData;

/**
 * @author SBanker
 *
 */
@RestController
@RequestMapping(value = "/")
public class InvoiceController {

	@Autowired
	InvoiceService invoiceService;

	@Autowired
	LineItemService lineItemService;

	@GetMapping(value = "/invoices")
	public InvoiceValueDetails getAllInvoices() {
		return invoiceService.getAllInvoices();
	}

	@RequestMapping(value = "/invoices", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String addInvoice(@RequestBody InvoiceDataRequest invoiceDataRequest) {
		Invoice invoice = new Invoice();
		invoice.setClient(invoiceDataRequest.getClient());
		invoice.setVatrate(invoiceDataRequest.getVatRate());
		invoice.setInvoicedate(invoiceDataRequest.getInvoiceDate());
		invoiceService.save(invoice);
		for (LineItemData lineItemContent : invoiceDataRequest.getLineItemData()) {
			LineItem lineItem = new LineItem();
			lineItem.setQuantity(lineItemContent.getQuantity());
			lineItem.setUnitPrice(lineItemContent.getUnitprice());
			lineItem.setDescription(lineItemContent.getDescription());
			lineItem.setInvoice(invoice);
			lineItemService.saveLineItem(lineItem);
		}
		return "Invoice details save successfully";


	}
	@GetMapping(value = "/invoices/{invoiceId}")
	public Invoice getInvoice(@PathVariable("invoiceId") long invoiceId) {
		return invoiceService.getInvoiceById(invoiceId);
	}

}
