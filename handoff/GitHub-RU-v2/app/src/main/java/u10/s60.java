package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s60 {
    public final String a;
    public final String b;
    public final String c;

    public s60(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s60)) {
            return false;
        }
        s60 s60Var = (s60) obj;
        return k71.k.b(this.a, s60Var.a) && k71.k.b(this.b, s60Var.b) && k71.k.b(this.c, s60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", login="), this.c, ")");
    }
}
