package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 {
    public String a;
    public String b;
    public String c;
    public String d;

    public h1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return k71.k.b(this.a, h1Var.a) && k71.k.b(this.b, h1Var.b) && k71.k.b(this.c, h1Var.c) && k71.k.b(this.d, h1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("App(id=", this.a, ", name=", this.b, ", logoUrl="), this.c, ", __typename=", this.d, ")");
    }
}
