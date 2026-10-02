public class PaqueteFragil extends Paquete{
    private String nivelProteccion;

    public PaqueteFragil(String codigoTrack, double pesoKg, String destino, String nivelProteccion) {
        super(codigoTrack, pesoKg, destino);
        this.nivelProteccion = nivelProteccion;
    }

    public double calcularCostoEnvio(){
        if(nivelProteccion.equals("Alta")){
            return (1000 * getPesoKg()) / 0.30;
        } else if (nivelProteccion.equals("Media")) {
            return (1000 * getPesoKg()) / 0.5;
        }
        return 1000 * getPesoKg();
    }

    public boolean esAptoParaEnvioAereo(){
        return false;
    }

    public void obtenerDetalle() {
        System.out.println(
                "   Tipo: Frágil" +
                        "\n   Código: " + getCodigoTrack() +
                        "\n   Destino: " + getDestino() +
                        "\n   Peso: " + getPesoKg() + " KG" +
                        "\n   Nivel de protección: " + this.nivelProteccion
        );
    }
}
