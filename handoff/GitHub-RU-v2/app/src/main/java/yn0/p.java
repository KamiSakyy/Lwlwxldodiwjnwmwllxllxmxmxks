package yn0;

import aa.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements m0 {
    public final q a;

    public p(q qVar) {
        this.a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && k71.k.b(this.a, ((p) obj).a);
    }

    public final int hashCode() {
        q qVar = this.a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public final String toString() {
        return "Data(rerunCheckSuiteMobile=" + this.a + ")";
    }
}
