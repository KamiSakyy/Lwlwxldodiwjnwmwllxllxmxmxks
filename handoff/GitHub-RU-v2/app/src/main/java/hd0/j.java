package hd0;

import gn0.dm;
import gn0.vc;
import go0.z;
import sy.y;
import tc0.r;
import w61.a0;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ z y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z zVar, String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        switch (i) {
            case 1:
                sn.a[] aVarArr = sn.a.r;
                this.y = zVar;
                this.z = str;
                super(2, cVar);
                break;
            case 2:
                sn.b[] bVarArr = sn.b.r;
                this.y = zVar;
                this.z = str;
                super(2, cVar);
                break;
            default:
                this.y = zVar;
                this.z = str;
                break;
        }
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        int i = this.v;
        String str = this.z;
        z zVar = this.y;
        switch (i) {
            case 0:
                j jVar = new j(zVar, str, cVar, 0);
                jVar.x = obj;
                return jVar;
            case 1:
                sn.a[] aVarArr = sn.a.r;
                j jVar2 = new j(zVar, str, cVar, 1);
                jVar2.x = obj;
                return jVar2;
            default:
                sn.b[] bVarArr = sn.b.r;
                j jVar3 = new j(zVar, str, cVar, 2);
                jVar3.x = obj;
                return jVar3;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((j) r(cVar, jVar)).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r2 == r10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r4 == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011e, code lost:
    
        if (r2 == r10) goto L53;
     */
    @Override // c71.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object v;
        Object v2;
        Object v3;
        int i = this.v;
        int i2 = 3;
        a0 a0Var = a0.a;
        String str = this.z;
        z zVar = this.y;
        switch (i) {
            case 0:
                y71.j jVar = (y71.j) this.x;
                b71.a aVar = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    this.x = jVar;
                    this.w = 1;
                    v = n1Shadow.v(n1Shadow.y(new go0.i(com.github.service.wrapper.a.o(zVar.s, new tc0.e(str), null, false, null, null, 58), str, i2), zVar.u), this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0Var;
                    }
                    y.j(obj);
                    v = obj;
                }
                qn.g gVar = (qn.g) v;
                if (gVar == null) {
                    return a0Var;
                }
                this.x = null;
                this.w = 2;
                if (jVar.c(gVar, this) != aVar) {
                    return a0Var;
                }
                return aVar;
            case 1:
                y71.j jVar2 = (y71.j) this.x;
                b71.a aVar2 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    y.j(obj);
                    sn.a[] aVarArr = sn.a.r;
                    this.x = jVar2;
                    this.w = 1;
                    v2 = n1Shadow.v(n1Shadow.y(new go0.i(com.github.service.wrapper.a.o(zVar.s, new tc0.j(str, vc.s), null, false, null, null, 58), str, 4), zVar.u), this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0Var;
                    }
                    y.j(obj);
                    v2 = obj;
                }
                qn.g gVar2 = (qn.g) v2;
                if (gVar2 == null) {
                    return a0Var;
                }
                this.x = null;
                this.w = 2;
                if (jVar2.c(gVar2, this) != aVar2) {
                    return a0Var;
                }
                return aVar2;
            default:
                y71.j jVar3 = (y71.j) this.x;
                b71.a aVar3 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    sn.b[] bVarArr = sn.b.r;
                    this.x = jVar3;
                    this.w = 1;
                    v3 = n1Shadow.v(n1Shadow.y(new go0.n(new y71.y(com.github.service.wrapper.a.o(zVar.s, new r(str, dm.s), null, false, null, null, 58), new go0.o(3, null, 5)), str, 1), zVar.u), this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0Var;
                    }
                    y.j(obj);
                    v3 = obj;
                }
                qn.g gVar3 = (qn.g) v3;
                if (gVar3 == null) {
                    return a0Var;
                }
                this.x = null;
                this.w = 2;
                if (jVar3.c(gVar3, this) != aVar3) {
                    return a0Var;
                }
                return aVar3;
        }
    }
}
