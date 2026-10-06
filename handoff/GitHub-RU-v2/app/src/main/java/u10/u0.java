package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 {
    public hc0.bm a;
    public t0 b;
    public p0 c;
    public String d;
    public String e;

    public u0(hc0.bm bmVar, t0 t0Var, p0 p0Var, String str, String str2) {
        this.a = bmVar;
        this.b = t0Var;
        this.c = p0Var;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a == u0Var.a && k71.k.b(this.b, u0Var.b) && k71.k.b(this.c, u0Var.c) && k71.k.b(this.d, u0Var.d) && k71.k.b(this.e, u0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread(subjectType=");
        sb.append(this.a);
        sb.append(", pullRequest=");
        sb.append(this.b);
        sb.append(", comments=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
