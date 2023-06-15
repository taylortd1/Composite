
class CompositeDemo
{
    public static StringBuffer g_indent = new StringBuffer();

    public static void main(String[] args)
    {
        Directory rt = new Directory("Root");
        Directory ct = new Directory("Contacts");
        Directory dt = new Directory("Documents");
        Directory pic = new Directory("Pictures");
        Directory m = new Directory("Music");
        File A = new File("FileA.txt");
        File B = new File("FileB.txt");
        File C = new File("FileC.txt");
        File D = new File("FileC.jpg");
        File E = new File("FileD.txt");
        File F = new File("InConstantSorrow.mp3");
        
        rt.add(ct);
        rt.add(dt);
        rt.add(pic);
        rt.add(m);
        rt.add(E);
        dt.add(A);
        dt.add(B);
        dt.add(C);
        pic.add(D);
        m.add(F);
        rt.ls();
        
    }
}
/*Root
Contacts <empty directory>
Documents
    fileA.txt
    fileB.txt
    fileC.txt
Pictures
    fileC.jpg
Music
    InConstantSorrow.mp3
fileD.txt*/
