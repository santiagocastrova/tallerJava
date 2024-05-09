public class Vendedor extends Empleado {
    private float Ventas;
    private float Horas;
    private float v_horas;

    public Vendedor(String Nombre, float Salario, float Ventas, float Horas, float v_horas){
        super(Nombre, Salario);
        this.Ventas = Ventas;
        this.Horas = Horas;
        this.v_horas = v_horas;

    }


    public float getVentas(){
        return Ventas;
    }
    public void setVentas(float Ventas){
        this.Ventas = Ventas;
    }

    public float getHoras(){
        return Horas;
    }
    public void setHoras(float Horas){
        this.Horas = Horas;
    }

    public float getv_horas(){
        return v_horas;
    }
    public void setv_horas(float v_horas){
        this.v_horas = v_horas;
    }

    public float CalcularSalario(){
        return (Horas*v_horas)+(Ventas*(10/100));
    }
}
