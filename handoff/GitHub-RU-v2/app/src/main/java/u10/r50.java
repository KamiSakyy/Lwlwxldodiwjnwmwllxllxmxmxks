package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r50 {
    public final String a;
    public final w50 b;
    public final String c;

    public r50(String str, w50 w50Var, String str2) {
        this.a = str;
        this.b = w50Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r50)) {
            return false;
        }
        r50 r50Var = (r50) obj;
        return k71.k.b(this.a, r50Var.a) && k71.k.b(this.b, r50Var.b) && k71.k.b(this.c, r50Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w50 w50Var = this.b;
        return this.c.hashCode() + ((hashCode + (w50Var == null ? 0 : Boolean.hashCode(w50Var.a))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeadRef(id=");
        sb.append(this.a);
        sb.append(", refUpdateRule=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
