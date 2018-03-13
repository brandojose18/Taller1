package com.holamundo.taller1;



public class Metodos {


        public static double comprar (int sexo, int tipoDeZapato, int marca, int cantidad) {

            String tipoDeZapatoEscogido ="";
            String MarcaDeZapatoEscogida="";
            String sexoEscogido="";
            double valoraPagar=0.0;


            switch (tipoDeZapato){
                case 0:
                    tipoDeZapatoEscogido = "Zapatilla";
                    break;
                case 1:
                    tipoDeZapatoEscogido = "Clasico";
                    break;
            }

            switch (marca){
                case 0:
                    MarcaDeZapatoEscogida = "Nike";
                    break;
                case 1:
                    MarcaDeZapatoEscogida = "Adidas";
                    break;
                case 2:
                    MarcaDeZapatoEscogida = "Puma";
                    break;
            }

            switch (sexo){
                case 0:
                    sexoEscogido = "Masculino";
                    if (tipoDeZapatoEscogido == "Zapatilla"){
                        if (MarcaDeZapatoEscogida == "Nike"){
                            valoraPagar = 120000 * cantidad;
                        }else if(MarcaDeZapatoEscogida == "Adidas"){
                            valoraPagar = 140000 * cantidad;
                        }else if(MarcaDeZapatoEscogida == "Puma"){
                            valoraPagar = 130000 * cantidad;
                        }
                    }else {
                        if (MarcaDeZapatoEscogida == "Nike"){
                            valoraPagar = 50000 * cantidad;
                        }else if(MarcaDeZapatoEscogida == "Adidas"){
                            valoraPagar = 80000 * cantidad;
                        }else if(MarcaDeZapatoEscogida == "Puma"){
                            valoraPagar = 100000 * cantidad;
                        }
                    }

                    break;
                case 1:
                    sexoEscogido = "Femenino";
                    if (tipoDeZapatoEscogido == "Zapatilla"){
                        if (MarcaDeZapatoEscogida == "Nike"){
                            valoraPagar = 100000 * cantidad;
                        }else if(MarcaDeZapatoEscogida == "Adidas"){
                            valoraPagar = 130000 * cantidad;
                        }else if(MarcaDeZapatoEscogida == "Puma"){
                            valoraPagar = 110000 * cantidad;
                        }
                    }else {
                        if (MarcaDeZapatoEscogida == "Nike"){
                            valoraPagar = 60000 * cantidad;
                        }else if(MarcaDeZapatoEscogida == "Adidas"){
                            valoraPagar = 70000 * cantidad;
                        }else if(MarcaDeZapatoEscogida == "Puma"){
                            valoraPagar = 120000 * cantidad;
                        }
                    }
                    break;
            }

            return valoraPagar;

        }

    }
