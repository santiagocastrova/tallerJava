import java.util.Date;
import java.time.LocalDate;

   public class Persona {
    private String Nombre;
    private int Edad;
    private Date FechaDeNacimiento;

    public Persona(String Nombre, int Edad, Date FechaDeNacimiento){
        this.Nombre= Nombre;
        this.Edad= Edad;
        this.FechaDeNacimiento= FechaDeNacimiento;
        
    }


    public void establecerNombre(String Nombre) {
        if (Nombre == "" || Nombre == null) {
            System.out.println("El nombre es invalido");
        } else {
            this.Nombre = Nombre;
        }
    }

    public String obtenerNombre() {
        return this.Nombre;
    }

    public void establecerEdad(int Edad) {
        if (Edad < 0) {
            System.out.println("La edad debe ser mayor a 0");
        } else {
            this.Edad = Edad;
        }
    }

    public int obtenerEdad() {
        return this.Edad;
    }

    public void establecerFechaDeNacimiento(Date FechaDeNacimiento) {
        if (FechaDeNacimiento == null) {
            System.out.println("La fecha es invalida");
        } else {
            this.FechaDeNacimiento = FechaDeNacimiento;
        }
    }

    public Date obtenerFechaDeNacimiento() {
        return this.FechaDeNacimiento;
    }

    public LocalDate CalcularFechaDeNacimiento() {
        if (this.Edad < 0) {
            System.out.println("Edad no valida");
        }
        return LocalDate.now().minusYears(this.Edad);
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Edad: " + Edad + ", Fecha de nacimiento: " + FechaDeNacimiento;
    }
}
