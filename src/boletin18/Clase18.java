package boletin18;

public class Clase18 {
    int []numeros=new int [6];
    
    public void crearArray(){
        for (int i=0;i<numeros.length;i++){
            numeros [i]=(int)Math.floor(Math.random()*50+1);
        }  
}
    public void visualizarNormal(){
        System.out.println("numeros generados");
        for (int i =0;i<numeros.length;i++){
            
            System.out.println(numeros[i]);
        }
    }
    public void visualizarReves(){
        System.out.println("numeros al reves");
        for (int i=numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
            
    }
