package m1;

import java.util.List;
import y41.t1;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends x61.e {

    /* renamed from: r, reason: collision with root package name */
    public n1.c f28909r;

    /* renamed from: s, reason: collision with root package name */
    public int f28910s;

    /* renamed from: t, reason: collision with root package name */
    public int f28911t;

    public a(n1.c cVar, int i, int i10) {
        this.f28909r = cVar;
        this.f28910s = i;
        t1.s(i, i10, cVar.a());
        this.f28911t = i10 - i;
    }

    public final int a() {
        return this.f28911t;
    }

    public final Object get(int i) {
        t1.q(i, this.f28911t);
        return this.f28909r.get(this.f28910s + i);
    }

    public final List subList(int i, int i10) {
        t1.s(i, i10, this.f28911t);
        int i11 = this.f28910s;
        return new a(this.f28909r, i + i11, i11 + i10);
    }
}
