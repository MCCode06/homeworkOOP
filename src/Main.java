public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Player player = new Player(50, 50, 30, 30, 5);
        player.moveDown();
        player.moveLeft();
        System.out.println("Player created at position: (" + player.getX() + ", " + player.getY() + ")");
        player.moveUp();
        player.moveRight();
        System.out.println("Player created at position: (" + player.getX() + ", " + player.getY() + ")");
        }
}
