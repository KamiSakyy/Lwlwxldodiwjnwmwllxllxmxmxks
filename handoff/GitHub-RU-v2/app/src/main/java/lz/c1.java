package lz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 {
    public final int a;

    public c1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && this.a == ((c1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("Inbox(totalCount=", this.a, ")");
    }
}
