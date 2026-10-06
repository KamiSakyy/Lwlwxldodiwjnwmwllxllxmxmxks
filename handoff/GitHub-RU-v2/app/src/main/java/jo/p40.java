package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p40 {
    public String a;
    public String b;
    public ct.u c;

    public p40(String str, String str2, ct.u uVar) {
        this.a = str;
        this.b = str2;
        this.c = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p40)) {
            return false;
        }
        p40 p40Var = (p40) obj;
        return k71.k.b(this.a, p40Var.a) && k71.k.b(this.b, p40Var.b) && k71.k.b(this.c, p40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", issueListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public p40(String p1, String p2, Object p3) {
    }
}
