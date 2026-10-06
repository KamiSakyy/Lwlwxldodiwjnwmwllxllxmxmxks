package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v2 implements aaShadow.v0 {
    public d3 a;
    public x2 b;
    public String c;
    public String d;

    public v2(d3 d3Var, x2 x2Var, String str, String str2) {
        this.a = d3Var;
        this.b = x2Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return k71.k.b(this.a, v2Var.a) && k71.k.b(this.b, v2Var.b) && k71.k.b(this.c, v2Var.c) && k71.k.b(this.d, v2Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x2 x2Var = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (x2Var == null ? 0 : x2Var.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", node=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
