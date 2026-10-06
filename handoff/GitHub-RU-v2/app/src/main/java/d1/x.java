package d1;

/* loaded from: /home/user/work/p/classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public w f21263a;

    /* renamed from: b, reason: collision with root package name */
    public w f21264b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21265c;

    public x(w wVar, w wVar2, boolean z10) {
        this.f21263a = wVar;
        this.f21264b = wVar2;
        this.f21265c = z10;
    }

    public static x a(x xVar, w wVar, w wVar2, boolean z10, int i) {
        if ((i & 1) != 0) {
            wVar = xVar.f21263a;
        }
        if ((i & 2) != 0) {
            wVar2 = xVar.f21264b;
        }
        if ((i & 4) != 0) {
            z10 = xVar.f21265c;
        }
        xVar.getClass();
        return new x(wVar, wVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.f21263a, xVar.f21263a) && k71.k.b(this.f21264b, xVar.f21264b) && this.f21265c == xVar.f21265c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21265c) + ((this.f21264b.hashCode() + (this.f21263a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f21263a + ", end=" + this.f21264b + ", handlesCrossed=" + this.f21265c + ')';
    }
}
