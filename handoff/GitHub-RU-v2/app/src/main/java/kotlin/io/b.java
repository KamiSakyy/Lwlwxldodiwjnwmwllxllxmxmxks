package kotlin.io;

import java.io.File;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b extends a {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;

    @Override // kotlin.io.f
    public final File a() {
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null) {
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr == null || this.d >= fileArr.length) {
            if (this.b) {
                return null;
            }
            this.b = true;
            return file;
        }
        k71.k.d(fileArr);
        int i = this.d;
        this.d = i + 1;
        return fileArr[i];
    }
}
