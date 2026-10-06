package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ri {
    public final String a;
    public final String b;
    public final kw0.a c;

    public ri(String str, String str2, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri)) {
            return false;
        }
        ri riVar = (ri) obj;
        return k71.k.b(this.a, riVar.a) && k71.k.b(this.b, riVar.b) && k71.k.b(this.c, riVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        kw0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f1.e.n(a0.s0.o("Actor(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
