package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xw implements aa.v0 {
    public final fx a;
    public final gx b;

    public xw(fx fxVar, gx gxVar) {
        this.a = fxVar;
        this.b = gxVar;
    }

    public static xw a(xw xwVar, fx fxVar, gx gxVar, int i) {
        if ((i & 1) != 0) {
            fxVar = xwVar.a;
        }
        if ((i & 2) != 0) {
            gxVar = xwVar.b;
        }
        xwVar.getClass();
        return new xw(fxVar, gxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        return k71.k.b(this.a, xwVar.a) && k71.k.b(this.b, xwVar.b);
    }

    public final int hashCode() {
        fx fxVar = this.a;
        return this.b.hashCode() + ((fxVar == null ? 0 : fxVar.hashCode()) * 31);
    }

    public final String toString() {
        return "Data(repository=" + this.a + ", search=" + this.b + ")";
    }
}
