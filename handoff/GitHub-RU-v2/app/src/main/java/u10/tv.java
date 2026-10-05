package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tv implements aa.v0 {
    public final xv a;

    public tv(xv xvVar) {
        this.a = xvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv) && k71.k.b(this.a, ((tv) obj).a);
    }

    public final int hashCode() {
        xv xvVar = this.a;
        if (xvVar == null) {
            return 0;
        }
        return xvVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
