package r4;

import android.graphics.Insets;
import b6.a2;
import m11.r;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f31147e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public int f31148a;

    /* renamed from: b, reason: collision with root package name */
    public int f31149b;

    /* renamed from: c, reason: collision with root package name */
    public int f31150c;

    /* renamed from: d, reason: collision with root package name */
    public int f31151d;

    public b(int i, int i10, int i11, int i12) {
        this.f31148a = i;
        this.f31149b = i10;
        this.f31150c = i11;
        this.f31151d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return c(Math.max(bVar.f31148a, bVar2.f31148a), Math.max(bVar.f31149b, bVar2.f31149b), Math.max(bVar.f31150c, bVar2.f31150c), Math.max(bVar.f31151d, bVar2.f31151d));
    }

    public static b b(b bVar, b bVar2) {
        return c(Math.min(bVar.f31148a, bVar2.f31148a), Math.min(bVar.f31149b, bVar2.f31149b), Math.min(bVar.f31150c, bVar2.f31150c), Math.min(bVar.f31151d, bVar2.f31151d));
    }

    public static b c(int i, int i10, int i11, int i12) {
        return (i == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f31147e : new b(i, i10, i11, i12);
    }

    public static b d(Insets insets) {
        return c(r.g(insets), r.j(insets), r.l(insets), r.m(insets));
    }

    public final Insets e() {
        return a2.i(this.f31148a, this.f31149b, this.f31150c, this.f31151d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f31151d == bVar.f31151d && this.f31148a == bVar.f31148a && this.f31150c == bVar.f31150c && this.f31149b == bVar.f31149b;
    }

    public final int hashCode() {
        return (((((this.f31148a * 31) + this.f31149b) * 31) + this.f31150c) * 31) + this.f31151d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f31148a);
        sb2.append(", top=");
        sb2.append(this.f31149b);
        sb2.append(", right=");
        sb2.append(this.f31150c);
        sb2.append(", bottom=");
        return x.i.j(sb2, this.f31151d, '}');
    }
    public Object a = null;
    public Object c = null;
}
