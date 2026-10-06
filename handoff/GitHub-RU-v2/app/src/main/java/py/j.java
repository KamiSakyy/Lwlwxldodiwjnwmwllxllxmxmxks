package py;

import aa.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements m0 {
    public final k a;

    public j(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k71.k.b(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public final String toString() {
        return "Data(enqueuePullRequest=" + this.a + ")";
    }
}
