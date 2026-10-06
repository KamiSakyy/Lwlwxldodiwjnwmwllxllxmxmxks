package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kn {
    public boolean a;

    public kn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn) && this.a == ((kn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("NotificationSettings(getsDirectMentionMobilePush=", ")", this.a);
    }
}
