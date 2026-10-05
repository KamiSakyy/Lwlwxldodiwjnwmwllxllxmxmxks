package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tl {
    public final boolean a;

    public tl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl) && this.a == ((tl) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("NotificationSettings(getsDirectMentionMobilePush=", ")", this.a);
    }
}
