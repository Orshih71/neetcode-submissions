class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int n = board.length;
        int m = board.length;

        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> cols = new ArrayList<>();
        List<Set<Character>> sqrs = new ArrayList<>();

        for(int i = 0; i < n; i++){
            rows.add(i, new HashSet<>());
            cols.add(i, new HashSet<>());
            sqrs.add(i, new HashSet<>());
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(rows.get(i).contains(board[i][j])){
                    return false;
                }
                else if(board[i][j] != '.'){
                    rows.get(i).add(board[i][j]);
                }
                if(cols.get(i).contains(board[j][i])){
                    return false;
                }
                else if(board[j][i] != '.') {
                    cols.get(i).add(board[j][i]);
                }

                int sqrIndex = (i / 3 * 3) + j / 3;
                if(sqrs.get(sqrIndex).contains(board[i][j])){
                    return false;
                }
                else if(board[i][j] != '.'){
                    sqrs.get(sqrIndex).add(board[i][j]);
                }
            }
        }
        return true;
    }
}
