package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g6 {
    public String a;
    public String b;
    public we0.e1 c;

    public g6(String str, String str2, we0.e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return k71.k.b(this.a, g6Var.a) && k71.k.b(this.b, g6Var.b) && k71.k.b(this.c, g6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Commit(__typename=", this.a, ", id=", this.b, ", commitDiffEntryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
