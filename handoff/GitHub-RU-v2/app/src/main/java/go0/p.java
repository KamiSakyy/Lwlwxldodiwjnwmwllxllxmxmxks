package go0;

import pz0.bt;
import pz0.ze;
import w61.a0;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ z y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        switch (i) {
            case 3:
                sn.b[] bVarArr = sn.b.r;
                this.y = zVar;
                this.z = str;
                super(2, cVar);
                break;
            default:
                sn.a[] aVarArr = sn.a.r;
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
                p pVar = new p(this.y, this.z, cVar, 0, false);
                pVar.x = obj;
                return pVar;
            case 1:
                sn.a[] aVarArr = sn.a.r;
                p pVar2 = new p(zVar, str, cVar, 1);
                pVar2.x = obj;
                return pVar2;
            case 2:
                p pVar3 = new p(this.y, this.z, cVar, 2, false);
                pVar3.x = obj;
                return pVar3;
            default:
                sn.b[] bVarArr = sn.b.r;
                p pVar4 = new p(zVar, str, cVar, 3);
                pVar4.x = obj;
                return pVar4;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((p) r(cVar, jVar)).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r2 == r10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        if (r4 == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011c, code lost:
    
        if (r4 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        if (r2 == r10) goto L70;
     */
    @Override // c71.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object v;
        Object v2;
        Object v3;
        Object v4;
        int i = this.v;
        int i2 = 0;
        a0 a0Var = a0.a;
        String str = this.z;
        z zVar = this.y;
        int i3 = 1;
        int i4 = 2;
        switch (i) {
            case 0:
                y71.j jVar = (y71.j) this.x;
                b71.a aVar = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    sy.y.j(obj);
                    this.x = jVar;
                    this.w = 1;
                    v = n1Shadow.v(n1Shadow.y(new i(com.github.service.wrapper.a.o(zVar.s, new sn0.e(str), null, false, null, null, 58), str, i2), zVar.u), this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    sy.y.j(obj);
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
                int i6 = this.w;
                if (i6 == 0) {
                    sy.y.j(obj);
                    sn.a[] aVarArr = sn.a.r;
                    this.x = jVar2;
                    this.w = 1;
                    v2 = n1Shadow.v(n1Shadow.y(new i(com.github.service.wrapper.a.o(zVar.s, new sn0.j(str, ze.s), null, false, null, null, 58), str, i3), zVar.u), this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    sy.y.j(obj);
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
            case 2:
                y71.j jVar3 = (y71.j) this.x;
                b71.a aVar3 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    sy.y.j(obj);
                    this.x = jVar3;
                    this.w = 1;
                    v3 = n1Shadow.v(n1Shadow.y(new i(com.github.service.wrapper.a.o(zVar.s, new sn0.r(str), null, false, null, null, 58), str, i4), zVar.u), this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    sy.y.j(obj);
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
            default:
                y71.j jVar4 = (y71.j) this.x;
                b71.a aVar4 = b71.a.r;
                int i8 = this.w;
                if (i8 == 0) {
                    sy.y.j(obj);
                    sn.b[] bVarArr = sn.b.r;
                    this.x = jVar4;
                    this.w = 1;
                    v4 = n1Shadow.v(n1Shadow.y(new n(new y71.y(com.github.service.wrapper.a.o(zVar.s, new sn0.w(str, bt.s), null, false, null, null, 58), new o(3, null, 0)), str, 0), zVar.u), this);
                    break;
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    sy.y.j(obj);
                    v4 = obj;
                }
                qn.g gVar4 = (qn.g) v4;
                if (gVar4 == null) {
                    return a0Var;
                }
                this.x = null;
                this.w = 2;
                if (jVar4.c(gVar4, this) != aVar4) {
                    return a0Var;
                }
                return aVar4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(z zVar, String str, a71.c cVar, int i, boolean z) {
        super(2, cVar);
        this.v = i;
        this.y = zVar;
        this.z = str;
    }
}
