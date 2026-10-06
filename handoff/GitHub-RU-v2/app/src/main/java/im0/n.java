package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public boolean a;

    public n(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.a == ((n) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsCiFailedOnly=", ")", this.a);
    }
}
