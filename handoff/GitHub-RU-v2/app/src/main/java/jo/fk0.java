package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fk0 {
    public final ek0 a;
    public final String b;
    public final String c;

    public fk0(ek0 ek0Var, String str, String str2) {
        this.a = ek0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk0)) {
            return false;
        }
        fk0 fk0Var = (fk0) obj;
        return k71.k.b(this.a, fk0Var.a) && k71.k.b(this.b, fk0Var.b) && k71.k.b(this.c, fk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(repositories=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
