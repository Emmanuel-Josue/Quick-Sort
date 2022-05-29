/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Codigo;

//Como trate de resolverlo. 
public class Principal {

    public static void main(String[] args) {

        CListaLigada miLista = new CListaLigada();
        Principal objeto = new Principal();
        
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
        
        objeto.quickSort(miLista, 0, miLista.cantidadDeElementos()-1);
        
        miLista.transversa();
        
        
        
        
    }
    
    //ParametroFinal será la ultima posición. 
    public int particion(CListaLigada lista, int parametroInicial, int parametroFinal)
    {
        int indicePivote = parametroInicial;//Será el lugar final en donde quede el pivote (ultimo número)
        int recorriendoIndice;// recorrera la colección y se comparara con el pivote
        int pivote = lista.getDato(parametroFinal);//Sera el ultimo número de la colección.

        //Al parametro final se le suma uno para que la colección pueda ser analizada completamente ya que 
        // el parametro final nos da el numero de elementos exactos de la colección y el for 
        // solo llega a entrar hasta un número antes. 
        for(int i = parametroInicial; i < parametroFinal+1; i++)
        {
            recorriendoIndice = i;
            if(lista.getDato(recorriendoIndice) < pivote)//Los números menores quedaran a la izquierda 
            {
                this.intercambio(lista.obtenerPorIndice(indicePivote),lista.obtenerPorIndice(recorriendoIndice));
                indicePivote = ++indicePivote;//Solo avanzara un espacio a la vez. 
            }
        }
        this.intercambio(lista.obtenerPorIndice(indicePivote),lista.obtenerPorIndice(parametroFinal));
        return indicePivote;
        
    }
    
    public void intercambio(CNodo nodoTrasero, CNodo nodoDelantero)
    {
        int buffer;
        buffer = nodoDelantero.getDato();
        nodoDelantero.setDato(nodoTrasero.getDato());
        nodoTrasero.setDato(buffer);
    }
    
    public CListaLigada quickSort(CListaLigada lista, int parametroInicial, int parametroFinal)
    {
        int posicionNumeroAcomodado;
        if(parametroInicial < parametroFinal)
        {
            posicionNumeroAcomodado = this.particion(lista, parametroInicial, parametroFinal);
            
            this.quickSort(lista, parametroInicial,posicionNumeroAcomodado-1);
            this.quickSort(lista, posicionNumeroAcomodado+1, parametroFinal);
        }
        else
        {
            lista = lista;
        }
        return lista;
    }
    
}
