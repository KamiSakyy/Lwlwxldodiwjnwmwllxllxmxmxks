package x7;

import sy.r;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f implements v7.c {

    /* renamed from: r, reason: collision with root package name */
    public w7.a f33950r;

    /* renamed from: s, reason: collision with root package name */
    public String f33951s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f33952t;

    public f(w7.a aVar, String str) {
        this.f33950r = aVar;
        this.f33951s = str;
    }

    public final void f() {
        if (this.f33952t) {
            r.w("statement is closed", 21);
            throw null;
        }
    }

    @Override // v7.c
    public void l() {
        f();
    }

    @Override // v7.c
    public void reset() {
        f();
    }
}
