package com.currencyNotes;

public class NotesCount {

		public void counting(int[] currency, int amount) {
			int noteqty[]=new int[currency.length];
			int i;
			int sum=0;
			for(i=0;i<currency.length;i++)
			{
				noteqty[i]=amount/currency[i];
				sum=sum+noteqty[i];
				amount=amount%currency[i];
			}
			System.out.println("Your payment approach in order to give min no of notes will be ");
			for(i=0;i<currency.length;i++)
			{
				if(noteqty[i]!=0)
					
				System.out.println( currency[i] + ":" + noteqty[i]);
			}
			System.out.println("Total number of notes will be "+sum);
			
			

	}

}
