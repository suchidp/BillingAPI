package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.dto.InvoiceRequestDTO;
import com.cybage.model.Invoice;
import com.cybage.service.InvoiceService;
import com.cybage.service.InvoiceServiceImpl;

@RestController
@EnableAutoConfiguration
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
	private InvoiceServiceImpl invoiceService;
  
  
  
  
  
  @GetMapping("/{invoiceId}")
	public ResponseEntity<?> findInvoicetById(@PathVariable int invoiceId) {
		Invoice  invoice = invoiceService.findInvoicetById(invoiceId);
		return new ResponseEntity<>(invoiceService.findInvoicetById(invoiceId), HttpStatus.OK);
	}
	@GetMapping("")
	public ResponseEntity<?> getAllInvoice() {
		return new ResponseEntity<>(invoiceService.getAllInvoice(), HttpStatus.OK);
	}
	/*
	@PostMapping("")
	public ResponseEntity<?> addInvoice(InvoiceRequestDTO invoiceRequestDTO) {
		InvoiceRequestDTO newInvoice=null;
		Invoice  invoice = InvoiceRequestDTO.
		*/

}








