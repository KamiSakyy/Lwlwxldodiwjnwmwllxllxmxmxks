package mg0;

import a0.s0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final int a;

    public a(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return s0.i("Comments(totalCount=", this.a, ")");
    }
}
