/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomintegers;

import java.security.SecureRandom;

public class RandomIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SecureRandom randomNumbers = new SecureRandom();
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;
        
        for (int counter = 1; counter <= 60000; counter++){
            int face = 1 + randomNumbers.nextInt(6);
            
            System.out.printf("%d ", face);
            
            if (counter % 6 == 0){
                System.out.println();
            }
            
            switch (face){
                case 1:
                    ++aCount;
                    break;
                case 2:
                    ++bCount;
                    break;
                case 3:
                    ++cCount;
                    break;
                case 4:
                    ++dCount;
                    break;
                case 5:
                    ++eCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }
        
        System.out.printf("%nNumber of 1 rolls: %d%n", aCount);
        System.out.printf("Number of 2 rolls: %d%n", bCount);
        System.out.printf("Number of 3 rolls: %d%n", cCount);
        System.out.printf("Number of 4 rolls: %d%n", dCount);
        System.out.printf("Number of 5 rolls: %d%n", eCount);
        System.out.printf("Number of 6 rolls: %d%n", fCount);
        
    }
    
}
