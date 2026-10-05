package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xs {
    public final String a;
    public final String b;
    public final int c;
    public final bt d;

    public xs(String str, String str2, int i, bt btVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = btVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs)) {
            return false;
        }
        xs xsVar = (xs) obj;
        return k71.k.b(this.a, xsVar.a) && k71.k.b(this.b, xsVar.b) && this.c == xsVar.c && k71.k.b(this.d, xsVar.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
        bt btVar = this.d;
        return b + (btVar == null ? 0 : btVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Entry(name=", this.a, ", type=", this.b, ", mode=");
        o.append(this.c);
        o.append(", submodule=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
