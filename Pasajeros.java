public class Pasajero{
    private String nombres;
    private String apellidos;
    private String numeroDePasaporte;
    private String asiento;
    private int edad;
    
    //Constructores
    Pasajero() {}
    
    Pasajero(String nombres, String apellidos, String numeroDePasaporte, String asiento, int edad){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroDePasaporte = numeroDePasaporte;
        this.asiento = asiento;
        this.edad = edad;
    }
    
    //Getters
    public String getNombres(){
        return this.nombres;
    }
    
    public String getApellidos(){
        return this.apellidos;
        
    }
    
    public String getNumeroDePasaporte(){
        return this.numeroDePasaporte;
    }
    
    public String getAsiento(){
        return this.asiento;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    //Setters
    
    public void setNombres(String nombres){
        this.nombres = nombres;
        
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public void setNumeroDePasaporte(String numeroDePasaporte){
        this.numeroDePasaporte = numeroDePasaporte;
    }
    
    public void setAsiento(String asiento){
        this.asiento = asiento;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
        
    }
    
}
