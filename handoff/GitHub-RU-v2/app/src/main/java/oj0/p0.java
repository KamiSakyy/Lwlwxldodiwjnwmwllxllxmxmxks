package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 {
    public String a;
    public String b;
    public j0 c;

    public p0(String str, String str2, j0 j0Var) {
        this.a = str;
        this.b = str2;
        this.c = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && k71.k.b(this.b, p0Var.b) && k71.k.b(this.c, p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DefaultBranchRef(__typename=", this.a, ", id=", this.b, ", repositoryBranchInfoFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
