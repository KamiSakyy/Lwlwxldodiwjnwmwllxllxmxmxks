package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e2 {
    public String a;
    public String b;
    public String c;
    public dw.r6 d;
    public dw.z6 e;

    public e2(String str, String str2, String str3, dw.r6 r6Var, dw.z6 z6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = r6Var;
        this.e = z6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return k71.k.b(this.a, e2Var.a) && k71.k.b(this.b, e2Var.b) && k71.k.b(this.c, e2Var.c) && k71.k.b(this.d, e2Var.d) && k71.k.b(this.e, e2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", subIssueListFragment=");
        o.append(this.d);
        o.append(", subIssueProgressFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
