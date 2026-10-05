package wy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c8 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public final /* synthetic */ f8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8(f8 f8Var, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.w = f8Var;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new c8(this.w, cVar, 0);
            default:
                return new c8(this.w, cVar, 1);
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
            case 0:
                c8 c8Var = (c8) r(cVar, jVar);
                w61.a0 a0Var = w61.a0.a;
                c8Var.v(a0Var);
                return a0Var;
            default:
                c8 c8Var2 = (c8) r(cVar, jVar);
                w61.a0 a0Var2 = w61.a0.a;
                c8Var2.v(a0Var2);
                return a0Var2;
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        a71.h hVar = this.s;
        f8 f8Var = this.w;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                k71.k.d(hVar);
                f8Var.t = v71.b0.r(hVar);
                break;
            default:
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                k71.k.d(hVar);
                f8Var.t = v71.b0.r(hVar);
                break;
        }
        return a0Var;
    }
}
