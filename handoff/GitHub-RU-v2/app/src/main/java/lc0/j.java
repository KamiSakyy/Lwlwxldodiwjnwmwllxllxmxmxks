package lc0;

import nc0.g0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public final String a;
    public final g0 b;

    public j(String str, g0 g0Var) {
        this.a = str;
        this.b = g0Var;
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
