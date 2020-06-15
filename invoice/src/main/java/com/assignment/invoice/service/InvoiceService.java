/**
 * 
 */
package com.assignment.invoice.service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.invoice.entity.Invoice;
import com.assignment.invoice.entity.LineItem;
import com.assignment.invoice.repository.InvoiceRepository;
import com.assignment.invoice.vos.InvoiceDetails;
import com.assignment.invoice.vos.InvoiceValueDetails;

/**
 * @author SBanker
 *
 */
@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	/**
	 * @param invoice
	 * @author SBanker
	 * @ModifiedBy SBanker
	 * @ModifiedDate Jun 13, 2020
	 */
	public void save(Invoice invoice)
	{
		invoiceRepository.save(invoice);
	}

	/**
	 * @return
	 * @author SBanker
	 * @ModifiedBy SBanker
	 * @ModifiedDate Jun 13, 2020
	 */
	public InvoiceValueDetails getAllInvoices() {

		List<Invoice> invoiceList = invoiceRepository.findAll();
		InvoiceValueDetails invoiceValueDetails = new InvoiceValueDetails();
		List<InvoiceDetails> invoiceDetailsList = new ArrayList<>();
		
		MathContext mc = new MathContext(2);
		for (Invoice inv : invoiceList) {
			InvoiceDetails invoiceDetails = new InvoiceDetails();
			BigDecimal totalValue = new BigDecimal("0.00");
			BigDecimal totalValueIncVat = new BigDecimal("0.00");
			for (LineItem lineItem : inv.getLineItemList()) {
				totalValue = totalValue.add((BigDecimal.valueOf(lineItem.getQuantity()).multiply(lineItem.getUnitPrice(), mc)));
			}
			totalValueIncVat = totalValue.add(BigDecimal.valueOf(inv.getVatrate()));
			invoiceDetails.setTotalvalueIncVat(totalValueIncVat);
			invoiceDetails.setTotalValueWithoutVat(totalValue);
			invoiceDetails.setInvoiceId(inv.getId());
			invoiceDetails.setClient(inv.getClient());
			invoiceDetails.setInvoiceDate(inv.getInvoicedate());
			invoiceDetailsList.add(invoiceDetails);
		}
		invoiceValueDetails.setInvoiceDetails(invoiceDetailsList);

		return invoiceValueDetails;
	}

	/**
	 * @param invoiceId
	 * @return
	 * @author SBanker
	 * @ModifiedBy SBanker
	 * @ModifiedDate Jun 13, 2020
	 */
	public Invoice getInvoiceById(long invoiceId) {
		
		return invoiceRepository.findById(invoiceId).isPresent() ? invoiceRepository.findById(invoiceId).get() : null;
	}

}
