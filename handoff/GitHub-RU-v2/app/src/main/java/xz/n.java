package xz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public final String a;
    public final m b;
    public final f00.b0 c;

    public n(String str, m mVar, f00.b0 b0Var) {
        this.a = str;
        this.b = mVar;
        this.c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && k71.k.b(this.c, nVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m mVar = this.b;
        return this.c.hashCode() + ((hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", item=" + this.b + ", projectV2ItemSortValuesFragment=" + this.c + ")";
    }
}
