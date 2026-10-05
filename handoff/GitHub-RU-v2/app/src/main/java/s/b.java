package s;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: r, reason: collision with root package name */
    public c f31371r;

    /* renamed from: s, reason: collision with root package name */
    public c f31372s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f31373t;

    public b(c cVar, c cVar2, int i) {
        this.f31373t = i;
        this.f31371r = cVar2;
        this.f31372s = cVar;
    }

    @Override // s.e
    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f31371r == cVar && cVar == this.f31372s) {
            this.f31372s = null;
            this.f31371r = null;
        }
        c cVar4 = this.f31371r;
        if (cVar4 == cVar) {
            switch (this.f31373t) {
                case k5.f.J /* 0 */:
                    cVar2 = cVar4.f31377u;
                    break;
                default:
                    cVar2 = cVar4.f31376t;
                    break;
            }
            this.f31371r = cVar2;
        }
        c cVar5 = this.f31372s;
        if (cVar5 == cVar) {
            c cVar6 = this.f31371r;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = b(cVar5);
            }
            this.f31372s = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f31373t) {
            case k5.f.J /* 0 */:
                return cVar.f31376t;
            default:
                return cVar.f31377u;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31372s != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f31372s;
        c cVar2 = this.f31371r;
        this.f31372s = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
