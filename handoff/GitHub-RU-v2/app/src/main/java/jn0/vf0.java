package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vf0 {
    public int a;

    public vf0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf0) && this.a == ((vf0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("NotificationThreads(totalCount=", this.a, ")");
    }
}
