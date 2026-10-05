package a81;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class s {
    public static final /* synthetic */ int a = 0;

    static {
        String d;
        String d2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            d = c71.a.class.getCanonicalName();
        } catch (Throwable th) {
            d = sy.y.d(th);
        }
        if (w61.n.a(d) != null) {
            d = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            d2 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            d2 = sy.y.d(th2);
        }
        if (w61.n.a(d2) != null) {
            d2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
