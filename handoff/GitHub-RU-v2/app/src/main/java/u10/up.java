package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class up implements aaShadow.v0 {
    public zp a;

    public up(zp zpVar) {
        this.a = zpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof up) && k71.k.b(this.a, ((up) obj).a);
    }

    public final int hashCode() {
        zp zpVar = this.a;
        if (zpVar == null) {
            return 0;
        }
        return zpVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
