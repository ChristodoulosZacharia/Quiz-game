
import javax.swing.*;

public class TrueFalseQuestion extends Question {


	
	TrueFalseQuestion(String question, Boolean answer){
		
		super(question);
		JPanel buttons = new JPanel();		
		
		if(answer==true) {this.correctAnswer= "TRUE";}
		else {this.correctAnswer= "FALSE";}
		
		addButton(buttons,"TRUE");
		addButton(buttons,"False");
		this.question.add(buttons);
		initQuestionDialog();

	}
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}

}
