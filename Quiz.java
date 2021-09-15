public class Quiz {
	
	
	
	public static void main(String[] args) {
		
		
		//Question 1, and creation of the object
		MultipleChoiceQuestion question = new MultipleChoiceQuestion( "What is the Capital of Cyprus?",
				"Nicosia",
				"Larnaca",
				"Paphos",
				"Lemasol",
				"Famagusta",
				"A");
		question.check();
		//Question 2
		question = new MultipleChoiceQuestion(
				"How many continents are there in the world?",
				"1",
				"5",
				"7",
				"11",
				"13",
				"C");
		question.check();
		//Question 3
		question = new MultipleChoiceQuestion(
				"How many bones are in the human body?",
				"105",
				"35",
				"1029",
				"206",
				"9",
				"D");
		question.check();
		//Question 4
		question = new MultipleChoiceQuestion(
				"What is the global average height for men?",
				"177 cm",
				"182 cm",
				"162 cm",
				"171 cm",
				"153 cm",
				"D");
		question.check();
		//Question 5
		question = new MultipleChoiceQuestion(
				"What is the World ranking of UoPeople according to EduRank, out of total 14178 Universities ?",
				"4888  ",
				"9870",
				"1029",
				"158",
				"6",
				"A");
		question.check();
	
		
		// Question 6. I create an object from the class TrueFalseQuestion.
		Question questionTorF = new TrueFalseQuestion("Spiders have 6 legs.",false);
		questionTorF.check();
		// Question 7
		questionTorF = new TrueFalseQuestion("shrimps heart is in their head.",true);
		questionTorF.check();
		// Question 8
		questionTorF = new TrueFalseQuestion("Peanuts come under the category of legumes.",true);
		questionTorF.check();
		//Question 9
		questionTorF = new TrueFalseQuestion("The smallest particle of an element is the molecule.",false);
		questionTorF.check();
		//Question 10
		questionTorF = new TrueFalseQuestion("Snails can sleep up to 3 years",true);
		questionTorF.check();
		
		
		Question.showResults();
	
		
	}
}
		
		