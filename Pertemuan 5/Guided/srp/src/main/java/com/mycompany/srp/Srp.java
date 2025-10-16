/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.srp;

/**
 *
 * @author LENOVO
 */
public class Srp {

    public static void main(String[] args) {
        ReportGenerator report = new ReportGenerator(); 
        FileSaver saver = new FileSaver(); 
        EmailSender sender = new EmailSender(); 
 
         
        report.generateReport();                    
        saver.saveToFile("laporan_penjualan.pdf");  
        sender.sendEmail("user@example.com");   
    }
}
