package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 implements aa.h0 {
    public String a;
    public String b;
    public boolean c;
    public i1 d;
    public String e;

    public j1(String str, String str2, boolean z, i1 i1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i1Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return k71.k.b(this.a, j1Var.a) && k71.k.b(this.b, j1Var.b) && this.c == j1Var.c && k71.k.b(this.d, j1Var.d) && k71.k.b(this.e, j1Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        i1 i1Var = this.d;
        return this.e.hashCode() + ((e + (i1Var == null ? 0 : i1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryBranchInfoFragment(id=", this.a, ", name=", this.b, ", viewerCanCommitToBranch=");
        o.append(this.c);
        o.append(", target=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
