public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int leftRight = 0;
        int upDown = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)){
                case 'L':
                    leftRight -= 1;
                    break;
                case 'R':
                    leftRight += 1;
                    break;
                case 'D':
                    upDown -= 1;
                    break;
                case 'U':
                    upDown += 1;
                    break;
            }
        }
        if (leftRight == 0 && upDown == 0) {
            return true;
        } else {
            return false;
        }
    }
}
