/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Codigo;

/**
 *
 * @author user01
 */
public class Principal {

    public static void main(String[] args) {

        CListaLigada miLista = new CListaLigada();
        
        miLista.adicionar(9);
        miLista.adicionar(8);
        miLista.adicionar(7);
        miLista.adicionar(1);
        miLista.adicionar(3);
        miLista.adicionar(5);
        miLista.adicionar(4);
        miLista.adicionar(6);
        miLista.adicionar(2);
        
        miLista.transversa();
        
        
        
        
    }
    
    public CListaLigada recursivo(CListaLigada lista, int parametroInicial, int parametroFinal)
    {
        //El pivote siempre sera el ultimo número de la parte de la coleccion que se 
        //manejara, los parametros son posiciones.
        int pivote = lista.getDato(parametroFinal);
        int compararPivote = parametroInicial;
        //Empezaremos a comparar con el siguiente número ya que 
        //no sirve de nada hacer un cambio con el propio número.
        int posicionCambio;
        for(int i = parametroInicial + 1; i < parametroFinal; i++)
        {
            posicionCambio = i;
            if(lista.getDato(posicionCambio) < pivote)
            {
                this.intercambio(lista.obtenerPorIndice(compararPivote), lista.obtenerPorIndice(posicionCambio));
                compararPivote = posicionCambio;
            }
        }
        
        return lista;
    }
    
    public void intercambio(CNodo nodoTrasero, CNodo nodoDelantero)
    {
        int buffer;
        buffer = nodoDelantero.getDato();
        nodoDelantero.setDato(nodoTrasero.getDato());
        nodoTrasero.setDato(buffer);
    }
    
}
