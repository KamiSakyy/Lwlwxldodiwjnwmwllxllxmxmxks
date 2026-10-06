package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q8 {
    public String a;
    public p8 b;
    public String c;

    public q8(String str, p8 p8Var, String str2) {
        this.a = str;
        this.b = p8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8)) {
            return false;
        }
        q8 q8Var = (q8) obj;
        return k71.k.b(this.a, q8Var.a) && k71.k.b(this.b, q8Var.b) && k71.k.b(this.c, q8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p8 p8Var = this.b;
        return this.c.hashCode() + ((hashCode + (p8Var == null ? 0 : p8Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewerLatestReviewRequest(id=");
        sb.append(this.a);
        sb.append(", requestedBy=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
