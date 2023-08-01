
public class AnswerScores {
    private int correctAnswer;
    private int wrongAnswer;
    private int skipAnswer;

  

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getWrongAnswer() {
		return wrongAnswer;
	}

	public void setWrongAnswer(int wrongAnswer) {
		this.wrongAnswer = wrongAnswer;
	}

	public int getSkipAnswer() {
		return skipAnswer;
	}

	public void setSkipAnswer(int skipAnswer) {
		this.skipAnswer = skipAnswer;
	}
	  public AnswerScores(int correctAnswer, int wrongAnswer, int skipAnswer) {
	        this.correctAnswer = correctAnswer;
	        this.wrongAnswer = wrongAnswer;
	        this.skipAnswer = skipAnswer;
	    }

}
