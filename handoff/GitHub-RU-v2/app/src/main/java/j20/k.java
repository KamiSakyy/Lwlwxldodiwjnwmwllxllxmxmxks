package j20;

import aa.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements m0 {
    public final l a;

    public k(l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && k71.k.b(this.a, ((k) obj).a);
    }

    public final int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Data(rerunCheckRunMobile=" + this.a + ")";
    }
}
