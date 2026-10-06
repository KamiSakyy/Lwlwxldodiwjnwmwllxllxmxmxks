package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public h00(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h00)) {
            return false;
        }
        h00 h00Var = (h00) obj;
        return k71.k.b(this.a, h00Var.a) && k71.k.b(this.b, h00Var.b) && k71.k.b(this.c, h00Var.c) && k71.k.b(this.d, h00Var.d) && k71.k.b(this.e, h00Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return this.e.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(id=", this.a, ", color=", this.b, ", name=");
        f1.e.x(o, this.c, ", description=", this.d, ", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
