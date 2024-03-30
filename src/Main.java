public class Main {
    public static void main(String[] args) {

        int gimimoMetai = 1969;
        int metaiIkiDabar = 2024 - gimimoMetai;

        for (int i = 1; i < metaiIkiDabar; i++){
            if (i < 18){
                System.out.println("Nepilnametis. Siuo metu jam tik " + i);
            }else{
                System.out.println("Pilnametis. Jam jau yra " + i);
            }
        }

        for (int i = 1; i < 10_000; i++){

            if (i % 2 == 0){
                System.out.println(i);

            }
            else if (i % 5 == 0){
                System.out.println(i);

            }
            else if (i % 7 == 0){
                System.out.println(i);

            }
            else if (i % 8 == 0){
                System.out.println(i);

            }
            else if (i % 12 == 0){
                System.out.println(i);

            }
            else if (i % 16 == 0){
                System.out.println(i);

            }
            else if (i % 42 == 0){
                System.out.println(i);

            }
            else if (i % 103 == 0){
                System.out.println(i);

            }
            else if (i % 111 == 0){
                System.out.println(i);

            }
            else if (i % 223 == 0){
                System.out.println(i);

            }
            else if (i % 250 == 0){
                System.out.println(i);

            }
            else{
                System.out.println("Nesidalina");
            }

            //Jeigu neklystu darete paskaitoje su panasiom israiskom ir nekilo jokio problemu, bet man meta,
            /*
            Jeigu neklystu darete paskaitoje su panasiom israiskom ir nekilo jokio problemu, bet man meta,
            kad case'uose yra boolean reiksme, kuri nesuderinama su mano int (i), ir kiek pasidomejau boolean reiksme switch'e
             negalima, tai nezinau ar kazka ne taip paskaitoj praziurejau ar kazka ne taip padariau.

            switch(i){
                case (i % 2 == 0):
                    System.out.println(i);

                case (i % 5 == 0):
                    System.out.println(i);

                case (i % 7 == 0):
                    System.out.println(i);

                case (i % 8 == 0):
                    System.out.println(i);

                case (i % 12 == 0):
                    System.out.println(i);

                case (i % 16 == 0):
                    System.out.println(i);

                case (i % 42 == 0):
                    System.out.println(i);

                case (i % 103 == 0):
                    System.out.println(i);

                case (i % 111 == 0):
                    System.out.println(i);

                case (i % 223 == 0):
                    System.out.println(i);

                case (i % 250 == 0):
                    System.out.println(i);

                default:
                    System.out.println("Nesidalina");
            }*/
        }


    }
}