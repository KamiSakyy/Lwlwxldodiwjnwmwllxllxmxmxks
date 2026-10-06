package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w {
    public String a;
    public String b;
    public cp0.c c;

    public w(String str, String str2, cp0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b) && k71.k.b(this.c, wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return f1.e.m(a0.s0.o("Actor(__typename=", this.a, ", id=", this.b, ", actorFields="), this.c, ")");
    }
    public Object e(Object p1) { return null; }
}
