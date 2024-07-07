package com.Emmanuel.Controlador.controlstatement;

public class StatementsExample {
    public void testIf(final String valor){

        if(valor.contains("a")){
            System.out.println("Contiene a");
        }
        else {
            System.out.println("No contiene a");

        }
    }

    public void testIf(final Integer edad){

        if(edad <= 5 && edad>0){
            System.out.println("La persona esta en primera infancia");
        }
        else if(edad >5 && edad <= 11) {
            System.out.println("La persona esta en infancia");
        }
        else if (edad > 11 && edad <=17) {
            System.out.println("La persona esta en adolecencia");
        }
        else if (edad > 17 && edad <=26) {
            System.out.println("La persona esta en juventud");
        }
        else if (edad > 26 && edad <=59) {
            System.out.println("La persona esta en adultez");
        }
        else if (edad > 59) {
            System.out.println("La persona esta en vejez");
        }
        else {
        System.out.println("Introduce un valor valido");
        }
    }
}
