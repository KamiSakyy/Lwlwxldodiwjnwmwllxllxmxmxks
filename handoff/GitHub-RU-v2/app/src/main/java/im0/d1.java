package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 {
    public final boolean a;

    public d1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && this.a == ((d1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(scheduledNotifications=", ")", this.a);
    }
}
