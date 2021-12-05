package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpratacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpratacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpratacion = interpratacion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpratacion() {
        return interpratacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusio) {
        this.conclusion = conclusio;
    }

    public String interpretacion() {
        return interpratacion;
    }

    public void setInterpratacion(String interpratacion) {
        this.interpratacion = interpratacion;
    }

    public int palabrasTotales(int x) {
        return this.getPaginas()*x*5;
    }

    public String toString() {
        return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.idea + "\n" + this.argumentos.length + "\n" + this.conclusion + "\n" + this.referencias;
    }
}
