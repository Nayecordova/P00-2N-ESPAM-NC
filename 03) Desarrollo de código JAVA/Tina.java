public class Tina {
    private double pesoNeto;
    private String tipoDestino;

    public Tina(double pesoNeto, String tipoDestino){
        this.pesoNeto = pesoNeto;
        this.tipoDestino = tipoDestino;
    }

    public String evaluarEstado(){
        if (tipoDestino.equalsIgnoreCase("Desperdicio")){
            return "Desperdicio";
        }
        if (pesoNeto >= 600 && pesoNeto <=605){

            return "Tina Completa";
        } else if (pesoNeto <600){
            return "Tina Incompleta";
        }else {
            return "Tina con Excedente";
        }
        
        

    }
}
