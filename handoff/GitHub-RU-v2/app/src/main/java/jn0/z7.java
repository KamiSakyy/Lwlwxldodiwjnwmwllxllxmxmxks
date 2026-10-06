package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z7 {
    public d8 a;
    public String b;
    public String c;

    public z7(d8 d8Var, String str, String str2) {
        this.a = d8Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        return k71.k.b(this.a, z7Var.a) && k71.k.b(this.b, z7Var.b) && k71.k.b(this.c, z7Var.c);
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
