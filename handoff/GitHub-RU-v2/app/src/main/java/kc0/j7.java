package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j7 {
    public final n7 a;
    public final String b;
    public final String c;

    public j7(n7 n7Var, String str, String str2) {
        this.a = n7Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return k71.k.b(this.a, j7Var.a) && k71.k.b(this.b, j7Var.b) && k71.k.b(this.c, j7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dashboard(shortcuts=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
