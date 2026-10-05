package q2;

import android.view.MotionEvent;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30886a = new a(1000);

    /* renamed from: b, reason: collision with root package name */
    public static final a f30887b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f30888c;

    /* renamed from: d, reason: collision with root package name */
    public static final StackTraceElement[] f30889d;

    static {
        new a(1007);
        f30887b = new a(1008);
        f30888c = new a(1002);
        f30889d = new StackTraceElement[0];
    }

    public static final boolean a(u uVar) {
        return (uVar.b() || uVar.f30897h || !uVar.f30893d) ? false : true;
    }

    public static final boolean b(u uVar) {
        return !uVar.f30897h && uVar.f30893d;
    }

    public static final boolean c(u uVar) {
        return (uVar.b() || !uVar.f30897h || uVar.f30893d) ? false : true;
    }

    public static final boolean d(u uVar) {
        return uVar.f30897h && !uVar.f30893d;
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean f(u uVar, long j10, long j11) {
        int i = uVar.i == 1 ? 1 : 0;
        long j12 = uVar.f30892c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        float f6 = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j11 >> 32)) * f6;
        float f10 = ((int) (j10 >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j11 & 4294967295L)) * f6;
        return (intBitsToFloat > f10) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j10 & 4294967295L)) + intBitsToFloat4);
    }

    public static w1.r g(w1.r rVar, a aVar) {
        return rVar.f(new o(aVar));
    }

    public static final long h(u uVar, boolean z10) {
        long e5 = c2.b.e(uVar.f30892c, uVar.f30896g);
        if (z10 || !uVar.b()) {
            return e5;
        }
        return 0L;
    }

    public static final void i(m mVar, long j10, j71.c cVar, boolean z10) {
        MotionEvent a10 = mVar.a();
        if (a10 == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = a10.getAction();
        if (z10) {
            a10.setAction(3);
        }
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        a10.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i10));
        cVar.k(a10);
        a10.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i10));
        a10.setAction(action);
    }

    public static String j(long j10) {
        return "PointerId(value=" + j10 + ')';
    }
}
