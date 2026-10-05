package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t5 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final s5 d;
    public final String e;

    public t5(String str, String str2, String str3, s5 s5Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = s5Var;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return k71.k.b(this.a, t5Var.a) && k71.k.b(this.b, t5Var.b) && k71.k.b(this.c, t5Var.c) && k71.k.b(this.d, t5Var.d) && k71.k.b(this.e, t5Var.e);
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
