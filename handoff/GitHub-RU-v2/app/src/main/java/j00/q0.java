package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 {
    public boolean a;

    public q0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.a == ((q0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsDirectMentions=", ")", this.a);
    }
}
