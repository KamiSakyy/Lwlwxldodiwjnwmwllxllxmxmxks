package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v5 implements aa.h0 {
    public String a;
    public u5 b;
    public String c;

    public v5(String str, u5 u5Var, String str2) {
        this.a = str;
        this.b = u5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        return k71.k.b(this.a, v5Var.a) && k71.k.b(this.b, v5Var.b) && k71.k.b(this.c, v5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubIssueListFragment(id=");
        sb.append(this.a);
        sb.append(", subIssues=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
