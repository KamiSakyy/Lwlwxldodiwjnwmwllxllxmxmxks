package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public class s implements aa.m0 {
    public u a;

    public s(u uVar) {
        this.a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && k71.k.b(this.a, ((s) obj).a);
    }

    public final int hashCode() {
        u uVar = this.a;
        if (uVar == null) {
            return 0;
        }
        return uVar.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
