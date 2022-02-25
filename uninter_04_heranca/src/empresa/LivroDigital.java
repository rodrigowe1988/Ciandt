package empresa;

public class LivroDigital extends Livro{
    public String linkDownload;
    public int tamanhoMB;

    public LivroDigital(String titulo, String autor, String linkDownload) {
        super(titulo, autor);
    }

    //MUDOU
    public float imposto() {
        return super.imposto() + 2;
    }
    //NOVO
    public float tamanhoPorPagina() {
        return tamanhoMB/(float)paginas;
    }

    public void imprimirImposto() {
        //super faz referencia a classe mae
        System.out.println("Imposto do livro físico: " + super.imposto());
        //this faz referencia a classe atual
        System.out.println("Imposto do livro digital: " + this.imposto());
    }
}
