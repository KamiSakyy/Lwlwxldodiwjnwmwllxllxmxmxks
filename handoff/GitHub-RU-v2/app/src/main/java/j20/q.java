package j20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public n a;

    public q(n nVar) {
        this.a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && k71.k.b(this.a, ((q) obj).a);
    }

    public final int hashCode() {
        n nVar = this.a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public final String toString() {
        return "RerunCheckSuiteMobile(checkSuite=" + this.a + ")";
    }
}
