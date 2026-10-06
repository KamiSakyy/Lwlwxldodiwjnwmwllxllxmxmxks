package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 implements aa.h0 {
    public String a;
    public String b;
    public boolean c;
    public k1 d;
    public String e;

    public l1(String str, String str2, boolean z, k1 k1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = k1Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return k71.k.b(this.a, l1Var.a) && k71.k.b(this.b, l1Var.b) && this.c == l1Var.c && k71.k.b(this.d, l1Var.d) && k71.k.b(this.e, l1Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        k1 k1Var = this.d;
        return this.e.hashCode() + ((e + (k1Var == null ? 0 : k1Var.hashCode())) * 31);
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
