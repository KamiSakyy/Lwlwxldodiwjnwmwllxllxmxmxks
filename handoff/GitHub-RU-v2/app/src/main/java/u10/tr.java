package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tr {
    public final String a;
    public final String b;
    public final int c;
    public final xr d;

    public tr(String str, String str2, int i, xr xrVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = xrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr)) {
            return false;
        }
        tr trVar = (tr) obj;
        return k71.k.b(this.a, trVar.a) && k71.k.b(this.b, trVar.b) && this.c == trVar.c && k71.k.b(this.d, trVar.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
        xr xrVar = this.d;
        return b + (xrVar == null ? 0 : xrVar.a.hashCode());
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
