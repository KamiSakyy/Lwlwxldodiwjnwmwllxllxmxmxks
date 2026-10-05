package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yj0 {
    public final wj0 a;
    public final String b;
    public final String c;

    public yj0(wj0 wj0Var, String str, String str2) {
        this.a = wj0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj0)) {
            return false;
        }
        yj0 yj0Var = (yj0) obj;
        return k71.k.b(this.a, yj0Var.a) && k71.k.b(this.b, yj0Var.b) && k71.k.b(this.c, yj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(organizations=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
