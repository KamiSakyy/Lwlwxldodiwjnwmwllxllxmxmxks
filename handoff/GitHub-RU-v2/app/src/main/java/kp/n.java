package kp;

import go0.z;
import java.util.LinkedHashSet;
import java.util.Set;
import m10.ui;
import m10.xy;
import so.v;
import sy.y;
import w61.a0;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ z y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z zVar, String str, a71.c cVar, int i) {
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

    public final a71.c r(a71.c cVar, Object obj) {
        int i = this.v;
        String str = this.z;
        z zVar = this.y;
        switch (i) {
            case 0:
                n nVar = new n(this.y, this.z, cVar, 0, false);
                nVar.x = obj;
                return nVar;
            case 1:
                sn.a[] aVarArr = sn.a.r;
                n nVar2 = new n(zVar, str, cVar, 1);
                nVar2.x = obj;
                return nVar2;
            case 2:
                n nVar3 = new n(this.y, this.z, cVar, 2, false);
                nVar3.x = obj;
                return nVar3;
            default:
                sn.b[] bVarArr = sn.b.r;
                n nVar4 = new n(zVar, str, cVar, 3);
                nVar4.x = obj;
                return nVar4;
        }
    }

    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, jVar).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r2 == r10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c2, code lost:
    
        if (r2 == r10) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
    
        if (r4 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0178, code lost:
    
        if (r4 == r2) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object v;
        Object v2;
        Object v3;
        Object v4;
        int i = this.v;
        a0 a0Var = a0.a;
        String str = this.z;
        z zVar = this.y;
        switch (i) {
            case 0:
                y71.j jVar = (y71.j) this.x;
                b71.a aVar = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    this.x = jVar;
                    this.w = 1;
                    v = n1.v(n1.y(new go0.i(com.github.service.wrapper.a.o(zVar.s, new so.i(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), str, 6), zVar.u), this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
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
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    sn.a[] aVarArr = sn.a.r;
                    this.x = jVar2;
                    this.w = 1;
                    v2 = n1.v(n1.y(new go0.i(com.github.service.wrapper.a.o(zVar.s, new so.n(str, ui.s), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), str, 7), zVar.u), this);
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
                int i4 = this.w;
                if (i4 == 0) {
                    y.j(obj);
                    this.x = jVar3;
                    this.w = 1;
                    v3 = n1.v(n1.y(new go0.i(com.github.service.wrapper.a.o(zVar.s, new v(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), str, 8), zVar.u), this);
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
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    sn.b[] bVarArr = sn.b.r;
                    this.x = jVar4;
                    this.w = 1;
                    v4 = n1.v(n1.y(new go0.n(new y71.y(com.github.service.wrapper.a.o(zVar.s, new so.a0(str, xy.s), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), new go0.o(3, (a71.c) null, 8)), str, 3), zVar.u), this);
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
    public /* synthetic */ n(z zVar, String str, a71.c cVar, int i, boolean z) {
        super(2, cVar);
        this.v = i;
        this.y = zVar;
        this.z = str;
    }
}
