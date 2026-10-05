package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rq {
    public final String a;
    public final String b;
    public final gq c;

    public rq(String str, String str2, gq gqVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = gqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq)) {
            return false;
        }
        rq rqVar = (rq) obj;
        return k71.k.b(this.a, rqVar.a) && k71.k.b(this.b, rqVar.b) && k71.k.b(this.c, rqVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        gq gqVar = this.c;
        return i + (gqVar == null ? 0 : gqVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target1(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
