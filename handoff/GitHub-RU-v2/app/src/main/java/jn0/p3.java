package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p3 {
    public String a;
    public String b;
    public String c;
    public String d;

    public p3(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return k71.k.b(this.a, p3Var.a) && k71.k.b(this.b, p3Var.b) && k71.k.b(this.c, p3Var.c) && k71.k.b(this.d, p3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("Node(id=", this.a, ", title=", this.b, ", body="), this.c, ", __typename=", this.d, ")");
    }
}
