
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author aikitrumm
 */
public class TextUserInterface {

    private Scanner scanner;
    private Jumpers jumpers;
    private Jumps jumps;
    // private Participant participant;

    public TextUserInterface(Scanner reader, Jumpers jumpers, Jumps jumps) {
        this.scanner = reader;
        this.jumpers = jumpers;
        this.jumps = jumps;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        askAndAddParticipants();

    }

    public void askAndAddParticipants() {
        while (true) {
            System.out.print("  Participant name: ");
            String participantName = this.scanner.nextLine();

            if (participantName.equals("")) {
                System.out.println("");
                System.out.println("The tournament begins!");
                System.out.println("");
                jumpOrResults();
                break;
            } else {
                Participant participant = new Participant(participantName);
                int participantPoints = 0;
                participant.setPoints(participantPoints);
                this.jumpers.addParticipant(participant);

                Jump jump = new Jump(participant);
                this.jumps.addJump(jump);
            }
        }
    }

    public void jumpOrResults() {

        int i = 1;

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String answer = this.scanner.nextLine();

            if (answer.equals("quit")) {
                System.out.println("");
                System.out.println("Thanks!");
                tournamentResults();
                break;
            } else if (answer.equals("jump")) {

                System.out.println("");
                System.out.println("Round " + i);
                System.out.println("");
                System.out.println("Jumping order:");

                List<Participant> contestants = new ArrayList<Participant>();
                contestants = this.jumpers.getSortedReverseJumpers();

                // Collections.sort(contestants);
                int j = 1;
                for (Participant entry : contestants) {
                    System.out.print("  " + j + ". ");
                    System.out.println(entry.toString());
                    j++;
                }

                System.out.println("");
                System.out.println("Results of round " + i);

                for (Participant entry : contestants) {
                    System.out.println("  " + entry.getName());
                    int jumpLength = this.jumpers.getRandomNumberInRange(60, 120);
                    System.out.println("    length: " + jumpLength);
                    ArrayList<Integer> votes = this.jumpers.judgeVotes();
                    System.out.println("    judge votes: " + votes);
                    int points = this.jumpers.sumOfJudgeVotes(votes) + jumpLength;
                    entry.setPoints(points);

                    List<Jump> jumps = this.jumps.getJumps();
                    for (Jump member : jumps) {
                        if (member.getParticipant() == entry) {
                            member.addJump(jumpLength);
                        }
                    }
                }
                System.out.println("");
            }
            i++;
        }

    }

    public void tournamentResults() {
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        List<Participant> contestants = new ArrayList<Participant>();
        contestants = this.jumpers.getJumpers();
        Collections.sort(contestants);
        Collections.reverse(contestants);

        List<Jump> jumps = this.jumps.getJumps();

        int i = 1;
        for (Participant entry : contestants) {
            System.out.print(i + "           ");
            System.out.println(entry.getName() + " (" + entry.getPoints() + " points)");
            System.out.print("            jump lengths: ");
            for (Jump member : jumps) {
                if (member.getParticipant() == entry) {
                        for (int k = 0; k < member.sizeOfListJumpLengths() - 1; k++) {
                            System.out.print(member.getJumpLengths().get(k) + " m, ");
                        }
                    System.out.println(member.getJumpLengths().get(member.sizeOfListJumpLengths() - 1) + " m");
                }
            }
            i++;
        }
    }

}
