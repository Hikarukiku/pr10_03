package pr4;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by admin on 10.03.2017.
 */
public class PathInfo {
    Path path;
    long size;
    List<PathInfo> children;

    public PathInfo(Path path, long size, List<PathInfo> children) {
        this.path = path;
        this.size = size;
        this.children = children;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
