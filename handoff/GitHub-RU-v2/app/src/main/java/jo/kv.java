package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kv implements aa.m0 {
    public final nv a;

    public kv(nv nvVar) {
        this.a = nvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv) && k71.k.b(this.a, ((kv) obj).a);
    }

    public final int hashCode() {
        nv nvVar = this.a;
        if (nvVar == null) {
            return 0;
        }
        return nvVar.hashCode();
    }

    public final String toString() {
        return "Data(removeReaction=" + this.a + ")";
    }
}
