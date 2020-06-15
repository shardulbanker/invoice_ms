/**
 * 
 */
package com.assignment.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assignment.invoice.entity.LineItem;

/**
 * @author SBanker
 *
 */
@Repository
public interface LineItemRepository extends JpaRepository<LineItem, Long> {

}
