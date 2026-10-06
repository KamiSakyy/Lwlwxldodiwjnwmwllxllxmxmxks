package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ty {
    public final String a;
    public final String b;
    public final ak0.f c;

    public ty(String str, String str2, ak0.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty)) {
            return false;
        }
        ty tyVar = (ty) obj;
        return k71.k.b(this.a, tyVar.a) && k71.k.b(this.b, tyVar.b) && k71.k.b(this.c, tyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Thread(__typename=", this.a, ", id=", this.b, ", reviewThreadFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
