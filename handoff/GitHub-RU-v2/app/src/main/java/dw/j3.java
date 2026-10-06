package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j3 {
    public String a;
    public String b;
    public String c;
    public eq.g d;

    public j3(String str, String str2, String str3, eq.g gVar) {
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
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return k71.k.b(this.a, j3Var.a) && k71.k.b(this.b, j3Var.b) && k71.k.b(this.c, j3Var.c) && k71.k.b(this.d, j3Var.d);
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
