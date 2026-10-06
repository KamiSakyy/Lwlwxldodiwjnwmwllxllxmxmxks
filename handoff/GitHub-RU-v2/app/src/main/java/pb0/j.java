package pb0;

import aa.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements m0 {
    public l a;

    public j(l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k71.k.b(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Data(updateRepository=" + this.a + ")";
    }
}
