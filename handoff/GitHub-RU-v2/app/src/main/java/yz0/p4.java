package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p4 extends o.b {
    public String t;
    public String u;

    public p4(String str, String str2) {
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
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return k71.k.b(this.t, p4Var.t) && k71.k.b(this.u, p4Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("Gist(id=", this.t, ", url=", this.u, ")");
    }
}
