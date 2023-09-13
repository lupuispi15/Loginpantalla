package com.prueba4.pantalla_login.ejercicios;

public class Sumatorias {

    public static int practico1(int cantidad){
        int aux = 3;
        int acumulador =0;
        for (int i = 1; i <=cantidad; i++) {
            System.out.print(aux + " + ");

            acumulador = acumulador + aux;
                    aux = aux * 2;
        }
        return acumulador;
    }
    public static int practico2(int cantidad){
        int aux = 1;
        int aux2 = 3;
        int acumulador =0;
        int suma=0;
        for (int i = 1; i <=cantidad; i++) {
            System.out.print(aux + " + ");
            suma = suma + aux;
            acumulador = aux + aux2;
            aux2 = aux;
            aux = acumulador;

        }
        return suma;
    }
    public static int practico3(int cantidad){
          int numero = 1;
          int cont = 3;
          int suma = 0;
        for (int i = 1; i <=cantidad; i++) {
            System.out.print(+numero+" + ");
            suma = suma + numero;
            numero = numero + cont;
            cont = cont+2;

        }
      return suma;
    }
    public static int practico4(int cantidad){
        int total = 0;
        int acumulador = 1;
        for (int i = 1; i <=cantidad; i++) {
            System.out.print(i);
            if (i % 2 != 0){
                System.out.print(" x ");
                acumulador = acumulador* i;
            }
            else{
                System.out.print(" + ");
            }

        }
      return total;
    }
    public static int practico5(int cantidad){
        int acumulador = 2;
        for (int i = 1; i <=cantidad; i++) {
            System.out.print(i);
            if (i % 2 == 0){
                System.out.print(" + ");
                acumulador = acumulador + i;
            }
            else{
                System.out.print(" - ");
                acumulador = acumulador - i;
            }

        }
        return acumulador;
    }
    public static int practico6(int cantidad){
       int numero2 = 1;
       int multi = 0;
       int suma = 0;
        for (int i = 1; i <=cantidad ; i++) {
            System.out.print(i+"*"+numero2+" + ");
            multi = i * numero2;
            numero2 += 2;
            suma = suma + multi;


        }
        return suma;
    }
    public static int practico7(int cantidad){
        int operacionelevadoaux = 0;
        int aux = 1;
        int aux2 = 2;
        int suma = 0;
        for (int i = 1; i <=cantidad ; i++) {
            if (i % 2 ==0 ){
                 operacionelevadoaux = aux * aux;
                if (i == cantidad){
                    System.out.print(aux2);
                    suma = suma +operacionelevadoaux;
                }

                else {
                    System.out.print(aux2+" + ");
                    suma = suma + operacionelevadoaux;
                }
                aux +=2;
            }
            else{
                if (i == cantidad){
                    System.out.print(aux);
                    suma = suma +aux;
                }
                else {
                    System.out.print(aux+"&");
                }

            }
        }
        return suma;
    }
    public static int practico8(int cantidad){
        int total = 0;

        return total;
    }
    public static int practico10(int cantidad){
        int suma = 0;
        int numero1= 1;
        int numero2 = 1;

        for (int i = 1; i <=cantidad ; i++) {
            if (i % 2 ==0 ){
                System.out.print(+numero1+"+");
                suma = suma + numero1;
                numero1 = numero1 * 2;

            }
            else{
                System.out.print(numero1+"+");
                suma = suma + numero1;
            }
        }
        return suma;
    }
    public static int practico12(int cantidad){
        int suma = 0;
        cantidad = cantidad * 11;
        for (int i = 11; i <=cantidad ; i+=11) {
            System.out.print(i+" + ");
              suma = suma + i;
        }

        return suma;
    }
    public static int practico13(int cantidad){
        int rango = 3;
        int multi = 0;
        int numero2 = 1;
        int aux = 1;
        int total = 0;
        for (int i = 1; i <cantidad; i++) {
            rango +=2;

        }
        for (int i = 3; i <=rango ; i +=2) {
            System.out.print(i+" * "+numero2+" + ");
            multi = i * numero2;
            aux++;
            total = total + multi;
            numero2 = numero2 * aux;

        }

        return total;
    }
    public static int practico14(int cantidad){
        int suma = 6;
        int total =0;
        for (int i = 1; i <=cantidad; i++) {
            System.out.print(suma+" + ");
            total = total + suma;
            suma = suma*2 ;

        }
        return total;
    }
    public static int practico15(int cantidad){
        int numero1 = 1;
        int numero2 = 5;
        int multi = 0;
        int total = 0;
        for (int i = 1; i <=cantidad ; i++) {
            if (i == 1){
                System.out.print(numero1+"*"+numero2+" + ");
                multi = numero1*numero2;
                total = total+multi;
            }
            else {

                numero1 = numero2;
                numero2 = i * i;
                multi = numero1*numero2;
                total = total+multi;
                System.out.print(numero1+"*"+numero2+" + ");
            }
        }
        return total;
    }
}

