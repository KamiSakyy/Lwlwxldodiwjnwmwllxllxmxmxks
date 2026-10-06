package pi0;

import aa.v0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements v0 {
    public final i a;

    public h(i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && k71.k.b(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        i iVar = this.a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
