package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n1 implements aa.v0 {
    public o1 a;
    public String b;
    public String c;

    public n1(o1 o1Var, String str, String str2) {
        this.a = o1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return k71.k.b(this.a, n1Var.a) && k71.k.b(this.b, n1Var.b) && k71.k.b(this.c, n1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
