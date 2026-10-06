package e9;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes.dex */
public final class m implements Executor {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22148r;

    /* renamed from: s, reason: collision with root package name */
    public Executor f22149s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayDeque f22150t;

    /* renamed from: u, reason: collision with root package name */
    public Runnable f22151u;

    /* renamed from: v, reason: collision with root package name */
    public Object f22152v;

    public m(Executor executor, int i) {
        this.f22148r = i;
        switch (i) {
            case 1:
                k71.k.g(executor, "executor");
                this.f22149s = executor;
                this.f22150t = new ArrayDeque();
                this.f22152v = new Object();
                break;
            default:
                this.f22149s = executor;
                this.f22150t = new ArrayDeque();
                this.f22152v = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.f22148r) {
            case k5.f.J:
                Runnable runnable = (Runnable) this.f22150t.poll();
                this.f22151u = runnable;
                if (runnable != null) {
                    this.f22149s.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.f22152v) {
                    Object poll = this.f22150t.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.f22151u = runnable2;
                    if (poll != null) {
                        this.f22149s.execute(runnable2);
                    }
                }
                return;
            default:
                synchronized (this.f22152v) {
                    try {
                        Runnable runnable3 = (Runnable) this.f22150t.poll();
                        this.f22151u = runnable3;
                        if (runnable3 != null) {
                            ((k.m) this.f22149s).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f22148r) {
            case k5.f.J:
                synchronized (this.f22152v) {
                    try {
                        this.f22150t.add(new com.google.common.util.concurrent.b(18, this, runnable));
                        if (this.f22151u == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                k71.k.g(runnable, "command");
                synchronized (this.f22152v) {
                    this.f22150t.offer(new b9.f(9, runnable, this));
                    if (this.f22151u == null) {
                        a();
                    }
                }
                return;
            default:
                synchronized (this.f22152v) {
                    try {
                        this.f22150t.add(new b9.f(8, this, runnable));
                        if (this.f22151u == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public m(k.m mVar) {
        this.f22148r = 2;
        this.f22152v = new Object();
        this.f22150t = new ArrayDeque();
        this.f22149s = mVar;
    }
    public Object B(Object p1) { return null; }
    public Object I() { return null; }
}
