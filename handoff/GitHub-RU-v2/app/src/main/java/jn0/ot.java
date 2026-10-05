package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ot {
    public final String a;
    public final gu0.c b;

    public ot(gu0.c cVar, String str) {
        k71.k.g(cVar, "reactionFragment");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot)) {
            return false;
        }
        ot otVar = (ot) obj;
        return k71.k.b(this.a, otVar.a) && k71.k.b(this.b, otVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Reactable(__typename=" + this.a + ", reactionFragment=" + this.b + ")";
    }
}
