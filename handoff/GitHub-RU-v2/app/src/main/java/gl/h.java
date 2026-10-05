package gl;

import g3.b0;
import l7.x1;
import oa.j;
import sy.y;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public final x1 a;
    public final l51.h b;

    public h(x1 x1Var, l51.h hVar) {
        this.a = x1Var;
        this.b = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, c71.c cVar) {
        g gVar;
        int i;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i2 = gVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.w = i2 - Integer.MIN_VALUE;
                Object obj = gVar.u;
                b71.a aVar = b71.a.r;
                i = gVar.w;
                if (i != 0) {
                    y.j(obj);
                    if (jVar.o) {
                        b0 b0Var = new b0(20);
                        gVar.w = 1;
                        obj = this.a.y(jVar, b0Var, gVar);
                    } else {
                        y71.i A = this.b.A(jVar);
                        gVar.w = 3;
                        Object v = n1.v(A, gVar);
                        if (v != aVar) {
                            return v;
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y.j(obj);
                        return obj;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                f fVar = new f((y71.i) obj, 0);
                gVar.w = 2;
                Object v2 = n1.v(fVar, gVar);
                return v2 != aVar ? aVar : v2;
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.u;
        b71.a aVar2 = b71.a.r;
        i = gVar.w;
        if (i != 0) {
        }
        f fVar2 = new f((y71.i) obj2, 0);
        gVar.w = 2;
        Object v22 = n1.v(fVar2, gVar);
        if (v22 != aVar2) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j<T1,T2,T3,T4> {
        public j() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class x1<T1,T2,T3,T4> {
        public x1() {
        }
    }
}
