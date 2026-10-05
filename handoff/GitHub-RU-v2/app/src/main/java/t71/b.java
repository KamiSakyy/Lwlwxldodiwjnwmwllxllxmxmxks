package t71;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements Iterator, l71.a {

    /* renamed from: r, reason: collision with root package name */
    public int f32109r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f32110s;

    /* renamed from: t, reason: collision with root package name */
    public int f32111t;

    /* renamed from: u, reason: collision with root package name */
    public q71.g f32112u;

    /* renamed from: v, reason: collision with root package name */
    public int f32113v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f32114w;

    public b(c cVar) {
        this.f32114w = cVar;
        int v4 = aa1.b.v(0, 0, cVar.f32115a.length());
        this.f32110s = v4;
        this.f32111t = v4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i = this.f32111t;
        if (i < 0) {
            this.f32109r = 0;
            this.f32112u = null;
            return;
        }
        c cVar = this.f32114w;
        int i10 = cVar.f32116b;
        if (i10 > 0) {
            int i11 = this.f32113v + 1;
            this.f32113v = i11;
        }
        if (i <= cVar.f32115a.length()) {
            w61.k kVar = (w61.k) cVar.f32117c.s(cVar.f32115a, Integer.valueOf(this.f32111t));
            if (kVar == null) {
                this.f32112u = new q71.g(this.f32110s, p.N(cVar.f32115a), 1);
                this.f32111t = -1;
            } else {
                int intValue = ((Number) kVar.r).intValue();
                int intValue2 = ((Number) kVar.s).intValue();
                this.f32112u = aa1.b.b0(this.f32110s, intValue);
                int i12 = intValue + intValue2;
                this.f32110s = i12;
                this.f32111t = i12 + (intValue2 == 0 ? 1 : 0);
            }
            this.f32109r = 1;
        }
        this.f32112u = new q71.g(this.f32110s, p.N(cVar.f32115a), 1);
        this.f32111t = -1;
        this.f32109r = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f32109r == -1) {
            a();
        }
        return this.f32109r == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f32109r == -1) {
            a();
        }
        if (this.f32109r == 0) {
            throw new NoSuchElementException();
        }
        q71.g gVar = this.f32112u;
        k71.k.e(gVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f32112u = null;
        this.f32109r = -1;
        return gVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
