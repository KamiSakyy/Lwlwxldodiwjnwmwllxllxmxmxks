package y30;

import hc0.p2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public p2 a;

    public d(p2 p2Var) {
        this.a = p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnCheckStep(status=" + this.a + ")";
    }
}
