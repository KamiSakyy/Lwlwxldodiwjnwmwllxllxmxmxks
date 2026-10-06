package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gb {
    public cb a;
    public hb b;

    public gb(cb cbVar, hb hbVar) {
        this.a = cbVar;
        this.b = hbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return k71.k.b(this.a, gbVar.a) && k71.k.b(this.b, gbVar.b);
    }

    public final int hashCode() {
        cb cbVar = this.a;
        int hashCode = (cbVar == null ? 0 : cbVar.hashCode()) * 31;
        hb hbVar = this.b;
        return hashCode + (hbVar != null ? hbVar.hashCode() : 0);
    }

    public final String toString() {
        return "DisablePullRequestAutoMerge(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
