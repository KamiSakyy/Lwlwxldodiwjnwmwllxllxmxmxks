package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e7 implements aa.h0 {
    public String a;
    public String b;
    public z6 c;
    public s0 d;
    public r6 e;

    public e7(String str, String str2, z6 z6Var, s0 s0Var, r6 r6Var) {
        this.a = str;
        this.b = str2;
        this.c = z6Var;
        this.d = s0Var;
        this.e = r6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return k71.k.b(this.a, e7Var.a) && k71.k.b(this.b, e7Var.b) && k71.k.b(this.c, e7Var.c) && k71.k.b(this.d, e7Var.d) && k71.k.b(this.e, e7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SubIssuesFragment(__typename=", this.a, ", id=", this.b, ", subIssueProgressFragment=");
        o.append(this.c);
        o.append(", parentIssueFragment=");
        o.append(this.d);
        o.append(", subIssueListFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
    public Object a = null;
}
