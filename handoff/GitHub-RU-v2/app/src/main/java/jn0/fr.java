package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fr {
    public final String a;
    public final String b;
    public final gr c;

    public fr(String str, String str2, gr grVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = grVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr)) {
            return false;
        }
        fr frVar = (fr) obj;
        return k71.k.b(this.a, frVar.a) && k71.k.b(this.b, frVar.b) && k71.k.b(this.c, frVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        gr grVar = this.c;
        return i + (grVar == null ? 0 : grVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onReactable=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
