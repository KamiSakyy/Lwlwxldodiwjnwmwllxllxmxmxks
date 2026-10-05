package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bf0 {
    public final String a;
    public final String b;
    public final fw0.c c;

    public bf0(String str, String str2, fw0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf0)) {
            return false;
        }
        bf0 bf0Var = (bf0) obj;
        return k71.k.b(this.a, bf0Var.a) && k71.k.b(this.b, bf0Var.b) && k71.k.b(this.c, bf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", homeNavLinks=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
