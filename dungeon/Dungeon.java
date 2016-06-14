package dungeon;
 
 
import java.util.*;
 
/**
 * @author axido
 * Exciting roguelike game where you try to bump into vampires.
 */
public class Dungeon {
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private Player player = new Player();
    private List<Vampire> vampireList;
    private Scanner reader;
    private Random rand = new Random();
         
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.reader = new Scanner(System.in);
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.vampireList = new ArrayList<Vampire>();
        
        // Generate vampires and add them to the list.
        for (int i = 0; i < vampires; i++) {
            Vampire vampire = new Vampire(height, length);
            vampireList.add(vampire);
             
        }
    }
     
    public void run() {
        while (moves > 0 && vampires > 0) {
 
            printMenu();
            drawMap();
 
            String commands = reader.nextLine();
            nextTurn(commands);
             
            moves--;
        }
         
        System.out.print("\n");
         
        if (vampires == 0) {
            System.out.println("YOU WIN");
        } else if (moves == 0) {
            System.out.println("YOU LOSE");
        }
    }
     
    private void printMenu() {
        System.out.println(moves + "\n");
        System.out.println("@ " + player.getX() + " " + player.getY());
        for (Vampire v : vampireList) {
            System.out.println("v " + v.getX() + " " + v.getY());
        }
        System.out.print("\n");
    }
     
    private void nextTurn(String command) {
        // Takes a string of commands, assigns the characters to an array, then
        // updates the player coordinates as per instructions.
        // For every move, vampires move once too in random direction.
        // After every move, checks if coordinates match with a vampire and removes it.
         
        char[] directions = command.toCharArray();
        for (char c : directions) {
            switch (c) {
                case 'w':
                    playerMove('w');
                    break;
                case 's':
                    playerMove('s');
                    break;
                case 'a':
                    playerMove('a');
                    break;
                case 'd':
                    playerMove('d');
                    break;                   
                default:
                    System.out.println("?");
                    break;
            }
             
            if (vampiresMove) {
                vampireMove();
            }
            anyKill();
        }
    }
     
    private void playerMove(char direction) {
        // Updates the player's coordinates and makes sure it stays within borders.
         
        if (direction == 'w' & legalMove(player.getX(), player.getY()-1)) {
            player.setY(player.getY()-1);
        } else if (direction == 's' & legalMove(player.getX(), player.getY()+1)) {
            player.setY(player.getY()+1);
        } else if (direction == 'a' & legalMove(player.getX()-1, player.getY())) {
            player.setX(player.getX()-1);
        } else if (direction == 'd' & legalMove(player.getX()+1, player.getY())) {
            player.setX(player.getX()+1);
        }   
    }
         
    private void vampireMove() {
        // Moves all the vampires
         
        for (Vampire v : vampireList) {
            newVampireCoordinates(v);
        }
    }
     
    private void newVampireCoordinates(Vampire v) {
        // Makes a copy of the vampires, makes sure moves are legal and performs them
         
        List<Vampire> copylist = new ArrayList<Vampire>(vampireList);
        boolean tileOccupied = false;
        int newX = v.getX() + rand.nextInt(3)-1;
        int newY = v.getY() + rand.nextInt(3)-1;
         
        for (Vampire k : copylist) {
            if (k.getX() == newX & k.getY() == newY) {
                tileOccupied = true;
            }
        }
         
        if (legalMove(newX, newY) & !tileOccupied) {
            v.setX(newX);
            v.setY(newY);
        }
    }
 
    private boolean legalMove(int X, int Y) {
        // checks if the move stays inside game area.
         
        if (X < length & X >= 0 & Y < height & Y >= 0) {
            return true;
        } else {
            return false;
        }
    }
     
    private void drawMap() {
        // Populates a 2D-array with "floor", then see where the player and the vampires
        // are located and replace the dots with appropriate symbols.
        // Finally print it all out.
         
        char[][] mapArray;
        mapArray = new char[height][length];
        for (int i=0; i < height; i++) {
            for (int j=0; j < length; j++) {
                mapArray[i][j] = '.';
            }
        }
         
        mapArray[player.getY()][player.getX()] = '@';
        for (Vampire v : vampireList) {
            mapArray[v.getY()][v.getX()] = 'v';
        }
 
        for (int k = 0; k < height; k++) {
            for (int y = 0; y < length; y++) {
                System.out.print(mapArray[k][y]);
            }
            System.out.print("\n");
        }
    }
     
    private void anyKill() {
        // if a vampire and the player are in same coordinates, remove the vampire
         
        ArrayList<Object> toBeRemoved = new ArrayList<Object>();
        for (Vampire v : vampireList) {
            if (v.getX() == player.getX() & v.getY() == player.getY()) {
                toBeRemoved.add(v);
            }
        }
        vampireList.removeAll(toBeRemoved);
        vampires = vampireList.size();
    }
}
