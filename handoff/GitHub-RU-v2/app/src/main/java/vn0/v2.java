package vn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v2 {
    public final String a;
    public final int b;
    public final String c;

    public v2(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return k71.k.b(this.a, v2Var.a) && this.b == v2Var.b && k71.k.b(this.c, v2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.n(this.b, "Node(id=", this.a, ", number=", ", __typename="), this.c, ")");
    }
}
