package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s4 extends o.b {
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;

    public s4(String str, String str2, String str3, String str4, String str5) {
        super(str, false);
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.w = str4;
        this.x = str5;
    }

    public final String c() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return k71.k.b(this.t, s4Var.t) && k71.k.b(this.u, s4Var.u) && k71.k.b(this.v, s4Var.v) && k71.k.b(this.w, s4Var.w) && k71.k.b(this.x, s4Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.t.hashCode() * 31, this.u, 31), this.v, 31), this.w, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Release(id=", this.t, ", tagName=", this.u, ", url=");
        f1.e.x(o, this.v, ", repoOwner=", this.w, ", repoName=");
        return com.github.rudroid.copilot.h1.p(o, this.x, ")");
    }
}
