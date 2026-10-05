package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ub implements aa.m0 {
    public final vb a;

    public ub(vb vbVar) {
        this.a = vbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub) && k71.k.b(this.a, ((ub) obj).a);
    }

    public final int hashCode() {
        vb vbVar = this.a;
        if (vbVar == null) {
            return 0;
        }
        return vbVar.hashCode();
    }

    public final String toString() {
        return "Data(enablePullRequestAutoMerge=" + this.a + ")";
    }
}
