package empresa;

public class LivroDigitalEx {
    public String autor;
    public float custoProducao;
    public float precoVenda;
    public String titulo;
    public int paginas;
    //NOVO
    public String linkDownload;
    public int tamanhoMB;

    public float lucro() {
        return precoVenda - custoProducao;
    }

    public void imprimirTitulo() {
        System.out.println(titulo);
    }
    //MUDOU
    public float imposto() {
        return 0.2f * lucro() + 2;
    }
    //NOVO
    public float tamanhoPorPagina() {
        return tamanhoMB/(float)paginas;
    }

}
