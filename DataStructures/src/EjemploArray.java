public class EjemploArray {

    private int[] datos;
    private int contador;

    public int[] getDatos() {
        return datos;
    }

    //Constructor: Recibe el tamaño del array
    public EjemploArray(int tamano){
        datos = new int[tamano];
        contador = 0;
    }

    //Agregar un numero al array
    public void agregar(int numero){
        if(contador < datos.length){
            datos[contador] = numero;
            System.out.println("El numero fue agregador exitosamente \n");
            contador++;
        } else {
            System.out.println("El array esta lleno");
        }
    }

    //Mostrar todos los elementos
    public void mostrar(){
        System.out.println("Contenido del arreglo");
        for (int i = 0; i < contador; i++){
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }

    //calcular suma de numeros en array
    public int sumar(){
        int suma = 0;
        for(int i = 0; i < contador; i++){
            suma += datos[i];
        }
        return suma;
    }

    public double promedio(){
        if (contador == 0) return 0;

        return (double) sumar() / contador;
    }
}