package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 implements aa.v0 {
    public t1 a;
    public String b;
    public String c;

    public r1(t1 t1Var, String str, String str2) {
        this.a = t1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return k71.k.b(this.a, r1Var.a) && k71.k.b(this.b, r1Var.b) && k71.k.b(this.c, r1Var.c);
    }

    public final int hashCode() {
        t1 t1Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((t1Var == null ? 0 : t1Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(user=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
