package s71;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements h, d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31727a;

    /* renamed from: b, reason: collision with root package name */
    public final h f31728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31729c;

    public c(h hVar, int i, int i10) {
        this.f31727a = i10;
        switch (i10) {
            case 1:
                this.f31728b = hVar;
                this.f31729c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(no.a.l("count must be non-negative, but was ", i, '.').toString());
                }
                return;
            default:
                k71.k.g(hVar, "sequence");
                this.f31728b = hVar;
                this.f31729c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(no.a.l("count must be non-negative, but was ", i, '.').toString());
                }
                return;
        }
    }

    @Override // s71.d
    public final h a(int i) {
        switch (this.f31727a) {
            case k5.f.J:
                int i10 = this.f31729c;
                int i11 = i10 + i;
                return i11 < 0 ? new c(this, i, 1) : new k(this.f31728b, i10, i11);
            default:
                return i >= this.f31729c ? this : new c(this.f31728b, i, 1);
        }
    }

    @Override // s71.d
    public final h b(int i) {
        switch (this.f31727a) {
            case k5.f.J:
                int i10 = this.f31729c + i;
                return i10 < 0 ? new c(this, i, 0) : new c(this.f31728b, i10, 0);
            default:
                int i11 = this.f31729c;
                return i >= i11 ? e.f31730a : new k(this.f31728b, i, i11);
        }
    }

    @Override // s71.h
    public final Iterator iterator() {
        switch (this.f31727a) {
            case k5.f.J:
                return new b(this);
            default:
                return new b(this, (byte) 0);
        }
    }
}
