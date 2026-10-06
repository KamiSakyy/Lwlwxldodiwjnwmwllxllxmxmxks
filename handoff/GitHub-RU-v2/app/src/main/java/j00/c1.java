package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 {
    public boolean a;

    public c1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && this.a == ((c1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsPullRequestReviews=", ")", this.a);
    }
}
