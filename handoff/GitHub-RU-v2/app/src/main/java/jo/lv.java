package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lv {
    public final String a;
    public final pv.c b;

    public lv(String str, pv.c cVar) {
        k71.k.g(cVar, "reactionFragment");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv)) {
            return false;
        }
        lv lvVar = (lv) obj;
        return k71.k.b(this.a, lvVar.a) && k71.k.b(this.b, lvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Reactable(__typename=" + this.a + ", reactionFragment=" + this.b + ")";
    }
}
