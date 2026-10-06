package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x4 extends o.b {
    public final String t;
    public final String u;

    public x4(String str, String str2) {
        super(str, false);
        this.t = str;
        this.u = str2;
    }

    public final String c() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return k71.k.b(this.t, x4Var.t) && k71.k.b(this.u, x4Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("SecurityAdvisory(id=", this.t, ", url=", this.u, ")");
    }
}
