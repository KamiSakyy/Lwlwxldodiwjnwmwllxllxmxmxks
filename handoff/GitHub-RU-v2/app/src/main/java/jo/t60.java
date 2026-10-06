package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t60 {
    public final o60 a;
    public final String b;
    public final String c;

    public t60(o60 o60Var, String str, String str2) {
        this.a = o60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t60)) {
            return false;
        }
        t60 t60Var = (t60) obj;
        return k71.k.b(this.a, t60Var.a) && k71.k.b(this.b, t60Var.b) && k71.k.b(this.c, t60Var.c);
    }

    public final int hashCode() {
        o60 o60Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((o60Var == null ? 0 : o60Var.hashCode()) * 31, this.b, 31);
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
