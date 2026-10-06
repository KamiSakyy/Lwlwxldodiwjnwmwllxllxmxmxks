package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i6 implements aa.h0 {
    public final String a;
    public final String b;
    public final d6 c;
    public final r0 d;
    public final v5 e;

    public i6(String str, String str2, d6 d6Var, r0 r0Var, v5 v5Var) {
        this.a = str;
        this.b = str2;
        this.c = d6Var;
        this.d = r0Var;
        this.e = v5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        return k71.k.b(this.a, i6Var.a) && k71.k.b(this.b, i6Var.b) && k71.k.b(this.c, i6Var.c) && k71.k.b(this.d, i6Var.d) && k71.k.b(this.e, i6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SubIssuesFragment(__typename=", this.a, ", id=", this.b, ", subIssueProgressFragment=");
        o.append(this.c);
        o.append(", parentIssueFragment=");
        o.append(this.d);
        o.append(", subIssueListFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
    public Object a = null;
}
