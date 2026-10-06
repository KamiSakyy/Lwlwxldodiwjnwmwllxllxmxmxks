package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 {
    public boolean a;

    public x0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && this.a == ((x0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsReleases=", ")", this.a);
    }
}
