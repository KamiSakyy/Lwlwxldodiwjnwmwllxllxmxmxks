package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r6 implements aa.h0 {
    public String a;
    public q6 b;
    public String c;

    public r6(String str, q6 q6Var, String str2) {
        this.a = str;
        this.b = q6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return k71.k.b(this.a, r6Var.a) && k71.k.b(this.b, r6Var.b) && k71.k.b(this.c, r6Var.c);
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
