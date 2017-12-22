package PracticeTests.Chapter16.Question35;

public class Tale {
    class BearException extends RuntimeException{};
    class WolfException extends RuntimeException{};
    class DrageExceptionException extends RuntimeException{};

    public int tellStory() {
        try{} catch (BearException d) {
//            d = new RuntimeException(); //variable undefined
            throw d;
        } catch (WolfException | DrageExceptionException e) {
//            e = new RuntimeException(); //variable undefined
            throw e;
        }
        return 3;
    }
    public static void main(String... wand) throws RuntimeException {
        new Tale().tellStory();
    }
}
