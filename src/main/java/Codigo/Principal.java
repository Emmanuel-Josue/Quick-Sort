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
        if((parametroInicial+1) != parametroFinal & parametroInicial != parametroFinal)//Esto quiere decir que no son consecutivos y que se analizaran mas de un número en la coleccion o que existen los numeros suficientes para que el algoritmo pueda trabajar 
        {
            //El pivote siempre sera el ultimo número de la parte de la coleccion que se 
            //manejara, los parametros son posiciones.
            int pivote = lista.getDato(parametroFinal);
            // compararPivote es la variable que ira avanzando como el iterador 
            int compararPivote;
            //´posicionCambio será la que se cambiara solo si la condicional se cumple
            int posicionCambio = parametroInicial;
            for(int i = parametroInicial + 1; i < parametroFinal; i++)
            {
                compararPivote = i;
                if(lista.getDato(compararPivote) < pivote)
                {
                    this.intercambio(lista.obtenerPorIndice(posicionCambio), lista.obtenerPorIndice(compararPivote));
                    posicionCambio = compararPivote;
                }
            }
        }
        //ambos casos estaran basados en la sentencia de arriba
        if(true)
        {
            //Primer caso base 
        }
        if(true)
        {
            //segundo caso base 
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
