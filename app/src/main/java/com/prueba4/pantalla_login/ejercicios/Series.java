package com.prueba4.pantalla_login.ejercicios;

public class Series {
    public static String ejercicio1(int cantidad){
        int primerNumero1 = 1;
        int segundoNumero1 = 4;
        int resultado = 0;
        StringBuilder cantidades = new StringBuilder();
        for (int i= 1; i <=cantidad; i++){
            if (i%2==0){
                System.out.print(primerNumero1+",");
                cantidades.append(primerNumero1).append(",");
                resultado = primerNumero1 + segundoNumero1;
                segundoNumero1 = resultado;
            }
            else {
                System.out.print(segundoNumero1+",");
                cantidades.append(segundoNumero1).append(",");
                resultado = primerNumero1 + segundoNumero1;
                primerNumero1 = resultado;
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio2(int cantidad){
        int primerNumero = 60;
        int segundoNumero = 1;
        StringBuilder cantidades  = new StringBuilder();
        for (int i = 1; i <= cantidad; i++) { //
            if (i%2==0){
                System.out.print(segundoNumero+",");
                cantidades.append(segundoNumero).append(",");
                segundoNumero += 2;

            }
            else {
                System.out.print(primerNumero+",");
                cantidades.append(primerNumero).append(",");
                primerNumero -= 2;
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio3(int cantidad){
        int primerNumero3 = 0;
        int segundoNumero3 = 1;
        StringBuilder cantidades = new StringBuilder();
        int aux = 0;
        for (int i= 1; i <=cantidad; i++){
            if (i %2==0){
                System.out.print(primerNumero3+", ");
                cantidades.append(primerNumero3).append(",");
                aux = primerNumero3 + segundoNumero3;
                segundoNumero3 = aux;
            }
            else {
                System.out.print(segundoNumero3+", ");
                cantidades.append(segundoNumero3).append(",");
                aux = primerNumero3 + segundoNumero3;
                primerNumero3 = aux;
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio4(int cantidad){
        int numero1 = 0;
        int cont = 0;
        StringBuilder cantidades = new StringBuilder();
        for (int i= 1; i <=cantidad; i++){
            System.out.print(numero1+", ");
            cantidades.append(numero1).append(",");
            cont = cont+2;
            numero1 = numero1 + cont;
        }
        return cantidades.toString();
    }
    public static String ejercicio5(int cantidad){
        int numero5 = 1;
        int cont5= 3;
        StringBuilder cantidades = new StringBuilder();
        for (int i= 1; i <=cantidad; i++){
            System.out.print("," +numero5);
            cantidades.append(numero5).append(",");
            numero5 = numero5 + cont5;
            cont5 = cont5 +2;
        }
        return cantidades.toString();
    }
    public static String ejercicio7(int cantidad){
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            if (i % 2 != 0){
                System.out.print("1, ");
                cantidades.append("1").append(",");
            }
            else {
                System.out.print("0, ");
                cantidades.append("0").append(",");
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio8(int cantidad){
        int numero8 = 1;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numero8 +", ");
            cantidades.append(numero8).append(",");
            if (i % 2 == 0) {
                numero8 += 1;
            } else {
                numero8 *= 2;
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio9(int cantidad){
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+", ");
                cantidades.append(j).append(",");
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio10(int cantidad){
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+", ");
                cantidades.append(j).append(",");
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio11 (int cantidad){
        int numeros10 = 10;
        int aux = 1;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <numeros10 ; i++) {
            System.out.print(aux+",");
            cantidades.append(aux).append(",");
            aux += 3;
        }
        return cantidades.toString();
    }
    public static String ejercicio12(int cantidad){
        int aux11 = 3;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <cantidad ; i++) {
            System.out.print(aux11+",");
            cantidades.append(aux11).append(",");
            aux11 += 5;
        }
        return cantidades.toString();
    }
    public static String ejercicio13(int cantidad){
        int numero12 = 3;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad; i++) {
            System.out.print(numero12+",");
            cantidades.append(numero12).append(",");
            numero12 = numero12 * 3;
        }
        return cantidades.toString();
    }
    public static String ejercicio14(int cantidad){
        int numero14 = 1;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            numero14 = i*i*i;
            System.out.print(numero14+", ");
            cantidades.append(numero14).append(",");
        }
        return cantidades.toString();
    }
    public static String  ejercicio15(int cantidad){
        int numero15 = 4;
        double aux = 0.5;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            if (numero15>=1){
                System.out.print(numero15+", ");
                cantidades.append(numero15).append(",");
                numero15 = numero15/2;
            }
            else{
                System.out.print(aux+", ");
                cantidades.append(aux).append(",");
                aux = aux/2;
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio16(int cantidad){
        int primeronumero15 = 8;
        int segundonumero15 = 1;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            if (i %2==0){
                System.out.print(segundonumero15+", ");
                cantidades.append(segundonumero15).append(",");
                segundonumero15++;
            }
            else {
                System.out.print(primeronumero15+", ");
                cantidades.append(primeronumero15).append(",");
                primeronumero15--;
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio17(int cantidad){
        int numero16 = 7;
        int otronumero16 = 1;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            if (i % 2 == 0) {
                System.out.print(otronumero16+", ");
                cantidades.append(otronumero16).append(",");
                otronumero16++;
            }
            else {
                System.out.print(numero16+", ");
                cantidades.append(numero16).append(",");
                numero16--;
          }
        }
        return cantidades.toString();
    }
    public static String ejercicio18(int cantidad){
        int numero17 = 1;
        int otronumero17 = 20;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            if (i % 2 == 0) {
                System.out.print(otronumero17+", ");
                cantidades.append(otronumero17).append(",");
                otronumero17-=2;
            }
            else {
                System.out.print(numero17+", ");
                cantidades.append(numero17).append(",");
                numero17+=2;
            }
        }
        return cantidades.toString();
    }
    public static String ejericio19(int cantidad){
        int numero18 = 1;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            System.out.print(+numero18+", ");
            cantidades.append(numero18).append(",");
            numero18 = numero18*2;
        }
        return cantidades.toString();
    }
    public static String ejercicio20(int cantidad){
        int aux = 5;
        int aux2 = 5;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad ; i++) {
            if (i % 2==0) {
                for (int j = aux; j >=1 ; j--) {
                    System.out.print(j+", ");
                    cantidades.append(j).append(",");
                }
                aux--;
            }
            else {
                for (int k = 1; k <=aux2 ; k++) {
                    System.out.print(k+", ");
                    cantidades.append(k).append(",");
                }
                aux2--;
            }
        }
        return cantidades.toString();
    }
    public static String ejercicio21(int cantidad){
        int primernumero21 = 1;
        int segundonumero21 = 1;
        StringBuilder cantidades = new StringBuilder();
        for (int i = 1; i <=cantidad; i++) {
            if (i%2==0){
                System.out.print(segundonumero21+", ");
                cantidades.append(segundonumero21).append(",");
                segundonumero21 = primernumero21+segundonumero21;
            }
            else{
                System.out.print("-"+primernumero21+", ");
                cantidades.append("-").append(primernumero21).append(",");
                primernumero21=primernumero21+segundonumero21;
            }
        }
        return cantidades.toString();
    }
}
