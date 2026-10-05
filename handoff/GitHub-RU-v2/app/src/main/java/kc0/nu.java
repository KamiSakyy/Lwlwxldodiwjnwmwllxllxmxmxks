package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nu implements aa.v0 {
    public final wu a;

    public nu(wu wuVar) {
        this.a = wuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nu) && k71.k.b(this.a, ((nu) obj).a);
    }

    public final int hashCode() {
        wu wuVar = this.a;
        if (wuVar == null) {
            return 0;
        }
        return wuVar.hashCode();
    }

    public final String toString() {
        return "Data(repositoryOwner=" + this.a + ")";
    }
}
