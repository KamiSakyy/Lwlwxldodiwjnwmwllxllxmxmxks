package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t40 {
    public String a;
    public String b;
    public String c;
    public m40 d;
    public s40 e;

    public t40(String str, String str2, String str3, m40 m40Var, s40 s40Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = m40Var;
        this.e = s40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t40)) {
            return false;
        }
        t40 t40Var = (t40) obj;
        return k71.k.b(this.a, t40Var.a) && k71.k.b(this.b, t40Var.b) && k71.k.b(this.c, t40Var.c) && k71.k.b(this.d, t40Var.d) && k71.k.b(this.e, t40Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        m40 m40Var = this.d;
        int hashCode = (i + (m40Var == null ? 0 : Integer.hashCode(m40Var.a))) * 31;
        s40 s40Var = this.e;
        return hashCode + (s40Var != null ? s40Var.hashCode() : 0);
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
