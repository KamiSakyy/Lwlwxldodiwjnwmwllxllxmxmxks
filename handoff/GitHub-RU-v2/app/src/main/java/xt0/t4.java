package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t4 {
    public String a;
    public String b;
    public String c;

    public t4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return k71.k.b(this.a, t4Var.a) && k71.k.b(this.b, t4Var.b) && k71.k.b(this.c, t4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("HeadRepository(id=", this.a, ", nameWithOwner=", this.b, ", __typename="), this.c, ")");
    }
}
