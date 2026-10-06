package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class he {
    public String a;
    public fe b;

    public he(String str, fe feVar) {
        this.a = str;
        this.b = feVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he)) {
            return false;
        }
        he heVar = (he) obj;
        return k71.k.b(this.a, heVar.a) && k71.k.b(this.b, heVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCommit(id=" + this.a + ", history=" + this.b + ")";
    }
}
