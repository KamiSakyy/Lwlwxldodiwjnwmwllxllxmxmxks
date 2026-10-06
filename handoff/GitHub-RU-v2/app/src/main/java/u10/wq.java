package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wq implements aaShadow.m0 {
    public final xq a;

    public wq(xq xqVar) {
        this.a = xqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wq) && k71.k.b(this.a, ((wq) obj).a);
    }

    public final int hashCode() {
        xq xqVar = this.a;
        if (xqVar == null) {
            return 0;
        }
        return xqVar.hashCode();
    }

    public final String toString() {
        return "Data(removeUpvote=" + this.a + ")";
    }
}
