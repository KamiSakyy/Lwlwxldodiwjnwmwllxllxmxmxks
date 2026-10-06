package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 implements aa.h0 {
    public String a;
    public d1 b;
    public String c;

    public e1(String str, d1 d1Var, String str2) {
        this.a = str;
        this.b = d1Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d1 d1Var = this.b;
        return this.c.hashCode() + ((hashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequestV2ItemsFragment(id=");
        sb.append(this.a);
        sb.append(", projectItems=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
