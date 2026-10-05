package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c3 implements aa.v0 {
    public final d3 a;
    public final String b;
    public final String c;

    public c3(d3 d3Var, String str, String str2) {
        this.a = d3Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return k71.k.b(this.a, c3Var.a) && k71.k.b(this.b, c3Var.b) && k71.k.b(this.c, c3Var.c);
    }

    public final int hashCode() {
        d3 d3Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((d3Var == null ? 0 : d3Var.hashCode()) * 31, this.b, 31);
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
