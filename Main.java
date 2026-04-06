import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

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

        System.out.println("Enter Hero Hit Points: ");
        int heroHP = scanner.nextInt();

        System.out.println("Enter Hero Damage points: ");
        int heroDamage = scanner.nextInt();

        Dragon[] dragons = new Dragon[3];
        dragons[0] = new Dragon(1000, 200);
        dragons[1] = new Dragon(1000, 200);
        dragons[2] = new Dragon(3000, 300);

        boolean heroWins = false;

        while (true) {
            System.out.println("Hero has " + heroHP + " HP and deals " + heroDamage + " points of damage.");
            System.out.println();

            printDragonStatus(dragons);

            if (heroHP < 1) {
                heroWins = false;
                break;
            }

            if (dragons[0].getHitPoints() < 1 &&
                    dragons[1].getHitPoints() < 1 &&
                    dragons[2].getHitPoints() < 1) {
                heroWins = true;
                break;
            }

            int dragonChoice = 0;
            while (dragonChoice < 1 || dragonChoice > 3) {
                System.out.println("Hero's turn to attack. Which Dragon would you like to attack (1, 2, 3)?");
                dragonChoice = scanner.nextInt();
            }

            System.out.println("Attacking Dragon " + dragonChoice);

            heroAttacksDragon(dragons, heroDamage, dragonChoice);

            dragonsAttackHero(dragons, heroHP);
        }

        System.out.println("Battle Outcome");
        System.out.println("--------------");

        printDragonStatus(dragons);

        if (heroWins == false) {
            System.out.println(death);
            System.out.println("You were DEFEATED!");
        } else {
            System.out.println(victory);
            System.out.println("You are a true hero. You WIN!");
        }
    }

    private static void heroAttacksDragon(Dragon[] dragons, int heroDamage, int dragonChoice) {
        Random random = new Random();

        if (dragons[dragonChoice - 1].getHitPoints() < 1) {
            System.out.println("Dragon " + dragonChoice + " is already dead!");
        } else {
            int heroHitsForDmg = random.nextInt(heroDamage);
            dragons[dragonChoice - 1].setHitPoints(dragons[dragonChoice - 1].getHitPoints() - heroHitsForDmg);
        }
    }

    private static void dragonsAttackHero(Dragon[] dragons, int heroHP) {
        Random random = new Random();
        for (int i = 0; i < dragons.length; i++) {
            if (dragons[i].getHitPoints() > 0) {
                int dragonHitsForDmg = random.nextInt(dragons[i].getDamage());
                heroHP = heroHP - dragonHitsForDmg;
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