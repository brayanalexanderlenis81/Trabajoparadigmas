package co.edu.poli.actividad5.model;

public class Medicamento {
	// Atributos (tal como en el diagrama)
    private int peso;
    private Marca marca;
    private boolean esoriginal;
    private String estado;
    private String viaaplicacion;
    private Composicionmedicamento composicionmedicamento;
    private String serial;
    private Lugarorigen lugarorigen;
    private int fechafabricacion;
    private Factura factura;

    // Constructores
    public Medicamento() {}

    public Medicamento(String serial, Marca marca) {
        this.serial = serial;
        this.marca = marca;
    }

    // Métodos (según diagrama)
    public boolean estaVencido() {
        System.out.println("[Medicamento] comprobando si está vencido...");
        // implementación demo: vencido si fechafabricacion < 2000
        return this.fechafabricacion < 2000;
    }

    public int calcularFechafabricacion() {
        System.out.println("[Medicamento] calculando fecha de fabricación...");
        return this.fechafabricacion;
    }

    // Métodos protegidos (sobrecarga)
    protected boolean verificarIndicaciones(String dosis) {
        System.out.println("[Medicamento] verificarIndicaciones(dosis): dosis = " + dosis);
        return dosis != null && !dosis.trim().isEmpty();
    }

    protected boolean verificarIndicaciones(String dosis, int edadPaciente) {
        System.out.println("[Medicamento] verificarIndicaciones(dosis, edadPaciente): dosis = " 
                           + dosis + ", edad = " + edadPaciente);
        if (dosis == null || dosis.trim().isEmpty()) return false;
        return edadPaciente >= 12;
    }

    public String mostrarInstrucciones() {
        String msg = "Instrucciones generales del medicamento:\n"
                   + "- Siga las indicaciones de su médico.\n"
                   + "- Conservar en un lugar fresco y seco.";
        System.out.println("[Medicamento] mostrarInstrucciones() invoked.");
        return msg;
    }

    // Getters y setters necesarios para toString y acceso
    public String getSerial() { return serial; }
    public Marca getMarca() { return marca; }
    public int getPeso() { return peso; }
    public int getFechafabricacion() { return fechafabricacion; }
    public Lugarorigen getLugarorigen() { return lugarorigen; }
    public Factura getFactura() { return factura; }

    public void setFechafabricacion(int fechafabricacion) { this.fechafabricacion = fechafabricacion; }
    public void setFactura(Factura factura) { this.factura = factura; }
    public void setComposicionmedicamento(Composicionmedicamento composicion) { this.composicionmedicamento = composicion; }
    public void setViaaplicacion(String via) { this.viaaplicacion = via; }
    public void setPeso(int peso) { this.peso = peso; }
    public void setLugarorigen(Lugarorigen lugarorigen) { this.lugarorigen = lugarorigen; }

    @Override
    public String toString() {
        return "Medicamento{serial=" + serial+ ", peso=" + peso+ ", marca=" + (marca != null ? marca.getId() : "null")+ ", esoriginal=" + esoriginal+ ", viaaplicacion=" + viaaplicacion+ ", fechafabricacion=" + fechafabricacion+ ", lugarorigen=" + (lugarorigen != null ? lugarorigen.getCiudad() : "null")+ ", factura=" + (factura != null ? factura.getNumero() : "null") + "}";
    }
}
