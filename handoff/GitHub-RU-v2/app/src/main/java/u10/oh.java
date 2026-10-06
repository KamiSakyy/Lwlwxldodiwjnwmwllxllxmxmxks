package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oh implements aaShadow.m0 {
    public ph a;

    public oh(ph phVar) {
        this.a = phVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh) && k71.k.b(this.a, ((oh) obj).a);
    }

    public final int hashCode() {
        ph phVar = this.a;
        if (phVar == null) {
            return 0;
        }
        return phVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteSavedNotificationThread=" + this.a + ")";
    }
}
