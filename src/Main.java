public class Main {
    public static void main(String[] args) {

        // Crear capitanes
        Capitan capitanUno = new Capitan("Carlos", "Palacios", "MAT1");
        Capitan capitanDos = new Capitan("Johanes", "Correa", "MAT2");
        Capitan capitanTres = new Capitan("Sebastian", "Alvarez", "MAT3");
        Capitan capitanCuatro = new Capitan("Edward", "Smith", "MAT4");

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan", "Perez", "ID001", "Calle Falsa 123", "555-1234");
        Usuario usuario2 = new Usuario("Maria", "Gomez", "ID002", "Avenida Siempre Viva 456", "555-5678");
        Usuario usuario3 = new Usuario("Luis", "Martinez", "ID003", "Boulevard de los Sueños 789", "555-9012");
        Usuario usuario4 = new Usuario("Ana", "Lopez", "ID004", "Plaza de la Libertad 101", "555-3456");

        // Crear Embarcaciones
        Velero velero = new Velero(capitanUno, 100_000, 10_000, 2021, 4, 3);
        Velero veleroGrande = new Velero(capitanUno, 180_000, 12_000, 2023, 5, 5);
        Yate yate = new Yate(capitanDos, 200_000, 20_000, 2019, 7, 4, 2_000_000);
        Yate yateLujo = new Yate(capitanTres, 300_000, 50_000, 2022, 12, 9, 5_000_000);

        // Calcular el monto del alquiler
        System.out.println("El monto de alquiler para la embarcacion: \n" +velero.toString()+ "\n es de " +velero.calcularMonto());
        System.out.println("El monto de alquiler para la embarcacion: \n" +veleroGrande.toString()+ "\n es de " +veleroGrande.calcularMonto());
        System.out.println("El monto de alquiler para la embarcacion: \n" +yate.toString()+ "\n es de " +yate.calcularMonto());
        System.out.println("El monto de alquiler para la embarcacion: \n" +yateLujo.toString()+ "\n es de " +yateLujo.calcularMonto());

        // Alquilar Embarcaciones asignando Usuarios a las Embarcaciones
        velero.asignarUsuario(usuario1);
        veleroGrande.asignarUsuario(usuario2);
        yate.asignarUsuario(usuario3);
        yateLujo.asignarUsuario(usuario4);

        // Comprando Yates 🤑
        System.out.println("El precio de compra del Yate normal es de " +yate.comprar());
        System.out.println("El precio de compra del Yate de Lujo es de " +yateLujo.comprar());

        // Liberando Usuarios de las Embarcaciones
        velero.liberarUsuario();
        veleroGrande.liberarUsuario();
        yate.liberarUsuario();
        yateLujo.liberarUsuario();
    }
}

/* Oportunidades de mejora

-Estructuras de datos
-Mas abstraccion y entidades
-Escalabilidad
-Manejo de exepciones y errores

*/