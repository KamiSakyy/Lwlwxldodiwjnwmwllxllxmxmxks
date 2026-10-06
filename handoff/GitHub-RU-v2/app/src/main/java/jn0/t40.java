package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t40 {
    public o40 a;
    public String b;
    public String c;

    public t40(o40 o40Var, String str, String str2) {
        this.a = o40Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40)) {
            return false;
        }
        t40 t40Var = (t40) obj;
        return k71.k.b(this.a, t40Var.a) && k71.k.b(this.b, t40Var.b) && k71.k.b(this.c, t40Var.c);
    }

    public final int hashCode() {
        o40 o40Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((o40Var == null ? 0 : o40Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(dashboard=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
