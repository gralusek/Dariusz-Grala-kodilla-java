package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {


    @Autowired
    private InvoiceDao invoiceDao;
    @Test
    void testInvoiceDaoSave() {
        //Given

        invoiceDao.deleteAll();
        Invoice invoice = new Invoice("1/2021");
        Item item1 = new Item(new BigDecimal(50), 10, new BigDecimal(505));
        Item item2 = new Item(new BigDecimal(100), 8, new BigDecimal(800));
        Item item3 = new Item(new BigDecimal(20), 5, new BigDecimal(100));

        Product product1 = new Product("Helmet");
        Product product2 = new Product("Bag");
        Product product3 = new Product("Trousers");

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int size = invoice.getItems().size();
        int id = invoice.getId();
        //Then
        assertEquals(3, size);

        //Cleanup
        invoiceDao.deleteById(id);


    }
}
