package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v90 {
    public final int a;

    public v90(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v90) && this.a == ((v90) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("NotificationThreads(totalCount=", this.a, ")");
    }
}
