package x9;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public h f34025a;

    /* renamed from: b, reason: collision with root package name */
    public List f34026b;

    public n(h hVar, List list) {
        k71.k.g(hVar, "billingResult");
        k71.k.g(list, "purchasesList");
        this.f34025a = hVar;
        this.f34026b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.f34025a, nVar.f34025a) && k71.k.b(this.f34026b, nVar.f34026b);
    }

    public final int hashCode() {
        return this.f34026b.hashCode() + (this.f34025a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PurchasesResult(billingResult=");
        sb2.append(this.f34025a);
        sb2.append(", purchasesList=");
        return x.i.l(sb2, this.f34026b, ")");
    }
}
