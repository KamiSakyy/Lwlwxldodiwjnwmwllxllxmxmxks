package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c2 implements aa.v0 {
    public final d2 a;
    public final String b;
    public final String c;

    public c2(d2 d2Var, String str, String str2) {
        this.a = d2Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return k71.k.b(this.a, c2Var.a) && k71.k.b(this.b, c2Var.b) && k71.k.b(this.c, c2Var.c);
    }

    public final int hashCode() {
        d2 d2Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((d2Var == null ? 0 : d2Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
