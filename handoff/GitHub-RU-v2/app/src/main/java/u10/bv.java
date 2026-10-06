package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bv implements aaShadow.v0 {
    public fv a;

    public bv(fv fvVar) {
        this.a = fvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bv) && k71.k.b(this.a, ((bv) obj).a);
    }

    public final int hashCode() {
        fv fvVar = this.a;
        if (fvVar == null) {
            return 0;
        }
        return fvVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
