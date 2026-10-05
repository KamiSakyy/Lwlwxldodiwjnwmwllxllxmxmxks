package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rx implements aa.v0 {
    public final vx a;

    public rx(vx vxVar) {
        this.a = vxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx) && k71.k.b(this.a, ((rx) obj).a);
    }

    public final int hashCode() {
        vx vxVar = this.a;
        if (vxVar == null) {
            return 0;
        }
        return vxVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
