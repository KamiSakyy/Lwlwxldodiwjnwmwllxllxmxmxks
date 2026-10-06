package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rq implements aaShadow.m0 {
    public sq a;

    public rq(sq sqVar) {
        this.a = sqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rq) && k71.k.b(this.a, ((rq) obj).a);
    }

    public final int hashCode() {
        sq sqVar = this.a;
        if (sqVar == null) {
            return 0;
        }
        return sqVar.hashCode();
    }

    public final String toString() {
        return "Data(removeStar=" + this.a + ")";
    }
}
