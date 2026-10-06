package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hk implements aaShadow.m0 {
    public final ik a;

    public hk(ik ikVar) {
        this.a = ikVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk) && k71.k.b(this.a, ((hk) obj).a);
    }

    public final int hashCode() {
        ik ikVar = this.a;
        if (ikVar == null) {
            return 0;
        }
        return ikVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteSavedNotificationThread=" + this.a + ")";
    }
}
