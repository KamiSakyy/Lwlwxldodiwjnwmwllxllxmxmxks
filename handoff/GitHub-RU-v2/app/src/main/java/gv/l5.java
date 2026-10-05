package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l5 {
    public final String a;
    public final String b;
    public final kw.e c;

    public l5(String str, String str2, kw.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj;
        return k71.k.b(this.a, l5Var.a) && k71.k.b(this.b, l5Var.b) && k71.k.b(this.c, l5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", reviewRequestFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
