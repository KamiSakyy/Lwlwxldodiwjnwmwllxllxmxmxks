package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public String a;
    public gu0.c b;

    public g0(gu0.c cVar, String str) {
        k71.k.g(cVar, "reactionFragment");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", reactionFragment=" + this.b + ")";
    }
}
