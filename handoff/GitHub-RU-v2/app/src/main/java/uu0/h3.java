package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 {
    public String a;
    public String b;
    public String c;
    public cp0.g d;

    public h3(String str, String str2, String str3, cp0.g gVar) {
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
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return k71.k.b(this.a, h3Var.a) && k71.k.b(this.b, h3Var.b) && k71.k.b(this.c, h3Var.c) && k71.k.b(this.d, h3Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        cp0.g gVar = this.d;
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
