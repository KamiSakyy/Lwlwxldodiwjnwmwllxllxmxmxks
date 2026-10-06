package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 {
    public boolean a;

    public i1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && this.a == ((i1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsReleases=", ")", this.a);
    }
}
