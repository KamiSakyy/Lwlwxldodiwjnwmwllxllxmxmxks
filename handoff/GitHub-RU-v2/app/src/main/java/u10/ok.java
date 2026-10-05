package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ok implements aa.v0 {
    public final qk a;

    public ok(qk qkVar) {
        this.a = qkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok) && k71.k.b(this.a, ((ok) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
