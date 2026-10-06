package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w40 implements aaShadow.v0 {
    public final a50 a;
    public final String b;
    public final String c;

    public w40(a50 a50Var, String str, String str2) {
        this.a = a50Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w40)) {
            return false;
        }
        w40 w40Var = (w40) obj;
        return k71.k.b(this.a, w40Var.a) && k71.k.b(this.b, w40Var.b) && k71.k.b(this.c, w40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
