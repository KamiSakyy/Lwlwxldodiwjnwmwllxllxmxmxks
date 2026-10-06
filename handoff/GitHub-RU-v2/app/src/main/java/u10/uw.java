package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uw {
    public String a;
    public String b;
    public i90.f c;

    public uw(String str, String str2, i90.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw)) {
            return false;
        }
        uw uwVar = (uw) obj;
        return k71.k.b(this.a, uwVar.a) && k71.k.b(this.b, uwVar.b) && k71.k.b(this.c, uwVar.c);
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
