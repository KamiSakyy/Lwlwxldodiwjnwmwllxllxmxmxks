package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e30 {
    public final String a;
    public final c30 b;
    public final y60.a c;

    public e30(String str, c30 c30Var, y60.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = c30Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e30)) {
            return false;
        }
        e30 e30Var = (e30) obj;
        return k71.k.b(this.a, e30Var.a) && k71.k.b(this.b, e30Var.b) && k71.k.b(this.c, e30Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c30 c30Var = this.b;
        return this.c.hashCode() + ((hashCode + (c30Var == null ? 0 : c30Var.a.hashCode())) * 31);
    }

    public final String toString() {
        return "UnminimizedComment(__typename=" + this.a + ", onNode=" + this.b + ", minimizableCommentFragment=" + this.c + ")";
    }










}
