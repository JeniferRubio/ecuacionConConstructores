package Clase03;
class Ecuacion {
    public Double numero1;
    public Double numero2;
    public Double numero3;
    public double x2;
    public double x1;

    //constructor  
    Ecuacion(double num1, Double num2, Double num3)
    {
      establecerNumero1(num1);
      establecerNumero2(num2);
      establecerNumero3(num3);
    }



    void establecerNumero1(Double num1)
    {
        numero1 = num1;
    }
    Double obtenerNumero1()
    {
        return numero1;
    }
    void establecerNumero2(Double num2)
    {
        numero2 = num2;
    }
    double obtenerNumero2()
    {
        return numero2;
    }
  
    void establecerNumero3 (Double num3)
    {
        numero3 = num3;
    }
     Double obtenerNumero3()
    {
        return numero3;
    }

    Double getDiscriminante()
    {
       return Math.pow(obtenerNumero2(), 2)-(4*obtenerNumero1()*obtenerNumero3());
    }
  


    void obtenerRaices()
    {
        x1 = (-obtenerNumero2()+Math.sqrt(getDiscriminante()))/(2*obtenerNumero1());
        x2 = (-obtenerNumero2() - Math.sqrt(Math.pow(obtenerNumero2(), 2)-(4*obtenerNumero1()*obtenerNumero3())))/(2*obtenerNumero1());
        System.out.println("solucion x1");
        System.out.println(x1);
        System.out.println("solucion x2");
        System.out.println(x2);
    }

    void obtenerRaiz()
   {
    double x=(-obtenerNumero2()) / (2*obtenerNumero1());
     System.out.println("unica solucion");
     System.out.println(x);
   }
 
   boolean tieneRaices() {                                                     
   
       return getDiscriminante () > 0;                                   
    }                                                                                            
   boolean tieneRaiz() {                                                  
       return getDiscriminante() ==0;
   }
   void calcular()
    {
     if (tieneRaices()){
       obtenerRaices();
    }
    if (tieneRaiz()){
           obtenerRaiz();
       }
    if (getDiscriminante() < 0) {
           System.out.println("No tiene soluciones");
       }
         
     }




}