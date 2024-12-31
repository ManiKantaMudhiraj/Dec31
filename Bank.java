package edu.peters.session;

public interface Bank {
	

	void withDraw(int amt) throws InSufficientBalanceException;
}
