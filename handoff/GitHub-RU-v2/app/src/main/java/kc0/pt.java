package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pt {
    public int a;

    public pt(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pt) && this.a == ((pt) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a0.s0.i("EntriesCount(totalCount=", this.a, ")");
    }
}
