package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements aa.m0 {
    public n a;

    public l(n nVar) {
        this.a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && k71.k.b(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        n nVar = this.a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
