public class PaqueteEstandar extends Paquete{
    private int diasEstimados;

    public PaqueteEstandar(String codigoTrack, double pesoKg, String destino, int diasEstimados) {
        super(codigoTrack, pesoKg, destino);
        this.diasEstimados = diasEstimados;
    }

    public double calcularCostoEnvio(){
        return 1000 * getPesoKg();
    }

    public boolean esAptoParaEnvioAereo(){
        return !(getPesoKg() > 15.0);
    }

    public void obtenerDetalle() {
        System.out.println(
                "   Tipo: Estandar" +
                "\n   Código: " + getCodigoTrack() +
                "\n   Destino: " + getDestino() +
                "\n   Peso: " + getPesoKg() + " KG"+
                "\n   Dias estimados: " + this.diasEstimados
        );
    }
}
