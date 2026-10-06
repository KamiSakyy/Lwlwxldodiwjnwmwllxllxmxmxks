package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ry implements aaShadow.m0 {
    public ty a;

    public ry(ty tyVar) {
        this.a = tyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ry) && k71.k.b(this.a, ((ry) obj).a);
    }

    public final int hashCode() {
        ty tyVar = this.a;
        if (tyVar == null) {
            return 0;
        }
        return tyVar.hashCode();
    }

    public final String toString() {
        return "Data(setLabelsForLabelable=" + this.a + ")";
    }
}
