public class shortest_path {
    public static int path(String path)
    {
    int x=0,y=0;
    for(int i=0;i<path.length();i++)
    {
        char dir=path.charAt(i);
        if(dir=='S')
        y--;
        if(dir=='N')
        y++;
        if(dir=='E')
        x--;
        if(dir=='W')
        x++;
    }
    float x2=x*x;
    float y2=y*y;
    return (int)Math.sqrt(x2+y2);
}
public static void main(String[] args) {
    
    String path="WNESENNN";
    System.out.println(path(path));
}
}
