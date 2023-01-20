// Crea una clase Persona con las siguientes variables:

// La edad

// El nombre

// El teléfono

// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

public class Main {
    public static void main(String[] args){

        Cliente jaimito = new Cliente();
        jaimito.setNombre("Jaimito Gutierrez");
        jaimito.setTelefono(312564254);
        jaimito.setEdad(25);
        jaimito.isCredito(True);
        System.out.println("Cliente");
        System.out.println("Nombre:"+jaimito.getNombre()+" Tel:"+jaimito.getTelefono()+" edad:"+jaimito.getEdad()+" Credito:"+jaimito.getCredito());
      
      
        Trabajador pedro = new Trabajador();
        pedro.setNombre("Pedro Sanchez");
        pedro.setTelefono(310554654);
        pedro.setEdad(30);
        pedro.setSalario(1800);
        System.out.println("Trabajador");
        System.out.println("Nombre:"+pedro.getNombre()+" Tel:"+pedro.getTelefono()+" edad:"+pedro.getEdad()+" Credito:"+pedro.getSalario());

    }
}


class Persona {
  
  private int edad;
  private int telefono;
  private String nombre;
  
  public int getEdad() {
        return edad;
    }
  public void setEdad(int edad) {
      this.edad = edad;
  }


  public String getNombre() {
      return this.nombre;
  }
  public void setNombre(String nombre) {
      this.nombre = nombre;
  }


  public int getTelefono() {
      return telefono;
  }
  public void setTelefono(int telefono) {
      this.telefono = telefono;
  } 
}

class Cliente extends Persona {
  
  private booleam credito;
   
  public booleam isCredito() {
      return this.credito;
  }
  public void setCredito(String credito) {
      this.credito = credito;
  }
}


class Trabajador extends Persona {
  
  private int salario;
   
  public int getSalario() {
      return this.salario;
  }
  public void setSalario(int salario) {
      this.salario = salario;
  }
}
