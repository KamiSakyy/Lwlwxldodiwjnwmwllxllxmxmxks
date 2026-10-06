package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class iv implements aaShadow.v0 {
    public final mv a;

    public iv(mv mvVar) {
        this.a = mvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv) && k71.k.b(this.a, ((iv) obj).a);
    }

    public final int hashCode() {
        mv mvVar = this.a;
        if (mvVar == null) {
            return 0;
        }
        return mvVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
