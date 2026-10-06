package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xv {
    public String a;
    public vx.a b;
    public dw.o5 c;

    public xv(String str, vx.a aVar, dw.o5 o5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = o5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return k71.k.b(this.a, xvVar.a) && k71.k.b(this.b, xvVar.b) && k71.k.b(this.c, xvVar.c);
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
