#include "stdio.h"

void main ()  {

  float valor_01 = 0, valor_02 = 0, valor_03 = 0, promedio = 0.0;    //declaramos cuatro variables y  asignamos un valor inicial

  printf ("\nSirve para promediar tres valores dados por el usuario. \n");

  printf (" \n \n Proporciona el primer valor y luego presiona ENTER: ");

  scanf ("%f", & valor_01);    // guardamos en una variable lo que el usuario proporciona

  printf (" \n \n Proporciona el segundo valor  y luego presiona ENTER: ");

  scanf ("%f", & valor_02);    // guardamos en otra  variable lo que el usuario proporciona

printf (" \n \n Proporciona el tercer valor  y luego presiona ENTER: ");

  scanf ("%f", & valor_03);    // guardamos en otra  variable lo que el usuario proporciona

  promedio = (valor_01 + valor_02 + valor_03)/3;   // se calcula el promedio


  printf ("\nEl  promedio de los tres valores proporcionados es %f ", promedio);    //Se muestra el resultado obtenido al calcular el promedio

}
