package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kd0 {
    public String a;
    public String b;
    public String c;

    public kd0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd0)) {
            return false;
        }
        kd0 kd0Var = (kd0) obj;
        return k71.k.b(this.a, kd0Var.a) && k71.k.b(this.b, kd0Var.b) && k71.k.b(this.c, kd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("PullRequest(id=", this.a, ", headRefOid=", this.b, ", __typename="), this.c, ")");
    }
}
