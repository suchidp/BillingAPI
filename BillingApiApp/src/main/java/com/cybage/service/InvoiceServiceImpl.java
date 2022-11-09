package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.InvoiceDao;
import com.cybage.model.Invoice;
@Service
public class InvoiceServiceImpl implements InvoiceService{
  @Autowired
  private InvoiceDao invoicedao; 
	@Override
	public Invoice save(Invoice invoice) {
		// TODO Auto-generated method stub
		return invoicedao.save(invoice);
	}
	@Override
	public List<Invoice> getAllInvoice() {
		// TODO Auto-generated method stub
		return invoicedao.findAll();
	}
	@Override
	public Invoice findInvoicetById(int invoiceId) {
		// TODO Auto-generated method stub
		return invoicedao.findById(invoiceId).orElse(null);
	}

}
