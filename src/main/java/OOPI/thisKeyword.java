package OOPI;

public class thisKeyword {

    int forThisExample;

    public thisKeyword(int forThisExample) {
        this.forThisExample = forThisExample;
        System.out.println("For the sake of my education " + this);
    }
    public static void main(String[] args) {
        thisKeyword thisKey = new thisKeyword(7);
        System.out.println(thisKey);
    }

}
