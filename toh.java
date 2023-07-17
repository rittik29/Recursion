public class toh {
    public static void solve(int n,char from,char to,char by){
        if(n==0){
            return;
        }
        solve(n-1,from,by,to);
        System.out.println("Push " + n + " from rod "+from+ " to rod "+to);
        solve(n-1,by,to,from);
    }
    public static void main(String[] args) {
        int n=4;
        solve(n,'A','C','B');
    }
}
