package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sh implements aaShadow.m0 {
    public th a;

    public sh(th thVar) {
        this.a = thVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sh) && k71.k.b(this.a, ((sh) obj).a);
    }

    public final int hashCode() {
        th thVar = this.a;
        if (thVar == null) {
            return 0;
        }
        return thVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationSubjectAsRead=" + this.a + ")";
    }
}
