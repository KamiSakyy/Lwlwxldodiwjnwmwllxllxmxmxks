package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cz implements aaShadow.v0 {
    public gz a;

    public cz(gz gzVar) {
        this.a = gzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz) && k71.k.b(this.a, ((cz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
