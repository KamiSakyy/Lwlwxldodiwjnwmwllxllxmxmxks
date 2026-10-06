package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y4 extends o.b {
    public final String t;
    public final String u;

    public y4(String str, String str2) {
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
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return k71.k.b(this.t, y4Var.t) && k71.k.b(this.u, y4Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("TeamDiscussion(id=", this.t, ", url=", this.u, ")");
    }
}
