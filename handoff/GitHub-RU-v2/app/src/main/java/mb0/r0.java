package mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 {
    public final boolean a;

    public r0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.a == ((r0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsPullRequestReviews=", ")", this.a);
    }
}
