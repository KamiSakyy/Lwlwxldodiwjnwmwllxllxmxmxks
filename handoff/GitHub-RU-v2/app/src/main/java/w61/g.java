package w61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements Comparable {
    public static final g s = new g();
    public final int r = 131605;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        k71.k.g(gVar, "other");
        return this.r - gVar.r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        g gVar = obj instanceof g ? (g) obj : null;
        return gVar != null && this.r == gVar.r;
    }

    public final int hashCode() {
        return this.r;
    }

    public final String toString() {
        return "2.2.21";
    }
}
