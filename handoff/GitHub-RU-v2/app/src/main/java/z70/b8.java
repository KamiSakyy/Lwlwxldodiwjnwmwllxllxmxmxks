package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b8 {
    public final String a;
    public final a8 b;
    public final String c;

    public b8(String str, a8 a8Var, String str2) {
        this.a = str;
        this.b = a8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        return k71.k.b(this.a, b8Var.a) && k71.k.b(this.b, b8Var.b) && k71.k.b(this.c, b8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a8 a8Var = this.b;
        return this.c.hashCode() + ((hashCode + (a8Var == null ? 0 : a8Var.hashCode())) * 31);
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
