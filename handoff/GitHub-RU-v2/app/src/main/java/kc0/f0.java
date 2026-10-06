package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 {
    public e0 a;
    public String b;
    public String c;

    public f0(e0 e0Var, String str, String str2) {
        this.a = e0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.a, f0Var.a) && k71.k.b(this.b, f0Var.b) && k71.k.b(this.c, f0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Reaction(reactable=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
