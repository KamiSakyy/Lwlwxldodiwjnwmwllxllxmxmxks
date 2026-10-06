package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j5 {
    public String a;
    public String b;
    public vx.a c;

    public j5(String str, String str2, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return k71.k.b(this.a, j5Var.a) && k71.k.b(this.b, j5Var.b) && k71.k.b(this.c, j5Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        vx.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return jo.f4.r(a0.s0.o("MergedBy(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
