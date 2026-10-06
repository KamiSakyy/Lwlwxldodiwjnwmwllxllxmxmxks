package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t6 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public t6(int i, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return k71.k.b(this.a, t6Var.a) && k71.k.b(this.b, t6Var.b) && this.c == t6Var.c && k71.k.b(this.d, t6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.c(this.c, ", __typename=", this.d, ")", a0.s0.o("Issue(id=", this.a, ", url=", this.b, ", number="));
    }
}
