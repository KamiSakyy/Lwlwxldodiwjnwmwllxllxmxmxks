package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vb {
    public final sb a;
    public final wb b;

    public vb(sb sbVar, wb wbVar) {
        this.a = sbVar;
        this.b = wbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb)) {
            return false;
        }
        vb vbVar = (vb) obj;
        return k71.k.b(this.a, vbVar.a) && k71.k.b(this.b, vbVar.b);
    }

    public final int hashCode() {
        sb sbVar = this.a;
        int hashCode = (sbVar == null ? 0 : sbVar.hashCode()) * 31;
        wb wbVar = this.b;
        return hashCode + (wbVar != null ? wbVar.hashCode() : 0);
    }

    public final String toString() {
        return "EnablePullRequestAutoMerge(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
    public Object b = null;
}
