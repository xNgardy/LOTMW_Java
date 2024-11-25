import java.util.Random;
import java.util.Scanner;

public class Chapters {
    int chapterNumber, itemNumber;
    ItemHolder itemHolder;
    Chapters(int chapterNumber, int itemNumber){
        this.itemHolder = new ItemHolder();
        this.chapterNumber = chapterNumber;
        this.itemNumber = itemNumber;
    }

    public int Chapter(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int questAnswer, choice;
        if (chapterNumber == 1)
        {
            System.out.println("Armed with your trusted weapons, you start your journey.\n");
            System.out.println("After a week, you come to a crossroads with two paths:\n");
            System.out.println("Now, you must decide which path to take.\n");
            System.out.println("\n1. Swamp road\n");
            System.out.println("\n2. Mountain cliff\n");

            System.out.println("\nEnter your choice (1 or 2): ");

            choice = input.nextInt();

            if (choice == 1)
            {
                System.out.println("\nOh no, you sinked to the swamp because of your heavy armour!!! You pathetically died from drowning in mud.\n");
                System.out.println("GAME OVER!!\n");
                return -1;
            }
            else if (choice == 2)
            {
                System.out.println("\nDespite the dangerous appearance of the mountain cliff, you managed to pass the obstacles very quickly!\n");
                return 2;
            }
        }
        else if (chapterNumber == 2)
        {
            System.out.println("\nAfter days of journeying, you finally arrive at a bridge guarded by a troll.\n");
            System.out.println("The troll looks at you and grins, saying, \"Yu wan to pass! Yu anser ma queston!\"\n");
            System.out.println("Considering that you are the mighty warrior, it seems unlikely that the troll could defeat you.\n");
            System.out.println("Should you take a chance and try to answer the troll's question or simply eliminate the troll instead?\n");
            System.out.println("\n1. Eliminate the troll.\n");
            System.out.println("\n2. Take a chance and answer the troll's question.\n");


            System.out.println("\nEnter your choice (1 or 2): ");
            choice = input.nextInt();

            if (choice == 1)
            {
                System.out.println("\nYou killed the troll quickly. What a waste of time!\n");
                return 3;
            }
            else if (choice == 2)
            {
                System.out.println("\nTroll asks:\nMe spek without a mout and heer without ears. I have no body, but I come alive wit wind. Wat am I?\n");
                System.out.println("\n 1 - Echo\n 2 - Shadow\n");
                System.out.println("\nEnter your choice (1 or 2): ");
                questAnswer = input.nextInt();
                System.out.println(questAnswer);

                if (questAnswer == 1)
                {
                    System.out.println("\nYou simply answered the question! You are truly a mighty riddle solver!\n");
                    System.out.println("The troll allowed you to pass the bridge, and while crossing, you witnessed a tragic accident.\n");
                    System.out.println("The troll accidentally fell from the bridge and perished.\n");
                    System.out.println("Seizing the opportunity, you quickly looted the troll's strong skin to fashion a sturdy shield!\n");
                    System.out.println("YAYY!! You got an item called Strudy Shield!!.\n");
                    
                    itemNumber++;
                    itemHolder.addItem(itemNumber);
                    System.out.println("You have " + itemHolder.getItem() +  " item in your inventory now!");
                    return 3;
                }
                else if (questAnswer == 2)
                {
                    System.out.println("\nWith your wrong answer, a cunning troll appeared and mercilessly mocked you.\n");
                    System.out.println("Feeling disheartened, you made the impulsive choice to abandon your journey\n");
                    System.out.println("and instead focused on studying riddle books.\n");
                    System.out.println("Tragically, during your absence, the fearsome dragon ravaged the kingdom,\n");
                    System.out.println("leaving behind a trail of destruction.\n");
                    System.out.println("\n");
                    System.out.println("GAME OVER!!\n");
                    return -1;
                }
            }
        }
        else if (chapterNumber == 3)
        {
            System.out.println("\nAs you continue on your journey, you come across a merchant engaged in a heated confrontation.\n");
            System.out.println("The merchant seems to be in trouble and is arguing with another man.\n");
            System.out.println("Now, you must decide whether to intervene and help or simply pass by without interfering.\n");
            System.out.println("What will you do?\n");
            System.out.println("\n1. Pass by without interfering and continue your journey.\n");
            System.out.println("\n2. Intervene and offer assistance to the wounded merchant.\n");

            System.out.println("\nEnter your choice (1 or 2): ");

            choice = input.nextInt();

            if (choice == 1)
            {
                System.out.println("\nYou decided to leave the merchant and the man alone.\n");
                return 4;
            }
            else if (choice == 2)
            {
                System.out.println("\nUpon closer inspection, you notice that the merchant is wielding an iron cleaver, while the other man has visible bruises on his leg.\n");
                System.out.println("Now faced with this additional information, you must make a decision on whether to help the merchant or the injured man.\n");
                System.out.println("What will you do?\n");
                System.out.println("\n1. Fight against the merchant.\n");
                System.out.println("\n2. Fight against the man.\n");
                System.out.println("\nEnter your choice (1 or 2): ");
                questAnswer = input.nextInt();

                if (questAnswer == 1)
                {
                    System.out.println("\nIt turns out that the merchant is a slave merchant! You defeated the merchant with the help of a man, and as a token of gratitude, the man gave you a life elixir.\n");
                    System.out.println("YAYY!! You got an item called Life Elixir!!.\n");
                    itemNumber++;
                    itemHolder.addItem(itemNumber);
                    System.out.println("You have " + itemHolder.getItem() + " item in your inventory now!");
                    return 4;
                }
                else if (questAnswer == 2)
                {
                    System.out.println("\nAfter defeating the injured man, you learned that the merchant wants to sell him to the faraway kingdoms.\n");
                    System.out.println("Upon discovering this, you realized that you cannot transition from evil to good and maintain your principles.\n");
                    System.out.println("Consequently, you abandoned your title and instead opened a tavern, patiently awaiting the dragon's arrival.\n");
                    System.out.println("GAME OVER!!\n");
                    return -1;
                }
            }
        }
        else if (chapterNumber == 4)
        {
            System.out.println("\nYou came across to an Arena!. Will you join to show your power, or pass it?\n");
            System.out.println("\n1. Fight in the Arena.\n");
            System.out.println("\n2. Pass the Arena.\n");
            System.out.println("\nEnter your choice (1 or 2): ");
            choice = input.nextInt();

            if (choice == 1)
            {
                System.out.println("\nYou joined to the Arena!!\n");

                if (itemNumber != 0 && itemNumber >= 1)
                {
                    System.out.println("\nYou succesfully defeated all of your opponents in the Arena! Hurray!\n ");
                    System.out.println("YAYY!! You got an item called Arena Sword!!.\n");
                    itemNumber++;
                    itemHolder.addItem(itemNumber);
                    System.out.println("You have " + itemHolder.getItem() + " item in their inventory now! \n");
                    return 5;
                }
                else
                {
                    System.out.println("\nYou simply died during the first fight. Poor you!\n");
                    System.out.println("GAME OVER!!\n");
                    return -1;
                }
            }
            else if (choice == 2)
            {
                System.out.println("\nYou didn't join the Arena\n");
                return 5;
            }
        }
        else if (chapterNumber == 5)
        {
            System.out.println("\nBefore reaching the final path to the dragon's nest, you come across a three-headed giant dog. It glares at you with anger. What will you do?\n");
            System.out.println("\n1. Fight.\n");
            System.out.println("\n2. Flee.\n");
            System.out.println("\nEnter your choice (1 or 2): ");
            choice = input.nextInt();

            if (choice == 1)
            {
                System.out.println("\nYou killed the poor doggo without hesitating :(\n");
                return 6;
            }
            else if (choice == 2)
            {
                System.out.println("\nAfter attempting to escape, you realize that the dog only wants to play with you!\n");
                System.out.println("You spend an hour playing with the giant dog, and you both have a great time.\n");
                System.out.println("As a token of friendship, the dog gives you his enchanted bone to protect you from the dragon.\n");
                System.out.println("What a cutie!\n");
                System.out.println("Now equipped with the enchanted bone, you feel a newfound confidence.\n");
                System.out.println("YAYY!! You got an item called Enhanced Bone!!.\n");
                itemNumber++;
                itemHolder.addItem(itemNumber);
                System.out.println("You have " + itemHolder.getItem() + " item in their inventory now! \n");
                return 6;
            }
        }
        else if (chapterNumber == 6)
        {
            System.out.println("\nThe time has come; you are ready to face the Elden Dragon. Your decisions throughout the journey may have an effect on the outcome of the fight.\n");
            System.out.println("\n");
            int bossFightResult = 0;

            if (itemNumber == 0)
            {
                System.out.println("\nDue to your poor decisions, the Elden Dragon easily defeated you!\n");
                System.out.println("GAME OVER!!\n\n");
                return -1;
            }
            else if (itemNumber == 1)
            {
                bossFightResult = rand.nextInt(4);
                System.out.println("Dice rolled to: " + bossFightResult);

                if (bossFightResult == 4)
                {
                    System.out.println("\nDespite of your poor decisions, you somewhat managed to defeat the Elden Dragon!\n");
                    System.out.println("YOU WIN!!\n");
                    System.out.println("Your Score: Bronze\n\n");
                    return -1;
                }
                else
                {
                    System.out.println("\nThe Elden Dragon has defeated you :(\n");
                    System.out.println("GAME OVER!!\n\n");
                    return -1;
                }
            }
            else if (itemNumber == 2)
            {
                bossFightResult = rand.nextInt(4);
                System.out.println("Dice rolled to: " + bossFightResult);

                if (bossFightResult == 4 || bossFightResult == 3)
                {
                    System.out.println("\nWith your great bravery, you managed to defeat the Elden Dragon!\n");
                    System.out.println("YOU WIN!!\n");
                    System.out.println("Your Score: Silver\n\n");
                    return -1;
                }
                else
                {
                    System.out.println("\nThe Elden Dragon has defeated you :(\n");
                    System.out.println("GAME OVER!!\n\n");
                    return -1;
                }
            }
            else if (itemNumber == 3)
            {
                bossFightResult = rand.nextInt(4);
                System.out.println("Dice rolled to: " + bossFightResult);

                if (bossFightResult == 1)
                {
                    System.out.println("\nAww so close, The Elden Dragon has defeated you :(\n");
                    System.out.println("GAME OVER!!\n\n");
                    return -1;
                }
                else
                {
                    System.out.println("\nYou achieved a tremendous victory by defeating the Elden Dragon!\n");
                    System.out.println("The entire kingdom now knows your name, and you have finally earned the position of the royal guard.\n");
                    System.out.println("To honor your heroic deeds, the king has commissioned a statue of you in the capital city.\n");
                    System.out.println("What a glorious achievement!\n");
                    System.out.println("Your bravery and valor will be remembered for generations to come.\n");
                    System.out.println("YOU WIN!!\n");
                    System.out.println("Your Score: Gold\n\n");
                    return -1;
                }
            }
            else if (itemNumber == 4)
            {
                System.out.println("\nYou defeated the Elden Dragon with just one punch! What are you? A One-Punch Warrior?\n");
                System.out.println("The incredible glory of your victory resonates throughout the entire kingdom.\n");
                System.out.println("The fear of you defeating every soldier within the realm leads the king to pass his title to you.\n");
                System.out.println("You are now the king! You are the mighty One-Punch Riddle Warrior known throughout the world!\n");
                System.out.println("YOU WIN!!\n");
                System.out.println("Your Score: Platinium\n\n");
                return -1;
            }
        }

        return 0;
    }
}
