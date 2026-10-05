package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 implements aa.h0 {
    public final q0 a;
    public final String b;
    public final String c;

    public s0(q0 q0Var, String str, String str2) {
        this.a = q0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b) && k71.k.b(this.c, s0Var.c);
    }

    public final int hashCode() {
        q0 q0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((q0Var == null ? 0 : q0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParentIssueFragment(parent=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
