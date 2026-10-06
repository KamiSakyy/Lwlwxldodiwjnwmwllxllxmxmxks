package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wk implements aaShadow.m0 {
    public final xk a;

    public wk(xk xkVar) {
        this.a = xkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk) && k71.k.b(this.a, ((wk) obj).a);
    }

    public final int hashCode() {
        xk xkVar = this.a;
        if (xkVar == null) {
            return 0;
        }
        return xkVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsRead=" + this.a + ")";
    }
}
