package i70;

import aa.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements m0 {
    public final c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k.b(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        c cVar = this.a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "Data(followOrganization=" + this.a + ")";
    }
}
