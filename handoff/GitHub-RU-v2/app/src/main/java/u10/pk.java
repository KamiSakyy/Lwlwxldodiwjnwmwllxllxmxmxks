package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pk {
    public boolean a;

    public pk(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pk) && this.a == ((pk) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("NotificationSettings(getsDirectMentionMobilePush=", ")", this.a);
    }
}
