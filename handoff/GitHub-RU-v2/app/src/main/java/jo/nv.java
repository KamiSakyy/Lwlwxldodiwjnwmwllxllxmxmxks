package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nv {
    public final ov a;
    public final mv b;

    public nv(ov ovVar, mv mvVar) {
        this.a = ovVar;
        this.b = mvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv)) {
            return false;
        }
        nv nvVar = (nv) obj;
        return k71.k.b(this.a, nvVar.a) && k71.k.b(this.b, nvVar.b);
    }

    public final int hashCode() {
        ov ovVar = this.a;
        int hashCode = (ovVar == null ? 0 : ovVar.hashCode()) * 31;
        mv mvVar = this.b;
        return hashCode + (mvVar != null ? mvVar.hashCode() : 0);
    }

    public final String toString() {
        return "RemoveReaction(subject=" + this.a + ", reaction=" + this.b + ")";
    }





}
