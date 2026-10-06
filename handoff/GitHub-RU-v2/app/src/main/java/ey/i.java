package ey;

import m10.v90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public int a;
    public v90 b;

    public i(int i, v90 v90Var) {
        this.a = i;
        this.b = v90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Summary(count=" + this.a + ", state=" + this.b + ")";
    }
}
