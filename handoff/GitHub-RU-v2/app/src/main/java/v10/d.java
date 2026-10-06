package v10;

import aa.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements v0 {
    public k a;

    public d(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k71.k.b(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ")";
    }
}
