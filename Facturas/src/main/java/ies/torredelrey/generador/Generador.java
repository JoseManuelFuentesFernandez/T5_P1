/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.torredelrey.generador;

import ies.torredelrey.modelo.ProductoVentas;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author usuario
 */
public class Generador {
    public static void leerInformeBD(Collection<Address> listaAddress,String rutaInforme,String nombreInformeSalida){
        try {
            JasperPrint print;
            HashMap param = new HashMap();
            param.put("fecha", LocalDate.now().toString());            
            HashMap paramSubInforme = new HashMap();
            JRDataSource datasource = new JRBeanArrayDataSource(listaAddress.toArray());
            print = JasperFillManager.fillReport(rutaInforme, param,datasource);
            JasperExportManager.exportReportToPdfFile(print,nombreInformeSalida);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void leerInformeBDParametro(Collection<Address> listaAddress,int id, String rutaInforme,String nombreInformeSalida){
        try {
            JasperPrint print;
            HashMap param = new HashMap();
            param.put("id",Integer.toString(id));            
            HashMap paramSubInforme = new HashMap();
            JRDataSource datasource = new JRBeanArrayDataSource(listaAddress.toArray());
            print = JasperFillManager.fillReport(rutaInforme, param,datasource);
            JasperExportManager.exportReportToPdfFile(print,nombreInformeSalida);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   /***********GENERAR METODOS PARA LEER INFORMES SEGUN SE NECESITE***********/
    
    public static void leerInformeVentasTotales(List<ProductoVentas> lista, String rutaInforme, String nombreInformeSalida){
        try {
            JasperPrint print;
            HashMap param = new HashMap();
            param.put("fecha", LocalDate.now().toString());

            JRDataSource datasource = new JRBeanArrayDataSource(lista.toArray());
            print = JasperFillManager.fillReport(rutaInforme, param,datasource);
            JasperExportManager.exportReportToPdfFile(print,nombreInformeSalida);
            JasperViewer.viewReport(print);
        } catch (JRException ex) {
            Logger.getLogger(Generador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
