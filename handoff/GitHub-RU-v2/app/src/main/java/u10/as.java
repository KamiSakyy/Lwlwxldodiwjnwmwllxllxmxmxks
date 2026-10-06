package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class as implements aaShadow.v0 {
    public final ds a;

    public as(ds dsVar) {
        this.a = dsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as) && k71.k.b(this.a, ((as) obj).a);
    }

    public final int hashCode() {
        ds dsVar = this.a;
        if (dsVar == null) {
            return 0;
        }
        return dsVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
