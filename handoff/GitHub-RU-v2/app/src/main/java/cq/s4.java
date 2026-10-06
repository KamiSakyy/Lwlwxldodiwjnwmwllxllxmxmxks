package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s4 {
    public String a;
    public String b;
    public boolean c;
    public t4 d;
    public String e;

    public s4(String str, String str2, boolean z, t4 t4Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = t4Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return k71.k.b(this.a, s4Var.a) && k71.k.b(this.b, s4Var.b) && this.c == s4Var.c && k71.k.b(this.d, s4Var.d) && k71.k.b(this.e, s4Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        t4 t4Var = this.d;
        return this.e.hashCode() + ((e + (t4Var == null ? 0 : t4Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Ref(id=", this.a, ", name=", this.b, ", viewerCanCommitToBranch=");
        o.append(this.c);
        o.append(", target=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
