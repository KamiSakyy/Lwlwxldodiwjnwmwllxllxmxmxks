package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z80 {
    public String a;
    public x80 b;
    public at0.a c;

    public z80(String str, x80 x80Var, at0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = x80Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80)) {
            return false;
        }
        z80 z80Var = (z80) obj;
        return k71.k.b(this.a, z80Var.a) && k71.k.b(this.b, z80Var.b) && k71.k.b(this.c, z80Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x80 x80Var = this.b;
        return this.c.hashCode() + ((hashCode + (x80Var == null ? 0 : x80Var.a.hashCode())) * 31);
    }

    public final String toString() {
        return "UnminimizedComment(__typename=" + this.a + ", onNode=" + this.b + ", minimizableCommentFragment=" + this.c + ")";
    }
}
