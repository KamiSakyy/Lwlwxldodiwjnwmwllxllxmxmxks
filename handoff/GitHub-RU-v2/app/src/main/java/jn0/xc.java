package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xc {
    public uc a;
    public yc b;

    public xc(uc ucVar, yc ycVar) {
        this.a = ucVar;
        this.b = ycVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc)) {
            return false;
        }
        xc xcVar = (xc) obj;
        return k71.k.b(this.a, xcVar.a) && k71.k.b(this.b, xcVar.b);
    }

    public final int hashCode() {
        uc ucVar = this.a;
        int hashCode = (ucVar == null ? 0 : ucVar.hashCode()) * 31;
        yc ycVar = this.b;
        return hashCode + (ycVar != null ? ycVar.hashCode() : 0);
    }

    public final String toString() {
        return "EnablePullRequestAutoMerge(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
