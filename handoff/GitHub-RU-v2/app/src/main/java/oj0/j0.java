package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 implements aa.h0 {
    public String a;
    public String b;
    public boolean c;
    public i0 d;
    public String e;

    public j0(String str, String str2, boolean z, i0 i0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i0Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.a, j0Var.a) && k71.k.b(this.b, j0Var.b) && this.c == j0Var.c && k71.k.b(this.d, j0Var.d) && k71.k.b(this.e, j0Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        i0 i0Var = this.d;
        return this.e.hashCode() + ((e + (i0Var == null ? 0 : i0Var.hashCode())) * 31);
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
