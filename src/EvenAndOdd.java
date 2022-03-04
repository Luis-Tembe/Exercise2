public class EvenAndOdd {
    //Task 3: a program that generates a random number between 1 and 100.
    public static void main(String[] args) {
    int randomValue = (int) (Math.random() * (100-1));

    if(randomValue%2 == 0){
        System.out.println(randomValue + " it is an even number");
    }else {
        System.out.println(randomValue + " it is an odd number");
    }
    }
}
