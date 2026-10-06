package p41;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public final o a;
    public final int b;
    public final int c;

    public i(int i, int i2, Class cls) {
        this(o.a(cls), i, i2);
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public static i b(o oVar) {
        return new i(oVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a.equals(iVar.a) && this.b == iVar.b && this.c == iVar.c;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(no.a.k("Unsupported injection: ", i2));
            }
            str = "deferred";
        }
        return h1.p(sb, str, "}");
    }

    public i(o oVar, int i, int i2) {
        m71.a.n(oVar, "Null dependency anInterface.");
        this.a = oVar;
        this.b = i;
        this.c = i2;
    }

    public <T0> T0 a(Object... a) {
        return null;
    }
}
