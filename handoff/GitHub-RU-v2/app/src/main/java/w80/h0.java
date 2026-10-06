package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements aa.h0 {
    public String a;
    public String b;
    public boolean c;
    public g0 d;
    public String e;

    public h0(String str, String str2, boolean z, g0 g0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = g0Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && k71.k.b(this.b, h0Var.b) && this.c == h0Var.c && k71.k.b(this.d, h0Var.d) && k71.k.b(this.e, h0Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        g0 g0Var = this.d;
        return this.e.hashCode() + ((e + (g0Var == null ? 0 : g0Var.hashCode())) * 31);
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
