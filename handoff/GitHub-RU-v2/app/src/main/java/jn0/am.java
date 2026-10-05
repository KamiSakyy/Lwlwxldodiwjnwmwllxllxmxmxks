package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class am {
    public final String a;
    public final String b;
    public final bm c;

    public am(String str, String str2, bm bmVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = bmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        return k71.k.b(this.a, amVar.a) && k71.k.b(this.b, amVar.b) && k71.k.b(this.c, amVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        bm bmVar = this.c;
        return i + (bmVar == null ? 0 : bmVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
