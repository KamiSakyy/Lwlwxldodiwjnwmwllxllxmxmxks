package z71;

import y71.m1;
import y71.w1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class z extends m1 implements w1 {
    @Override // y71.w1
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.y;
            k71.k.d(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.z + ((int) ((q() + this.B) - this.z))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            Object[] objArr = this.y;
            k71.k.d(objArr);
            m(Integer.valueOf(((Number) objArr[((int) ((this.z + ((int) ((q() + this.B) - this.z))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
