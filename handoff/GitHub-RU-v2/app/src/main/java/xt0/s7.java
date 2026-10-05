package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s7 implements aa.h0 {
    public final String a;
    public final r7 b;
    public final String c;

    public s7(String str, r7 r7Var, String str2) {
        this.a = str;
        this.b = r7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        return k71.k.b(this.a, s7Var.a) && k71.k.b(this.b, s7Var.b) && k71.k.b(this.c, s7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r7 r7Var = this.b;
        return this.c.hashCode() + ((hashCode + (r7Var == null ? 0 : r7Var.hashCode())) * 31);
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
