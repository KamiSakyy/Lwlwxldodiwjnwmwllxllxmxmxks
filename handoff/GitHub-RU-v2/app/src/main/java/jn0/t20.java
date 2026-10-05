package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t20 {
    public final String a;
    public final String b;
    public final String c;
    public final m20 d;
    public final s20 e;

    public t20(String str, String str2, String str3, m20 m20Var, s20 s20Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = m20Var;
        this.e = s20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t20)) {
            return false;
        }
        t20 t20Var = (t20) obj;
        return k71.k.b(this.a, t20Var.a) && k71.k.b(this.b, t20Var.b) && k71.k.b(this.c, t20Var.c) && k71.k.b(this.d, t20Var.d) && k71.k.b(this.e, t20Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        m20 m20Var = this.d;
        int hashCode = (i + (m20Var == null ? 0 : Integer.hashCode(m20Var.a))) * 31;
        s20 s20Var = this.e;
        return hashCode + (s20Var != null ? s20Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", name=", this.b, ", id=");
        o.append(this.c);
        o.append(", issueTypes=");
        o.append(this.d);
        o.append(", pinnedIssues=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
