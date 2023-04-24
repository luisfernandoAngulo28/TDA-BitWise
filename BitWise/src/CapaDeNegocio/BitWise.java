/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeNegocio;

/**
 *32 31  30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9  8  7  6  5  4  3  2  1
 * 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0 
 * @author ferna
 */
public class BitWise {
    //Atributo
    int V;
    
    public BitWise(){
        this.V=0;
       // *32 31  30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9  8  7  6  5  4  3  2  1
        //* 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0 
    }
                           //3
    public void set1(int posicion){
        if (posicion<=32) {
            int mascara=1;
       //     *32 31  30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9  8  7  6  5  4  3  2  1    
     //mascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1=1 
     mascara=mascara<<(posicion-1);  //(3-1)=2    2
       //     *32 31  30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9  8  7  6  5  4  3  2  1    
   //masascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=4
   ///Para Encender Un Bits usamos el or |
           //V= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  
        //Aplicando un or   V|mascara
        //----------------------------------------------------------------------------------------------------
        //   V= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0=0
  // masascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=4        
        //----------------------------------------------------------------------------------------------------
         //  V= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=4 
           V=V|mascara;
            System.out.println(V+" "+Integer.toBinaryString(V));
     
        }
    }
    
    public void set0(int posicion){
        if (posicion<=32) {
            int mascara=1;
       //     *32 31  30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9  8  7  6  5  4  3  2  1    
     //mascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1=1 
     mascara=mascara<<(posicion-1);  //(3-1)=2    2
       //     *32 31  30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9  8  7  6  5  4  3  2  1    
   //masascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=4
        mascara=~mascara;
 //  masascara= 1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  0  1  1=
      V=V&mascara;
         //  V= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0  
        //Aplicando un or   V|mascara
        //----------------------------------------------------------------------------------------------------
        //   V= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=5
  // masascara= 1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  1  0  1  1=        
        //----------------------------------------------------------------------------------------------------
         //  V= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0 (0)  0  0=0 
            System.out.println(V+" "+Integer.toBinaryString(V));
        }
    }
      //  V= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=4
                          //3
    public int getBit(int posicion){
        if (posicion<=32) {
            int mascara=1;
       //     *32 31  30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9  8  7  6  5  4  3  2  1    
     //mascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1=1 
     mascara=mascara<<(posicion-1); //(3-1)=2
      //      *32 31  30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9  8  7  6  5  4  3  2  1    
     //mascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=4 
        mascara=mascara&V;
     //---------------------------------------------------------------------------------------------------------
      //      *32 31  30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9  8  7  6  5  4  3  2  1    
     //mascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=4
       //    V= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=4
      //---------------------------------------------------------------------------------------------------------
//     mascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1  0  0=4
       mascara=mascara>>>(posicion-1);//(2)
//     mascara= 0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  1=1       

       return mascara;
     
        }
        return 0;
    }
    
    
    public String toString(){
        String salida="";
        for (int i = 32; i >= 1; i--) {
            salida=salida+" "+getBit(i)+" ";
        }
      return salida+"="+V;
    }
    
    public static void main(String[] args) {
        BitWise bitwisePrueba=new BitWise();
        bitwisePrueba.set1(3);
        //bitwisePrueba.set0(3);
        System.out.println(bitwisePrueba.toString());
    
    }
    /*
    BitWise
    ConjuntoBit
    Vector7Bits
    VectorNBits (aplicacion)
    Matriz Sparce Normal
    Matriz Sparce VectorNBits
    Examen
    
    */
}
