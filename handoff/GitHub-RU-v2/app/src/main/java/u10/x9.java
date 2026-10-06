package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x9 implements aaShadow.v0 {
    public aaShadow a;

    public x9(aaShadow aaVar) {
        this.a = aaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x9) && k71.k.b(this.a, ((x9) obj).a);
    }

    public final int hashCode() {
        aaShadow aaVar = this.a;
        if (aaVar == null) {
            return 0;
        }
        return aaVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
