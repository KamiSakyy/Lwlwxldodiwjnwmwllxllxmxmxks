package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qx implements aaShadow.v0 {
    public ux a;

    public qx(ux uxVar) {
        this.a = uxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qx) && k71.k.b(this.a, ((qx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(search=" + this.a + ")";
    }
}
