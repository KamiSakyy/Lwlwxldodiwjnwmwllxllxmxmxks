package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h8 {
    public String a;
    public String b;
    public String c;
    public boolean d;
    public String e;

    public h8(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        return k71.k.b(this.a, h8Var.a) && k71.k.b(this.b, h8Var.b) && k71.k.b(this.c, h8Var.c) && this.d == h8Var.d && k71.k.b(this.e, h8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RequestedBy(id=", this.a, ", login=", this.b, ", avatarUrl=");
        com.github.rudroid.m0.x(o, this.c, ", isViewer=", this.d, ", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
