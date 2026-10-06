package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o1 {
    public final String a;
    public final String b;
    public final j1 c;

    public o1(String str, String str2, j1 j1Var) {
        this.a = str;
        this.b = str2;
        this.c = j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.a, o1Var.a) && k71.k.b(this.b, o1Var.b) && k71.k.b(this.c, o1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("BranchInfo(__typename=", this.a, ", id=", this.b, ", repositoryBranchInfoFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
