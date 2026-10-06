package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f2 {
    public String a;
    public String b;
    public String c;
    public dw.s0 d;

    public f2(String str, String str2, String str3, dw.s0 s0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return k71.k.b(this.a, f2Var.a) && k71.k.b(this.b, f2Var.b) && k71.k.b(this.c, f2Var.c) && k71.k.b(this.d, f2Var.d);
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
