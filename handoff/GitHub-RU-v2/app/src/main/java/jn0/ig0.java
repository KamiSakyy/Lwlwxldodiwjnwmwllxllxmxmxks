package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ig0 implements aaShadow.v0 {
    public jg0 a;
    public String b;
    public String c;

    public ig0(jg0 jg0Var, String str, String str2) {
        this.a = jg0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig0)) {
            return false;
        }
        ig0 ig0Var = (ig0) obj;
        return k71.k.b(this.a, ig0Var.a) && k71.k.b(this.b, ig0Var.b) && k71.k.b(this.c, ig0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
