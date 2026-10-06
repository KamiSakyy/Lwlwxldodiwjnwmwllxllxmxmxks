package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l10 {
    public String a;
    public String b;
    public i90.f c;

    public l10(String str, String str2, i90.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l10)) {
            return false;
        }
        l10 l10Var = (l10) obj;
        return k71.k.b(this.a, l10Var.a) && k71.k.b(this.b, l10Var.b) && k71.k.b(this.c, l10Var.c);
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
    public l10(String p1, String p2, Object p3) {
    }
}
