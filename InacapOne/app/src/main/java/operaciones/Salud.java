package operaciones;

public class Salud {

    private String nombre;
    private int pesoActual;
    private int edad;
    private int pesoIdeal;
    private String resultado;

    public int getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int calcularPesoIdeal(){
        pesoIdeal = edad*2+8;

        return pesoIdeal;
    }

    public String compararPeso(){

        if (pesoIdeal > pesoActual){

            resultado = "Bajo peso";
        }else{
            if (pesoIdeal < pesoActual){

                resultado = "Sobre Peso";
            }else{
                if(pesoIdeal == pesoActual){
                    resultado = "En su Peso Ideal";
                }
            }
        }
        return resultado;
    }

    public int getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
