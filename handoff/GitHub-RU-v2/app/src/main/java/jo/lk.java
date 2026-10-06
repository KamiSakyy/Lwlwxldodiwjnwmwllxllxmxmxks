package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lk implements aaShadow.m0 {
    public mk a;

    public lk(mk mkVar) {
        this.a = mkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lk) && k71.k.b(this.a, ((lk) obj).a);
    }

    public final int hashCode() {
        mk mkVar = this.a;
        if (mkVar == null) {
            return 0;
        }
        return mkVar.hashCode();
    }

    public final String toString() {
        return "Data(markFileAsViewed=" + this.a + ")";
    }
}
