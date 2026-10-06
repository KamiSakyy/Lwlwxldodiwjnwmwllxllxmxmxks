package com.github.service.wrapper;

import aa.w0;
import com.github.service.models.ApiFailure;
import in.o0;
import in.p0;
import java.util.Map;
import java.util.Set;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Set x;
    public final /* synthetic */ i y;
    public final /* synthetic */ w0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Set set, i iVar, w0 w0Var, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = set;
        this.y = iVar;
        this.z = w0Var;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                e eVar = new e(this.x, this.y, this.z, cVar, 0);
                eVar.w = obj;
                return eVar;
            default:
                e eVar2 = new e(this.x, this.y, this.z, cVar, 1);
                eVar2.w = obj;
                return eVar2;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        p0 p0Var = (p0) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
            case 0:
                e eVar = (e) r(cVar, p0Var);
                a0 a0Var = a0.a;
                eVar.v(a0Var);
                return a0Var;
            default:
                e eVar2 = (e) r(cVar, p0Var);
                a0 a0Var2 = a0.a;
                eVar2.v(a0Var2);
                return a0Var2;
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        a0 a0Var = a0.a;
        w0 w0Var = this.z;
        i iVar = this.y;
        Set set = this.x;
        switch (i) {
            case 0:
                o0 o0Var = (p0) this.w;
                b71.a aVar = b71.a.r;
                y.j(obj);
                if (o0Var instanceof o0) {
                    ApiFailure apiFailure = o0Var.b;
                    if (!set.contains(apiFailure.r)) {
                        com.github.rudroid.common.e.a(iVar.b, new PartialApiDataMissException(w0Var.name(), apiFailure), (Map) null, 6);
                        break;
                    }
                }
                break;
            default:
                o0 o0Var2 = (p0) this.w;
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                if (o0Var2 instanceof o0) {
                    ApiFailure apiFailure2 = o0Var2.b;
                    if (!set.contains(apiFailure2.r)) {
                        com.github.rudroid.common.e.a(iVar.b, new PartialApiDataMissException(w0Var.name(), apiFailure2), (Map) null, 6);
                        break;
                    }
                }
                break;
        }
        return a0Var;
    }
    public Object n(Object p1, Object p2, Object p3) { return null; }
    public Object q(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; }
    public Object n(Object, Object, Object) { return null; }
    public Object q(Object, Object, Object, boolean, Object, Object, Object, Object, int) { return null; }
}
