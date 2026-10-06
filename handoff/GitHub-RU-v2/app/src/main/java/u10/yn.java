package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yn {
    public String a;
    public String b;
    public zn c;

    public yn(String str, String str2, zn znVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = znVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yn)) {
            return false;
        }
        yn ynVar = (yn) obj;
        return k71.k.b(this.a, ynVar.a) && k71.k.b(this.b, ynVar.b) && k71.k.b(this.c, ynVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        zn znVar = this.c;
        return i + (znVar == null ? 0 : znVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onReactable=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
