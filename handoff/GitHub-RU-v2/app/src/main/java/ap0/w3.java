package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final x3 d;
    public final String e;

    public w3(String str, String str2, boolean z, x3 x3Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = x3Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return k71.k.b(this.a, w3Var.a) && k71.k.b(this.b, w3Var.b) && this.c == w3Var.c && k71.k.b(this.d, w3Var.d) && k71.k.b(this.e, w3Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        x3 x3Var = this.d;
        return this.e.hashCode() + ((e + (x3Var == null ? 0 : x3Var.hashCode())) * 31);
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
