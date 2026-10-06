package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 implements aa.v0 {
    public k1 a;
    public String b;
    public String c;

    public d1(k1 k1Var, String str, String str2) {
        this.a = k1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && k71.k.b(this.b, d1Var.b) && k71.k.b(this.c, d1Var.c);
    }

    public final int hashCode() {
        k1 k1Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((k1Var == null ? 0 : k1Var.hashCode()) * 31, this.b, 31);
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
