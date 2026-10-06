package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bb implements aaShadow.v0 {
    public cb a;

    public bb(cb cbVar) {
        this.a = cbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb) && k71.k.b(this.a, ((bb) obj).a);
    }

    public final int hashCode() {
        cb cbVar = this.a;
        if (cbVar == null) {
            return 0;
        }
        return cbVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
