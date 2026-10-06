package b41;

import android.content.Context;
import java.io.File;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public final Context a;

    public l(Context context) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += a(file2);
            }
        }
        return j;
    }
}
