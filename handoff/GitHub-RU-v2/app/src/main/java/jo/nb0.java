package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nb0 {
    public String a;
    public lb0 b;
    public ju.a c;

    public nb0(String str, lb0 lb0Var, ju.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = lb0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0Var = (nb0) obj;
        return k71.k.b(this.a, nb0Var.a) && k71.k.b(this.b, nb0Var.b) && k71.k.b(this.c, nb0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lb0 lb0Var = this.b;
        return this.c.hashCode() + ((hashCode + (lb0Var == null ? 0 : lb0Var.a.hashCode())) * 31);
    }

    public final String toString() {
        return "UnminimizedComment(__typename=" + this.a + ", onNode=" + this.b + ", minimizableCommentFragment=" + this.c + ")";
    }
}
