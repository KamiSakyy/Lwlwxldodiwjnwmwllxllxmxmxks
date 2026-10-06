package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c50 {
    public String a;
    public a50 b;
    public qh0.a c;

    public c50(String str, a50 a50Var, qh0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = a50Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c50)) {
            return false;
        }
        c50 c50Var = (c50) obj;
        return k71.k.b(this.a, c50Var.a) && k71.k.b(this.b, c50Var.b) && k71.k.b(this.c, c50Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a50 a50Var = this.b;
        return this.c.hashCode() + ((hashCode + (a50Var == null ? 0 : a50Var.a.hashCode())) * 31);
    }

    public final String toString() {
        return "UnminimizedComment(__typename=" + this.a + ", onNode=" + this.b + ", minimizableCommentFragment=" + this.c + ")";
    }
}
