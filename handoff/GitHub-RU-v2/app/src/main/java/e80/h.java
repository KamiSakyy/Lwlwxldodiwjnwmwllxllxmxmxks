package e80;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public int a;

    public h(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return s0.i("Comments(totalCount=", this.a, ")");
    }
}
