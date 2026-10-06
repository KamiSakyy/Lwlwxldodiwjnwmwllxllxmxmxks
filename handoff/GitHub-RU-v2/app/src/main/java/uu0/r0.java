package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 implements aa.h0 {
    public final p0 a;
    public final String b;
    public final String c;

    public r0(p0 p0Var, String str, String str2) {
        this.a = p0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && k71.k.b(this.b, r0Var.b) && k71.k.b(this.c, r0Var.c);
    }

    public final int hashCode() {
        p0 p0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((p0Var == null ? 0 : p0Var.hashCode()) * 31, this.b, 31);
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
