package p01;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public List a;
    public x01.i b;

    public a(List list, x01.i iVar) {
        this.a = list;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BranchesPaged(branches=" + this.a + ", page=" + this.b + ")";
    }
}
