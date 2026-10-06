package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class le0 {
    public final String a;
    public final String b;
    public final vx.a c;

    public le0(String str, String str2, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le0)) {
            return false;
        }
        le0 le0Var = (le0) obj;
        return k71.k.b(this.a, le0Var.a) && k71.k.b(this.b, le0Var.b) && k71.k.b(this.c, le0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        vx.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f4.r(a0.s0.o("MergedBy(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
