package rm0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import jn0.tb;
import jn0.vb;
import jo.qc;
import jo.sc;
import kc0.bb;
import kc0.za;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ int v;

    public /* synthetic */ r1(y71.j jVar, String str, String str2, int i, int i2) {
        this.r = i2;
        this.s = jVar;
        this.t = str;
        this.u = str2;
        this.v = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        q1 q1Var;
        int i;
        t00.l1 l1Var;
        int i2;
        vb0.d1 d1Var;
        int i3;
        wy0.d1 d1Var2;
        int i4;
        switch (this.r) {
            case 0:
                if (cVar instanceof q1) {
                    q1Var = (q1) cVar;
                    int i5 = q1Var.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        q1Var.v = i5 - Integer.MIN_VALUE;
                        Object obj2 = q1Var.u;
                        b71.a aVar = b71.a.r;
                        i = q1Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            bb bbVar = ((za) obj).a;
                            if ((bbVar != null ? bbVar.b : null) == null) {
                                ApiFailureType apiFailureType = ApiFailureType.SERVER_ERROR;
                                StringBuilder o = a0.s0.o("Invalid Discussion info: ", this.t, ", ", this.u, ", ");
                                o.append(this.v);
                                throw new ApiFailure(apiFailureType, o.toString(), null, null, null, null, null, 120);
                            }
                            b01.j d = w8.s.d(bbVar.b.c);
                            q1Var.v = 1;
                            if (this.s.c(d, q1Var) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                        }
                        return w61.a0.a;
                    }
                }
                q1Var = new q1(this, cVar);
                Object obj22 = q1Var.u;
                b71.a aVar2 = b71.a.r;
                i = q1Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof t00.l1) {
                    l1Var = (t00.l1) cVar;
                    int i6 = l1Var.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        l1Var.v = i6 - Integer.MIN_VALUE;
                        Object obj3 = l1Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = l1Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            sc scVar = ((qc) obj).a;
                            if ((scVar != null ? scVar.b : null) == null) {
                                ApiFailureType apiFailureType2 = ApiFailureType.SERVER_ERROR;
                                StringBuilder o2 = a0.s0.o("Invalid Discussion info: ", this.t, ", ", this.u, ", ");
                                o2.append(this.v);
                                throw new ApiFailure(apiFailureType2, o2.toString(), null, null, null, null, null, 120);
                            }
                            b01.j e = sy.e0.e(scVar.b.c);
                            l1Var.v = 1;
                            if (this.s.c(e, l1Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                l1Var = new t00.l1(this, cVar);
                Object obj32 = l1Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = l1Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof vb0.d1) {
                    d1Var = (vb0.d1) cVar;
                    int i7 = d1Var.v;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        d1Var.v = i7 - Integer.MIN_VALUE;
                        Object obj4 = d1Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = d1Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            u10.ta taVar = ((u10.ra) obj).a;
                            if ((taVar != null ? taVar.b : null) == null) {
                                ApiFailureType apiFailureType3 = ApiFailureType.SERVER_ERROR;
                                StringBuilder o3 = a0.s0.o("Invalid Discussion info: ", this.t, ", ", this.u, ", ");
                                o3.append(this.v);
                                throw new ApiFailure(apiFailureType3, o3.toString(), null, null, null, null, null, 120);
                            }
                            b01.j d2 = sy.s.d(taVar.b.c);
                            d1Var.v = 1;
                            if (this.s.c(d2, d1Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                d1Var = new vb0.d1(this, cVar);
                Object obj42 = d1Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = d1Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof wy0.d1) {
                    d1Var2 = (wy0.d1) cVar;
                    int i8 = d1Var2.v;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        d1Var2.v = i8 - Integer.MIN_VALUE;
                        Object obj5 = d1Var2.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = d1Var2.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            vb vbVar = ((tb) obj).a;
                            if ((vbVar != null ? vbVar.b : null) == null) {
                                ApiFailureType apiFailureType4 = ApiFailureType.SERVER_ERROR;
                                StringBuilder o4 = a0.s0.o("Invalid Discussion info: ", this.t, ", ", this.u, ", ");
                                o4.append(this.v);
                                throw new ApiFailure(apiFailureType4, o4.toString(), null, null, null, null, null, 120);
                            }
                            b01.j j = b41.b.j(vbVar.b.c);
                            d1Var2.v = 1;
                            if (this.s.c(j, d1Var2) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                d1Var2 = new wy0.d1(this, cVar);
                Object obj52 = d1Var2.u;
                b71.a aVar52 = b71.a.r;
                i4 = d1Var2.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
        }
    }
}
