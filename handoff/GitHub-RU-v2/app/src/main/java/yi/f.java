package yi;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements k, l {
    public final int a;

    public f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return s0.i("AliveProjectItemCreatedMessage(itemId=", this.a, ")");
    }
}
