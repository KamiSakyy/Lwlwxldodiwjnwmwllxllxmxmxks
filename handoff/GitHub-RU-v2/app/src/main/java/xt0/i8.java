package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i8 {
    public String a;
    public h8 b;
    public String c;

    public i8(String str, h8 h8Var, String str2) {
        this.a = str;
        this.b = h8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return k71.k.b(this.a, i8Var.a) && k71.k.b(this.b, i8Var.b) && k71.k.b(this.c, i8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h8 h8Var = this.b;
        return this.c.hashCode() + ((hashCode + (h8Var == null ? 0 : h8Var.hashCode())) * 31);
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
