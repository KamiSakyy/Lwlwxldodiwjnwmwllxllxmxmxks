package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 {
    public boolean a;

    public f0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.a == ((f0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsDeploymentRequests=", ")", this.a);
    }
}
