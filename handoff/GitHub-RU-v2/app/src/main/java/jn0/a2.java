package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a2 {
    public final String a;
    public final String b;
    public final String c;
    public final uu0.r0 d;

    public a2(String str, String str2, String str3, uu0.r0 r0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return k71.k.b(this.a, a2Var.a) && k71.k.b(this.b, a2Var.b) && k71.k.b(this.c, a2Var.c) && k71.k.b(this.d, a2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SubIssue(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", parentIssueFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
