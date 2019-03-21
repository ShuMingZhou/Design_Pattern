package observer.guavagper;

public class GuavaObserveTest {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Question question = new Question("rick","发布问题java");
        question.addTeacher(new Teacher("Tom"));
        question.addTeacher(new Teacher("Mic"));
        gper.publishQuestion(question);
    }
}
