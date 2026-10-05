package yo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public final i a;

    public l(i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && k71.k.b(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        i iVar = this.a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "RerunCheckRunMobile(checkSuite=" + this.a + ")";
    }
}
