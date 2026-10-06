package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k40 implements aaShadow.v0 {
    public final t40 a;
    public final u40 b;
    public final String c;
    public final String d;

    public k40(t40 t40Var, u40 u40Var, String str, String str2) {
        this.a = t40Var;
        this.b = u40Var;
        this.c = str;
        this.d = str2;
    }

    public static k40 a(k40 k40Var, t40 t40Var, u40 u40Var, int i) {
        if ((i & 1) != 0) {
            t40Var = k40Var.a;
        }
        if ((i & 2) != 0) {
            u40Var = k40Var.b;
        }
        String str = k40Var.c;
        String str2 = k40Var.d;
        k40Var.getClass();
        return new k40(t40Var, u40Var, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k40)) {
            return false;
        }
        k40 k40Var = (k40) obj;
        return k71.k.b(this.a, k40Var.a) && k71.k.b(this.b, k40Var.b) && k71.k.b(this.c, k40Var.c) && k71.k.b(this.d, k40Var.d);
    }

    public final int hashCode() {
        t40 t40Var = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((t40Var == null ? 0 : t40Var.hashCode()) * 31)) * 31, this.c, 31);
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
