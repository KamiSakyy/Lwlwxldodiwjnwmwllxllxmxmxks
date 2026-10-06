package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x implements aa.m0 {
    public final z a;

    public x(z zVar) {
        this.a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && k71.k.b(this.a, ((x) obj).a);
    }

    public final int hashCode() {
        z zVar = this.a;
        if (zVar == null) {
            return 0;
        }
        return zVar.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
