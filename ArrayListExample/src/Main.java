public static void main(String[] args) {
    MiArrayList miArrayList = new MiArrayList();
    Scanner scanner = new Scanner(System.in);

    int opcion;
    do {
        System.out.println("==== Menu ====");
        System.out.println("1.- Agregar");
        System.out.println("2.- Consultar");
        System.out.println("3.- Eliminar");
        System.out.println("0.- Salir");
        opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingresa el numero que desea: ");
                int num = scanner.nextInt();
                miArrayList.agregar(num);
                break;

            case 2:
                miArrayList.obtener();
                break;

            case 3:
                System.out.println("Ingrese el numero a eliminar: ");
                int num1 = scanner.nextInt();
                miArrayList.eliminar(num1);
        }


    }while (opcion != 0);
}