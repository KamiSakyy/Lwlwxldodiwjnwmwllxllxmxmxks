package h91;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class g0 {
    public static final f0 a = new f0(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(f0 f0Var) {
        k71.k.g(f0Var, "segment");
        if (f0Var.f != null || f0Var.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (f0Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        f0 f0Var2 = a;
        f0 f0Var3 = (f0) atomicReference.getAndSet(f0Var2);
        if (f0Var3 == f0Var2) {
            return;
        }
        int i = f0Var3 != null ? f0Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(f0Var3);
            return;
        }
        f0Var.f = f0Var3;
        f0Var.b = 0;
        f0Var.c = i + 8192;
        atomicReference.set(f0Var);
    }

    public static final f0 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        f0 f0Var = a;
        f0 f0Var2 = (f0) atomicReference.getAndSet(f0Var);
        if (f0Var2 == f0Var) {
            return new f0();
        }
        if (f0Var2 == null) {
            atomicReference.set(null);
            return new f0();
        }
        atomicReference.set(f0Var2.f);
        f0Var2.f = null;
        f0Var2.c = 0;
        return f0Var2;
    }
}
