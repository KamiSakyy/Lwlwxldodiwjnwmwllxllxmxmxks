package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dh implements aa.m0 {
    public final ch a;

    public dh(ch chVar) {
        this.a = chVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh) && k71.k.b(this.a, ((dh) obj).a);
    }

    public final int hashCode() {
        ch chVar = this.a;
        if (chVar == null) {
            return 0;
        }
        return chVar.hashCode();
    }

    public final String toString() {
        return "Data(createSavedNotificationThread=" + this.a + ")";
    }
}
