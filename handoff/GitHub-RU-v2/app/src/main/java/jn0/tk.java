package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tk implements aaShadow.m0 {
    public uk a;

    public tk(uk ukVar) {
        this.a = ukVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk) && k71.k.b(this.a, ((tk) obj).a);
    }

    public final int hashCode() {
        uk ukVar = this.a;
        if (ukVar == null) {
            return 0;
        }
        return ukVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationsAsRead=" + this.a + ")";
    }
}
