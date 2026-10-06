package is;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public final String a;
    public final k0 b;
    public final eq.c c;

    public h0(String str, k0 k0Var, eq.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = k0Var;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && k71.k.b(this.b, h0Var.b) && k71.k.b(this.c, h0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k0 k0Var = this.b;
        return this.c.hashCode() + ((hashCode + (k0Var == null ? 0 : k0Var.a.hashCode())) * 31);
    }

    public final String toString() {
        return "Author(__typename=" + this.a + ", onNode=" + this.b + ", actorFields=" + this.c + ")";
    }
    public Object a = null;
    public Object b = null;
    public Object c = null;
}
