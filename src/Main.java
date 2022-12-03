public class Main {
    public static void main(String[] args) {
        System.out.println("Generics Learn!");
        Trinity<Integer, Integer, Integer> integerTrinity = new Trinity<>(new Integer(8), new Integer(18), new Integer(7));
        switch (integerTrinity.getThirst().compareTo(integerTrinity.getSecond())) {
            case 1:
                switch (integerTrinity.getThirst().compareTo(integerTrinity.getThird())) {
                    case 1:
                        switch (integerTrinity.getSecond().compareTo(integerTrinity.getThird())) {
                            case 1:
                                integerTrinity.printT_S_TR();
                                System.exit(0);
                            case -1:
                                integerTrinity.printT_TR_S();
                                System.exit(0);
                        }
                    case -1:
                        integerTrinity.printTR_T_S();
                        System.exit(0);
                }
            case -1:
                switch (integerTrinity.getThirst().compareTo(integerTrinity.getThird())){
                    case 1:
                        integerTrinity.printS_T_TR();
                        System.exit(0);
                    case -1:
                        switch (integerTrinity.getSecond().compareTo(integerTrinity.getThird())){
                            case 1:
                                integerTrinity.printS_TR_T();
                                System.exit(0);
                            case -1:
                                integerTrinity.printTR_S_T();
                                System.exit(0);
                        }
                }
        }
    }
}