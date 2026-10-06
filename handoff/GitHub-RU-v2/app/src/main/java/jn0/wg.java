package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wg implements aaShadow.m0 {
    public xg a;

    public wg(xg xgVar) {
        this.a = xgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg) && k71.k.b(this.a, ((wg) obj).a);
    }

    public final int hashCode() {
        xg xgVar = this.a;
        if (xgVar == null) {
            return 0;
        }
        return xgVar.hashCode();
    }

    public final String toString() {
        return "Data(followUser=" + this.a + ")";
    }
}
