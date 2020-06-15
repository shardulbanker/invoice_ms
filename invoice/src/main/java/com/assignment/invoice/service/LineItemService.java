/**
 * 
 */
package com.assignment.invoice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.invoice.entity.LineItem;
import com.assignment.invoice.repository.LineItemRepository;

/**
 * @author SBanker
 *
 */
@Service
public class LineItemService {
	@Autowired
	LineItemRepository lineItemRepository;

	/**
	 * @param lineItem
	 * @author SBanker
	 * @ModifiedBy SBanker
	 * @ModifiedDate Jun 13, 2020
	 */
	public void saveLineItem(LineItem lineItem)
	{
		lineItemRepository.save(lineItem);
	}

}
