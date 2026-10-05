package v6;

import a71.h;
import java.util.concurrent.CancellationException;
import k71.k;
import v71.b0;
import v71.z;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements AutoCloseable, z {

    /* renamed from: r, reason: collision with root package name */
    public final h f32739r;

    public a(h hVar) {
        k.g(hVar, "coroutineContext");
        this.f32739r = hVar;
    }

    public final h K() {
        return this.f32739r;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b0.h(this.f32739r, (CancellationException) null);
    }
}
