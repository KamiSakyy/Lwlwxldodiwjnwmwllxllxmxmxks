package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u4 {
    public final String a;
    public final String b;
    public final String c;

    public u4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return k71.k.b(this.a, u4Var.a) && k71.k.b(this.b, u4Var.b) && k71.k.b(this.c, u4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("App(logoUrl=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
