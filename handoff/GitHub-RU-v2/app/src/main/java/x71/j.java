package x71;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class jShadow {
    public static final p a = new p(-1, null, null, 0);
    public static final int b = a81.bShadow.l(32, "kotlinx.coroutines.bufferedChannel.segmentSize", 12);
    public static final int c = a81.bShadow.l(10000, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 12);
    public static final a81.t d = new a81.t(0, "BUFFERED", false);
    public static final a81.t e = new a81.t(0, "SHOULD_BUFFER", false);
    public static final a81.t f = new a81.t(0, "S_RESUMING_BY_RCV", false);
    public static final a81.t g = new a81.t(0, "RESUMING_BY_EB", false);
    public static final a81.t h = new a81.t(0, "POISONED", false);
    public static final a81.t i = new a81.t(0, "DONE_RCV", false);
    public static final a81.t j = new a81.t(0, "INTERRUPTED_SEND", false);
    public static final a81.t k = new a81.t(0, "INTERRUPTED_RCV", false);
    public static final a81.t l = new a81.t(0, "CHANNEL_CLOSED", false);
    public static final a81.t m = new a81.t(0, "SUSPEND", false);
    public static final a81.t n = new a81.t(0, "SUSPEND_NO_WAITER", false);
    public static final a81.t o = new a81.t(0, "FAILED", false);
    public static final a81.t p = new a81.t(0, "NO_RECEIVE_RESULT", false);
    public static final a81.t q = new a81.t(0, "CLOSE_HANDLER_CLOSED", false);
    public static final a81.t r = new a81.t(0, "CLOSE_HANDLER_INVOKED", false);
    public static final a81.t s = new a81.t(0, "NO_CLOSE_CAUSE", false);

    public static final boolean a(v71.k kVar, Object obj, j71.f fVar) {
        a81.t p2 = kVar.p(obj, fVar);
        if (p2 == null) {
            return false;
        }
        kVar.y(p2);
        return true;
    }
}
