package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z7 {
    public String a;
    public y7 b;
    public String c;

    public z7(String str, y7 y7Var, String str2) {
        this.a = str;
        this.b = y7Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        return k71.k.b(this.a, z7Var.a) && k71.k.b(this.b, z7Var.b) && k71.k.b(this.c, z7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y7 y7Var = this.b;
        return this.c.hashCode() + ((hashCode + (y7Var == null ? 0 : y7Var.hashCode())) * 31);
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
