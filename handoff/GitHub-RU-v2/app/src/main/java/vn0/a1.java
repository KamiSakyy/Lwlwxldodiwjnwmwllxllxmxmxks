package vn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 implements aa.h0 {
    public String a;
    public v0 b;
    public String c;

    public a1(String str, v0 v0Var, String str2) {
        this.a = str;
        this.b = v0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return k71.k.b(this.a, a1Var.a) && k71.k.b(this.b, a1Var.b) && k71.k.b(this.c, a1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v0 v0Var = this.b;
        return this.c.hashCode() + ((hashCode + (v0Var == null ? 0 : v0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitCheckSuitesFragment(id=");
        sb.append(this.a);
        sb.append(", checkSuites=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
