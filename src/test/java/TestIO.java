
import java.io.File;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class TestIO
{
    @Test
    public void test() {

        File file = new File("pathName");
        try {
            if (file.createNewFile())
            {
                System.out.println("File created ");
            } else
                {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //checking file exists
        String path = file.getPath();
        System.out.println(path);
        Assert.assertEquals("pathName", path);

        // Delete file
        boolean df = file.delete();
        System.out.println(df + ": Stands for file deleted");
        Assert.assertTrue(df);

        // Creating Directory
        boolean bool = file.mkdir();
        if (bool) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Cant create specified directory");
        }
        Assert.assertTrue(bool);

        // List File directories , files with Extension
        String Path = "Desktop:/IntelliJ/FileIO";
        File dir = new File(Path);
        String[] files = dir.list();
        if (files.length == 0) {
            System.out.println("Directory empty");
        } else {
            for (String aFile : files) {
                System.out.println(aFile);
            }
        }

    }

}