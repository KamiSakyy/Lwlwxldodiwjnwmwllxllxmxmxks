package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q10 implements aaShadow.v0 {
    public s10 a;
    public String b;
    public String c;

    public q10(s10 s10Var, String str, String str2) {
        this.a = s10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q10)) {
            return false;
        }
        q10 q10Var = (q10) obj;
        return k71.k.b(this.a, q10Var.a) && k71.k.b(this.b, q10Var.b) && k71.k.b(this.c, q10Var.c);
    }

    public final int hashCode() {
        s10 s10Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((s10Var == null ? 0 : s10Var.hashCode()) * 31, this.b, 31);
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
