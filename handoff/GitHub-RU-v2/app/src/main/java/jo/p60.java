package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p60 implements aaShadow.v0 {
    public final t60 a;
    public final String b;
    public final String c;

    public p60(t60 t60Var, String str, String str2) {
        this.a = t60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p60)) {
            return false;
        }
        p60 p60Var = (p60) obj;
        return k71.k.b(this.a, p60Var.a) && k71.k.b(this.b, p60Var.b) && k71.k.b(this.c, p60Var.c);
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
