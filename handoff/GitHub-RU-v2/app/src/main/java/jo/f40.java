package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f40 {
    public String a;
    public String b;
    public gv.z2 c;

    public f40(String str, String str2, gv.z2 z2Var) {
        this.a = str;
        this.b = str2;
        this.c = z2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f40)) {
            return false;
        }
        f40 f40Var = (f40) obj;
        return k71.k.b(this.a, f40Var.a) && k71.k.b(this.b, f40Var.b) && k71.k.b(this.c, f40Var.c);
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
    public f40(String p1, String p2, Object p3) {
    }
}
