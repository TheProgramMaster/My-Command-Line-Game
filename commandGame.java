import java.util.Scanner;
public class commandGame{
	public static void runTownScenario(){
		Scanner scan = new Scanner(System.in);
		System.out.println("You have entered a town. You see a collection of buildings around you. Would you" +
		" like to visit the inn, visit the weapon shop, or visit the castle?");
		System.out.println();
		System.out.println("(Please enter \"visit the castle\", \"visit the weapon shop\", or \"visit the inn\")");
		System.out.println();
		String input = scan.nextLine();
		System.out.println();
		if(input == "visit the inn"){
			System.out.println("You enter the inn. The inn keeper tells you of an issue he has been having with one "
			+" of his guests. He states that the member has a habit of causing trouble for the rest of the guests. He "
			+" asks if you could assist him in ending the trouble. Do you assist?");
			System.out.println();
			System.out.println("(Please enter \"assist\" or \"do not assist\")");
			System.out.println();
			String decision;
			while(true){
				decision = scan.nextLine();
				if(decision.equals("assist") || decision.equals("do not assist")){
					break;
				}else{
					System.out.println("Sorry, that is not a valid option. Please try again.");
				}
			}
			System.out.println();
			if(decision.equals("assist")){
				System.out.println("You agree to assist the inn keeper in deterring the member from causing more "
				+"trouble. He thanks you and directs you to his direction. You walk up to the guest and inquire why "
				+"he is causing trouble. He tells you he is bored of the local life. Do you take him on as an apprentice "
				+"in adventuring, or correct his behavior?");
				System.out.println();
				System.out.println("(Please enter \"take him on\" or \"correct his behavior\")");
				System.out.println();
				while(true){
					decision = scan.nextLine();
					if(decision.equals("take him on") || decision.equals("correct his behavior")){
						break;
					}else{
						System.out.println("Sorry, that is an invalid option. Please try again.");
					}
				}
				System.out.println();
				if(decision.equals("take him on")){
					System.out.println("You decide to invite the member to join you in your adventures. He accepts."
					+" Together, the two of you fight crime and prevent the suffering of the innocent.");
				}else if(decision.equals("correct his behavior")){
					System.out.println("You tell the guest that his behavior is simplt unacceptable. He understands and "
					+"agrees never to behave in the same menner in the future. However, you cannot help but feel that you "
					+"may have been able to make a friend in the process.");
				}
			}
		}
		else if(input.equals("visit the castle")){
			System.out.println("You enter the castle and find the princess sitting on her throne. She appears to be concerned."
		+ "Upon approaching her, she tells you of a recent issue regarding goblins invading a local farm. Do you assist her"
		+ " in her struggles, or leave?");
			System.out.println();
			System.out.println("(Please enter \"assist\" or \"leave\")");
			System.out.println();
			String decision = scan.nextLine();
			System.out.println();
			if(decision.equals("assist")){
				System.out.println("The princess thanks you for your assistance. She gives you a map, a sword, a shield, and a suit of armor."
				+" She then directs you to go forth and protect the kingdom from the goblins. You leave on your way.");
				System.out.println();
				System.out.println("You enter the designated farming location and find the Goblins at work terrorizing the farmers. Nearby, "
				+"you see a box of seeds on the ground. do you fight the goblins off, or give them the seeds?");
				System.out.println();
				System.out.println("(Please enter \"Fight\" or \"Give the seeds\")");
				System.out.println();
				while(true){
					decision = scan.nextLine();
					if(decision.equals("Fight") || decision.equals("Give the seeds")){
						break;
					}else{
						System.out.println("Sorry, that is an invalid option. Please try again.");
					}
				}
				System.out.println();
				if(decision.equals("Fight")){
					System.out.println("You are unable to fight off the goblins, and they defeat you.");
					System.out.println();
				}else if(decision.equals("Give the seeds")){
					System.out.println("You give the goblins the seeds. They take them and immediately leave. It seems "
					+"they were attacking the farmers out of starvation as they were unable to feed themselves. You have "
					+"saved both them from starvation and your farming companions. Way to go!");
					System.out.println();
				}
			}else if(decision.equals("leave")){
				System.out.println("The princess is disappointed, yet understands your decision. You decide to spend the "
				+"remainder of your life in the town enjoying the delightful breeze as well as the sights and sounds the town has to offer.");
				System.out.println();
			}
		}else if(input.equals("visit the weapon shop")){
			System.out.println("You enter the weapon shop. You find the owner of the store at the counter, who directs you "
			+"to his collection of weaponry. He appears to be going on about his collection. What do you do?");
			System.out.println();
			System.out.println("(Please enter \"continue listening\" or \"interrupt\")");
			System.out.println();
			String decision;
			while(true){
				decision = scan.nextLine();
				if(decision.equals("continue listening") || decision.equals("interrupt")){
					break;
				}else{
					System.out.println("Sorry, that is an invalid option. Please try again.");
				}
			}
			System.out.println();
			if(decision.equals("continue listening")){
				System.out.println("The owner continues on his rant regarding the weaponry, when he suddenly takes "
				+"out one of his swords and tells you that it is cursed. It seems that whoever wields it is either "
				+"doomed to a like of bad luck, or may have the opportunity to experience great fortune. He offers "
				+" the sword to you. Do you take it?");
				System.out.println();
				System.out.println("(Please enter \"leave\" or \"take the sword\")");
				System.out.println();
				while(true){
					decision = scan.nextLine();
					if(decision.equals("leave") || decision.equals("take the sword")){
						break;
					}else{
						System.out.println("Sorry, that is not a valid option. Please try again.");
					}
				}
				System.out.println();
				if(decision.equals("leave")){
					System.out.println("You decide that the sword is too much trouble to attempt fate. The owner understands. "
					+"However, he appreciates your wisdom, and offers you a job in his shop. You accept, and become the greatest"
					+" in the kingdom!");
					System.out.println();
				}else if(decision.equals("take the sword")){
					System.out.println("The sword feels like fifty pounds of weight as you wield it in your hands. As soon as you wield the sword,"
					+" a messanger enters the store. He tells you of news that the kingdom is searching for a new king, and an oracle tells of your lineage"
					+" to the crown. You are granted the crown, and are now king of the kingdom!");
					System.out.println();
				}
			}
		}
	}
	public static void runCaveScenario(){
		Scanner scan = new Scanner(System.in);
		System.out.println("You turn to your left and find a path in front of you. As you go down that path, you "
		+" come upon a cave. Do you enter the cave, or walk away?");
		System.out.println();
		System.out.println("(Please enter \"enter the cave\" or \"leave\")");
		System.out.println();
		String decision;
		while(true){
			decision = scan.nextLine();
			if(decision.equals("enter the cave") || decision.equals("leave")){
				break;
			}else{
				System.out.println("Sorry, that is an invalid input. Please try again.");
			}
		}
		System.out.println();
		if(decision.equals("enter the cave")){
			System.out.println("You enter the cave. There is a cave-in and the entrance immediately closes. You look in front of you and find "
			+" that there is are three passages. Do you go left, go right, or go forward?");
			System.out.println();
			System.out.println("(Please enter \"go left\", \"go right\", or \"go forward\")");
			System.out.println();
			while(true){
				decision = scan.nextLine();
				if(decision.equals("go left") || decision.equals("go right") || decision.equals("go forward")){
					break;
				}else{
					System.out.println("Sorry, that is an invalid option. Please try again.");
				}
			}
			System.out.println();
			if(decision.equals("go left")){
				System.out.println("You take the path to your left. There is an immediate cave-in and you are caught in it. You perish on impact");
			}else if(decision.equals("go right")){
				System.out.println("You take the path to your right. You find a bear inside. He sees you and immediately defeats you.");
			}else if(decision.equals("go forward")){
				System.out.println("You go forward and continue walking until you come upon an opening. You see an individual who is trapped on the cliff."
				+" It seems he wandered into the cave and got lost. You lead him back to the entrance. He thanks you for your help.");
			}
		}
	}
	public static void runWizardScenario(){
		Scanner scan = new Scanner(System.in);
		System.out.println("You turn to your right and go forward on the path that is before you until you stop at a house in an enclosed location within"
		+" the forest. You enter the household and find an elderly man reclining in a chair with a book. He tells you he is a wizard and is in need of assistance"
		+" with a spell he is attempting to finish. Do you help him, leave, or request of him to perform a different spell for you?");
		System.out.println();
		System.out.println("(Please enter \"help him\", \"leave\", or \"request spell\")");
		System.out.println();
		String decision;
		while(true){
			decision = scan.nextLine();
			if(decision.equals("help him") || decision.equals("leave") || decision.equals("request spell")){
				break;
			}else{
				System.out.println("Sorry, that is an invalid option. Please try again.");
			}
		}
		System.out.println();
		if(decision.equals("help him")){
			System.out.println("You agree to help the wizard in his spell experiment. He tells you that he is attempting to concoct a defensive spell for the "
			+"current lord of the kingdom. He seems be creating a potion that will give the archers the ability to defend the walls of the kingdom from ogres "
			+"with greater accuracy. However, he is deciding on the final ingredient. Do you suggest him to use a dragon's tongue, a rock of lava, or an aqua pearl?");
			System.out.println();
			System.out.println("(Please enter \"dragon\'s tongue\", \"rock of lava\", or \"aqua pearl\")");
			System.out.println();
			while(true){
				decision = scan.nextLine();
				if(decision.equals("dragon's tongue") || decision.equals("rock of lava") || decision.equals("aqua pearl")){
					break;
				}else{
					System.out.println("Sorry, that is an invalid option. Please try again.");
				}
			}
			if(decision.equals("dragon's tongue")){
				System.out.println("You take the dragon\'s tongue from the nearby shelf in the room and offer it to him. He takes it from your hand and drops it in the "
				+"cauldron. As he does so, the cauldron roars with activity, and a baby dragon comes out of the pot and immediately sets to work lighting the shop afire."
				+" Well, if not an enemy, at least you have given the kingdom a beast with which to defend the populace!");
				System.out.println();
			}else if(decision.equals("rock of lava")){
				System.out.println("You find a rock of lava on the floor. You hand it to the wizard, who then drops it into the cauldron. As he continues "
				+"stirring the pot, the liquid inside begins to turn a bright shade of red. With seconds, the cauldron begins to boild over in lava, thereby"
				+" burning the house. Perhaps an item of lava was not the best option.");
				System.out.println();
			}else if(decision.equals("aqua pearl")){
				System.out.println("You find an aqua pearl lying in a nearby chest in the room. You fetch it and offer it to the wizard in his attempt."
				+" He takes it and adds it to his concoction, all the while continuing to stir the cauldron. In doing so, the liquid begins to simmer and"
				+" cool. He takes a glass and consumes some of it. Upon doing so, he takes off one of his shoes, throws it at a house fly, and rids himself"
				+" of the nuisance. It seems you did your job well in protecting the kingdom from ogre forces!");
				System.out.println();
			}
		}else if(decision.equals("leave")){
			System.out.println("You tell the man you wish him the best on his endeavor, though you have no interest in magical matters. You then"
			+" decide to leave him to his matters and depart from the building.");
			return;
		}else if(decision.equals("request spell")){
			System.out.println("You tell the man you do not wish to undergo the risks associated with his spell, though would like to know "
			+" if he could cast a spell on you to test his magical capabilities as well as to assist you in your future adventures. He agrees"
			+" to do so. He asks you if you would like for him to cast a strengthen spell, a transformation spell, or a teleportation spell "
			+" on you.");
			System.out.println();
			System.out.println("(Please enter \"strengthen spell\", \"transformation spell\", ot \"teleportation spell\")");
			System.out.println();
			while(true){
				decision = scan.nextLine();
				if(decision.equals("strengthen spell") || decision.equals("transformation spell") || decision.equals("teleporation spell")){
					break;
				}else{
					System.out.println("Sorry, that is not a valid option. Please try again.");
				}
			}
			if(decision.equals("strengthen spell")){
				System.out.println("You request of the wizard to cast a strengthening spell on you. He does so. As he casts the incantation, "
				+" you feel your muscles growing larger. Upon looking on your reflection in a nearby mirror, you see that you could easily defend both yourself"
				+" and the land from any and all forces of evil. You are now the defender of the land!");
				System.out.println();
			}else if(decision.equals("transformation spell")){
				System.out.println("You request of the wizard to transform you into a beast worth fearing from all forces of evil. He agrees to do so."
				+" Walking to a nearby cauldron, he offers you a potion. You accept the drink and consume it. You immediately turn into a frog in the process."
				+" Oh well, at least the princesses may find you worth noting!");
				System.out.println();
			}else if(decision.equals("teleporation spell")){
				System.out.println("You request of the wizard to perform a teleportation spell on you. He nods his head in agreement. He takes out his wand and "
				+" begins the spell. As he does so, you find that you no longer hear his words. Looking around you, you find yourself in a dungeon filled with living "
				+"skeletons, and you are in a prison cell. Perhaps it was best to ask  the wizard for some education in defensive spells while you had the chance.");
				System.out.println();
			}
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("You are in a forest. Would you like to go forward, turn right, or turn left?");
		System.out.println();
		System.out.println("(Please enter \"go forward\", \"turn left\", or \"turn right\")");
		System.out.println();
		String input;
		while(true){
			input = scan.nextLine();
			if(input.equals("go forward") || input.equals("turn left") || input.equals("turn right")){
				break;
			}else{
				System.out.println("Sorry, that is an invalid option. Please try again.");
			}
		}
		if(input.equals("go forward")){
			runTownScenario();
		}else if(input.equals("turn left")){
			runCaveScenario();
		}else if(input.equals("turn right")){
			runWizardScenario();
		}
		System.out.println("THE END");
	}
}
