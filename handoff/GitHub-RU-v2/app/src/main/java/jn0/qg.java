package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qg {
    public final String a;
    public final String b;
    public final rg c;

    public qg(String str, String str2, rg rgVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = rgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg)) {
            return false;
        }
        qg qgVar = (qg) obj;
        return k71.k.b(this.a, qgVar.a) && k71.k.b(this.b, qgVar.b) && k71.k.b(this.c, qgVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        rg rgVar = this.c;
        return i + (rgVar == null ? 0 : rgVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onUser=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
