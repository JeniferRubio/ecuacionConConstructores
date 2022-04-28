package Clase03;

class Main {
    public static void main(String[] args) {
        
        Ecuacion ecuacion1 = new Ecuacion(1.00,-2.00,1.00);
        
       
       
        System.out.println("numero 1: "+ecuacion1.obtenerNumero1());
        System.out.println("numero 2: "+ecuacion1.obtenerNumero2());
        System.out.println("numero 3: "+ecuacion1.obtenerNumero3());
        ecuacion1.calcular();
       
        
    }
}
