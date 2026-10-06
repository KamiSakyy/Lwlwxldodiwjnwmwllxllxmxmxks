package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ru implements aaShadow.v0 {
    public uu a;

    public ru(uu uuVar) {
        this.a = uuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru) && k71.k.b(this.a, ((ru) obj).a);
    }

    public final int hashCode() {
        uu uuVar = this.a;
        if (uuVar == null) {
            return 0;
        }
        return uuVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
