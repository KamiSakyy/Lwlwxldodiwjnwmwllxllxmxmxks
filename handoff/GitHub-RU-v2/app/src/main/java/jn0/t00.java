package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t00 implements aa.v0 {
    public final u00 a;
    public final String b;
    public final String c;

    public t00(u00 u00Var, String str, String str2) {
        this.a = u00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t00)) {
            return false;
        }
        t00 t00Var = (t00) obj;
        return k71.k.b(this.a, t00Var.a) && k71.k.b(this.b, t00Var.b) && k71.k.b(this.c, t00Var.c);
    }

    public final int hashCode() {
        u00 u00Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((u00Var == null ? 0 : u00Var.hashCode()) * 31, this.b, 31);
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
