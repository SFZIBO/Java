public class Segitiga {
    public static void main(String[] args){
        int i,j,k,l;
        for (i = 0 ; i < 5; i++){
            for (j = 0; j < 5; j++){
                System.out.print("* "+i);
            }
            System.out.print("\n");

        }

        for (i = 0 ; i < 5; i++){
            for (j = 0; j < 5; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                }
            }
            System.out.print("\n");

        }
        System.out.print("\n");
        for (i = 0 ; i < 9; i++){
            for (j = 0; j < 9 ; j++){
                System.out.print("* ");
                if ((i == j)){
                    break;
                }else if((i +j)== 8){
                    break;
                }
            }
            System.out.print("\n");

        }






         System.out.print("\n\nBelah Ketupat\n\n");


        int tinggi =5;
        System.out.print("\n");
        for (i = 0; i < tinggi; i++) {
            for (j = 0; j < tinggi - i; j++) {
                System.out.print("   ");
            }
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (i = tinggi - 2; i >= 0; i--) {
            for (j = 0; j < tinggi - i; j++) {
                System.out.print("   ");
            }
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }




        System.out.println();        
        System.out.println();
        for (i = 0; i < tinggi; i++) {
            for (j = 0; j < tinggi - i; j++){
                System.out.print(" * ");
           
            }
            for (k = 0; k < 2 * i - i; k++){
                System.out.print("   ");
            }
            for (l = 0; l < tinggi /5 + i; l++){
                System.out.print("   ");
            }
            for (l = 0; l < tinggi - i; l++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        for (i = tinggi; i >= 0; i--) {
            for (j = 0; j < tinggi - i; j++) {
                System.out.print(" * ");
            }
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.print("   ");
            }
            for (l = 0; l < tinggi - i; l++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

        System.out.println("\n\n");

        for (i = 0; i < tinggi; i++){
            for (j = 0; j < tinggi; j++) {
                System.out.print(" * ");
            }
    
            for (j = 0; j < tinggi; j++) {
                System.out.print("   ");
            }

            for (j = 0; j < tinggi; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(i=0; i < tinggi; i++){
            for(k = 0; k < tinggi; k++){
                System.out.print("   ");                
            }
            for(k = 0; k < tinggi; k++){
                System.out.print(" * ");                
            }
            for(k = 0; k < tinggi; k++){
                System.out.print("   ");                
            }
            System.out.println();
        }
        for (i = 0; i < tinggi; i++){
            for (j = 0; j < tinggi; j++) {
                System.out.print(" * ");
            }
    
            for (j = 0; j < tinggi; j++) {
                System.out.print("   ");
            }

            for (j = 0; j < tinggi; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }




        System.out.println("\n\n\n\n");




        for (i = 0; i < tinggi; i++){
            for (j = 0; j < tinggi; j++) {
                System.out.print(" * ");
            }
    
            for (j = 0; j < tinggi; j++) {
                System.out.print("   ");
            }
            System.out.println();
        } 
        for (i = 0; i < tinggi; i++){
            for (j = 0; j < tinggi; j++) {
                System.out.print("   ");
            }
    
            for (j = 0; j < tinggi; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }         
        for (i = 0; i < tinggi; i++){
            for (j = 0; j < tinggi; j++) {
                System.out.print("   ");
            }
    
            for (j = 0; j < tinggi; j++) {
                System.out.print("   ");
            }
            for (j = 0; j < tinggi; j++) {
                System.out.print(" * ");
            }            
            System.out.println();
        }   

        System.out.println("\n\n\n\n");

        for (i = 0; i < tinggi+3; i++){
            for (j = 0; j < tinggi; j++) {
                System.out.print(" * ");
            }
    
            for (j = 0; j < tinggi - 2; j++) {
                System.out.print("   ");
            }

            for (j = 0; j < tinggi; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }        






    }
}

