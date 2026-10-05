package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ea implements aa.v0 {
    public final ga a;

    public ea(ga gaVar) {
        this.a = gaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea) && k71.k.b(this.a, ((ea) obj).a);
    }

    public final int hashCode() {
        ga gaVar = this.a;
        if (gaVar == null) {
            return 0;
        }
        return gaVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }



}
