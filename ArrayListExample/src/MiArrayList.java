import java.util.ArrayList;


public class MiArrayList {
    ArrayList<Integer> list = new ArrayList<>();

    public void agregar(int num){
        list.add(num);
        System.out.println("El numero agregado fue: " + num + "\n");
    }

    public void obtener(){
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "\n");
        }
    }

    public void eliminar(int num){
        list.remove(Integer.valueOf(num));
        System.out.println("Se elimino el numero " + num);
    }
}
