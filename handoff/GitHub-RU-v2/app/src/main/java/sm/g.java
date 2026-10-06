package sm;

import k71.k;
import oa.j;
import sy.y;
import y71.i;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final qm.d a;

    public g(qm.d dVar) {
        k.g(dVar, "repository");
        this.a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, boolean z, ak.a aVar, j71.c cVar, c71.c cVar2) {
        f fVar;
        int i;
        if (cVar2 instanceof f) {
            fVar = (f) cVar2;
            int i2 = fVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.z = i2 - Integer.MIN_VALUE;
                Object obj = fVar.x;
                b71.a aVar2 = b71.a.r;
                i = fVar.z;
                if (i != 0) {
                    y.j(obj);
                    fVar.u = jVar;
                    fVar.v = cVar;
                    fVar.w = z;
                    fVar.z = 1;
                    obj = this.a.b(jVar, aVar, z, fVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return obj;
                    }
                    z = fVar.w;
                    cVar = fVar.v;
                    jVar = fVar.u;
                    y.j(obj);
                }
                y71.y J = b31.b.J((i) obj, jVar, cVar);
                fVar.u = null;
                fVar.v = null;
                fVar.w = z;
                fVar.z = 2;
                Object F = n1.F(J, fVar);
                return F != aVar2 ? aVar2 : F;
            }
        }
        fVar = new f(this, cVar2);
        Object obj2 = fVar.x;
        b71.a aVar22 = b71.a.r;
        i = fVar.z;
        if (i != 0) {
        }
        y71.y J2 = b31.b.J((i) obj2, jVar, cVar);
        fVar.u = null;
        fVar.v = null;
        fVar.w = z;
        fVar.z = 2;
        Object F2 = n1.F(J2, fVar);
        if (F2 != aVar22) {
        }
    }

}
