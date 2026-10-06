package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m9 {
    public final String a;
    public final i9 b;
    public final g9 c;
    public final String d;

    public m9(String str, i9 i9Var, g9 g9Var, String str2) {
        this.a = str;
        this.b = i9Var;
        this.c = g9Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9)) {
            return false;
        }
        m9 m9Var = (m9) obj;
        return k71.k.b(this.a, m9Var.a) && k71.k.b(this.b, m9Var.b) && k71.k.b(this.c, m9Var.c) && k71.k.b(this.d, m9Var.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b.a, this.a.hashCode() * 31, 31);
        g9 g9Var = this.c;
        return this.d.hashCode() + ((b + (g9Var == null ? 0 : g9Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Discussion(id=" + this.a + ", comments=" + this.b + ", answer=" + this.c + ", __typename=" + this.d + ")";
    }
}
