package hd;

import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final b41.a f25595a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25596b;

    /* renamed from: c, reason: collision with root package name */
    public final a f25597c;

    public b(b41.a aVar, boolean z10, a aVar2) {
        this.f25595a = aVar;
        this.f25596b = z10;
        this.f25597c = aVar2;
    }

    public static b a(b bVar, a aVar, int i) {
        b41.a aVar2 = bVar.f25595a;
        boolean z10 = (i & 2) != 0 ? bVar.f25596b : false;
        if ((i & 4) != 0) {
            aVar = bVar.f25597c;
        }
        bVar.getClass();
        k.g(aVar, "updateState");
        return new b(aVar2, z10, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.f25595a, bVar.f25595a) && this.f25596b == bVar.f25596b && this.f25597c == bVar.f25597c;
    }

    public final int hashCode() {
        b41.a aVar = this.f25595a;
        return this.f25597c.hashCode() + i.e((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f25596b);
    }

    public final String toString() {
        return "InAppUpdateState(appUpdateInfo=" + this.f25595a + ", shouldShowFlexibleUpdateBanner=" + this.f25596b + ", updateState=" + this.f25597c + ")";
    }

    public /* synthetic */ b() {
        this(null, false, a.f25586r);
    }
}
