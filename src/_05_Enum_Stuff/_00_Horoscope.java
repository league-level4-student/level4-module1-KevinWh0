package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	  // 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	static int index = 1;
	static Zodiac z = Zodiac.values()[index];//Zodiac.AQUARIUS;
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void show(Zodiac zo) {
		//JOptionPane jop = new JOptionPane("You are an " + zo);
		String[] descriptions = {"Try to be patient and understanding. Some of your new friends may not be that trustworthy. Relationships will be emotional today.","  Depression may result if you don't get to do things your own way. You will enjoy physical activities more than you think. Control your temper by getting immersed in your work.",
				"  Matters pertaining to your home environment will be favorable if you are direct. You will be able to borrow money in order to invest. You have been stagnating for some time now and you need a change of pace.",
				"  Don't push your luck with your boss. Try to join groups of interest such as ballroom dance classes or perhaps an internet organization. Call siblings or old friends to catch up on recent news.", 
				"  You will need to do a lot of research if you wish to get to the bottom of things. Don't let your jealousy be the reason for a decaying relationship. You may blow situations out of proportion when dealing with the one you love.", "  Opportunities for financial gains through investments and games of chance are likely. Responsibilities with respect to older relatives may be a burden. Home improvement projects will go well if you delegate work to all your family members.", 
						"  You can get into weight loss programs or go out and change your image with a new look in clothing, hairstyle, and attitude. You are able to make changes in your home that will be favorable to all involved. Encourage the youngsters in your family.",
						"  You can make major gains if you talk to your boss about your findings. Visitors may drop by unexpectedly, resulting in tension with your lover. Your attitude could be up and down like a yo-yo.",
						"  Your ideas may be good, but they aren't necessarily right for everyone. Today will be hectic. Don't be too eager to spend what's left over; more unexpected expenses are evident.",
						"  You may have a problem with coworkers if you try to tell them what to do. You may find that your family responsibilities are piling up. Get proper medical attention and confront your situation decisively.", 
						"  Don't settle for less than the best. If you're looking to do something worthwhile, consider volunteer work. You can make positive changes in your home.", 
						"  Expand your knowledge and sign up for courses and seminars. Lending and borrowing may be a problem. You will want to complain about the injustice that is going on,"};
		String desc = "";
		//System.out.println(Zodiac.valueOf(zo.toString()));
		
		JOptionPane.showMessageDialog(null, "You are an " + zo + "\n "+ descriptions[index]);

	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		show(z);
	}
	

}

