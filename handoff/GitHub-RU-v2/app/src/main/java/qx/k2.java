package qx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k2 {
    public boolean a;
    public boolean b;

    public k2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.a == k2Var.a && this.b == k2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NotificationSettings(getsParticipatingWeb=" + this.a + ", getsWatchingWeb=" + this.b + ")";
    }
}
