package com.holamundo.taller1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void combinacion1(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 0;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 0;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 0;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 120000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion2(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 0;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 0;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 1;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 140000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion3(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 0;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 0;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 2;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 130000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion4(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 0;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 1;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 0;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 50000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion5(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 0;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 1;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 1;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 80000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion6(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 0;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 1;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 2;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 100000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion7(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 1;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 0;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 0;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 100000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion8(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 1;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 0;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 1;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 130000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion9(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 1;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 0;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 2;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 110000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion10(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 1;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 1;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 0;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 60000;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion11(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 1;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 1;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 1;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 70000;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

    @Test
    public void combinacion12(){

        //sexo 0 = Masculino, sexo 1 = Femenino
        int sexo = 1;
        //tipoDeZapato 0 = Zapatilla, tipoDeZapato 1 = Clasico
        int tipoDeZapato = 1;
        //MarcaDeZapatoEscogida 0 = Nike, MarcaDeZapatoEscogida 1 = Adidas, MarcaDeZapatoEscogida 2 = Puma
        int marca = 2;
        //Cantidad cualquier numero
        int cantidad = 1;

        double ve = 120000.0;
        double vr = Metodos.comprar(sexo,tipoDeZapato,marca,cantidad);
        assertEquals(ve,vr,0);

    }

}