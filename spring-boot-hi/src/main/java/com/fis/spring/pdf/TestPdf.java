package com.fis.spring.pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class TestPdf {
	  public static void main(String[] args) throws Exception {
	    
	    TestPdf pdf = new TestPdf();
	    String filename = "D:/testTable1.pdf";
	    pdf.createPDF(filename);
	    System.out.println("打印完成");
	    
	}
	  public void createPDF(String filename) throws IOException {
	    Document document = new Document(PageSize.A4);
	    try {
	        PdfWriter.getInstance(document, new FileOutputStream(filename));
	        document.addTitle("sheet of product");
	        document.addAuthor("scurry");
	        document.addSubject("product sheet.");
	        document.addKeywords("product.");
	        document.open();
	        document.add(new Paragraph("Hello World!"));
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (DocumentException e) {
	        e.printStackTrace();
	    } finally {
	        document.close();
	    }
	  }
	}