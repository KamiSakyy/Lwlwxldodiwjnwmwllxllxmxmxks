package n8;

import a0.s0;
import android.graphics.Rect;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f29648a;

    /* renamed from: b, reason: collision with root package name */
    public int f29649b;

    /* renamed from: c, reason: collision with root package name */
    public int f29650c;

    /* renamed from: d, reason: collision with root package name */
    public int f29651d;

    static {
        new b(0, 0, 0, 0);
    }

    public b(int i, int i10, int i11, int i12) {
        this.f29648a = i;
        this.f29649b = i10;
        this.f29650c = i11;
        this.f29651d = i12;
        if (i > i11) {
            throw new IllegalArgumentException(no.a.j(i, i11, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(no.a.j(i10, i12, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.f29651d - this.f29649b;
    }

    public final int b() {
        return this.f29650c - this.f29648a;
    }

    public final Rect c() {
        return new Rect(this.f29648a, this.f29649b, this.f29650c, this.f29651d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k.e(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f29648a == bVar.f29648a && this.f29649b == bVar.f29649b && this.f29650c == bVar.f29650c && this.f29651d == bVar.f29651d;
    }

    public final int hashCode() {
        return (((((this.f29648a * 31) + this.f29649b) * 31) + this.f29650c) * 31) + this.f29651d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f29648a);
        sb2.append(',');
        sb2.append(this.f29649b);
        sb2.append(',');
        sb2.append(this.f29650c);
        sb2.append(',');
        return s0.l(sb2, this.f29651d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        k.g(rect, "rect");
    }
}
