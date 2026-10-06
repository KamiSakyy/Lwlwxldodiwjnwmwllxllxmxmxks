package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.m0 {
    public t a;

    public r(t tVar) {
        this.a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && k71.k.b(this.a, ((r) obj).a);
    }

    public final int hashCode() {
        t tVar = this.a;
        if (tVar == null) {
            return 0;
        }
        return tVar.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
