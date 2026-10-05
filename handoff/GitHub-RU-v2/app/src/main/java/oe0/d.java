package oe0;

import gn0.r2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final r2 a;

    public d(r2 r2Var) {
        this.a = r2Var;
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
