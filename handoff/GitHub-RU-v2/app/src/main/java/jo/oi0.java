package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oi0 implements aaShadow.v0 {
    public pi0 a;
    public String b;
    public String c;

    public oi0(pi0 pi0Var, String str, String str2) {
        this.a = pi0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi0)) {
            return false;
        }
        oi0 oi0Var = (oi0) obj;
        return k71.k.b(this.a, oi0Var.a) && k71.k.b(this.b, oi0Var.b) && k71.k.b(this.c, oi0Var.c);
    }

    public final int hashCode() {
        pi0 pi0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((pi0Var == null ? 0 : pi0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
