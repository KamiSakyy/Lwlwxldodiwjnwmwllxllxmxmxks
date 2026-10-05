package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sj implements aa.m0 {
    public final rj a;

    public sj(rj rjVar) {
        this.a = rjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj) && k71.k.b(this.a, ((sj) obj).a);
    }

    public final int hashCode() {
        rj rjVar = this.a;
        if (rjVar == null) {
            return 0;
        }
        return rjVar.hashCode();
    }

    public final String toString() {
        return "Data(createGoogleIapSubscription=" + this.a + ")";
    }
}
