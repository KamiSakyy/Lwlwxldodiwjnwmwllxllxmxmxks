package uf0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 {
    public String a;
    public String b;
    public a1 c;
    public boolean d;
    public String e;

    public b1(String str, String str2, a1 a1Var, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = a1Var;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.a, b1Var.a) && k71.k.b(this.b, b1Var.b) && k71.k.b(this.c, b1Var.c) && this.d == b1Var.d && k71.k.b(this.e, b1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + x.i.e((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", isOrganizationDiscussionRepository=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
