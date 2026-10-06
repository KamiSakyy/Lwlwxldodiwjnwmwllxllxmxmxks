package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y {
    public final boolean a;
    public final boolean b;

    public y(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && this.b == yVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MobilePushNotificationSettings(getsCiFailedOnly=" + this.a + ", getsCiActivity=" + this.b + ")";
    }
}
