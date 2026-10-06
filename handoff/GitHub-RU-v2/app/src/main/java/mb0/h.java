package mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public boolean a;

    public h(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsAssignments=", ")", this.a);
    }
}
