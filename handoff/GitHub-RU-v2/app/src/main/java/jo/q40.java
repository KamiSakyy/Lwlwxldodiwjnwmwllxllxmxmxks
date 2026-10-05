package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q40 {
    public final String a;
    public final String b;
    public final gv.z2 c;

    public q40(String str, String str2, gv.z2 z2Var) {
        this.a = str;
        this.b = str2;
        this.c = z2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return k71.k.b(this.a, q40Var.a) && k71.k.b(this.b, q40Var.b) && k71.k.b(this.c, q40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
