package s;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: r, reason: collision with root package name */
    public c f31378r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f31379s = true;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f f31380t;

    public d(f fVar) {
        this.f31380t = fVar;
    }

    @Override // s.e
    public final void a(c cVar) {
        c cVar2 = this.f31378r;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f31377u;
            this.f31378r = cVar3;
            this.f31379s = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f31379s) {
            return this.f31380t.f31381r != null;
        }
        c cVar = this.f31378r;
        return (cVar == null || cVar.f31376t == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f31379s) {
            this.f31379s = false;
            this.f31378r = this.f31380t.f31381r;
        } else {
            c cVar = this.f31378r;
            this.f31378r = cVar != null ? cVar.f31376t : null;
        }
        return this.f31378r;
    }
}
