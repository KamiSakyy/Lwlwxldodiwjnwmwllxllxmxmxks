package p01;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public static final h Companion = new h();
    public static final i c;
    public g a;
    public boolean b;

    static {
        g.Companion.getClass();
        c = new i(g.e, false);
    }

    public i(g gVar, boolean z) {
        k71.k.g(gVar, "ref");
        this.a = gVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && this.b == iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RefWithRepoPermissions(ref=" + this.a + ", viewerCanPush=" + this.b + ")";
    }
}
