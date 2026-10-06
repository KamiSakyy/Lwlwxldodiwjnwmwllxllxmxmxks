package mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public boolean a;
    public boolean b;

    public t(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MobilePushNotificationSettings(getsCiFailedOnly=" + this.a + ", getsCiActivity=" + this.b + ")";
    }
}
