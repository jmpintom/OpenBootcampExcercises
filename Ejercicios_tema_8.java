public class Main {
    public static void main(String[] args){

        Persona juan = new Persona();
        juan.setNombre("Juan Pérez");
        juan.setEdad(25);
        juan.setTelefono(31254684);
        System.out.println("Nombre:"+juan.getNombre()+ "  Edad:" + juan.getEdad()+" Tel:"+juan.getTelefono());
    }
}

class Persona {
  
    private String nombre;
    private int edad;
    private int telefono;
  
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
