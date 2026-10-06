package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m7Shadow extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public final /* synthetic */ o7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(o7 o7Var, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.w = o7Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new m7Shadow(this.w, cVar, 0);
            default:
                return new m7Shadow(this.w, cVar, 1);
        }
    }

    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
            case 0:
                m7Shadow r = r(cVar, jVar);
                w61.a0 a0Var = w61.a0.a;
                r.v(a0Var);
                return a0Var;
            default:
                m7Shadow r2 = r(cVar, jVar);
                w61.a0 a0Var2 = w61.a0.a;
                r2.v(a0Var2);
                return a0Var2;
        }
    }

    public final Object v(Object obj) {
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        a71.h hVar = ((c71.c) this).s;
        o7 o7Var = this.w;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                k71.k.d(hVar);
                o7Var.t = v71.b0.r(hVar);
                break;
            default:
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                k71.k.d(hVar);
                o7Var.t = v71.b0.r(hVar);
                break;
        }
        return a0Var;
    }
}
