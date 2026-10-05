package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ue implements aa.v0 {
    public final ve a;
    public final hf b;
    public final jf c;
    public final kf d;
    public final gf e;

    public ue(ve veVar, hf hfVar, jf jfVar, kf kfVar, gf gfVar) {
        this.a = veVar;
        this.b = hfVar;
        this.c = jfVar;
        this.d = kfVar;
        this.e = gfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue)) {
            return false;
        }
        ue ueVar = (ue) obj;
        return k71.k.b(this.a, ueVar.a) && k71.k.b(this.b, ueVar.b) && k71.k.b(this.c, ueVar.c) && k71.k.b(this.d, ueVar.d) && k71.k.b(this.e, ueVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Data(issues=" + this.a + ", pullRequests=" + this.b + ", repos=" + this.c + ", users=" + this.d + ", organizations=" + this.e + ")";
    }
}
