package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xs {
    public String a;
    public String b;
    public cp0.c c;

    public xs(String str, String str2, cp0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs)) {
            return false;
        }
        xs xsVar = (xs) obj;
        return k71.k.b(this.a, xsVar.a) && k71.k.b(this.b, xsVar.b) && k71.k.b(this.c, xsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return f1.e.m(a0.s0.o("Author1(__typename=", this.a, ", id=", this.b, ", actorFields="), this.c, ")");
    }
}
