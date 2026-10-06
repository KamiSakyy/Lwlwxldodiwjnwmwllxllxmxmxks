package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ub {
    public String a;
    public yb b;
    public String c;

    public ub(String str, yb ybVar, String str2) {
        this.a = str;
        this.b = ybVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj;
        return k71.k.b(this.a, ubVar.a) && k71.k.b(this.b, ubVar.b) && k71.k.b(this.c, ubVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yb ybVar = this.b;
        return this.c.hashCode() + ((hashCode + (ybVar == null ? 0 : ybVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comment(id=");
        sb.append(this.a);
        sb.append(", replyTo=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
