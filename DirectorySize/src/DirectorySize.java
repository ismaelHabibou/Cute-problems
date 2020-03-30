import java.io.File;

public class DirectorySize {

    public static void main(String[] args) {

    }

    public static long size(File file){

        if (file.isDirectory())
            return size(file.listFiles());
        else
            return file.length();
    }

    private static long size(File[] files){
        long size = 0;

        if (files != null){

            for (File file:files){
                if (file.isDirectory())
                   size += size(file.listFiles());

                else
                    size += file.length();
            }
        }

        return size;
    }

}
