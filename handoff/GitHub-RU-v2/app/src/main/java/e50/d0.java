package e50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {
    public String a;
    public g0 b;
    public e30.a c;

    public d0(String str, g0 g0Var, e30.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = g0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return k71.k.b(this.a, d0Var.a) && k71.k.b(this.b, d0Var.b) && k71.k.b(this.c, d0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g0 g0Var = this.b;
        return this.c.hashCode() + ((hashCode + (g0Var == null ? 0 : g0Var.a.hashCode())) * 31);
    }

    public final String toString() {
        return "Author(__typename=" + this.a + ", onNode=" + this.b + ", actorFields=" + this.c + ")";
    }
    public Object values() { return null; }
    public Object j = null;
    public e50.d0 j = null;
}
