package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p6 implements aa.v0 {
    public final t6 a;
    public final String b;
    public final String c;

    public p6(t6 t6Var, String str, String str2) {
        this.a = t6Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return k71.k.b(this.a, p6Var.a) && k71.k.b(this.b, p6Var.b) && k71.k.b(this.c, p6Var.c);
    }

    public final int hashCode() {
        t6 t6Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((t6Var == null ? 0 : t6Var.hashCode()) * 31, this.b, 31);
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
