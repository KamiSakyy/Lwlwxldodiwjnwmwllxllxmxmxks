package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v3 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public u3 d;
    public String e;

    public v3(String str, String str2, String str3, u3 u3Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u3Var;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return k71.k.b(this.a, v3Var.a) && k71.k.b(this.b, v3Var.b) && k71.k.b(this.c, v3Var.c) && k71.k.b(this.d, v3Var.d) && k71.k.b(this.e, v3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SimpleRepositoryFragment(name=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", owner=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
