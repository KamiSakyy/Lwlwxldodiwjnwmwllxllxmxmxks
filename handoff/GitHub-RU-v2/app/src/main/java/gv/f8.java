package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f8 implements aa.h0 {
    public String a;
    public e8 b;
    public String c;

    public f8(String str, e8 e8Var, String str2) {
        this.a = str;
        this.b = e8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return k71.k.b(this.a, f8Var.a) && k71.k.b(this.b, f8Var.b) && k71.k.b(this.c, f8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e8 e8Var = this.b;
        return this.c.hashCode() + ((hashCode + (e8Var == null ? 0 : e8Var.hashCode())) * 31);
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
