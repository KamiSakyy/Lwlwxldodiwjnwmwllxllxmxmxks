package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fb {
    public final String a;
    public final String b;
    public final gb c;

    public fb(String str, String str2, gb gbVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = gbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return k71.k.b(this.a, fbVar.a) && k71.k.b(this.b, fbVar.b) && k71.k.b(this.c, fbVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        gb gbVar = this.c;
        return i + (gbVar == null ? 0 : gbVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onDiscussion=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
