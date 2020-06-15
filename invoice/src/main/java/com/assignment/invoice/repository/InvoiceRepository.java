/**
 * 
 */
package com.assignment.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.invoice.entity.Invoice;

/**
 * @author SBanker
 *
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
