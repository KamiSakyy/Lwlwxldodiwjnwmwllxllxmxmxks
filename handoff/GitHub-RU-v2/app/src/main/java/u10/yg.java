package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yg implements aaShadow.m0 {
    public zg a;

    public yg(zg zgVar) {
        this.a = zgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg) && k71.k.b(this.a, ((yg) obj).a);
    }

    public final int hashCode() {
        zg zgVar = this.a;
        if (zgVar == null) {
            return 0;
        }
        return zgVar.hashCode();
    }

    public final String toString() {
        return "Data(markNotificationAsRead=" + this.a + ")";
    }
}
