package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e40 {
    public String a;
    public String b;
    public ct.u c;

    public e40(String str, String str2, ct.u uVar) {
        this.a = str;
        this.b = str2;
        this.c = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        return k71.k.b(this.a, e40Var.a) && k71.k.b(this.b, e40Var.b) && k71.k.b(this.c, e40Var.c);
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
    public e40(String p1, String p2, Object p3) {
    }
}
