package ly;

import aa.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements m0 {
    public final h a;

    public g(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && k71.k.b(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        h hVar = this.a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteUserList=" + this.a + ")";
    }
}
