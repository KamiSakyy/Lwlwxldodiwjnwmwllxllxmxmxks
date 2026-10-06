package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vb0 {
    public final int a;

    public vb0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb0) && this.a == ((vb0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("NotificationThreads(totalCount=", this.a, ")");
    }
}
