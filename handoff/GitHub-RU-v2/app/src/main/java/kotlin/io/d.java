package kotlin.io;

import java.io.File;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends a {
    public boolean b;
    public File[] c;
    public int d;

    @Override // kotlin.io.f
    public final File a() {
        boolean z = this.b;
        File file = this.a;
        if (!z) {
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null || listFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.c;
        k71.k.d(fileArr2);
        int i = this.d;
        this.d = i + 1;
        return fileArr2[i];
    }
}
