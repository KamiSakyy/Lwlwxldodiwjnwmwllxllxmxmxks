package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mt implements aaShadow.v0 {
    public final nt a;

    public mt(nt ntVar) {
        this.a = ntVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt) && k71.k.b(this.a, ((mt) obj).a);
    }

    public final int hashCode() {
        nt ntVar = this.a;
        if (ntVar == null) {
            return 0;
        }
        return ntVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
