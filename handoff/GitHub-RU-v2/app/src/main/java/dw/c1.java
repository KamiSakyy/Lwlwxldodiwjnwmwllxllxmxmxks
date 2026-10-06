package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 {
    public String a;
    public String b;
    public z0 c;

    public c1(String str, String str2, z0 z0Var) {
        this.a = str;
        this.b = str2;
        this.c = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return k71.k.b(this.a, c1Var.a) && k71.k.b(this.b, c1Var.b) && k71.k.b(this.c, c1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", projectIssueOrPullRequestProjectFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
