package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ov {
    public String a;
    public pv.c b;

    public ov(String str, pv.c cVar) {
        k71.k.g(cVar, "reactionFragment");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov)) {
            return false;
        }
        ov ovVar = (ov) obj;
        return k71.k.b(this.a, ovVar.a) && k71.k.b(this.b, ovVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", reactionFragment=" + this.b + ")";
    }
}
