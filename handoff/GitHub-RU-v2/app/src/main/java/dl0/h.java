package dl0;

import aa.v0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements v0 {
    public j a;
    public i b;

    public h(j jVar, i iVar) {
        this.a = jVar;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        return hashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ", repository=" + this.b + ")";
    }
}
