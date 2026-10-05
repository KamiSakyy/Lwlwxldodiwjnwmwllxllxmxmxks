package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k20 implements aa.v0 {
    public final t20 a;
    public final u20 b;
    public final String c;
    public final String d;

    public k20(t20 t20Var, u20 u20Var, String str, String str2) {
        this.a = t20Var;
        this.b = u20Var;
        this.c = str;
        this.d = str2;
    }

    public static k20 a(k20 k20Var, t20 t20Var, u20 u20Var, int i) {
        if ((i & 1) != 0) {
            t20Var = k20Var.a;
        }
        if ((i & 2) != 0) {
            u20Var = k20Var.b;
        }
        String str = k20Var.c;
        String str2 = k20Var.d;
        k20Var.getClass();
        return new k20(t20Var, u20Var, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k20)) {
            return false;
        }
        k20 k20Var = (k20) obj;
        return k71.k.b(this.a, k20Var.a) && k71.k.b(this.b, k20Var.b) && k71.k.b(this.c, k20Var.c) && k71.k.b(this.d, k20Var.d);
    }

    public final int hashCode() {
        t20 t20Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((t20Var == null ? 0 : t20Var.hashCode()) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", search=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
