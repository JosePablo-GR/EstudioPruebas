#include "stdio.h"

void  main()
{
    int respuesta = 0;
    
    printf("Programa hecho por GRANADOS ROVIRA JOSE PABLO, 319288162, 671, 653 \n");
    printf("Debe elegir un número y luego presionar la tecla ENTER: \n");
    printf("1.- Tiene 60 o más años de edad.\n");
    printf("2.- Es personal médico que atiende COVID-19.\n");
    printf("3.- Tiene menos de 60 años de edad.\n");
    scanf("%d", &respuesta);
    
    if (respuesta == 1){
    printf ("No deje de cuidarse. \n");
    printf ("Ya debe haber recibido su vacuna contra COVID-19.  \n");
    }
    
    if (respuesta == 2){
    printf ("Felicidades.  \n");
    printf ("Va a recibir su vacuna antes que los demás.  \n");
    }
    
    if (respuesta == 3){
    printf ("Buena suerte. \n");
    printf ("Debe esperar a que llegue su turno. \n");
    }
}
