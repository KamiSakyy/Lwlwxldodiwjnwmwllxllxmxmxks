package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dk implements aa.m0 {
    public final ek a;

    public dk(ek ekVar) {
        this.a = ekVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dk) && k71.k.b(this.a, ((dk) obj).a);
    }

    public final int hashCode() {
        ek ekVar = this.a;
        if (ekVar == null) {
            return 0;
        }
        return ekVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsUnread=" + this.a + ")";
    }
}
