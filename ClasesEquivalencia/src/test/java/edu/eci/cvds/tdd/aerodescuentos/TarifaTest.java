package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.*;

public class TarifaTest {
    private CalculadorDescuentos c= new CalculadorDescuentos();
    private double tarifa;

    @Test
    public void validarEdadMenor0(){
        //Primera Excepcion que se enuncio en el trabajo
        try{
            tarifa = c.calculoTarifa(5000000,15,-100);
            long er = 0/0;
        }
        catch ( Exception e){
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void validarEdad0(){
        //Segunda excepcion que se enuncia en el trabajo
        try{
            tarifa = c.calculoTarifa(5000000,15,0);
            long er = 0/0;
        }
        catch ( Exception e){
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void validarEdadMayor150(){
        //deberia generar error, por edad > 150
        try{
        tarifa = c.calculoTarifa(5000000,15,200);
        long er = 0/0;
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }
    
    @Test
    public void validarAntelacionNegativa(){
        //deberia generar error por dias antelación < 0
        try{
            tarifa = c.calculoTarifa(5000000,-1,30);
            long er = 0/0;
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }

    }
       
    @Test
    public void validarTarifaNegativa(){
        //        deberia generar un error, por la  tarifaBase
        try{
            tarifa = c.calculoTarifa(-5000000,1,30);
            long er = 0/0;
        }
        catch (Exception e){
            Assert.assertTrue(true);
        }
    }
       
    @Test
    public void validarDescuento0(){
        //Case1 No se le aplica descuento, persona entre 18 a 65 años y sin 20 dias de antelacion; Sin descuento
        tarifa = c.calculoTarifa(5000000,15,65);
        Assert.assertEquals( String.valueOf(tarifa), "5000000.0");
    }    
    
    @Test
    public void validarDescuento5(){
        //Case2 Menor a 18 años pero sin 20 días de antelacion; Descuento del 5%
        tarifa = c.calculoTarifa(5000000,15,17);
        Assert.assertEquals( String.valueOf(tarifa), "4750000.0");
    }

    @Test
    public void validarDescuento8(){
        //Case3 Mayor a 65 años pero sin 20 días de antelacion; Descuento del 8%
        tarifa = c.calculoTarifa(5000000,15,150);
        Assert.assertEquals( String.valueOf(tarifa), "4600000.0");
    }

    @Test
    public void descuentoAcum15(){
    	//Case4 Entre 18 a 65 y con antelacion de 20 días; Descuento del 15%
        tarifa = c.calculoTarifa(5000000,40,28);
        Assert.assertEquals( String.valueOf(tarifa), "4250000.0");
    }
    
    @Test
    public void descuentoAcum20(){
    	//Case5 Menor a 18 y con antelacion de 20 días; Descuento del 20%
        tarifa = c.calculoTarifa(5000000,40,14);
        Assert.assertEquals( String.valueOf(tarifa), "4000000.0");
    }

    @Test
    public void descuentoAcum23(){
        //Case6 Mayor a 65 y con antelacion de 20 días; Descuento del 23%
        tarifa = c.calculoTarifa(5000000,70,66);
        Assert.assertEquals( String.valueOf(tarifa), "3850000.0");
    }


}