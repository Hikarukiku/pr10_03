package pr4;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by admin on 10.03.2017.
 */
public class Main {

    static PathInfo scan(Path path) throws IOException {
        if(Files.isDirectory(path)){
            ArrayList<PathInfo> children = new ArrayList<>();
            long sumSize = 0;
            try(DirectoryStream<Path> ds = Files.newDirectoryStream(path)) {
                for (Path child : ds) {
                    PathInfo childInfo = scan(child);
                    children.add(childInfo);
                    sumSize+=childInfo.size;
                }
            }
            return new PathInfo(path, sumSize, children);
        }else{
            List<PathInfo> empty = Collections.emptyList();
            long size = Files.size(path);
            return new PathInfo(path, size, empty);
        }
    }

    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("C:\\temp");
        /*boolean isDir = Files.isDirectory(dir);
        long size = Files.size(dir);
        FileTime t = Files.getLastModifiedTime(dir);
        try(DirectoryStream<Path> ds = Files.newDirectoryStream(dir)){
            for (Path child:dir){

            }
        }*/

        System.out.println(scan(dir));

    }
}
