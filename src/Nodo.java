public class Nodo {
    int dato;
    String nombre;
    Nodo hijoIzquierdo, hijoDerecho;
    public Nodo(int d, String nom){
        this.dato=d;
        this.nombre=nom;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }
    public String toString(){
        return nombre + " Su Dato es " + dato;
    }
}