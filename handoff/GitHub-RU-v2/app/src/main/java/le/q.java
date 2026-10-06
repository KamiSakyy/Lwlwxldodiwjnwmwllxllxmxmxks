package le;

import yz0.x0;

/* loaded from: /home/user/work/p/classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f28718a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28719b;

    public q(x0 x0Var) {
        k71.k.g(x0Var, "contributor");
        String str = x0Var.a;
        k71.k.g(str, "stableId");
        this.f28718a = x0Var;
        this.f28719b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.f28718a, qVar.f28718a) && k71.k.b(this.f28719b, qVar.f28719b);
    }

    public final int hashCode() {
        return this.f28719b.hashCode() + (this.f28718a.hashCode() * 31);
    }

    public final String toString() {
        return "ListItemTopContributor(contributor=" + this.f28718a + ", stableId=" + this.f28719b + ")";
    }
}
