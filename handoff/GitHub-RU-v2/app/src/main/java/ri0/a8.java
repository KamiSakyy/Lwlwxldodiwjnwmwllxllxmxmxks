package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a8 implements aa.h0 {
    public String a;
    public z7 b;
    public String c;

    public a8(String str, z7 z7Var, String str2) {
        this.a = str;
        this.b = z7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        return k71.k.b(this.a, a8Var.a) && k71.k.b(this.b, a8Var.b) && k71.k.b(this.c, a8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z7 z7Var = this.b;
        return this.c.hashCode() + ((hashCode + (z7Var == null ? 0 : z7Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewerLatestReviewRequestFragment(id=");
        sb.append(this.a);
        sb.append(", viewerLatestReviewRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
