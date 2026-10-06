package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e10 {
    public final z00 a;
    public final String b;
    public final String c;

    public e10(z00 z00Var, String str, String str2) {
        this.a = z00Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e10)) {
            return false;
        }
        e10 e10Var = (e10) obj;
        return k71.k.b(this.a, e10Var.a) && k71.k.b(this.b, e10Var.b) && k71.k.b(this.c, e10Var.c);
    }

    public final int hashCode() {
        z00 z00Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((z00Var == null ? 0 : z00Var.hashCode()) * 31, this.b, 31);
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
