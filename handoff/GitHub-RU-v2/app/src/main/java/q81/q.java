package q81;

import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes5.dex */
public final class q {
    public static final t71.n d = new t71.n("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final t71.n e = new t71.n(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public String a;
    public String b;
    public String[] c;

    public q(String str, String str2, String str3, String[] strArr) {
        k71.k.g(str, "mediaType");
        k71.k.g(strArr, "parameterNamesAndValues");
        this.a = str;
        this.b = str2;
        this.c = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Charset a(q qVar) {
        String str;
        String[] strArr = qVar.c;
        int i = 0;
        int x = k41.b.x(0, strArr.length - 1, 2);
        if (x >= 0) {
            while (!t71.w.y(strArr[i], "charset", true)) {
                if (i != x) {
                    i += 2;
                }
            }
            str = strArr[i + 1];
            if (str != null) {
                return null;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q) && k71.k.b(((q) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
