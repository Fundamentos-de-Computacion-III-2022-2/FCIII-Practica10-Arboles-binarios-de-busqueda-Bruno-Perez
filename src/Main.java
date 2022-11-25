import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion = 0, elemento = 0;
        String nombre;
        ArbolBinario arbolbinario = new ArbolBinario();
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un Nodo\n" +
                                "2. Recorrer el arbol In Orden\n" +
                                "3. Salir\n", "Menu", JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del nodo : ", "Agregando Nodo", JOptionPane.INFORMATION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo", "Agregando Nodo", JOptionPane.INFORMATION_MESSAGE);
                        arbolbinario.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if(!arbolbinario.estaVacio()){
                            arbolbinario.inOrden(arbolbinario.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio", "Arbol", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        }while(opcion!=3);
    }
}