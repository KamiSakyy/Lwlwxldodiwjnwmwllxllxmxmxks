package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a4 {
    public String a;
    public String b;
    public String c;
    public eq.g d;

    public a4(String str, String str2, String str3, eq.g gVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return k71.k.b(this.a, a4Var.a) && k71.k.b(this.b, a4Var.b) && k71.k.b(this.c, a4Var.c) && k71.k.b(this.d, a4Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        eq.g gVar = this.d;
        return i + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", login=");
        o.append(this.c);
        o.append(", avatarFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
