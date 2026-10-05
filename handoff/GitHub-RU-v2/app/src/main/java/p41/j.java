package p41;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements m51.c, m51.b {
    public final HashMap a;
    public ArrayDeque b;
    public final q41.k c;

    public j() {
        q41.k kVar = q41.k.r;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = kVar;
    }

    public final synchronized void a(Executor executor, m51.a aVar) {
        try {
            executor.getClass();
            if (!this.a.containsKey(k41.b.class)) {
                this.a.put(k41.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(k41.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
