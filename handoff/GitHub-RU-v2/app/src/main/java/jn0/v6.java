package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v6 {
    public final String a;
    public final String b;
    public final cq0.e1 c;

    public v6(String str, String str2, cq0.e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return k71.k.b(this.a, v6Var.a) && k71.k.b(this.b, v6Var.b) && k71.k.b(this.c, v6Var.c);
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
