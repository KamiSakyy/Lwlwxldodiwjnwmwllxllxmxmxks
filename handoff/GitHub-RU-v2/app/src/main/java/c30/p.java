package c30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public final l a;
    public final String b;

    public p(l lVar, String str) {
        this.a = lVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b);
    }

    public final int hashCode() {
        l lVar = this.a;
        return this.b.hashCode() + ((lVar == null ? 0 : lVar.hashCode()) * 31);
    }

    public final String toString() {
        return "OnCommit(file=" + this.a + ", id=" + this.b + ")";
    }
}
