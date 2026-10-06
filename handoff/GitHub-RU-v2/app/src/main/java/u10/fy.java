package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fy implements aaShadow.v0 {
    public jy a;

    public fy(jy jyVar) {
        this.a = jyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fy) && k71.k.b(this.a, ((fy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(search=" + this.a + ")";
    }
}
