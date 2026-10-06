package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uk implements aaShadow.v0 {
    public final wk a;

    public uk(wk wkVar) {
        this.a = wkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uk) && k71.k.b(this.a, ((uk) obj).a);
    }

    public final int hashCode() {
        wk wkVar = this.a;
        if (wkVar == null) {
            return 0;
        }
        return wkVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
