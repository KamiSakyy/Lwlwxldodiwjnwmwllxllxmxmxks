package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fw implements aaShadow.v0 {
    public final gw a;

    public fw(gw gwVar) {
        this.a = gwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fw) && k71.k.b(this.a, ((fw) obj).a);
    }

    public final int hashCode() {
        gw gwVar = this.a;
        if (gwVar == null) {
            return 0;
        }
        return gwVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
