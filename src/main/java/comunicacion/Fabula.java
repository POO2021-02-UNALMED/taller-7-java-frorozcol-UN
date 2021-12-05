package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretiacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretiación) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = enseñanza;
        this.interpretiacion = interpretiación;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String interpretacion() {
        return interpretiacion;
    }

    public void setInterpretiación(String interpretiacion) {
        this.interpretiacion = interpretiacion;
    }
    public String toString() {
        return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.ensenanza;
    }

    public int palabrasTotales(int x) {
        return this.getPaginas()*x;
    }
}
