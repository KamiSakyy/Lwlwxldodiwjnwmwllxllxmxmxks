package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hq {
    public String a;
    public i80.c b;

    public hq(i80.c cVar, String str) {
        k71.k.g(cVar, "reactionFragment");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq)) {
            return false;
        }
        hq hqVar = (hq) obj;
        return k71.k.b(this.a, hqVar.a) && k71.k.b(this.b, hqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Reactable(__typename=" + this.a + ", reactionFragment=" + this.b + ")";
    }
    public hq(Object p1, String p2) {
    }
}
