public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n;
    n = scanner.nextInt();
    EjemploArray array = new EjemploArray(n);

    int opcion;

        do {
            System.out.println("======MENU======");
            System.out.println("1.- Agregar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Sumar");
            System.out.println("4.- Promediar");
            System.out.println("0.- Salir");
            System.out.println("Tamaño de array");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("===== Agregar =====");
                    System.out.println("Ingrese el numero que desea agregar: ");
                    int numero = scanner.nextInt();
                    array.agregar(numero);

                    break;

                case 2:
                    System.out.println("===== Mostrar =====");
                    array.mostrar();
                    break;

                case 3:
                    System.out.println("===== Sumar =====");
                    System.out.println(array.sumar());
                    break;

                case 4:
                    System.out.println("===== Promediar =====");
                    System.out.println(array.promedio());
                    break;

            }
        } while (opcion != 0);
}