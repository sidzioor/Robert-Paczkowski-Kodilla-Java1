//package com.kodilla.hibernate.invoice.dao;
//
//import com.kodilla.hibernate.invoice.Invoice;
//import com.kodilla.hibernate.invoice.Item;
//import com.kodilla.hibernate.invoice.Product;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//    @Autowired
//    InvoiceDao invoiceDao;
//    @Autowired
//    ProductDao productDao;
//
//    @Test
//    public void testInvoiceDaoSave() {
//        Product product = new Product("Product");
//        Product product2 = new Product("Product2");
//        Product product3 = new Product("Product3");
//
//        Item item = new Item(product, new BigDecimal(123), 3, new BigDecimal(213));
//        Item item2 = new Item(product2, new BigDecimal(10), 1, new BigDecimal(32));
//        Item item3 = new Item(product3, new BigDecimal(32), 2, new BigDecimal(13));
//
//        Invoice invoice = new Invoice("12314/1");
//        Invoice invoice2 = new Invoice("41321/2");
//        Invoice invoice3 = new Invoice("32143/3");
//
//        invoice.getItems().add(item);
//        invoice2.getItems().add(item2);
//        invoice3.getItems().add(item3);
//
//        //when
//        productDao.save(product);
//        productDao.save(product2);
//        productDao.save(product3);
//        invoiceDao.save(invoice);
//        int invoiceId = invoice.getId();
//        invoiceDao.save(invoice2);
//        int invoice2Id = invoice2.getId();
//        invoiceDao.save(invoice3);
//        int invoice3Id = invoice3.getId();
//
//        //Then
//        Assert.assertNotEquals(0, invoiceId);
//        Assert.assertNotEquals(0, invoice2Id);
//        Assert.assertNotEquals(0, invoice3Id);
//
//        //CleanUp
//        try {
//            invoiceDao.deleteById(invoiceId);
//            invoiceDao.deleteById(invoice2Id);
//            invoiceDao.deleteById(invoice3Id);
//        }catch (Exception e){
//            //do nothing
//        }
//    }
//
//}
