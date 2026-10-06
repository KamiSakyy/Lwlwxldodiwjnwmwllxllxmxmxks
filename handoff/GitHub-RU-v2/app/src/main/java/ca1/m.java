package ca1;

import da1.d0;
import da1.g0;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m extends j {
    public d0 A;

    static {
        String[] strArr = ba1.h.a;
        ea1.s.N(ba1.h.i(", ", Arrays.asList(ba1.a.c)));
    }

    public m(g0 g0Var, b bVar) {
        super(g0Var, null, bVar);
        this.A = new d0();
    }

    @Override // ca1.o
    public final void B(o oVar) {
        super.B(oVar);
        this.A.remove(oVar);
    }

    @Override // ca1.j
    /* renamed from: F */
    public final j i() {
        return (m) super.i();
    }

    @Override // ca1.j, ca1.o
    /* renamed from: clone */
    public final Object i() {
        return (m) super.i();
    }

    @Override // ca1.j, ca1.o
    public final o i() {
        return (m) super.i();
    }
}
