package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 {
    public m10.xz a;
    public y0 b;
    public u0 c;
    public String d;
    public String e;

    public z0(m10.xz xzVar, y0 y0Var, u0 u0Var, String str, String str2) {
        this.a = xzVar;
        this.b = y0Var;
        this.c = u0Var;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.a == z0Var.a && k71.k.b(this.b, z0Var.b) && k71.k.b(this.c, z0Var.c) && k71.k.b(this.d, z0Var.d) && k71.k.b(this.e, z0Var.e);
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
