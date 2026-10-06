package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rj implements aaShadow.m0 {
    public final tj a;

    public rj(tj tjVar) {
        this.a = tjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rj) && k71.k.b(this.a, ((rj) obj).a);
    }

    public final int hashCode() {
        tj tjVar = this.a;
        if (tjVar == null) {
            return 0;
        }
        return tjVar.hashCode();
    }

    public final String toString() {
        return "Data(mergePullRequest=" + this.a + ")";
    }
}
