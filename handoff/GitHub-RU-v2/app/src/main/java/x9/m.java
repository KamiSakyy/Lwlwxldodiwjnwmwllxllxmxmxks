package x9;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public hShadow f34023a;

    /* renamed from: b, reason: collision with root package name */
    public List f34024b;

    public m(hShadow hVar, List list) {
        k71.k.g(hVar, "billingResult");
        this.f34023a = hVar;
        this.f34024b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.f34023a, mVar.f34023a) && k71.k.b(this.f34024b, mVar.f34024b);
    }

    public final int hashCode() {
        int hashCode = this.f34023a.hashCode() * 31;
        List list = this.f34024b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProductDetailsResult(billingResult=");
        sb2.append(this.f34023a);
        sb2.append(", productDetailsList=");
        return x.i.l(sb2, this.f34024b, ")");
    }
}
