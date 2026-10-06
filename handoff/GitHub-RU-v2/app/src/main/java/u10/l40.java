package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l40 {
    public String a;
    public String b;
    public ja0.a c;

    public l40(String str, String str2, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l40)) {
            return false;
        }
        l40 l40Var = (l40) obj;
        return k71.k.b(this.a, l40Var.a) && k71.k.b(this.b, l40Var.b) && k71.k.b(this.c, l40Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ja0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return no.a.p(a0.s0.o("Actor(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
    public l40(String p1, String p2, Object p3) {
    }
}
