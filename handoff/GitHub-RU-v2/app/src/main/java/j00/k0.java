package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    public final boolean a;

    public k0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && this.a == ((k0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsDeploymentRequests=", ")", this.a);
    }
}
