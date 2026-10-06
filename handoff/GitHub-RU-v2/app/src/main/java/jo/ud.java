package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ud {
    public rd a;
    public vd b;

    public ud(rd rdVar, vd vdVar) {
        this.a = rdVar;
        this.b = vdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        return k71.k.b(this.a, udVar.a) && k71.k.b(this.b, udVar.b);
    }

    public final int hashCode() {
        rd rdVar = this.a;
        int hashCode = (rdVar == null ? 0 : rdVar.hashCode()) * 31;
        vd vdVar = this.b;
        return hashCode + (vdVar != null ? vdVar.hashCode() : 0);
    }

    public final String toString() {
        return "EnablePullRequestAutoMerge(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
    public Object b = null;
}
