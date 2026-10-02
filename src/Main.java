//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CentroLogistico centroLogistico = new CentroLogistico();

    // Paquetes estándar
    // Paquete 01
    try {
        Paquete packEst01 = new PaqueteEstandar("100", 15, "chaco", 5);
        System.out.println("Información del paquete:");
        packEst01.obtenerDetalle();

        // Apto para
        System.out.println("\nCondiciones:");
        if(!packEst01.esAptoParaEnvioAereo()){
            System.out.println("No es apto para envio aereo ya que pesa más de 15 kg.");
        } else {
            System.out.println("Es apto para envio aereo ya que pesa menos de 15 kg");
        }

        System.out.println("\nPrecio final:");
        System.out.println(packEst01.calcularCostoEnvio());

        System.out.println("____________________\n");
    } catch (Exception e){
        System.out.println("Error: " + e.getMessage());
    }
    // Paquete 02
    try {
        Paquete packEst01 = new PaqueteEstandar("101", 30, "Corrientes", 7);
        System.out.println("Información del paquete:");
        packEst01.obtenerDetalle();

        System.out.println("\nCondiciones:");

        if(!packEst01.esAptoParaEnvioAereo()){
            System.out.println("No es apto para envios ya que pesa más de 15 kg.");
        } else {
            System.out.println("Es apto para envios ya que pesa menos de 15 kg");
        }

        System.out.println("\nPrecio final:");
        System.out.println(packEst01.calcularCostoEnvio());

        System.out.println("____________________\n");
    } catch (Exception e){
        System.out.println("Error: " + e.getMessage());
    }

    // Paquetes frágil
    // Paquete 01
    try {
        Paquete packFra01 = new PaqueteFragil("102", 15, "chaco", "Alta");
        System.out.println("Información del paquete:");
        packFra01.obtenerDetalle();

        // Apto para
        System.out.println("\nCondiciones:");
        if(!packFra01.esAptoParaEnvioAereo()){
            System.out.println("No es apto para envio aereo ya que es un paquete frágil");
        }

        System.out.println("\nPrecio final:");
        System.out.println(packFra01.calcularCostoEnvio());

        System.out.println("____________________\n");
    } catch (Exception e){
        System.out.println("Error: " + e.getMessage());
    }

    try {
        Paquete packFra01 = new PaqueteFragil("103", 15, "San Juan", "Media");
        System.out.println("Información del paquete:");
        packFra01.obtenerDetalle();

        // Apto para
        System.out.println("\nCondiciones:");
        if(!packFra01.esAptoParaEnvioAereo()){
            System.out.println("No es apto para envio aereo ya que es un paquete frágil");
        }

        System.out.println("\nPrecio final:");
        System.out.println(packFra01.calcularCostoEnvio());

        System.out.println("____________________\n");
    } catch (Exception e){
        System.out.println("Error: " + e.getMessage());
    }

}
