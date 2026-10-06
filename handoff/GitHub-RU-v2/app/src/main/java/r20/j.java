package r20;

import d20.r;
import go0.z;
import hc0.bl;
import hc0.hc;
import java.util.LinkedHashSet;
import java.util.Set;
import sy.y;
import w61.a0;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
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

    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, jVar).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (r3 == r9) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bb, code lost:
    
        if (r3 == r9) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        if (r3 == r9) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object v;
        Object v2;
        Object v3;
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
                    v = n1Shadow.v(n1Shadow.y(new go0.i(com.github.service.wrapper.a.o(zVar.s, new d20.e(str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), str, 10), zVar.u), this);
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
                    v2 = n1Shadow.v(n1Shadow.y(new go0.i(com.github.service.wrapper.a.o(zVar.s, new d20.j(str, hc.s), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), str, 11), zVar.u), this);
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
            default:
                y71.j jVar3 = (y71.j) this.x;
                b71.a aVar3 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    y.j(obj);
                    sn.b[] bVarArr = sn.b.r;
                    this.x = jVar3;
                    this.w = 1;
                    v3 = n1Shadow.v(n1Shadow.y(new go0.i(com.github.service.wrapper.a.o(zVar.s, new r(str, bl.s), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), str, 12), zVar.u), this);
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
        }
    }
}
