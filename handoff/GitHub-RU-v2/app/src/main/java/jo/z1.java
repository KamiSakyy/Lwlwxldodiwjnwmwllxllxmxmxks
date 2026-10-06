package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 {
    public final String a;
    public final vx.a b;
    public final dw.o5 c;

    public z1(String str, vx.a aVar, dw.o5 o5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = o5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return k71.k.b(this.a, z1Var.a) && k71.k.b(this.b, z1Var.b) && k71.k.b(this.c, z1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vx.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        dw.o5 o5Var = this.c;
        return hashCode2 + (o5Var != null ? o5Var.hashCode() : 0);
    }

    public final String toString() {
        return "Starrable(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", repositoryStarsFragment=" + this.c + ")";
    }
}
