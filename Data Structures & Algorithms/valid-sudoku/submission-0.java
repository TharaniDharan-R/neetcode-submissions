class Solution {
    public boolean isValidSudoku(char[][] b) {
        HashSet<String> hs= new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c= b[i][j];
                if(c!='.'){
                    if(!hs.add(c+"r"+i)||
                    !hs.add(c+"c"+j)||
                    !hs.add(c+"b"+i/3+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
