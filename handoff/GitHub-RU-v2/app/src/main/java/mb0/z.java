package mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public final boolean a;

    public z(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.a == ((z) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsReviewRequests=", ")", this.a);
    }
}
