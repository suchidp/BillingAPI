package com.cybage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Invoice;


public interface InvoiceService {
	public Invoice save(Invoice invoice);
	public List<Invoice> getAllInvoice() ;

	//public Invoice save(Invoice Invoice);

	public Invoice findInvoicetById(int invoiceId);
}
