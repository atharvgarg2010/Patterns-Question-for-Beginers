class Lec4 {
    public static void main(String args[]){
        // Pattern - 1
        // *****
        // *****
        // *****
        // *****
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }

        // Pattern - 2
        // *****
        // *   *
        // *   *
        // *****
        // int n = 4;
        // int m = 5;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i==1 || j==1 || i==n || j==m) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();

        // }

        // Pattern - 3
        // *
        // **
        // ***
        // ****
        // int n = 11;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j=j+1) {
        //         System.out.print(" ");
                
        //     }
        //     for (int j = 1; j < i; j++) {
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }
        
        // Pattern - 4
        // 1
        // 12
        // 123
        // 1234
        // for (int i = 1; i <=6; i++) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // Pattern - 5
        // 1234
        // 123
        // 12
        // 1

        // for (int i = 6; i >=1; i--) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        // Pattern - 6
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14
        // int num = 1; 
        // for (int i = 1; i <=6; i++) {
        //     for (int j = 1; j < i; j++) {
        //         System.out.print(num+" ");
        //         num++;
                
        //     }
        //     System.out.println();
        // }

        // Pattern - 7
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        for (int i = 1; i <=6; i++) {
            for (int j = 1; j < i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print(0+" ");
                } else {
                    System.out.print(1+" ");
                    
                }                
            }
            System.out.println();
        }
    }

}
