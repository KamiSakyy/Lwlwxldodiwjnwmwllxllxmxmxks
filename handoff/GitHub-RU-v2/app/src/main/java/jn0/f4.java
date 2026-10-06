package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f4 {
    public final z3 a;
    public final String b;
    public final String c;

    public f4(z3 z3Var, String str, String str2) {
        this.a = z3Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        return k71.k.b(this.a, f4Var.a) && k71.k.b(this.b, f4Var.b) && k71.k.b(this.c, f4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node2(commit=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
