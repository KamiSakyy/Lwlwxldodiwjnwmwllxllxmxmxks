package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b60 {
    public final String a;
    public final String b;
    public final String c;

    public b60(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b60)) {
            return false;
        }
        b60 b60Var = (b60) obj;
        return k71.k.b(this.a, b60Var.a) && k71.k.b(this.b, b60Var.b) && k71.k.b(this.c, b60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Discussion(id=", this.a, ", title=", this.b, ", __typename="), this.c, ")");
    }
}
