package a81;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v71.s0;
import v71.t0;

/* loaded from: /home/user/work/p/classes5.dex */
public class x {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public s0[] a;

    public final void a(s0 s0Var) {
        s0Var.d((t0) this);
        s0[] s0VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (s0VarArr == null) {
            s0VarArr = new s0[4];
            this.a = s0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= s0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(s0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            k71.k.f(copyOf, "copyOf(...)");
            s0VarArr = (s0[]) copyOf;
            this.a = s0VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        s0VarArr[i] = s0Var;
        s0Var.s = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s0 b(int i) {
        Object[] objArr = this.a;
        k71.k.d(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                s0 s0Var = objArr[i];
                k71.k.d(s0Var);
                Object obj = objArr[i2];
                k71.k.d(obj);
                if (s0Var.compareTo(obj) < 0) {
                    d(i, i2);
                    c(i2);
                }
            }
            while (true) {
                int i3 = i * 2;
                int i4 = i3 + 1;
                if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.a;
                k71.k.d(objArr2);
                int i5 = i3 + 2;
                if (i5 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i5];
                    k71.k.d(comparable);
                    Object obj2 = objArr2[i4];
                    k71.k.d(obj2);
                }
                i5 = i4;
                Comparable comparable2 = objArr2[i];
                k71.k.d(comparable2);
                Comparable comparable3 = objArr2[i5];
                k71.k.d(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i, i5);
                i = i5;
            }
        }
        s0 s0Var2 = objArr[atomicIntegerFieldUpdater.get(this)];
        k71.k.d(s0Var2);
        s0Var2.d(null);
        s0Var2.s = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return s0Var2;
    }

    public final void c(int i) {
        while (i > 0) {
            s0[] s0VarArr = this.a;
            k71.k.d(s0VarArr);
            int i2 = (i - 1) / 2;
            s0 s0Var = s0VarArr[i2];
            k71.k.d(s0Var);
            s0 s0Var2 = s0VarArr[i];
            k71.k.d(s0Var2);
            if (s0Var.compareTo(s0Var2) <= 0) {
                return;
            }
            d(i, i2);
            i = i2;
        }
    }

    public final void d(int i, int i2) {
        s0[] s0VarArr = this.a;
        k71.k.d(s0VarArr);
        s0 s0Var = s0VarArr[i2];
        k71.k.d(s0Var);
        s0 s0Var2 = s0VarArr[i];
        k71.k.d(s0Var2);
        s0VarArr[i] = s0Var;
        s0VarArr[i2] = s0Var2;
        s0Var.s = i;
        s0Var2.s = i2;
    }
}
