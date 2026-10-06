package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dp {
    public boolean a;

    public dp(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp) && this.a == ((dp) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("NotificationSettings(getsDirectMentionMobilePush=", ")", this.a);
    }
}
