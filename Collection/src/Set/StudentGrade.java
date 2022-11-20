package Set;

public class StudentGrade {
    private String name;
    private int chinese;
    private int math;
    private int Score;

    public StudentGrade() {
    }

    public StudentGrade(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        Score = this.getChinese()+this.getMath();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = this.getChinese()+this.getMath();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StudentGrade{");
        sb.append("name='").append(name).append('\'');
        sb.append(", chinese=").append(chinese);
        sb.append(", math=").append(math);
        sb.append(", Score=").append(Score);
        sb.append('}');
        return sb.toString();
    }
}
