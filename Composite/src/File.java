
public class File implements AbstractFile {

	public File(String name)
    {
        m_name = name;
    }
    public void ls()
    {
        System.out.println(CompositeDemo.g_indent + m_name);
    }
    private String m_name;

}
