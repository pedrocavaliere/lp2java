public class BattleshipTestDrive {
    public static void main(String[] args)
    {
        BattleshipBoard board = new BattleshipBoard();
        board.setBoard(20,20,20);

        Battleship ship = new Battleship();
        ship.setLocation(2,4,0,0,0,0);
        board.addShip(ship);

        Battleship ship2 = new Battleship();
        ship2.setLocation(20,20,18,20,0,0);
        board.addShip(ship2);

        Battleship squareShip = new Battleship();
        squareShip.setLocation(10,11,10,11,10,11);
        board.addShip(squareShip);

        System.out.println("\nPalpites dentro do navio tem que ser 'hit'");
        System.out.println(board.fire("2", "0", "0"));
        System.out.println(board.fire("3", "0", "0"));
        System.out.println(board.fire("4", "0", "0"));
        System.out.println(board.fire("20","20","0"));
        System.out.println(board.fire("10","11","10"));

        System.out.println("\nPalpites fora do navio tem que ser 'miss'");
        System.out.println(board.fire("0", "0", "0"));
        System.out.println(board.fire("1", "0", "0"));
        System.out.println(board.fire("5", "0", "0"));
        System.out.println(board.fire("9", "0", "0"));
        System.out.println(board.fire("19","20", "0"));
        System.out.println(board.fire("10","12", "10"));

        System.out.println("\nPalpites com localização errada tem que ser 'ERRO'");
        System.out.println(board.fire("A",     "0", "0"));
        System.out.println(board.fire("0.123", "A", "-5"));

        System.out.println("\nPalpites fora do tabuleiro tem que ser 'ERRO(FORA)'");
        System.out.println(board.fire("-1", "0", "0"));
        System.out.println(board.fire("0", "21", "0"));
    }
}

