package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ji0 {
    public int a;

    public ji0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji0) && this.a == ((ji0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("NotificationThreads(totalCount=", this.a, ")");
    }
}
