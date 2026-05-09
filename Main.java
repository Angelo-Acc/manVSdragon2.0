import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {


        // Title
        System.out.println("**************************");
        System.out.println("Welcome to Man Vs. Dragons");
        System.out.println("**************************");

        // Fire screen
        System.out.println();
        String victory = "                                                                     \n" +
                "            88                                                       \n" +
                "            \"\"              ,d                                       \n" +
                "                            88                                       \n" +
                "8b       d8 88  ,adPPYba, MM88MMM ,adPPYba,  8b,dPPYba, 8b       d8  \n" +
                "`8b     d8' 88 a8\"     \"\"   88   a8\"     \"8a 88P'   \"Y8 `8b     d8'  \n" +
                " `8b   d8'  88 8b           88   8b       d8 88          `8b   d8'   \n" +
                "  `8b,d8'   88 \"8a,   ,aa   88,  \"8a,   ,a8\" 88           `8b,d8'    \n" +
                "    \"8\"     88  `\"Ybbd8\"'   \"Y888 `\"YbbdP\"'  88             Y88'     \n" +
                "                                                            d8'      \n" +
                "                                                           d8'  ";
        String death = "                  _  /)\n" +
                "                 mo / )\n" +
                "                 |/)\\)\n" +
                "                  /\\_\n" +
                "                  \\__|=\n" +
                "                 (    )\n" +
                "                 __)(__\n" +
                "           _____/      \\\\_____\n" +
                "          |  _     ___   _   ||\n" +
                "          | | \\     |   | \\  ||\n" +
                "          | |  |    |   |  | ||\n" +
                "          | |_/     |   |_/  ||\n" +
                "          | | \\     |   |    ||\n" +
                "          | |  \\    |   |    ||\n" +
                "          | |   \\. _|_. | .  ||\n" +
                "          |                  ||\n" +
                "          |                  ||\n" +
                "          |                  ||\n" +
                "  *       | *   **    * **   |**      **\n" +
                "   \\))ejm97/.,(//,,..,,\\||(,,.,\\\\,.((//\n";
        String firescreen = "                        /\\\n" +
                "                        ||\n" +
                "                        ||\n" +
                "                        ||\n" +
                "                        ||                                               ~-----~\n" +
                "                        ||                                            /===--  ---~~~\n" +
                "                        ||                   ;'                 /==~- --   -    ---~~~\n" +
                "                        ||                (/ ('              /=----         ~~_  --(  '\n" +
                "                        ||             ' / ;'             /=----               \\__~\n" +
                "     '                ~==_=~          '('             ~-~~      ~~~~        ~~~--\\~'\n" +
                "     \\\\                (c_\\_        .i.             /~--    ~~~--   -~     (     '\n" +
                "      `\\               (}| /       / : \\           / ~~------~     ~~\\   (\n" +
                "      \\ '               ||/ \\      |===|          /~/             ~~~ \\ \\(\n" +
                "      ``~\\              ~~\\  )~.~_ >._.< _~-~     |`_          ~~-~     )\\\n" +
                "       '-~                 {  /  ) \\___/ (   \\   |` ` _       ~~         '\n" +
                "       \\ -~\\                -<__/  -   -  L~ -;   \\\\    \\ _ _/\n" +
                "       `` ~~=\\                  {    :    }\\ ,\\    ||   _ :(\n" +
                "        \\  ~~=\\__                \\ _/ \\_ /  )  } _//   ( `|'\n" +
                "        ``    , ~\\--~=\\           \\     /  / _/ / '    (   '\n" +
                "         \\`    } ~ ~~ -~=\\   _~_  / \\ / \\ )^ ( // :_  / '\n" +
                "         |    ,          _~-'   '~~__-_  / - |/     \\ (\n" +
                "          \\  ,_--_     _/              \\_'---', -~ .   \\\n" +
                "           )/      /\\ / /\\   ,~,         \\__ _}     \\_  \"~_\n" +
                "           ,      { ( _ )'} ~ - \\_    ~\\  (-:-)       \"\\   ~ \n" +
                "                  /'' ''  )~ \\~_ ~\\   )->  \\ :|    _,       \" \n" +
                "                 (\\  _/)''} | \\~_ ~  /~(   | :)   /          }\n" +
                "                <``  >;,,/  )= \\~__ {{{ '  \\ =(  ,   ,       ;\n" +
                "               {o_o }_/     |v  '~__  _    )-v|  \"  :       ,\"\n" +
                "               {/\"\\_)       {_/'  \\~__ ~\\_ \\\\_} '  {        /~\\\n" +
                "               ,/!          '_/    '~__ _-~ \\_' :  '      ,\"  ~ \n" +
                "              (''`                  /,'~___~    | /     ,\"  \\ ~' \n" +
                "             '/, )                 (-)  '~____~\";     ,\"     , }\n" +
                "           /,')                    / \\         /  ,~-\"       '~'\n" +
                "       (  ''/                     / ( '       /  /          '~'\n" +
                "    ~ ~  ,, /) ,                 (/( \\)      ( -)          /~'\n" +
                "  (  ~~ )`  ~}                   '  \\)'     _/ /           ~'\n" +
                " { |) /`,--.(  }'                    '     (  /          /~'\n" +
                "(` ~ ( c|~~| `}   )                        '/:\\         ,'\n" +
                " ~ )/``) )) '|),                          (/ | \\)                 -sjm\n" +
                "  (` (-~(( `~`'  )                        ' (/ '\n" +
                "   `~'    )'`')                              '\n" +
                "     ` ``";

        System.out.println(firescreen);
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        Hero hero = new Hero();

        System.out.println("Enter Hero hit points: ");
        int userInput = scanner.nextInt();
        hero.setHitPoints(userInput);
        hero.setMaxHitPoints(userInput);

        System.out.println("Enter Hero damage points: ");
        userInput = scanner.nextInt();
        hero.setDamage(userInput);

        Dragon[] dragons = new Dragon[3];
        dragons[0] = new Dragon(1000, 200, 10);
        dragons[1] = new Dragon(1000, 200, 10);
        dragons[2] = new Dragon(3000, 300, 40);

        boolean heroWins = false;

        while (true) {
            System.out.println("Hero has " + hero.getHitPoints() + " HP and deals " + hero.getDamage() + " points of damage.");
            System.out.println("Hero Gold: " + hero.getGold());
            System.out.println();

            printDragonStatus(dragons);

            if (hero.getHitPoints() < 1) {
                heroWins = false;
                break;
            }

            if (dragons[0].getHitPoints() < 1 &&
                    dragons[1].getHitPoints() < 1 &&
                    dragons[2].getHitPoints() < 1) {
                heroWins = true;
                break;
            }

            int userChoice = 0;

            while (userChoice < 1 || userChoice > 4) {
                System.out.println("Choose an action:");
                System.out.println("1. Attack Dragon 1");
                System.out.println("2. Attack Dragon 2");
                System.out.println("3. Attack Dragon 3");
                System.out.println("4. Heal");

                userChoice = scanner.nextInt();
            }

            if (userChoice == 4) {
                heroHeal(hero);
            } else {
                System.out.println("Attacking Dragon " + userChoice);
                heroAttacksDragon(dragons, hero, userChoice);
            }

            dragonsAttackHero(dragons, hero);
        }

        System.out.println("Battle Outcome");
        System.out.println("--------------");

        printDragonStatus(dragons);

        if (heroWins == false) {
            System.out.println("You were DEFEATED!");
        } else {
            System.out.println("You are a true hero. You WIN!");
            System.out.println("You finished with " + hero.getGold() + " gold!");
        }
    }

    private static void heroAttacksDragon(Dragon[] dragons, Hero hero, int dragonChoice) {

        if (dragons[dragonChoice - 1].getHitPoints() < 1) {
            System.out.println("Dragon " + dragonChoice + " is already dead!");
        } else {
            int heroHitsForDmg = random.nextInt(hero.getDamage());

            dragons[dragonChoice - 1].setHitPoints(
                    dragons[dragonChoice - 1].getHitPoints() - heroHitsForDmg
            );

            System.out.println("Hero hits Dragon " + dragonChoice + " for " + heroHitsForDmg + " damage!");

            if(dragons[dragonChoice - 1].getHitPoints() <= 0) {

                int goldDropped = random.nextInt(500) + 100;

                hero.setGold(hero.getGold() + goldDropped);

                System.out.println("Dragon " + dragonChoice + " dropped " + goldDropped + " gold!");
            }
        }
    }

    private static void heroHeal(Hero hero) {

        if(hero.getHealCount() >= 2) {
            System.out.println("Hero has no heals remaining!");
            return;
        }

        int healAmount = random.nextInt(200) + 100;

        int newHp = hero.getHitPoints() + healAmount;

        if(newHp > hero.getMaxHitPoints()) {
            newHp = hero.getMaxHitPoints();
        }

        hero.setHitPoints(newHp);

        hero.setHealCount(hero.getHealCount() + 1);

        System.out.println("Hero healed for " + healAmount + " HP!");
    }

    private static void dragonsAttackHero(Dragon[] dragons, Hero hero) {

        for (int i = 0; i < dragons.length; i++) {
            if (dragons[i].getHitPoints() > 0) {

                if(dragons[i].getHitPoints() < 300 &&
                        dragons[i].getHealCount() < 2) {

                    int healAmount = random.nextInt(150) + 50;

                    dragons[i].setHitPoints(dragons[i].getHitPoints() + healAmount);

                    dragons[i].setHealCount(dragons[i].getHealCount() + 1);

                    System.out.println("Dragon " + (i + 1) + " healed for " + healAmount + " HP!");
                }

                int critCheck = random.nextInt(100) + 1;
                float damageMultiplier = 1.00F;

                if(critCheck <= dragons[i].getCritChance()) {
                    System.out.println("CRITICAL STRIKE");
                    damageMultiplier += 0.50F;
                }

                int dragonHitsForDmg = random.nextInt(dragons[i].getDamage());
                int damageWithMultiplier = (int) ( (float) dragonHitsForDmg * damageMultiplier );

                System.out.println("Original damage: " + dragonHitsForDmg + " with multiplier: " + damageWithMultiplier);

                int newHitPoints = hero.getHitPoints() - damageWithMultiplier;
                hero.setHitPoints(newHitPoints);
            }
        }
    }

    private static void printDragonStatus(Dragon[] dragons) {
        System.out.println();
        System.out.println("Dragon Status");
        System.out.println("-------------");

        for (int i = 0; i < dragons.length; i++) {
            System.out.println("Dragon " + (i + 1) + " has " + dragons[i].getHitPoints() + " HP and deals " + dragons[i].getDamage() + " points of damage.");
        }
    }
}
