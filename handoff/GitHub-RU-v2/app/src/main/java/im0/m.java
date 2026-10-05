package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements aa.m0 {
    public final o a;

    public m(o oVar) {
        this.a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && k71.k.b(this.a, ((m) obj).a);
    }

    public final int hashCode() {
        o oVar = this.a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
