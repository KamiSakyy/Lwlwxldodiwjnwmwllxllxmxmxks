package n5;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /home/user/work/p/classes.dex */
public class y implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final File f29630a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f29631b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f29632c = new AtomicBoolean(false);

    public y(File file, l0 l0Var) {
        this.f29630a = file;
        this.f29631b = l0Var;
    }

    @Override // n5.j0
    public final Object b(m mVar) {
        if (this.f29632c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        return com.google.common.util.concurrent.a.d(this.f29630a, new a10.b(this, (a71.c) null, 9), mVar);
    }

    @Override // n5.a
    public final void close() {
        this.f29632c.set(true);
    }
    public Object s(Object p1, Object p2) { return null; }
    public Object a = null;
    public Object b = null;
}
