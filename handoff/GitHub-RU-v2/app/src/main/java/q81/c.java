package q81;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c {
    public static final c n = new c(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public static final c o;
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public String m;

    static {
        int i = kotlin.time.a.u;
        kotlin.time.c cVar = kotlin.time.c.u;
        long h = kotlin.time.a.h(kotlin.time.e.n(Integer.MAX_VALUE, cVar), cVar);
        if (h < 0) {
            throw new IllegalArgumentException(h1.m("maxStale < 0: ", h).toString());
        }
        o = new c(false, false, -1, -1, false, false, false, h <= 2147483647L ? (int) h : Integer.MAX_VALUE, -1, true, false, false, null);
    }

    public c(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        k71.k.f(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String sb2 = sb.toString();
        this.m = sb2;
        return sb2;
    }
    public static final Object u = null;
}
