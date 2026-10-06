package i01;

import k71.k;
import yz0.j3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final j3 a;
    public final int b;

    public c(j3 j3Var, int i) {
        this.a = j3Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && this.b == cVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MergeQueueListEntry(pullRequest=" + this.a + ", position=" + this.b + ")";
    }
}
