package bu;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public int a;

    public l(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.a == ((l) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return s0.i("Entries(totalCount=", this.a, ")");
    }
}
