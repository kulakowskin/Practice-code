/**
 * Created by Nicole Kulakowski on 12/19/16.
 */
public class ScoreKeeper {

    private PieceButton[] pieces;
    private PieceButton[][] playerOneMoves;
    private PieceButton[][] playerTwoMoves;

    public ScoreKeeper(PieceButton[] pieces){
        this.pieces = pieces;
    }

    public boolean updateScore(PieceButton move)
    {
        int player = move.getPlayer();
        int pos = move.getPosition();

        if(checkDiag(pos) || checkPerp(pos))
        {
            System.out.println("Player"+player+" WINS!");
            return true;
        }
        return false;
    }

    public boolean checkDiag(int pos)
    {
        int matches = checkNW(pos,0);
        if(checkSE(pos,matches) > 3)
        {
            System.out.println("Winner of NW-SE!");
            return true;
        }
        matches = checkNE(pos,0);
        if(checkSW(pos,matches) > 3)
        {
            System.out.println("Winner of NE-SW!");
            return true;
        }
        return false;
    }

    public boolean checkPerp(int pos)
    {
        int matches = checkN(pos,0);
        matches += checkS(pos,matches);
        System.out.println("N-S: "+matches);
        if(matches > 3)
        {
            System.out.println("Winner of N-S!");
            return true;
        }
        matches = checkW(pos,0);
        matches += checkE(pos,matches);
        System.out.println("W-E: "+matches);
        if(matches > 3)
        {
            System.out.println("Winner of W-E!");
            return true;
        }
        return false;
    }

    // Backslash match
    public int checkNW(int pos, int matches){
        if(nullCheck(pos-8))
        {
            if (pieces[pos].playerMove == pieces[pos - 8].playerMove)
            {
                return 1 + checkNW(pos - 8, matches);
            }
        }
        return matches;

    }

    public int checkSE(int pos, int matches)
    {
        if(nullCheck(pos+8)) {
            if (pieces[pos].playerMove == pieces[pos + 8].playerMove)
            {
                return 1 + checkSE(pos + 8, matches);
            }
        }
        return matches;
    }

    // Forward slash match
    public int checkNE(int pos, int matches){
        if(nullCheck(pos-6)) {
            if (pieces[pos].playerMove == pieces[pos - 6].playerMove) {
                return 1 + checkNE(pos - 6, matches);
            }
        }
        return matches;
    }

    public int checkSW(int pos, int matches)
    {
        if(nullCheck(pos+6)) {
            if (pieces[pos].playerMove == pieces[pos + 6].playerMove) {
                return 1 + checkSW(pos + 6, matches);
            }
        }
        return matches;
    }

    // Verticle match
    public int checkN(int pos, int matches){
        if(nullCheck(pos-7)) {
            if (pieces[pos].playerMove == pieces[pos - 7].playerMove) {
                return 1 + checkN(pos - 7, matches);
            }
        }
        return matches;
    }

    public int checkS(int pos, int matches)
    {
        if(nullCheck(pos+7)) {
            if (pieces[pos].playerMove == pieces[pos + 7].playerMove) {
                return 1 + checkS(pos + 7, matches);
            }
        }
        return matches;
    }

    //   Horizontal match
    public int checkW(int pos, int matches){
        if(nullCheck(pos-1)) {
            if (pieces[pos].playerMove == pieces[pos - 1].playerMove) {
                return 1 + checkNW(pos - 1, matches);
            }
        }
        return matches;
    }

    public int checkE(int pos, int matches)
    {
        if(nullCheck(pos+1)) {
            if (pieces[pos].playerMove == pieces[pos + 1].playerMove) {
                return 1 + checkSE(pos + 1, matches);
            }
        }
        return matches;
    }

    public boolean nullCheck(int value){
        if(value >= 0 && value < 49)
        {
            if (pieces[value].playerMove != 0)
            {
                return true;
            }
        }
        return false;
    }
}

