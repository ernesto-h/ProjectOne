package com.skillstorm.beans;

import java.util.Scanner;

public class Scenes {
	static Scanner in = new Scanner(System.in);


	Player p1 = new Player();

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////JAVA DREAM///////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// this will be the method that runs my game.
	public void runJavaDream() {
		String choice;
		do {//do this
			// run my game
			// when game ends, prompt player to play again
			runScenes();
			System.out.println("Play again? Enter Yes or No.");

			choice = in.nextLine();
			// (do the above) while choice equals yes
		}while(choice.equalsIgnoreCase("yes") ||
				(choice.equalsIgnoreCase("y")));
		//if choice doesn't equal yes, "Goodbye."
		if (!(choice.equalsIgnoreCase("yes") ||
				(choice.equalsIgnoreCase("y"))));{
					System.out.println("Goodbye.");
				}//end of if statement
	}//runJavaDream
	//////////////////////////////////////////////////////////////////////////////////////////////////////////


	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////runScenes Method///////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////


	public void runScenes() {

		for(int i = 0; i < 1; i++) {// this just loops through my methods
			newPlayer(in);
			if(!runBearScene(p1)) break;		//
			if(!runRiddleScene(p1)) break; 		//
			if(!runDungeonScene(p1)) break;		// -> if these methods return false (because you died), these break the loop
			if(!runBattlefieldScene(p1)) break;	//
			if(!runTavernScene(p1)) break;		//
			runOutroScene(p1); // if you make it through all of them, this method runs, its the OutroScene, duh.
		}//end of loop
	}//runScenes
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////INTRO/////////////////////////////////////////////////////////
	////////////////////////////////////////////////newPlayer//////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public Player newPlayer(Scanner in) {

		System.out.println("**************************************************************************************************");
		System.out.println("");
		System.out.println("Good morning, sleeping beauty.");
		System.out.println("You're probably wondering where you're at and who you are.");
		System.out.println("You'll need to forget about that.");
		System.out.println("This is your new reality for now, so what do you want to call yourself? ");
		System.out.println("Enter name: ");
		// user inputs name here
		String name = in.nextLine();
		System.out.println(name + "? What kind of name is that? ");
		System.out.println("Hmph, I suppose that will have to do. ");
		System.out.println("There's not much time, so let me get to the point.");
		System.out.println("If you ever want to get back home, you'll have to enter the portal in front of you.");
		System.out.println("This will take you to 1 of 5 alternate dimensions.");
		System.out.println("Your abilities will be tested by tasks in each dimension.");
		System.out.println("If successful in one, a new portal will appear leading you to your next task. ");
		System.out.println("If by some miracle you complete all five, your time here may come to an end.");
		System.out.println("Beware, though. Fail one, and you die!");
		System.out.println("");

		// user chooses character here
		String choice;
		//do this
		do {
			System.out.println("So, what kind of hero are you?: ");
			System.out.println("");
			System.out.println("A. Fierce Warrior");
			System.out.println("B. Bright Wizard");
			System.out.println("C. Deadly Assassin");
			System.out.println("D. Joker");// master key class, use to beat every scene.
			System.out.println("");
			choice = in.nextLine();
			//while choice doesn't equal a, b, c, or d
		}while(!(choice.equalsIgnoreCase("A") ||
				(choice.equalsIgnoreCase("B") ||
						(choice.equalsIgnoreCase("C") ||
								(choice.equalsIgnoreCase("D"))))));

		int str = 0;
		int wis = 0;
		int dex = 0;

		//warrior
		if(choice.equalsIgnoreCase("A")){
			p1.setStr(10);
			p1.setWis(4);
			p1.setDex(6);

			//wizard
		}else if(choice.equalsIgnoreCase("B")){
			p1.setStr(4);
			p1.setWis(10);
			p1.setDex(6);


			//assassin
		}else if(choice.equalsIgnoreCase("C")){
			p1.setStr(6);
			p1.setWis(4);
			p1.setDex(10);


			//Joker
		}else if(choice.equalsIgnoreCase("D")){
			p1.setStr(10);
			p1.setWis(10);
			p1.setDex(10);


		}else {
			System.out.println("Try Again.");
		}

