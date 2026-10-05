package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xq {
    public final yq a;

    public xq(yq yqVar) {
        this.a = yqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq) && k71.k.b(this.a, ((xq) obj).a);
    }

    public final int hashCode() {
        yq yqVar = this.a;
        if (yqVar == null) {
            return 0;
        }
        return yqVar.hashCode();
    }

    public final String toString() {
        return "RemoveUpvote(subject=" + this.a + ")";
    }
}
