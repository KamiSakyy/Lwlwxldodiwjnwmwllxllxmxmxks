package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ga0 {
    public final String a;
    public final String b;
    public final String c;

    public ga0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga0)) {
            return false;
        }
        ga0 ga0Var = (ga0) obj;
        return k71.k.b(this.a, ga0Var.a) && k71.k.b(this.b, ga0Var.b) && k71.k.b(this.c, ga0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("User(mobileTimeZone=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
