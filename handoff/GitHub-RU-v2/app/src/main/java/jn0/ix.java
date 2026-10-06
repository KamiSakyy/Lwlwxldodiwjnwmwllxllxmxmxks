package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ix {
    public String a;
    public String b;
    public uu0.j1 c;

    public ix(String str, String str2, uu0.j1 j1Var) {
        this.a = str;
        this.b = str2;
        this.c = j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix)) {
            return false;
        }
        ix ixVar = (ix) obj;
        return k71.k.b(this.a, ixVar.a) && k71.k.b(this.b, ixVar.b) && k71.k.b(this.c, ixVar.c);
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
