package w61;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 implements h, Serializable {
    public j71.a r;
    public Object s;

    @Override // w61.h
    public final Object getValue() {
        if (this.s == x.a) {
            j71.a aVar = this.r;
            k71.k.d(aVar);
            this.s = aVar.a();
            this.r = null;
        }
        return this.s;
    }

    public final String toString() {
        return this.s != x.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
