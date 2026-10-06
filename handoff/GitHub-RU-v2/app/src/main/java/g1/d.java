package g1;

import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public c2.c f24449a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24450b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24451c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24452d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24453e;

    public d(c2.c cVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f24449a = cVar;
        this.f24450b = z10;
        this.f24451c = z11;
        this.f24452d = z12;
        this.f24453e = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.f24449a, dVar.f24449a) && this.f24450b == dVar.f24450b && this.f24451c == dVar.f24451c && this.f24452d == dVar.f24452d && this.f24453e == dVar.f24453e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24453e) + i.e(i.e(i.e(this.f24449a.hashCode() * 31, 31, this.f24450b), 31, this.f24451c), 31, this.f24452d);
    }

    public final String toString() {
        return "HingeInfo(bounds=" + this.f24449a + ", isFlat=" + this.f24450b + ", isVertical=" + this.f24451c + ", isSeparating=" + this.f24452d + ", isOccluding=" + this.f24453e + ')';
    }
}
