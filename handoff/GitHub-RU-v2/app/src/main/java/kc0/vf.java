package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vf implements aaShadow.v0 {
    public wf a;
    public kg b;
    public lg c;
    public mg d;
    public ig e;
    public tf f;

    public vf(wf wfVar, kg kgVar, lg lgVar, mg mgVar, ig igVar, tf tfVar) {
        this.a = wfVar;
        this.b = kgVar;
        this.c = lgVar;
        this.d = mgVar;
        this.e = igVar;
        this.f = tfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) obj;
        return k71.k.b(this.a, vfVar.a) && k71.k.b(this.b, vfVar.b) && k71.k.b(this.c, vfVar.c) && k71.k.b(this.d, vfVar.d) && k71.k.b(this.e, vfVar.e) && k71.k.b(this.f, vfVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        tf tfVar = this.f;
        return hashCode + (tfVar == null ? 0 : tfVar.hashCode());
    }

    public final String toString() {
        return "Data(issues=" + this.a + ", pullRequests=" + this.b + ", repos=" + this.c + ", users=" + this.d + ", organizations=" + this.e + ", code=" + this.f + ")";
    }
}
