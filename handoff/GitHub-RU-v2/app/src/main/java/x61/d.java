package x61;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends e implements RandomAccess {
    public e r;
    public int s;
    public int t;

    public d(e eVar, int i, int i2) {
        this.r = eVar;
        this.s = i;
        sy.a0.g(i, i2, eVar.a());
        this.t = i2 - i;
    }

    @Override // x61.a
    public final int a() {
        return this.t;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.t;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(no.a.j(i, i2, "index: ", ", size: "));
        }
        return this.r.get(this.s + i);
    }

    @Override // x61.e, java.util.List
    public final List subList(int i, int i2) {
        sy.a0.g(i, i2, this.t);
        int i3 = this.s;
        return new d(this.r, i + i3, i3 + i2);
    }
    public static final Object r = null;
}
