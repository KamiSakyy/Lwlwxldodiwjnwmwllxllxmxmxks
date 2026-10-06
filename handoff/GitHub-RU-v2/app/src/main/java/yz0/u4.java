package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u4 extends o.b {
    public final String t;
    public final String u;

    public u4(String str, String str2) {
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
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return k71.k.b(this.t, u4Var.t) && k71.k.b(this.u, u4Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RepositoryDependabotAlertsThread(id=", this.t, ", url=", this.u, ")");
    }
}
