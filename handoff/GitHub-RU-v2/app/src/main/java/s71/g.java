package s71;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public h f31736a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31737b;

    /* renamed from: c, reason: collision with root package name */
    public j71.c f31738c;

    public g(h hVar, boolean z10, j71.c cVar) {
        this.f31736a = hVar;
        this.f31737b = z10;
        this.f31738c = cVar;
    }

    @Override // s71.h
    public final Iterator iterator() {
        return new f(this);
    }
}