		System.out.println("Having made your choice, you enter the portal.");
		System.out.println("");
		System.out.println("**************************************************************************************************");
		System.out.println("");
		Player p1 = new Player(name, str, wis, dex);
		return p1;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////RIDDLE SCENE///////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//riddle: A Man wants to bring a Lion, a goat, and Grass across the river. 
	//The boat is tiny and can only carry one passenger at a time. 
	//If he leaves the Lion and the goat alone together, 
	//the Lion will eat the goat. If he leaves the goat 
	//and the Grass alone together, the goat will eat the Grass.
	//How can he bring all three safely across the river?
	//answer: If he takes lion with him, goat eats the grass, 
	//if he takes the grass with him, the lion eats the goat. 
	//So first he will take the goat with him
	//and leave him on the other side of the river (lion doesn't eat grass).
	//Then he will take the lion and leave him on the other bank of the river 
	//and bring back the goat with him.
	//Then he will take grass and leave the goat on the first bank of the river. 
	//He will drop the grass with lion and come back to take his goat.
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean runRiddleScene(Player p1) {
		System.out.println("**************************************************************************************************");
		System.out.println("");
		System.out.println("You emerge from the portal and find yourself deep inside of a cave. ");
		System.out.println("You hear the words \"Welcome to my home.\" as a hobbled creature ");
		System.out.println("appears from a darkened corner. ");
		System.out.println("Its quickly apparent that the creature is a goblin.");
		System.out.println("\"It seems chance has brought you here, but your luck is down.\"");
		System.out.println("\"See, I'm the only one able to open the portal out of here, but...\"");
		System.out.println("\"I'm very hungry, and you look like a meal on wheels.\"");
		System.out.println("\"So I'll only let you out on one condition: answer my riddle.\"");
		System.out.println("\"Are you ready?\"");
		String in1;
		do { //do this
			System.out.println("Enter Yes when ready:");
			in1 = in.nextLine();
			//while in1 doesn't equal yes
		}while (!(in1.equalsIgnoreCase("yes")));
		if (in1.equalsIgnoreCase("yes") ||
				(in1.equalsIgnoreCase("y"))) {

			System.out.println("");
			System.out.println("\"Listen carefully:");
			System.out.println("");
			System.out.println("A Man wants to bring a Lion, a Goat, and Grass across the river.");
			System.out.println("The boat is tiny.. he can only carry one passenger with him at a time. ");
			System.out.println("If he leaves the Lion and the Goat alone together,");
			System.out.println("the Lion will eat the Goat. If he leaves the Goat ");
			System.out.println("and the Grass alone together, the Goat will eat the Grass.");
			System.out.println("");
			System.out.println("What order can he bring all three safely across the river in?");
			System.out.println("");

			// correct answer
			System.out.println("A. Goat first and leave it on the other side.");
			System.out.println("   Then, cross the Lion, and bring back the Goat.");
			System.out.println("   Afterwards, cross the Grass to the other side.");
			System.out.println("   Finally, return for the Goat.");
			System.out.println("");

			// incorrect, you left the Goat with the Grass.
			System.out.println("B. Lion first and leave it on the other side.");
			System.out.println("   Then, cross the Goat, and bring back the Lion.");
			System.out.println("   Afterwards, cross the Grass to the other side.");
			System.out.println("   Finally, return for the Lion.");
			System.out.println("");


			//incorrect, you left the Lion with the Goat
			System.out.println("C. Grass first and  leave it on the other side.");
			System.out.println("   Then, cross the Goat, and bring back the Grass.");
			System.out.println("   Afterwards, cross the Lion to the other side.");
			System.out.println("   Finally, return for the Goat.");
			System.out.println("");


			//chance
			System.out.println("D. Guess the answer.");		


			System.out.println("");
			String answer;
			do {// do this
				System.out.println("Enter your answer: ");
				System.out.println("");

				answer = in.nextLine();
				// while answer doesn't equal a, b, c, or d.
			}while(!(answer.equalsIgnoreCase("A") ||
					answer.equalsIgnoreCase("B") ||
					answer.equalsIgnoreCase("C") ||
					answer.equalsIgnoreCase("D")));

			if(answer.equalsIgnoreCase("A")){
				System.out.println("The goblin grunts, creates a portal, and says:");
				System.out.println("\"You're smarter than you look. Get outta here!\"");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				// starts new portal
				//////////////////////////////////////////////////////////////////////////////
			}else if(answer.equalsIgnoreCase("B") ||
					(answer.equalsIgnoreCase("C"))){
				System.out.println("Wrong answer. The Goblin eats you.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}else if(answer.equalsIgnoreCase("D")){
				if(p1.getWis() >= 7) {
					System.out.println("You guessed the first choice.");
					System.out.println("The goblin grunts, creates a portal, and says:");
					System.out.println("\"You're smarter than you look. Get outta here!\"");
					System.out.println("");
					System.out.println("**************************************************************************************************");
				}else {
					System.out.println("Wrong answer, you're no wizard!");
					System.out.println("You died.");
					System.out.println("");
					System.out.println("**************************************************************************************************");
					runGameOver(p1);
					return false;
				}
				//if wisdom >= 7, guess correctly.
				//"You wake up"
				//if wisdom < 7, goblin eats you.
				//////////////////////////////////////////////////////////////////////////////			
			}else {
				System.out.println("That wasn't an option, the Goblin eats you.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}




		}// end of if else statement

		return true;
	}//riddle scene
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////




	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////BATTLEFIELD SCENE///////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean runBattlefieldScene(Player p1) {
		System.out.println("**************************************************************************************************");
		System.out.println("");
		System.out.println("You come out of the portal and find yourself on an ancient battlefield");
		System.out.println("You see an army of men. You can tell they're no fan of you...");
		System.out.println("As if from above, you hear a booming voice call out:");
		System.out.println("\"DEFEAT THIS ARMY, AND YOUR NEXT PORTAL WILL APPEAR.\" ");
		System.out.println("\"VICTORY OR DEATH!\" ");
		System.out.println("\"NOW, CHOOSE YOUR WEAPON, HERO!\"");
		System.out.println("");
		String choice;

		do {
			//do this
			System.out.println("A. Atiesh, Greatstaff of the Guardian");//wizards best
			System.out.println("B. Donkey's Jaw Bone, Bane of One Thousand Philistines.");//warrior's best
			System.out.println("C. Thori'dal, Star's Fury - Longbow");//assassin's best
			System.out.println("");

			choice = in.nextLine().trim();
			// while choice doesn't equal a, b, or c.
		} while(!(choice.equalsIgnoreCase("A") ||
				choice.equalsIgnoreCase("B") ||
				choice.equalsIgnoreCase("C")));

		// otherwise, do this
		if(choice.equalsIgnoreCase("A")){
			// if wisdom >= 6
			if(p1.getWis() >= 6) {
				System.out.println("You pick up Atiesh. Elemental power begins to rush through your veins.");
				System.out.println("You call down the wrath of a hundred  tempests and your foes are blown away.");
				System.out.println("With the enemy defeated, a portal opens, allowing you to move on.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
			}else {
				//if wisdom < 6
				System.out.println("You pick up Atiesh. ");
				System.out.println("It burns your hands and whispers: \"Fool, you have no power...\"");
				System.out.println("You run, but there's nowhere to hide. The enemy overtakes you.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}else if(choice.equalsIgnoreCase("B")){
			//if strength >= 6
			if(p1.getStr() >=6) {
				System.out.println("You pick up Donkey's Jaw Bone. A divine strength begins to rush through your veins.");
				System.out.println("You rage and rush your enemies, laughing at their terror as you crush them singlehandedly.");
				System.out.println("After the last foe is defeated, a portal opens, allowing you to move on.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				// if strength < 6
			}else {
				System.out.println("You pick up Donkey's Jaw Bone. ");
				System.out.println("It's much heavier than you expected, this was a BIG donkey.");
				System.out.println("You see the enemy and realize you're doomed.");
				System.out.println("You run, but there's nowhere to hide. The enemy overtakes you.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}else if(choice.equalsIgnoreCase("C")){
			//if assassin or if dex >= 6
			if(p1.getDex() >= 6) {
				System.out.println("You pick up Thori'dal, Star's Fury. Pulling back the bowstring, you take aim at the enemy general.");
				System.out.println("You let loose the magic arrow - it hits your mark.");
				System.out.println("Everyone within a half-mile of the arrow is vanquished by starfire.");
				System.out.println("Victory is granted - a portal opens, allowing you to move on.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				// if dex < 6
			}else {
				System.out.println("You pick up Thori'dal, Star's Fury. ");
				System.out.println("You shoot.....");
				System.out.println("and miss.");
				System.out.println("You've never used a bow in your life!");
				System.out.println("You run, but there's nowhere to hide. The enemy overtakes you.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}// end of if else statement
		return true;
	}//battlefield scene
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////




	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////TAVERN SCENE////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean runTavernScene(Player p1) {
		System.out.println("**************************************************************************************************");
		System.out.println("");
		System.out.println("This portal brings you to a Kool-Aid tavern.");
		System.out.println("A watchful barmaid hands you a note, it reads:");
		System.out.println("\"The only way out is to drink everyone else under the table.\" ");
		System.out.println("Someone shouts:");
		System.out.println("\"So you think you can drink more Kool-Aid than US??\" ");
		System.out.println("\"(burp)\" ");
		System.out.println("\"How d'ya plan on doin' THAT??\"");
		String choice;
		//do this
		do {
			System.out.println("Make your choice:");
			System.out.println("");
			System.out.println("A. Literally try to drink more Kool-Aid than a tavern's worth of people.");
			System.out.println("");

			System.out.println("B. Ask to make a \"mixed drink\" to consume instead. ");
			System.out.println("");

			System.out.println("C. Attempt to poison the Kool-Aid barrels.");
			System.out.println("");
			choice = in.nextLine();
			//while choice doesn't equal a, b, or c
		}while(!(choice.equalsIgnoreCase("A") ||
				(choice.equalsIgnoreCase("B") ||
						(choice.equalsIgnoreCase("C")))));

		if(choice.equalsIgnoreCase("A")) {
			//if str >= 5
			if(p1.getStr() >= 5) {
				System.out.println("You shout \"BRING ME THE JUGS!\" and start chugging Kool-Aid.");
				System.out.println("The tavern dwellers try to keep up, but they eventually crash from the sugar rush.");
				System.out.println("You beat the tavern game, the next portal opens and you step through it.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				//if str < 5
			}else {
				System.out.println("You shout \"BRING ME THE JUGS!\" and start chugging Kool-Aid.");
				System.out.println("Oops, you forgot you've been on a no-sugar diet since childhood.");
				System.out.println("You go into a sugar-induced coma.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}

		}else if(choice.equalsIgnoreCase("B")) {
			//if wis >= 5
			if(p1.getWis() >= 5) {
				System.out.println("You ask to make a mixed drink to consume instead.");
				System.out.println("They show you to an empty barrel and say \"Have at it!\" ");
				System.out.println("You add in two parts hydrogen, one part oxygen.");
				System.out.println("The patrons are too jacked up on Kool-Aid to realize you're");
				System.out.println(" only drinking water. They all drink until they crash from the sugar rush.");
				System.out.println("You beat the tavern game, the next portal opens and you step through it.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				//if wis < 5
			}else {
				System.out.println("You ask to make a mixed drink to consume instead.");
				System.out.println("They show you to an empty barrel and say \"Have at it!\" ");
				System.out.println("You realize you can't just conjure up water because you're not a wizard...");
				System.out.println("You cry and poor a bucket of Kool-Aid powder, knowing your end is near.");
				System.out.println("You start chugging from the barrel and go into a sugar-induced coma.");
				System.out.println("You died.");	
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}else if(choice.equalsIgnoreCase("C")) {
			//if dex >= 5
			if(p1.getDex() >= 5) {
				System.out.println("You pull out a vial of pg-13 horse-tranquilizer.");
				System.out.println("While everyone is indulging in sugar debauchary, you put ");
				System.out.println(" the pg-13 horse tranquilizer in the Kool-Aid barrels.");
				System.out.println("After their next drink, all the patrons fall into a tranquil sleep.");
				System.out.println("You beat the tavern game, the next portal opens and you step through it.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				//if dex < 5
			}else{
				System.out.println("You pull out a vial of...");
				System.out.println("Nothing. - You don't carry vials of poison with you everywhere.");
				System.out.println("You're not some kind of \"deadly assassin\". ");
				System.out.println("Ashamed, you start chugging the Kool-Aid.");
				System.out.println("You go into a sugar-induced coma.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}// end of if else statement

		return true;
	}//tavernScene
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////




	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////DUNGEON SCENE////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean runDungeonScene(Player p1) {

		System.out.println("**************************************************************************************************");
		System.out.println("");
		System.out.println("You come out of the portal and find you're in a dungeon cell.");
		System.out.println("There's an exit portal, but its on the other side of 100 ft of lava.");
		System.out.println("A guard speaks to you and says \"I'll let you out if you can make it across\"");
		System.out.println("Smirking, he continues: \"But, I'll only give you one chance.\" ");
		System.out.println("\"Fail in your attempt, and my men will throw you into the pg-13 lava.\"");
		System.out.println("");

		String choice;
		do {//do this
			System.out.println("How will you get across?");
			System.out.println("(Oh, and you have a grappling hook. Just make sure you're strong enough!)");
			System.out.println("");
			System.out.println("A. Throw a grappling hook across.");
			System.out.println("");

			System.out.println("B. Walk across the lava.");
			System.out.println("");

			System.out.println("C. Scale the walls like a ninja.");

			choice = in.nextLine();
			//while choice doesn't equal a, b, or c
		}while(!(choice.equalsIgnoreCase("A") ||
				(choice.equalsIgnoreCase("B") ||
						(choice.equalsIgnoreCase("C")))));

		if(choice.equalsIgnoreCase("A")) {
			//if str >=5
			if(p1.getStr() >+ 5) {
				System.out.println("You throw the grappling hook all the way across, good throw!");
				System.out.println("You tie the tag end of the rope to a pillar on your side of the dungeon");
				System.out.println("Now you're able to safely commando crawl over the lava to the portal.");
				System.out.println("You succeed and enter the portal.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				//if str <5
			}else {
				System.out.println("You throw the grappling hook as hard as you possibly can.");
				System.out.println("It makes it about 30 ft and falls into the lava");
				System.out.println("The guard's men seize you and cast you into the pg-13 lava.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}else if(choice.equalsIgnoreCase("B")) {
			//if wis >= 5
			if(p1.getWis() >=5) {
				System.out.println("You laugh at the guard's threat.");
				System.out.println("You're a wizard, duh! (or you may as well be one).");
				System.out.println("You focus your chakra on the bottom of your feet and walk across the lava.");
				System.out.println("You make it to the other side and enter the portal");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				//if wis < 5
			}else {
				System.out.println("You laugh at the guard's threat.");
				System.out.println("You step on the lava and immediately burn yourself.");
				System.out.println("You're no wizard, you can't walk on lava!");
				System.out.println("The guard's men seize you and cast you into the pg-13 lava.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}else if(choice.equalsIgnoreCase("C")) {
			//if dex >= 5
			if(p1.getDex() >=5) {
				System.out.println("You look closely at the walls and see there's cracks along it that may hold you.");
				System.out.println("You're able to nimbly climb all the across with no issue.");
				System.out.println("You must be an assassin, or some kind of freak climber.");
				System.out.println("Safely on the other side, you step into the portal.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				//if dex < 5
			}else {
				System.out.println("You look closely at the walls and see there's cracks along it that may hold you.");
				System.out.println("You start your climb, but quickly realize you're no nimble assassin.");
				System.out.println("You make it to the halfway point, and reach for the next hold.");
				System.out.println("Its no use though, you get off balance and fall into the lava.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}// end of if else statement

		return true;
	}//dungeon scene
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////




	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////BEAR SCENE///////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////


	//////////////********NEEDS WORK*************///////////////////////////////////////////////
	public boolean runBearScene(Player p1) {

		System.out.println("**************************************************************************************************");
		System.out.println("");
		System.out.println("This portal has brought you deep in the woods.");
		System.out.println("Its quite peaceful and you -");
		System.out.println("Oh my gosh, there's a 12 ft she-bear running at you at full speed!");
		String choice;
		//do this
		do {
			System.out.println("Think fast!");
			System.out.println("");

			System.out.println("A. Use a nearby log and attempt to fight the she-bear.");
			System.out.println("B. Cast a spell.");
			System.out.println("C. Throw a smoke bomb and hide your presence.");

			choice = in.nextLine();
			//while choice doesn't equal a, b, or c
		}while(!(choice.equalsIgnoreCase("A") ||
				(choice.equalsIgnoreCase("B") ||
						(choice.equalsIgnoreCase("C")))));

		if(choice.equalsIgnoreCase("A")) {
			//if str >=5
			if(p1.getStr() >= 5) {
				System.out.println("You swing the log down with incredible strength.");
				System.out.println("Whew, somehow you were able to knock the she-bear out.");
				System.out.println("A woodsman approaches and says:");
				System.out.println("\"Sorry about that, that's my she-bear.\"");
				System.out.println("\"As payment, I'll open the portal out of these here woods.\"");
				System.out.println("You take the portal.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				//if str < 5
			}else {
				System.out.println("You swing the log down.");
				System.out.println("Unfortunately, it was too weak of a swing.");
				System.err.println("The log bounces off the she bear and she eats you.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}else if(choice.equalsIgnoreCase("B")) {
			//if wis >= 5
			if(p1.getWis() >= 5) {
				System.out.println("You cast a polymorph spell.");
				System.out.println("The she bear turns into a sheep.");
				System.out.println("A woodsman approaches and says:");
				System.out.println("\"Sorry about that, that's my she-bear.\"");
				System.out.println("\"As payment, I'll open the portal out of these here woods.\"");
				System.out.println("You take the portal.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				//if wis < 5
			}else {
				System.out.println("You're no wizard, you can't cast spells!");
				System.out.println("The she-bear snorts and eats you.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}else if(choice.equalsIgnoreCase("A")) {
			//if dex >= 5
			if(p1.getDex() > 5) {
				System.out.println("You throw a smoke bomb.");
				System.out.println("While the bear is confused, you cover yourself in a scent-mask and camouflage yourself.");
				System.out.println("Success! Years of subterfuge training paid off.	");
				System.out.println("The bear wanders off, confused.");
				System.out.println("\"Sorry about that, that's my she-bear.\"");
				System.out.println("\"As payment, I'll open the portal out of these here woods.\"");
				System.out.println("You take the portal.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				//if dex < 5
			}else {
				System.out.println("You throw a smoke bomb.");
				System.out.println("You've never been trained in subterfuge, like an assassin, so your attempt to hide fails.");
				System.out.println("The she-bear comes out of the smoke screen, snorts, and eats you.");
				System.out.println("You died.");
				System.out.println("");
				System.out.println("**************************************************************************************************");
				runGameOver(p1);
				return false;
			}
		}//end of if else statement
		return true;
	}//bear scene
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////// OUTRO //////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void runOutroScene(Player p1) {
		System.out.println("**************************************************************************************************");
		System.out.println("");
		System.out.println("You step through the final portal.");
		System.out.println("A golden fairy buzzes by your ear.");
		System.out.println("\"Congratulations, I didn't think you could do it.\" ");
		System.out.println("\" For your efforts, we've decided to let you return from whence you came.");
		System.out.println("\" Farewell!\" ");
		System.out.println("The fairy waves her wand at you and you fall into a deep sleep.");
		System.out.println("You wake up in your room, everything seems normal.");
		System.out.println("Mom's making pancakes.");
		System.out.println("The entire thing must've been a dream.....");
		System.out.println("");
		System.out.println("**************************************************************************************************");

	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////



	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////GAME OVER////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void runGameOver(Player p1) {

		System.out.println("**************************************************************************************************");
		System.out.println("");
		System.out.println("Game Over.");
		System.out.println("");
		System.out.println("**************************************************************************************************");

	}// game over
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
}//class
