package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ek implements aaShadow.m0 {
    public fk a;

    public ek(fk fkVar) {
        this.a = fkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ek) && k71.k.b(this.a, ((ek) obj).a);
    }

    public final int hashCode() {
        fk fkVar = this.a;
        if (fkVar == null) {
            return 0;
        }
        return fkVar.hashCode();
    }

    public final String toString() {
        return "Data(minimizeComment=" + this.a + ")";
    }
}
