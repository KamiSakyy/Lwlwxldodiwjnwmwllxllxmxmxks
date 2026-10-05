package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n2 {
    public final String a;
    public final String b;
    public final ek0.b c;
    public final g3 d;

    public n2(String str, String str2, ek0.b bVar, g3 g3Var) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = g3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return k71.k.b(this.a, n2Var.a) && k71.k.b(this.b, n2Var.b) && k71.k.b(this.c, n2Var.c) && k71.k.b(this.d, n2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", subscribableFragment=");
        o.append(this.c);
        o.append(", repositoryNodeFragmentIssue=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
