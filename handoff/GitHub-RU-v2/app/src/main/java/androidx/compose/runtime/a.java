package androidx.compose.runtime;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a implements d {

    /* renamed from: r, reason: collision with root package name */
    public Object f1548r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f1549s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public Object f1550t;

    public a(Object obj) {
        this.f1548r = obj;
        this.f1550t = obj;
    }

    @Override // androidx.compose.runtime.d
    public final void b(Object obj) {
        this.f1549s.add(this.f1550t);
        this.f1550t = obj;
    }

    public final void g() {
        this.f1549s.clear();
        this.f1550t = this.f1548r;
        l();
    }

    @Override // androidx.compose.runtime.d
    public final void h() {
        this.f1550t = this.f1549s.remove(r0.size() - 1);
    }

    @Override // androidx.compose.runtime.d
    public final Object k() {
        return this.f1550t;
    }

    public abstract void l();
}
