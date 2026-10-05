package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ix {
    public final String a;
    public final String b;

    public ix(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix)) {
            return false;
        }
        ix ixVar = (ix) obj;
        return k71.k.b(this.a, ixVar.a) && k71.k.b(this.b, ixVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("MergeQueue(id=", this.a, ", __typename=", this.b, ")");
    }
}
