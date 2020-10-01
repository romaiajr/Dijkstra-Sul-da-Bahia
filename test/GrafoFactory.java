/**
 * Componente Curricular: Módulo Integrado de Programação II
 * Autor: <Samuel da Costa Araujo Nunes>
 * Data:  <01/10/2020>
 *
 * Declaro que este código foi elaborado por mim de forma individual e
 * não contém nenhum trecho de código de outro colega ou de outro autor, 
 * tais como provindos de livros e apostilas, e páginas ou documentos 
 * eletrônicos da Internet. Qualquer trecho de código de outra autoria que
 * uma citação para o  não a minha está destacado com  autor e a fonte do
 * código, e estou ciente que estes trechos não serão considerados para fins
 * de avaliação. Alguns trechos do código podem coincidir com de outros
 * colegas pois estes foram discutidos em sessões tutorias.
 */
package modelTest;
import model.Grafo;

/**
 * @author Samuel da Costa Araujo Nunes
 */
public class GrafoFactory {
/**
 * @author Samuel da Costa Araujo Nunes
 */
    Grafo grafo;

    public Grafo GrafoFactory(){
        
        grafo.addAresta(30,"origem","caminhoMenor");
        grafo.addAresta(50,"origem","caminhoMaior");
        grafo.addAresta(10,"caminhoMenor","destino");
        grafo.addAresta(20,"caminhoMaior","destino");

        return grafo;
    }
}