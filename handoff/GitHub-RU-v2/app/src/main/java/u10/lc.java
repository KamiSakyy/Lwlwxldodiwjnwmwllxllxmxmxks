package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lc implements aaShadow.v0 {
    public sc a;

    public lc(sc scVar) {
        this.a = scVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc) && k71.k.b(this.a, ((lc) obj).a);
    }

    public final int hashCode() {
        sc scVar = this.a;
        if (scVar == null) {
            return 0;
        }
        return scVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
