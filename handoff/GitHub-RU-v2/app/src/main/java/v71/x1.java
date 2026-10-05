package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class x1 extends v {
    public static final x1 t = new x1();

    @Override // v71.v
    public final void J0(a71.h hVar, Runnable runnable) {
        b2 w0 = hVar.w0(b2.t);
        if (w0 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        w0.s = true;
    }

    @Override // v71.v
    public final v M0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // v71.v
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
