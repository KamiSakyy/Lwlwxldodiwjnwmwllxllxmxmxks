package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z6 implements aa.h0 {
    public String a;
    public y6 b;
    public String c;

    public z6(String str, y6 y6Var, String str2) {
        this.a = str;
        this.b = y6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return k71.k.b(this.a, z6Var.a) && k71.k.b(this.b, z6Var.b) && k71.k.b(this.c, z6Var.c);
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
