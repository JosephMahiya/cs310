// The Object Oriented Avengers: Dustin Tawney and Joseph Sampson
// Lexical Analyzer (Parser) Class 

import java.lang.String;

public class Parser 
{
	private String[] lexemes = {"identifier", "integer literal", "procedure keyword", "begin keyword", "end keyword", "semicolon operator", "assignment operator", "addition operator", "subtraction operator", "multiplication operator", "division operator", "equality operator", "notequals operator", "left parenthesis", "right parenthesis", "if keyword", "then keyword", "else keyword", "endif keyword", "ENDOFINPUT"};
	private char[] input;
	private int currTok;
	String token;

	//Constructor
	public Parser(String in)
	{
		input = new char[in.length()];
		for(int i = 0; i < in.length(); i++)
		{
			input[i] = in.charAt(i);
		}
		currTok = 0;
		token = "";
	}
	
	//Scans through
	public int getNextToken()
	{
		token = "";
		for(int i = currTok; i < input.length; i++)
		{
			token = token + input[i];
			for(int j = 0; j < lexemes.length; j++)
			{
				if(token.compareTo(lexemes[j]) == 1)
				{
					token = "";
					return j;
				}
			}
		}
	}
	
	public char getCurrentToken()
	{
		return input[currTok];
	}
	
	
}
