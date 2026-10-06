package go0;

import org.json.JSONObject;
import q81.h0;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ qn.g t;

    public /* synthetic */ t(y71.j jVar, Object obj, qn.g gVar, int i) {
        this.r = i;
        this.s = jVar;
        this.t = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        s sVar;
        int i;
        u uVar;
        int i2;
        hd0.m mVar;
        int i3;
        hd0.n nVar;
        int i4;
        kp.q qVar;
        int i5;
        kp.r rVar;
        int i6;
        r20.m mVar2;
        int i7;
        r20.n nVar2;
        int i8;
        int i9 = this.r;
        a0 a0Var = a0.a;
        qn.g gVar = this.t;
        y71.j jVar = this.s;
        switch (i9) {
            case 0:
                if (cVar instanceof s) {
                    sVar = (s) cVar;
                    int i10 = sVar.v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        sVar.v = i10 - Integer.MIN_VALUE;
                        Object obj2 = sVar.u;
                        b71.a aVar = b71.a.r;
                        i = sVar.v;
                        if (i == 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                            return a0Var;
                        }
                        sy.y.j(obj2);
                        String jSONObject = new JSONObject().put("subscribe", new JSONObject().put(gVar.a, "")).toString();
                        k71.k.f(jSONObject, "toString(...)");
                        k71.k.g("- sending: ".concat(jSONObject), "message");
                        g91.f fVar = (h0) obj;
                        fVar.getClass();
                        h91.kShadow kVar = h91.kShadow.u;
                        Boolean valueOf = Boolean.valueOf(fVar.f(1, c30.d.b(jSONObject)));
                        sVar.v = 1;
                        return jVar.c(valueOf, sVar) == aVar ? aVar : a0Var;
                    }
                }
                sVar = new s(this, cVar);
                Object obj22 = sVar.u;
                b71.a aVar2 = b71.a.r;
                i = sVar.v;
                if (i == 0) {
                }
            case 1:
                if (cVar instanceof u) {
                    uVar = (u) cVar;
                    int i12 = uVar.v;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        uVar.v = i12 - Integer.MIN_VALUE;
                        Object obj3 = uVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = uVar.v;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                            return a0Var;
                        }
                        sy.y.j(obj3);
                        if (!gVar.a((qn.d) obj)) {
                            return a0Var;
                        }
                        uVar.v = 1;
                        return jVar.c(obj, uVar) == aVar3 ? aVar3 : a0Var;
                    }
                }
                uVar = new u(this, cVar);
                Object obj32 = uVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = uVar.v;
                if (i2 == 0) {
                }
            case 2:
                if (cVar instanceof hd0.m) {
                    mVar = (hd0.m) cVar;
                    int i13 = mVar.v;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        mVar.v = i13 - Integer.MIN_VALUE;
                        Object obj4 = mVar.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = mVar.v;
                        if (i3 == 0) {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                            return a0Var;
                        }
                        sy.y.j(obj4);
                        String jSONObject2 = new JSONObject().put("subscribe", new JSONObject().put(gVar.a, "")).toString();
                        k71.k.f(jSONObject2, "toString(...)");
                        k71.k.g("- sending: ".concat(jSONObject2), "message");
                        g91.f fVar2 = (h0) obj;
                        fVar2.getClass();
                        h91.kShadow kVar2 = h91.kShadow.u;
                        Boolean valueOf2 = Boolean.valueOf(fVar2.f(1, c30.d.b(jSONObject2)));
                        mVar.v = 1;
                        return jVar.c(valueOf2, mVar) == aVar4 ? aVar4 : a0Var;
                    }
                }
                mVar = new hd0.m(this, cVar);
                Object obj42 = mVar.u;
                b71.a aVar42 = b71.a.r;
                i3 = mVar.v;
                if (i3 == 0) {
                }
            case 3:
                if (cVar instanceof hd0.n) {
                    nVar = (hd0.n) cVar;
                    int i14 = nVar.v;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        nVar.v = i14 - Integer.MIN_VALUE;
                        Object obj5 = nVar.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = nVar.v;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                            return a0Var;
                        }
                        sy.y.j(obj5);
                        if (!gVar.a((qn.d) obj)) {
                            return a0Var;
                        }
                        nVar.v = 1;
                        return jVar.c(obj, nVar) == aVar5 ? aVar5 : a0Var;
                    }
                }
                nVar = new hd0.n(this, cVar);
                Object obj52 = nVar.u;
                b71.a aVar52 = b71.a.r;
                i4 = nVar.v;
                if (i4 == 0) {
                }
            case 4:
                if (cVar instanceof kp.q) {
                    qVar = (kp.q) cVar;
                    int i15 = qVar.v;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        qVar.v = i15 - Integer.MIN_VALUE;
                        Object obj6 = qVar.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = qVar.v;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                            return a0Var;
                        }
                        sy.y.j(obj6);
                        String jSONObject3 = new JSONObject().put("subscribe", new JSONObject().put(gVar.a, "")).toString();
                        k71.k.f(jSONObject3, "toString(...)");
                        k71.k.g("- sending: ".concat(jSONObject3), "message");
                        g91.f fVar3 = (h0) obj;
                        fVar3.getClass();
                        h91.kShadow kVar3 = h91.kShadow.u;
                        Boolean valueOf3 = Boolean.valueOf(fVar3.f(1, c30.d.b(jSONObject3)));
                        qVar.v = 1;
                        return jVar.c(valueOf3, qVar) == aVar6 ? aVar6 : a0Var;
                    }
                }
                qVar = new kp.q(this, cVar);
                Object obj62 = qVar.u;
                b71.a aVar62 = b71.a.r;
                i5 = qVar.v;
                if (i5 == 0) {
                }
            case 5:
                if (cVar instanceof kp.r) {
                    rVar = (kp.r) cVar;
                    int i16 = rVar.v;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        rVar.v = i16 - Integer.MIN_VALUE;
                        Object obj7 = rVar.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = rVar.v;
                        if (i6 == 0) {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                            return a0Var;
                        }
                        sy.y.j(obj7);
                        if (!gVar.a((qn.d) obj)) {
                            return a0Var;
                        }
                        rVar.v = 1;
                        return jVar.c(obj, rVar) == aVar7 ? aVar7 : a0Var;
                    }
                }
                rVar = new kp.r(this, cVar);
                Object obj72 = rVar.u;
                b71.a aVar72 = b71.a.r;
                i6 = rVar.v;
                if (i6 == 0) {
                }
            case 6:
                if (cVar instanceof r20.m) {
                    mVar2 = (r20.m) cVar;
                    int i17 = mVar2.v;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        mVar2.v = i17 - Integer.MIN_VALUE;
                        Object obj8 = mVar2.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = mVar2.v;
                        if (i7 == 0) {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                            return a0Var;
                        }
                        sy.y.j(obj8);
                        String jSONObject4 = new JSONObject().put("subscribe", new JSONObject().put(gVar.a, "")).toString();
                        k71.k.f(jSONObject4, "toString(...)");
                        k71.k.g("- sending: ".concat(jSONObject4), "message");
                        g91.f fVar4 = (h0) obj;
                        fVar4.getClass();
                        h91.kShadow kVar4 = h91.kShadow.u;
                        Boolean valueOf4 = Boolean.valueOf(fVar4.f(1, c30.d.b(jSONObject4)));
                        mVar2.v = 1;
                        return jVar.c(valueOf4, mVar2) == aVar8 ? aVar8 : a0Var;
                    }
                }
                mVar2 = new r20.m(this, cVar);
                Object obj82 = mVar2.u;
                b71.a aVar82 = b71.a.r;
                i7 = mVar2.v;
                if (i7 == 0) {
                }
            default:
                if (cVar instanceof r20.n) {
                    nVar2 = (r20.n) cVar;
                    int i18 = nVar2.v;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        nVar2.v = i18 - Integer.MIN_VALUE;
                        Object obj9 = nVar2.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = nVar2.v;
                        if (i8 == 0) {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                            return a0Var;
                        }
                        sy.y.j(obj9);
                        if (!gVar.a((qn.d) obj)) {
                            return a0Var;
                        }
                        nVar2.v = 1;
                        return jVar.c(obj, nVar2) == aVar9 ? aVar9 : a0Var;
                    }
                }
                nVar2 = new r20.n(this, cVar);
                Object obj92 = nVar2.u;
                b71.a aVar92 = b71.a.r;
                i8 = nVar2.v;
                if (i8 == 0) {
                }
        }
    }

    public /* synthetic */ t(y71.j jVar, qn.g gVar, int i) {
        this.r = i;
        this.s = jVar;
        this.t = gVar;
    }
}
