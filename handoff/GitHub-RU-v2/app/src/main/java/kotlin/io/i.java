package kotlin.io;

import java.io.File;
import t71.p;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i extends m71.a {
    public static File p0(File file) {
        int length;
        int Q;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        k71.k.f(path, "getPath(...)");
        char c = File.separatorChar;
        int Q2 = p.Q(path, c, 0, 4);
        if (Q2 != 0) {
            length = (Q2 <= 0 || path.charAt(Q2 + (-1)) != ':') ? (Q2 == -1 && p.M(path, ':')) ? path.length() : 0 : Q2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (Q = p.Q(path, c, 2, 4)) < 0) {
            length = 1;
        } else {
            int Q3 = p.Q(path, c, Q + 1, 4);
            length = Q3 >= 0 ? Q3 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String file3 = file.toString();
        k71.k.f(file3, "toString(...)");
        if ((file3.length() == 0) || p.M(file3, c)) {
            return new File(file3 + file2);
        }
        return new File(file3 + c + file2);
    }
}
