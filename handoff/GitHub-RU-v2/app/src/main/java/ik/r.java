package ik;

import com.github.rudroid.discussions.ac;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public final oa.g a;

    public r(oa.g gVar) {
        k71.k.g(gVar, "organizationService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, ac acVar, c71.c cVar) {
        q qVar;
        int i;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i2 = qVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.y = i2 - Integer.MIN_VALUE;
                Object obj = qVar.w;
                b71.a aVar = b71.a.r;
                i = qVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.o0 o0Var = (z01.o0) this.a.a(jVar);
                    qVar.u = jVar;
                    qVar.v = acVar;
                    qVar.y = 1;
                    obj = o0Var.a(str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    acVar = qVar.v;
                    jVar = qVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, acVar);
            }
        }
        qVar = new q(this, cVar);
        Object obj2 = qVar.w;
        b71.a aVar2 = b71.a.r;
        i = qVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, acVar);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ac<T1,T2,T3,T4> {
        public ac() {
        }
    }
}
