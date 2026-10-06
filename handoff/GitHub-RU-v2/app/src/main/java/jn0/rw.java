package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rw {
    public final String a;
    public final String b;
    public final sw c;

    public rw(String str, String str2, sw swVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = swVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw)) {
            return false;
        }
        rw rwVar = (rw) obj;
        return k71.k.b(this.a, rwVar.a) && k71.k.b(this.b, rwVar.b) && k71.k.b(this.c, rwVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        sw swVar = this.c;
        return i + (swVar == null ? 0 : swVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
