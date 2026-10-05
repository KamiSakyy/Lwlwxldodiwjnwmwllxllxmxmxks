package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements aa.m0 {
    public final f a;

    public i(f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && k71.k.b(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        f fVar = this.a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public final String toString() {
        return "Data(addComment=" + this.a + ")";
    }
}
