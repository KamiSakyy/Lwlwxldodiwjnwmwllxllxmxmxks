package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lj implements aa.v0 {
    public final mj a;

    public lj(mj mjVar) {
        this.a = mjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lj) && k71.k.b(this.a, ((lj) obj).a);
    }

    public final int hashCode() {
        mj mjVar = this.a;
        if (mjVar == null) {
            return 0;
        }
        return mjVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
