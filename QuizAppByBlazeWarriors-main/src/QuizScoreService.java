

public class QuizScoreService {

    private AnswerScores answerScores;

    public  QuizScoreService (AnswerScores answerScores) {
        this.answerScores = answerScores;
    }

    public int calculateScore(int numCorrect, int numWrong, int numSkipped) {
        int score = (numCorrect * answerScores.getCorrectAnswer()) +
                (numWrong * answerScores.getWrongAnswer());
        return score;
    }
    
    
  

}
