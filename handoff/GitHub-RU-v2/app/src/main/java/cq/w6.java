package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w6 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public eq.g e;

    public w6(String str, String str2, String str3, String str4, eq.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return k71.k.b(this.a, w6Var.a) && k71.k.b(this.b, w6Var.b) && k71.k.b(this.c, w6Var.c) && k71.k.b(this.d, w6Var.d) && k71.k.b(this.e, w6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("UserFeedFragment(__typename=", this.a, ", id=", this.b, ", login=");
        f1.e.x(o, this.c, ", url=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
