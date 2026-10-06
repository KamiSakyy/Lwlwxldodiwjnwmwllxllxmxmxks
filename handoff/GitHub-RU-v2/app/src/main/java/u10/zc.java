package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zc implements aaShadow.v0 {
    public final ad a;

    public zc(ad adVar) {
        this.a = adVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc) && k71.k.b(this.a, ((zc) obj).a);
    }

    public final int hashCode() {
        ad adVar = this.a;
        if (adVar == null) {
            return 0;
        }
        return adVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
