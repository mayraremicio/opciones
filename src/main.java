
import java.util.Scanner;

public class main  {
    public static void main (String[] args) {
        int opci,num1,num2,sum,mult, edad,resultado, valor1,valor2,resultado2,resultado3;
        String nombre;
        System.out.println(" hola, bienvenido al programa");
       Scanner entrada = new Scanner(System.in);
        System.out.println(" seleccione 1. opereciones 2.cobros 3.area del triangulo");
        opci = entrada.nextInt();
        switch (opci){

            case 1:
                System.out.println("por favor ingrese dos numeros ");
            num1 = entrada.nextInt();
            num2 = entrada.nextInt();
            sum= num1+num2;
            mult=num1*num2;

            System.out.println(" la suma es "+sum);
                System.out.println(" la multiplicacion  es "+mult);

                break;


            case 2:

                System.out.println(" por favor ingrese su nombre ");
                nombre = entrada.next();
                System.out.println(" por favor ingrese  su edad");
                edad= entrada.nextInt();
                if (edad >= 18){
                    resultado= edad*1000;

                    System.out.println(" su nombre es "+nombre);
                    System.out.println(" su valor a ´pagar es"+resultado);}

                    else{
                    System.out.println(" su nombre es "+nombre);
                        System.out.println(" usted no genera cobro");
                    }
                    break;
            case 3:
                System.out.println(" por favor ingrese base y altura ");
                valor1 =entrada.nextInt();
                valor2= entrada.nextInt();
                resultado2= valor1*valor2;
                resultado3= resultado2/2;

                System.out.println(" el area del triangulo es"+resultado3);
                break;


            default:
        System.out.println(" escriba una de las opciones 1,2,3 ");
        }

    }

    }
