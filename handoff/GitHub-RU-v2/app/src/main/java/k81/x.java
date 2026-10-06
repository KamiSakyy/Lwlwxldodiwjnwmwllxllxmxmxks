package k81;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class x {
    public static final long[] e = new long[0];
    public SerialDescriptor a;
    public f0.o0 b;
    public long c;
    public long[] d;

    public x(SerialDescriptor serialDescriptor, f0.o0 o0Var) {
        k71.k.g(serialDescriptor, "descriptor");
        this.a = serialDescriptor;
        this.b = o0Var;
        int f = serialDescriptor.f();
        if (f <= 64) {
            this.c = f != 64 ? (-1) << f : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (f - 1) >>> 6;
        long[] jArr = new long[i];
        if ((f & 63) != 0) {
            jArr[i - 1] = (-1) << f;
        }
        this.d = jArr;
    }
}
