package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class t1 {
    public static final ThreadLocal a = new ThreadLocal();

    public static v0 a() {
        ThreadLocal threadLocal = a;
        v0 v0Var = (v0) threadLocal.get();
        if (v0Var != null) {
            return v0Var;
        }
        h hVar = new h(Thread.currentThread());
        threadLocal.set(hVar);
        return hVar;
    }
}
