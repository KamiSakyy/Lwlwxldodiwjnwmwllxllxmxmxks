package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aa.v0 {
    public final x1 a;
    public final String b;
    public final String c;

    public t1(x1 x1Var, String str, String str2) {
        this.a = x1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return k71.k.b(this.a, t1Var.a) && k71.k.b(this.b, t1Var.b) && k71.k.b(this.c, t1Var.c);
    }

    public final int hashCode() {
        x1 x1Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((x1Var == null ? 0 : x1Var.hashCode()) * 31, this.b, 31);
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
