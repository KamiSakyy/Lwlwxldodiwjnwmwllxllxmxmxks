package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ng implements aa.m0 {
    public final og a;

    public ng(og ogVar) {
        this.a = ogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng) && k71.k.b(this.a, ((ng) obj).a);
    }

    public final int hashCode() {
        og ogVar = this.a;
        if (ogVar == null) {
            return 0;
        }
        return ogVar.hashCode();
    }

    public final String toString() {
        return "Data(markFileAsViewed=" + this.a + ")";
    }
}
