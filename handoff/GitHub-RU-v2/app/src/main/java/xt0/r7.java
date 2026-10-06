package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r7 {
    public final String a;
    public final q7 b;
    public final String c;

    public r7(String str, q7 q7Var, String str2) {
        this.a = str;
        this.b = q7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj;
        return k71.k.b(this.a, r7Var.a) && k71.k.b(this.b, r7Var.b) && k71.k.b(this.c, r7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q7 q7Var = this.b;
        return this.c.hashCode() + ((hashCode + (q7Var == null ? 0 : q7Var.hashCode())) * 31);
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
