import java.util.Scanner;

public class brok {
    public class b {
        private int teller;
        private int nevner;

        public b (int teller, int nevner) {
            this.teller = teller;

            if (nevner == 0) {
                throw new IllegalArgumentException("Nevner er null.");
            }
            
            this.nevner = nevner;
        }

        public b (int teller) {
            this.teller = teller;
            this.nevner = 1;
        }

        public int getTeller () {
            return this.teller;
        }

        public int getNevner () {
            return this.nevner;
        }

        public void multiply (b b2) {
            this.nevner = this.nevner * b2.nevner;
            this.teller = this.teller * b2.teller;
        }

        public void divide (b b2) {
            this.nevner = this.nevner * b2.teller;
            this.teller = this.teller * b2.nevner;
        }

        public void add (b b2) {
            this.teller = (this.teller * b2.nevner) + (b2.teller * this.nevner);
            this.nevner = this.nevner * b2.nevner;
          
        }
        
        public void subtract (b b2) {
            this.teller = (this.teller * b2.nevner) - (b2.teller * this.nevner);
            this.nevner = this.nevner * b2.nevner;
          
        }

        public void userMenu (b b2) {
            Scanner scanner = new Scanner(System.in); 
            System.out.println("Velg et tall for a utfore operasjonen: \n 1: Addisjon \n 2: Substraksjon \n 3: Multiplikasjon \n 4: Divisjon");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println(this.teller + "/" + this.nevner + " + " + b2.teller + "/" + b2.nevner + " = ");
                    add(b2);
                    System.out.println(this.teller + "/" + this.nevner);
                }

                case 2 -> { 
                    System.out.println(this.teller + "/" + this.nevner + " - " + b2.teller + "/" + b2.nevner + " = ");
                    subtract(b2);
                    System.out.println(this.teller + "/" + this.nevner);
                }

                case 3 -> { 
                    System.out.println(this.teller + "/" + this.nevner + " * " + b2.teller + "/" + b2.nevner + " = ");
                    multiply(b2);
                    System.out.println(this.teller + "/" + this.nevner);
                }


                case 4 -> { 
                    System.out.println(this.teller + "/" + this.nevner + " / " + b2.teller + "/" + b2.nevner + " = ");
                    divide(b2);
                    System.out.println(this.teller + "/" + this.nevner);
                }
                    
            }
        }


    }

    public static void main(String[] args) {
        brok brok = new brok();

        System.out.println("Definerer brok nummer 1, input teller og nevner, separert med /: ");
        Scanner scannerBrok = new Scanner(System.in);
        String broek = scannerBrok.nextLine();

        char slash = '/';

        b brok1;
        b brok2;

        if (broek.contains(Character.toString(slash))) {
            String[] temp = broek.split("/");
            brok1 = brok.new b(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }

        else {
            brok1 = brok.new b(Integer.parseInt(broek));
        }

        
        System.out.println("Definerer brok nummer 2, input teller og nevner, separert med /: ");
        String broek2 = scannerBrok.nextLine(); 

        if (broek2.contains(Character.toString(slash))) {
            String[] temp = broek2.split("/");
            brok2 = brok.new b(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }

        else {
            brok2 = brok.new b(Integer.parseInt(broek2));
        }

        brok1.userMenu(brok2);
    }
}