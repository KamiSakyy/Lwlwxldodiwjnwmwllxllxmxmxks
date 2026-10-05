package lz0;

import aa.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements m0 {
    public final z a;

    public y(z zVar) {
        this.a = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && k71.k.b(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        z zVar = this.a;
        if (zVar == null) {
            return 0;
        }
        return zVar.hashCode();
    }

    public final String toString() {
        return "Data(rejectMobileAuthDeviceRequest=" + this.a + ")";
    }
}
