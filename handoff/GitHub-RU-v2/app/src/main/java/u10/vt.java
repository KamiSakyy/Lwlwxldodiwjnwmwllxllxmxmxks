package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vt implements aaShadow.v0 {
    public au a;

    public vt(au auVar) {
        this.a = auVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt) && k71.k.b(this.a, ((vt) obj).a);
    }

    public final int hashCode() {
        au auVar = this.a;
        if (auVar == null) {
            return 0;
        }
        return auVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
