package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class si0 implements aa.v0 {
    public final ti0 a;
    public final String b;
    public final String c;

    public si0(ti0 ti0Var, String str, String str2) {
        this.a = ti0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si0)) {
            return false;
        }
        si0 si0Var = (si0) obj;
        return k71.k.b(this.a, si0Var.a) && k71.k.b(this.b, si0Var.b) && k71.k.b(this.c, si0Var.c);
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
