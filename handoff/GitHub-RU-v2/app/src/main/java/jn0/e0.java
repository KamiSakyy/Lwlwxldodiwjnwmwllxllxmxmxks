package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 {
    public final String a;
    public final gu0.c b;

    public e0(gu0.c cVar, String str) {
        k71.k.g(cVar, "reactionFragment");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Reactable(__typename=" + this.a + ", reactionFragment=" + this.b + ")";
    }
}
