public abstract class Paquete implements Enviable{
    private String codigoTrack;
    private double pesoKg;
    private String destino;

    public Paquete (String codigoTrack, double pesoKg, String destino) {
        this.codigoTrack = setCodigoTrack(codigoTrack);
        this.pesoKg = setPesoKg(pesoKg);
        this.destino = destino;
    }

    //Setters
    public String setCodigoTrack(String codigoTrack) {
        if(codigoTrack == null || codigoTrack == ""){
            throw new IllegalArgumentException("El codigo no puede ser vacio");
        }
        return this.codigoTrack = codigoTrack;
    }

    public double setPesoKg(double pesoKg) {
        if(pesoKg <= 0){
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        }
        return this.pesoKg = pesoKg;
    }

    //Getters
    public double getPesoKg() {
        return pesoKg;
    }

    public String getCodigoTrack() {
        return codigoTrack;
    }

    public String getDestino() {
        return destino;
    }

    // Metodos para actualizar el destino
    public void actualizarDestino(String nuevoDestino){
        if(nuevoDestino == null || nuevoDestino.isEmpty()){
            throw new IllegalArgumentException("No puede ser un destino vacio");
        }
        this.destino = nuevoDestino;
    }

    public void actualizarDestino(String nuevoDestino, boolean express){
        // * integrar condición para cambiar destino y ver si es envio express
    }

    public abstract void obtenerDetalle();
}
