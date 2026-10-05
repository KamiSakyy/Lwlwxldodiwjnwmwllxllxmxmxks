package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dv {
    public final String a;
    public final String b;
    public final oj0.j0 c;

    public dv(String str, String str2, oj0.j0 j0Var) {
        this.a = str;
        this.b = str2;
        this.c = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv)) {
            return false;
        }
        dv dvVar = (dv) obj;
        return k71.k.b(this.a, dvVar.a) && k71.k.b(this.b, dvVar.b) && k71.k.b(this.c, dvVar.c);
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
