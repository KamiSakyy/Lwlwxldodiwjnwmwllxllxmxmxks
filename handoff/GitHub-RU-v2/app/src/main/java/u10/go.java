package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class go implements aaShadow.m0 {
    public final io a;

    public go(io ioVar) {
        this.a = ioVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go) && k71.k.b(this.a, ((go) obj).a);
    }

    public final int hashCode() {
        io ioVar = this.a;
        if (ioVar == null) {
            return 0;
        }
        return ioVar.hashCode();
    }

    public final String toString() {
        return "Data(rejectDeployments=" + this.a + ")";
    }
}
