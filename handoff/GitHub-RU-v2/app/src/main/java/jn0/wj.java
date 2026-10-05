package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wj implements aa.m0 {
    public final vj a;

    public wj(vj vjVar) {
        this.a = vjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wj) && k71.k.b(this.a, ((wj) obj).a);
    }

    public final int hashCode() {
        vj vjVar = this.a;
        if (vjVar == null) {
            return 0;
        }
        return vjVar.hashCode();
    }

    public final String toString() {
        return "Data(createSavedNotificationThread=" + this.a + ")";
    }
}
