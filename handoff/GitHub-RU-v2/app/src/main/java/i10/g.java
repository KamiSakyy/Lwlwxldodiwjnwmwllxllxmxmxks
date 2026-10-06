package i10;

import aa.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements m0 {
    public e a;

    public g(e eVar) {
        this.a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && k71.k.b(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        e eVar = this.a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "Data(approveMobileAuthDeviceRequest=" + this.a + ")";
    }
}
