public class ArbolBinario {
    Nodo raiz;
    public ArbolBinario(){
        raiz=null;
    }
    //Metodo para insertar un Nodo en el Arbol
    public void agregarNodo(int d, String nom){
        Nodo nuevo = new Nodo(d, nom);
        if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo auxiliar = raiz;
            Nodo padre;
            while(true){
                padre = auxiliar;
                if(d<auxiliar.dato){
                    auxiliar=auxiliar.hijoIzquierdo;
                    if(auxiliar == null){
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.hijoDerecho;
                    if(auxiliar==null){
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    //Metodo para saber cuando el arbol esta vacio
    public boolean estaVacio(){
        return raiz == null;
    }
    //Metodo para recorrer el Arbol InOrden
    public void inOrden(Nodo r){
        if(r!=null){
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato);
            inOrden(r.hijoDerecho);
        }
    }
}