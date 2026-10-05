package h91;

import com.github.rudroid.copilot.h1;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes5.dex */
public class m0 {
    public static final l0 d = new l0();
    public boolean a;
    public long b;
    public long c;

    public m0 a() {
        this.a = false;
        return this;
    }

    public m0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public m0 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public m0 g(long j, TimeUnit timeUnit) {
        k71.k.g(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("timeout < 0: ", j).toString());
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }

    public long h() {
        return this.c;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
