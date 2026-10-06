package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qi implements aaShadow.m0 {
    public final ri a;

    public qi(ri riVar) {
        this.a = riVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qi) && k71.k.b(this.a, ((qi) obj).a);
    }

    public final int hashCode() {
        ri riVar = this.a;
        if (riVar == null) {
            return 0;
        }
        return riVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteSavedNotificationThread=" + this.a + ")";
    }
}
