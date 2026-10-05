package p41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final o a;
    public final boolean b;

    public h(o oVar, boolean z) {
        this.a = oVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.a.equals(this.a) && hVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
