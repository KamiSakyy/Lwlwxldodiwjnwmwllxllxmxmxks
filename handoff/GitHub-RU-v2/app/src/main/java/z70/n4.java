package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n4 {
    public String a;
    public String b;
    public ja0.a c;

    public n4(String str, String str2, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return k71.k.b(this.a, n4Var.a) && k71.k.b(this.b, n4Var.b) && k71.k.b(this.c, n4Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ja0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return no.a.p(a0.s0.o("MergedBy(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
