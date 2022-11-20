package Exception;

public class Teacher {
    public void checkScore(int score) throws SocreException{
        if(score<0||score>100){
            throw new SocreException("score should between 0 and 100.");
        }else {
            System.out.println("OK!");
        }
    }
}
