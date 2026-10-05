package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ra implements aa.v0 {
    public final ta a;

    public ra(ta taVar) {
        this.a = taVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ra) && k71.k.b(this.a, ((ra) obj).a);
    }

    public final int hashCode() {
        ta taVar = this.a;
        if (taVar == null) {
            return 0;
        }
        return taVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
