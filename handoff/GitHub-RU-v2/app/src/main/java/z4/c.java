package z4;

import z3.d;

/* loaded from: /home/user/work/p/classes.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final Object f34564c;

    public c(int i) {
        super(i);
        this.f34564c = new Object();
    }

    @Override // z3.d
    public final Object a() {
        Object a10;
        synchronized (this.f34564c) {
            a10 = super.a();
        }
        return a10;
    }

    @Override // z3.d
    public final boolean c(Object obj) {
        boolean c10;
        synchronized (this.f34564c) {
            c10 = super.c(obj);
        }
        return c10;
    }
}
