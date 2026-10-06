package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zv {
    public int a;

    public zv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv) && this.a == ((zv) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("EntriesCount(totalCount=", this.a, ")");
    }
}
