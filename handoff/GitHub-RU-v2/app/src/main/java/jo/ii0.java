package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ii0 implements aa.v0 {
    public final ki0 a;
    public final String b;
    public final String c;

    public ii0(ki0 ki0Var, String str, String str2) {
        this.a = ki0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii0)) {
            return false;
        }
        ii0 ii0Var = (ii0) obj;
        return k71.k.b(this.a, ii0Var.a) && k71.k.b(this.b, ii0Var.b) && k71.k.b(this.c, ii0Var.c);
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
