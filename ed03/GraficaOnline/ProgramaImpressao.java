package GraficaOnline;

/**
 * Programa principal para teste da impressão.
 */
public class ProgramaImpressao {
    public static void main(String[] args) {
        DocumentoTexto doc = new DocumentoTexto("Documento de Apresentação", "Este é o conteúdo do documento.");
        ImagemDigital img = new ImagemDigital("paisagem.jpg", "1920x1080");
        GraficoEstatistico graf = new GraficoEstatistico("Distribuição de Vendas", "barra");
        RelatorioPDF relatorio = new RelatorioPDF("João Silva", 12);

        doc.imprimir();
        img.imprimir();
        graf.imprimir();
        relatorio.imprimir();
    }
}