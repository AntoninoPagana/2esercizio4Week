public class Main {
    public static void main(String[] args) {
        controlloCarattere('5');
    }
    public static void controlloCarattere(char carattere){
        if(Character.isDigit(carattere)){
            System.out.println("Il carattere inserito e' un numero");
        } else{
            throw new ArithmeticException();
        }
    }
}
