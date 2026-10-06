package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w4 {
    public final x5 a;
    public final String b;
    public final String c;

    public w4(x5 x5Var, String str, String str2) {
        this.a = x5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return k71.k.b(this.a, w4Var.a) && k71.k.b(this.b, w4Var.b) && k71.k.b(this.c, w4Var.c);
    }

    public final int hashCode() {
        x5 x5Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((x5Var == null ? 0 : x5Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseRef(refUpdateRule=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
