package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fb implements aa.m0 {
    public final gb a;

    public fb(gb gbVar) {
        this.a = gbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fb) && k71.k.b(this.a, ((fb) obj).a);
    }

    public final int hashCode() {
        gb gbVar = this.a;
        if (gbVar == null) {
            return 0;
        }
        return gbVar.hashCode();
    }

    public final String toString() {
        return "Data(disablePullRequestAutoMerge=" + this.a + ")";
    }
}
