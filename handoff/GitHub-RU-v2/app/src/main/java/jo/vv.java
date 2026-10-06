package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vv implements aaShadow.m0 {
    public final wv a;

    public vv(wv wvVar) {
        this.a = wvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vv) && k71.k.b(this.a, ((vv) obj).a);
    }

    public final int hashCode() {
        wv wvVar = this.a;
        if (wvVar == null) {
            return 0;
        }
        return wvVar.hashCode();
    }

    public final String toString() {
        return "Data(removeStar=" + this.a + ")";
    }
}
