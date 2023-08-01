
public class Main {
	public static void main(String[] args) {
		
	
	
    // Dummy values
    int correctAnswer = 2;
    int wrongAnswer = -1;
    int skipAnswer = 0;

    // Create an instance of the AnswerScores POJO
    AnswerScores answerScores = new AnswerScores(correctAnswer, wrongAnswer, skipAnswer);

    // Create an instance of the ScoreCalculatorService
    QuizScoreService  scoreCalculator = new  QuizScoreService (answerScores);

    // Dummy number of correct, wrong, and skipped answers
    int numCorrect = 7;
    int numWrong = 2;
    int numSkipped = 1;

    // Calculate the score
    int score = scoreCalculator.calculateScore(numCorrect, numWrong, numSkipped);

    // Print the score to the console
    System.out.println("Score: " + score);
}
}