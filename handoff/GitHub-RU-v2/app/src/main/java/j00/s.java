package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s {
    public boolean a;

    public s(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.a == ((s) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("MobilePushNotificationSettings(getsCiFailedOnly=", ")", this.a);
    }
}
