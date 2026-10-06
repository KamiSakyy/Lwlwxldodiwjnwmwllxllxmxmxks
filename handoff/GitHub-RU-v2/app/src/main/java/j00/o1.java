package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 {
    public boolean a;

    public o1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1) && this.a == ((o1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(scheduledNotifications=", ")", this.a);
    }
}
