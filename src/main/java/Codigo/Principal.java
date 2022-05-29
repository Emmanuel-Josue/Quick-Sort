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
      //  System.out.println("-----------------------particion()-------------------------");
        int indicePivote = parametroInicial;
        int recorriendoIndice;
        int pivote = lista.getDato(parametroFinal);
      //  System.out.println("El pivote vale: "+pivote);
       // System.out.println("El indicePivote: "+indicePivote);
        for(int i = parametroInicial; i < parametroFinal+1; i++)
        {
            recorriendoIndice = i;
          //  System.out.println("indicePivote dentro de for y antes del if: "+indicePivote);
            if(lista.getDato(recorriendoIndice) < pivote)
            {
                this.intercambio(lista.obtenerPorIndice(indicePivote),lista.obtenerPorIndice(recorriendoIndice));
                indicePivote = ++indicePivote;
           //     System.out.println("El IndicePivote adentro del if vale: "+indicePivote);
            }
        }
        
        //Este intercambio es el que necesito analizar, entender bien 
        this.intercambio(lista.obtenerPorIndice(indicePivote),lista.obtenerPorIndice(parametroFinal));
      //  System.out.println("----------------------------se devuelve el indice--------------------");
      lista.transversa();
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
        System.out.println("------------------quickSort()---------------------");
        int posicionNumeroAcomodado;
        System.out.println("Parametrinicial: "+parametroInicial+"  ParametroFinal: "+parametroFinal);
        if(parametroInicial < parametroFinal)
        {
            System.out.println("Entra el if");
            posicionNumeroAcomodado = this.particion(lista, parametroInicial, parametroFinal);
            
            this.quickSort(lista, parametroInicial,posicionNumeroAcomodado-1);
            this.quickSort(lista, posicionNumeroAcomodado+1, parametroFinal);
        }
        else
        {
            System.out.println("Entra el else");
            lista = lista;
        }
        System.out.println("---------------------------se devolvera la lista-----------------------------");
        return lista;
    }
    
}
