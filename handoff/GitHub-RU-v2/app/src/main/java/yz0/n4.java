package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n4 extends o.b {
    public final String t;
    public final String u;
    public final String v;

    public n4(String str, String str2, String str3) {
        super(str, true);
        this.t = str;
        this.u = str2;
        this.v = str3;
    }

    public final String c() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return k71.k.b(this.t, n4Var.t) && k71.k.b(this.u, n4Var.u) && k71.k.b(this.v, n4Var.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + com.github.rudroid.copilot.h1.i(this.t.hashCode() * 31, this.u, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Commit(id=", this.t, ", abbreviatedOid=", qb.b.a(this.u), ", url="), this.v, ")");
    }
}
