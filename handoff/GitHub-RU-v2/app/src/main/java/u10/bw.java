package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bw {
    public String a;
    public v70.d b;

    public bw(String str, v70.d dVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return k71.k.b(this.a, bwVar.a) && k71.k.b(this.b, bwVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v70.d dVar = this.b;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "Owner(__typename=" + this.a + ", projectOwnerFragment=" + this.b + ")";
    }
}
