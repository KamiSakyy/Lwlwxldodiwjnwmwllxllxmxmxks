package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xm {
    public final rm a;

    public xm(rm rmVar) {
        this.a = rmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm) && k71.k.b(this.a, ((xm) obj).a);
    }

    public final int hashCode() {
        rm rmVar = this.a;
        if (rmVar == null) {
            return 0;
        }
        return rmVar.hashCode();
    }

    public final String toString() {
        return "OnDiscussion(mentionableItems=" + this.a + ")";
    }
}
