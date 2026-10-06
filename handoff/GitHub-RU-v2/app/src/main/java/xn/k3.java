package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k3 {
    public List a;
    public boolean b;

    public k3(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return k71.k.b(this.a, k3Var.a) && this.b == k3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionEvents(events=" + this.a + ", hasFinishedBackfill=" + this.b + ")";
    }
}
