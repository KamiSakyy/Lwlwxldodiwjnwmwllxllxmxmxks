package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes.dex */
public final class t extends h.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2645a;

    public t(AtomicReference atomicReference) {
        this.f2645a = atomicReference;
    }

    @Override // h.c
    public final void a(Object obj) {
        h.c cVar = (h.c) this.f2645a.get();
        if (cVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar.a(obj);
    }
}
