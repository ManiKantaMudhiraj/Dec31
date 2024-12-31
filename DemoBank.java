package edu.peters.session;

		interface Bank{
			
			void withDraw(int amt) throws InSufficientBalanceException;
			void deposit(int amt) throws LimitExceedes;
		}

		public class DemoBank {

		}

