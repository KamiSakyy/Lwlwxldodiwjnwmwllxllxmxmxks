package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d6 implements aa.h0 {
    public final String a;
    public final c6 b;
    public final String c;

    public d6(String str, c6 c6Var, String str2) {
        this.a = str;
        this.b = c6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return k71.k.b(this.a, d6Var.a) && k71.k.b(this.b, d6Var.b) && k71.k.b(this.c, d6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubIssueProgressFragment(id=");
        sb.append(this.a);
        sb.append(", subIssuesSummary=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
