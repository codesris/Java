package src.projects.miniProjects;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Template
        System.out.print("It was a _________(adjective), cold November day.\n");

        System.out.print("\nI woke up to the ________(adjective) of _________(type of bird) roasting in the _________(room in a house) downstairs.\n");

        System.out.print("\nI _________(verb (past tense)) down the stairs to see if I could help ____________(verb) the dinner.\n");


        System.out.print("\nMy mom said, \"See if __________(relative's name) needs a fresh _________(noun).\"\n");

        System.out.print("\nSo I carried a tray of glasses full of _________(a liquid) into the ____________(verb ending in -ing) room.\n");

        System.out.print("\nWhen I got there, I couldn't beleive my __________(part of the body (plural))!\n");

        System.out.print("\nThere were ____________(plural noun) ____________(verb ending in -ing) on the ____________(noun)!");

        System.out.print("\nEnter adjective: ");
        String adj1 = scanner.nextLine();

        System.out.print("\nEnter adjective: ");
        String adj2 = scanner.nextLine();

        System.out.print("\nEnter type of bird: ");
        String tyobird = scanner.nextLine();

        System.out.print("\nEnter room in a house: ");
        String room = scanner.nextLine();

        System.out.print("\nEnter verb(past tense): ");
        String verbPT = scanner.nextLine();

        System.out.print("\nEnter verb: ");
        String verb = scanner.nextLine();

        System.out.print("\nEnter relative's name: ");
        String name = scanner.nextLine();

        System.out.print("\nEnter noun: ");
        String noun = scanner.nextLine();

        System.out.print("\nEnter a liquid: ");
        String liquid = scanner.nextLine();

        System.out.print("\nEnter verb ending in -ing: ");
        String verbING = scanner.nextLine();

        System.out.print("\nEnter part of the body(plural): ");
        String bodyPart = scanner.nextLine();

        System.out.print("\nEnter plural noun: ");
        String pNoun = scanner.nextLine();

        System.out.print("\nEnter verb ending in -ing: ");
        String verbING2 = scanner.nextLine();

        System.out.print("\nEnter noun: ");
        String noun2 = scanner.nextLine();

        System.out.println("\n\nIt was a " + adj1 + ", cold November day. I woke up to the "+ adj2 + " of " + tyobird + " roasting in the " + room + " downstairs. I " + verbPT + "down the stairs to see if I could help " + verb + " the dinner. My mom said,  \"See if " + name + " needs a fresh " + noun + "." +" So I carried a tray of glasses full of " + liquid + " into the " + verbING + " room. When I got there, I couldn't believe my " + bodyPart + "! There were " + pNoun + " " + verbING2 + " on the " + noun2 +"!");


        scanner.close();
    }
}
