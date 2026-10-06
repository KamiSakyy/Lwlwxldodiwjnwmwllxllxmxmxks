package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public boolean a;

    public e0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && this.a == ((e0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsReviewRequests=", ")", this.a);
    }
}
