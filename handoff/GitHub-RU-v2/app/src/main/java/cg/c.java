package cg;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final a a;
    public final a b;

    public c(a aVar, a aVar2) {
        k.g(aVar, "currentLicenseSubscription");
        this.a = aVar;
        this.b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DowngradeDialogData(currentLicenseSubscription=" + this.a + ", downgradeToSubscription=" + this.b + ")";
    }
}
