package ko;

import mo.h0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public final String a;
    public final h0 b;

    public j(String str, h0 h0Var) {
        this.a = str;
        this.b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UnlockingModel(__typename=" + this.a + ", unlockingModelFragment=" + this.b + ")";
    }
}
