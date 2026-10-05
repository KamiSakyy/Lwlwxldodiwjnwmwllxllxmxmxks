package vz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public final String a;
    public final xz.p b;

    public l(String str, xz.p pVar) {
        this.a = str;
        this.b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Items(__typename=" + this.a + ", projectV2GroupItemsFragment=" + this.b + ")";
    }
}
