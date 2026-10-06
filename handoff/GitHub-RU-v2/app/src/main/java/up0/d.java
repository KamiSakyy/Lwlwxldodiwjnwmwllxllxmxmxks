package up0;

import pz0.e3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public e3 a;

    public d(e3 e3Var) {
        this.a = e3Var;
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
