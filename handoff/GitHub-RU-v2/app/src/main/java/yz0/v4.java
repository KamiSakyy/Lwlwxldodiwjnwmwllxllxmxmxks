package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v4 extends o.b {
    public String t;
    public String u;

    public v4(String str, String str2) {
        super(str, true);
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
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return k71.k.b(this.t, v4Var.t) && k71.k.b(this.u, v4Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("RepositoryInvitation(id=", this.t, ", permalink=", this.u, ")");
    }
}
