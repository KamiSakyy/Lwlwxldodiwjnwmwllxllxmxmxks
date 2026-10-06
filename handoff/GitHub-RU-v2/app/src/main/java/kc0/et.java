package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class et implements aaShadow.v0 {
    public final ht a;

    public et(ht htVar) {
        this.a = htVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof et) && k71.k.b(this.a, ((et) obj).a);
    }

    public final int hashCode() {
        ht htVar = this.a;
        if (htVar == null) {
            return 0;
        }
        return htVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
