package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p40 implements aa.v0 {
    public final t40 a;
    public final String b;
    public final String c;

    public p40(t40 t40Var, String str, String str2) {
        this.a = t40Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p40)) {
            return false;
        }
        p40 p40Var = (p40) obj;
        return k71.k.b(this.a, p40Var.a) && k71.k.b(this.b, p40Var.b) && k71.k.b(this.c, p40Var.c);
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
