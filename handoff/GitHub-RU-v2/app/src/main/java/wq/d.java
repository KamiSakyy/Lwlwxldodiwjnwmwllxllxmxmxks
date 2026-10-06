package wq;

import m10.b4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public b4 a;

    public d(b4 b4Var) {
        this.a = b4Var;
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
