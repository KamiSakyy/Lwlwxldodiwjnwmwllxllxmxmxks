package x41;

import b21.v;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements d {
    public static final Charset t = Charset.forName("UTF-8");
    public File r;
    public l s;

    public m(File file) {
        this.r = file;
    }

    @Override // x41.d
    public final void a() {
        v41.gShadow.b(this.s);
        this.s = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004e  */
    @Override // x41.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e() {
        v vVar;
        byte[] bArr;
        File file = this.r;
        if (file.exists()) {
            if (this.s == null) {
                try {
                    this.s = new l(file);
                } catch (IOException unused) {
                    Objects.toString(file);
                }
            }
            l lVar = this.s;
            if (lVar != null) {
                int[] iArr = {0};
                byte[] bArr2 = new byte[lVar.N()];
                try {
                    this.s.r(new f(bArr2, iArr));
                } catch (IOException unused2) {
                }
                vVar = new v(bArr2, iArr[0], 11);
                if (vVar != null) {
                    bArr = null;
                } else {
                    int i = vVar.s;
                    bArr = new byte[i];
                    System.arraycopy((byte[]) vVar.t, 0, bArr, 0, i);
                }
                if (bArr == null) {
                    return new String(bArr, t);
                }
                return null;
            }
        }
        vVar = null;
        if (vVar != null) {
        }
        if (bArr == null) {
        }
    }

    @Override // x41.d
    public final void f(String str, long j) {
        File file = this.r;
        if (this.s == null) {
            try {
                this.s = new l(file);
            } catch (IOException unused) {
                Objects.toString(file);
            }
        }
        if (this.s == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - 16384);
            }
            this.s.f(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(t));
            while (!this.s.t() && this.s.N() > 65536) {
                this.s.F();
            }
        } catch (IOException unused2) {
        }
    }
}
