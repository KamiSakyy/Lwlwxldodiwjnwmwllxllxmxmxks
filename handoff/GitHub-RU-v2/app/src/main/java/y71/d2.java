package y71;

import kotlin.KotlinNothingValueException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d2 implements j1 {
    public final j1 r;
    public final c71.j s;

    public d2(j1 j1Var, j71.e eVar) {
        this.r = j1Var;
        this.s = (c71.j) eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // y71.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(j jVar, a71.c cVar) {
        c2 c2Var;
        int i;
        if (cVar instanceof c2) {
            c2Var = (c2) cVar;
            int i2 = c2Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2Var.w = i2 - Integer.MIN_VALUE;
                Object obj = c2Var.u;
                b71.a aVar = b71.a.r;
                i = c2Var.w;
                if (i != 0) {
                    sy.y.j(obj);
                    b2 b2Var = new b2(this.s, jVar);
                    c2Var.w = 1;
                    if (this.r.b(b2Var, c2Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        c2Var = new c2(this, cVar);
        Object obj2 = c2Var.u;
        b71.a aVar2 = b71.a.r;
        i = c2Var.w;
        if (i != 0) {
        }
        throw new KotlinNothingValueException();
    }
}
