// The Object Oriented Avengers: Dustin Tawney and Joseph Sampson

public class Parser 
{
	public static boolean program()
	{
		if(t.getCurrentToken() == procedureKey) //find these variables names
		{
			t.getNextToken();
			if(t.getCurrentToken() == identifier)
			{
				t.getNextToken();
				if(t.getCurrentToken() == begin)
				{
					t.getNextToken();
					if(stmt_list() == true)
					{
						t.getNexttoken();
						if(t.getCurrentToken() == end)
						{
							return true;
						}
					}
				}
			}
		}
		else return false; //Confirm correct "false" placement (do I need one for every if statement)
	}
	
	public static boolean stmt_list()
	{
		if(stmt() == true)
		{ //see if the ";" needs to be accounted for
			t.getNextToken(); 
			if(t.getCurrentToken() == ) //find out how to start this loop
			{
				stmt_list();
			}
			else return true;
		}
		else return false;
	}
	
	public static boolean stmt()
	{
		if(assign() == true)
		{
			return true;
		}
		else if(IF() == true)
		{
			return true;
		}
		else return false;
	}
	
	public static boolean IF()
	{
		if(t.getCurrentToken() == "if")
		{
			t.getNextToken();
			if(t.getCurrentToken() == "(")
			{
				t.getNextToken();
				if(bool() == true)
				{
					t.getNextToken();
					if(t.getCurrentToken() == ")")
					{
						t.getNextToken();
						if(t.getCurrentToken == "then")
						{
							t.getNextToken();
							if(stmt_list() == true)
							{
								t.getNextToken();
								if(t.getCurrentToken() == "else")
								{
									t.getNextToken();
									if(stmt_list() == true)
									{
										t.getNextToken();
										if(t.getCurrentToken() == "endif")
										{
											t.getNextToken();
											if(t.getCurrentToken() == ";") //does this need to be accounted for
											{
												return true;
											}
										}
									}
								}
								else if(t.getCurrentToken() == "endif")
								{
									t.getNextToken();
									if(t.getCurrentToken() == ";") //does this need to be accounted for
									{
										return true;
									}
								}
							}
						}
					}					
				}
			}
		}
		else return false;
	}
		
	public static boolean assign()
	{
		if(var() == true)
		{
			if(t.getCurrentToken() == ":") //find these variables names (may combined to ":=")
			{
				t.getNextToken();
				if(t.getCurrentToken() == "=")
				{
					t.getNextToken();
					if(expr() == true)
					{
						t.getNextToken();
						if(t.getCurrentToken() == ";")
						{
							return true; //see if the ";" needs to be accounted for
						}
					}
				}
			}
		}
		else return false; //Confirm correct "false" placement
	}
	
	public static boolean expr()
	{
		if(term() == true)
		{
			t.getNextToken();
			if(t.getCurrentToken == "+")
			{
				t.getNextToken();
				if(term() == true) //possible solution to the loop problem, change all "term()" to "expr()"
				{
					return true;
				}
			}
			else if(t.getCurrentToken() == "-")
			{
				t.getNextToken();
				if(term() == true)
				{
					return true;
				}
			}
			else if(t.getCurrentToken() == "*")
			{
				t.getNextToken();
				if(term() == true)
				{
					return true;
				}
			}
			else if(t.getCurrentToken() == "/")
			{
				t.getNextToken();
				if(term() == true)
				{
					return true;
				}
			}
			else return true;
		}
		else return false;
	}
	
	public static boolean term()
	{
		if(var() == true)
		{
			return true;
		}
		else if(int() == true)
		{
			return true;
		}
		else return false;
	}
	
	public static boolean bool()
	{
		if(var() == true)
		{
			t.getNextToken();
			if(t.getCurrentToken() == "=")
			{
				t.getNextToken();
				if(int() == true)
				{
					return true;
				}
			}
			else if(t.getCurrentToken() == "!=")
			{
				t.getNextToken();
				if(int() == true)
				{
					return true;
				}
			}
		}
		else return false;
	}
}
