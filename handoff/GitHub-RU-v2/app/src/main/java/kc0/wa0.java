package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wa0 {
    public ua0 a;
    public String b;
    public String c;

    public wa0(ua0 ua0Var, String str, String str2) {
        this.a = ua0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa0)) {
            return false;
        }
        wa0 wa0Var = (wa0) obj;
        return k71.k.b(this.a, wa0Var.a) && k71.k.b(this.b, wa0Var.b) && k71.k.b(this.c, wa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(contributionsCollection=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
