package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wh implements aa.m0 {
    public final xh a;

    public wh(xh xhVar) {
        this.a = xhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh) && k71.k.b(this.a, ((wh) obj).a);
    }

    public final int hashCode() {
        xh xhVar = this.a;
        if (xhVar == null) {
            return 0;
        }
        return xhVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsDone=" + this.a + ")";
    }
}
