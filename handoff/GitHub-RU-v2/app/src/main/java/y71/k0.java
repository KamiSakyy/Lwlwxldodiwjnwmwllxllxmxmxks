package y71;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class k0 implements j {
    public final /* synthetic */ int r;
    public final /* synthetic */ j s;
    public final /* synthetic */ c71.j t;

    public k0(j jVar, j71.e eVar, int i) {
        this.r = i;
        switch (i) {
            case 2:
                this.s = jVar;
                this.t = (c71.j) eVar;
                break;
            default:
                this.s = jVar;
                this.t = (c71.j) eVar;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    @Override // y71.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        j0 j0Var;
        int i;
        boolean z;
        Object obj2;
        Object obj3;
        k0 k0Var;
        l0 l0Var;
        Object obj4;
        b71.a aVar;
        int i2;
        j jVar;
        a1 a1Var;
        b71.a aVar2;
        int i3;
        Object obj5;
        j jVar2;
        switch (this.r) {
            case 0:
                if (cVar instanceof j0) {
                    j0Var = (j0) cVar;
                    int i4 = j0Var.w;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        j0Var.w = i4 - Integer.MIN_VALUE;
                        Object obj6 = j0Var.v;
                        b71.a aVar3 = b71.a.r;
                        i = j0Var.w;
                        z = true;
                        if (i != 0) {
                            sy.y.j(obj6);
                            j0Var.u = this;
                            j0Var.y = obj;
                            j0Var.w = 1;
                            Object s = this.t.s(obj, j0Var);
                            if (s == aVar3) {
                                return aVar3;
                            }
                            obj2 = s;
                            obj3 = obj;
                            k0Var = this;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                k0Var = j0Var.u;
                                sy.y.j(obj6);
                                if (z) {
                                    return w61.a0.a;
                                }
                                throw new AbortFlowException(k0Var);
                            }
                            Object obj7 = j0Var.y;
                            k0 k0Var2 = j0Var.u;
                            sy.y.j(obj6);
                            obj3 = obj7;
                            k0Var = k0Var2;
                            obj2 = obj6;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z = false;
                        } else {
                            j jVar3 = k0Var.s;
                            j0Var.u = k0Var;
                            j0Var.y = null;
                            j0Var.w = 2;
                            if (jVar3.c(obj3, j0Var) == aVar3) {
                                return aVar3;
                            }
                        }
                        if (z) {
                        }
                    }
                }
                j0Var = new j0(this, cVar);
                Object obj62 = j0Var.v;
                b71.a aVar32 = b71.a.r;
                i = j0Var.w;
                z = true;
                if (i != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
            case 1:
                if (cVar instanceof l0) {
                    l0Var = (l0) cVar;
                    int i5 = l0Var.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        l0Var.v = i5 - Integer.MIN_VALUE;
                        obj4 = l0Var.u;
                        aVar = b71.a.r;
                        i2 = l0Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            j jVar4 = this.s;
                            l0Var.w = jVar4;
                            l0Var.v = 1;
                            Object s2 = this.t.s(obj, l0Var);
                            if (s2 == aVar) {
                                return aVar;
                            }
                            obj4 = s2;
                            jVar = jVar4;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sy.y.j(obj4);
                                return w61.a0.a;
                            }
                            jVar = l0Var.w;
                            sy.y.j(obj4);
                        }
                        l0Var.w = null;
                        l0Var.v = 2;
                        if (jVar.c(obj4, l0Var) == aVar) {
                            return aVar;
                        }
                        return w61.a0.a;
                    }
                }
                l0Var = new l0(this, cVar);
                obj4 = l0Var.u;
                aVar = b71.a.r;
                i2 = l0Var.v;
                if (i2 != 0) {
                }
                l0Var.w = null;
                l0Var.v = 2;
                if (jVar.c(obj4, l0Var) == aVar) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof a1) {
                    a1Var = (a1) cVar;
                    int i6 = a1Var.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        a1Var.v = i6 - Integer.MIN_VALUE;
                        Object obj8 = a1Var.u;
                        aVar2 = b71.a.r;
                        i3 = a1Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj8);
                            a1Var.x = obj;
                            j jVar5 = this.s;
                            a1Var.y = jVar5;
                            a1Var.v = 1;
                            if (this.t.s(obj, a1Var) == aVar2) {
                                return aVar2;
                            }
                            obj5 = obj;
                            jVar2 = jVar5;
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sy.y.j(obj8);
                                return w61.a0.a;
                            }
                            jVar2 = a1Var.y;
                            obj5 = a1Var.x;
                            sy.y.j(obj8);
                        }
                        a1Var.x = null;
                        a1Var.y = null;
                        a1Var.v = 2;
                        if (jVar2.c(obj5, a1Var) == aVar2) {
                            return aVar2;
                        }
                        return w61.a0.a;
                    }
                }
                a1Var = new a1(this, cVar);
                Object obj82 = a1Var.u;
                aVar2 = b71.a.r;
                i3 = a1Var.v;
                if (i3 != 0) {
                }
                a1Var.x = null;
                a1Var.y = null;
                a1Var.v = 2;
                if (jVar2.c(obj5, a1Var) == aVar2) {
                }
                return w61.a0.a;
        }
    }

    public k0(j71.e eVar, j jVar) {
        this.r = 0;
        this.t = (c71.j) eVar;
        this.s = jVar;
    }
}
