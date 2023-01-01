// 1. Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.


public class Main {
  
  pubic static void main{String[] args) {
    
    var numeroIf = 0;
    
    if (numeroWhile < 0) {
      System.out.println("Es negativo");
     } else if (numeroWhile > 0){
      System.out.println("Es positivo");
     } else {
      System.out.println("Es cero");
     }
  }
}
  
  
// 2. Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
// Incrementar el valor de la variable en uno cada vez que se ejecute.
// Mostrarlo por pantalla cada vez que se ejecute.

public class Main {
  
  pubic static void main{String[] args) {
    
    var numeroWhile = 0;
    
    while (numeroWhile < 3) {
      
      System.out.println(numeroWhile);
      numeroWhile = numeroWhile + 1
     }
  }
}

    
// 3. Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
 
public class Main {
  
  pubic static void main{String[] args) {
    
    var numeroWhile = 0;
    
    do {
      System.out.println(numeroWhile);
      numeroWhile = numeroWhile + 1
    }while (numeroWhile < 3); 
  }
}
   
// 4. Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, 
// se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

public class Main {
  
  pubic static void main{String[] args) {
    
    var numeroFor = 0;
    
    for (numeroFor <= 3) {
      System.out.println(numerofor);
      numerofor = numerofor + 1
    }
  }
}
   
// 5. Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la 
// variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando 
// el valor de la variable no sea una estación.

 public class Main {
  
  pubic static void main{String[] args) {
    
    var estacion = "verano";
    
    switch(estacion) {
      case "verano":
        System.out.println("es verano");
        break;
      case "invierno":
        System.out.println("es invierno");
        break;
      case "otoño":
        System.out.println("es otoño");
        break;
      case "primavera":
        System.out.println("es primavera");
        break;
     }
   }
 }
   
