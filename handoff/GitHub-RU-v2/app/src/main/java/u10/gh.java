package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gh implements aa.m0 {
    public final hh a;

    public gh(hh hhVar) {
        this.a = hhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh) && k71.k.b(this.a, ((gh) obj).a);
    }

    public final int hashCode() {
        hh hhVar = this.a;
        if (hhVar == null) {
            return 0;
        }
        return hhVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsUndone=" + this.a + ")";
    }
}
