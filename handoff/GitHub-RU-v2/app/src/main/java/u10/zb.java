package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zb implements aaShadow.v0 {
    public final ac a;

    public zb(ac acVar) {
        this.a = acVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb) && k71.k.b(this.a, ((zb) obj).a);
    }

    public final int hashCode() {
        ac acVar = this.a;
        if (acVar == null) {
            return 0;
        }
        return acVar.hashCode();
    }

    public final String toString() {
        return "Data(enterpriseSupportContact=" + this.a + ")";
    }
}
