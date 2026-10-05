package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jx implements aa.v0 {
    public final nx a;

    public jx(nx nxVar) {
        this.a = nxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx) && k71.k.b(this.a, ((jx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(search=" + this.a + ")";
    }
}
