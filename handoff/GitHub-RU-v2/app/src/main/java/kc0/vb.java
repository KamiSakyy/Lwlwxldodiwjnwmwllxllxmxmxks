package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vb implements aaShadow.m0 {
    public final wb a;

    public vb(wb wbVar) {
        this.a = wbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb) && k71.k.b(this.a, ((vb) obj).a);
    }

    public final int hashCode() {
        wb wbVar = this.a;
        if (wbVar == null) {
            return 0;
        }
        return wbVar.hashCode();
    }

    public final String toString() {
        return "Data(dismissPullRequestReview=" + this.a + ")";
    }
}
