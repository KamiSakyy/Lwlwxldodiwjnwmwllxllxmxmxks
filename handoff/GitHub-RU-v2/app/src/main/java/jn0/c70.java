package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c70 {
    public final String a;
    public final String b;
    public final hv0.f c;

    public c70(String str, String str2, hv0.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c70)) {
            return false;
        }
        c70 c70Var = (c70) obj;
        return k71.k.b(this.a, c70Var.a) && k71.k.b(this.b, c70Var.b) && k71.k.b(this.c, c70Var.c);
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
