package ea0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i2 {
    public final boolean a;
    public final boolean b;

    public i2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return this.a == i2Var.a && this.b == i2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NotificationSettings(getsParticipatingWeb=" + this.a + ", getsWatchingWeb=" + this.b + ")";
    }
}
