package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x1 {
    public final String a;
    public final String b;
    public final String c;
    public final e30.c d;

    public x1(String str, String str2, String str3, e30.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return k71.k.b(this.a, x1Var.a) && k71.k.b(this.b, x1Var.b) && k71.k.b(this.c, x1Var.c) && k71.k.b(this.d, x1Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        e30.c cVar = this.d;
        return i + (cVar == null ? 0 : cVar.hashCode());
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
