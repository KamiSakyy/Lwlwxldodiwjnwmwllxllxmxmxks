package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o implements j {
    public final /* synthetic */ int r;
    public final /* synthetic */ x71.t s;

    public /* synthetic */ o(x71.t tVar, int i) {
        this.r = i;
        this.s = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    @Override // y71.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        n nVar;
        int i;
        z71.p pVar;
        int i2;
        switch (this.r) {
            case 0:
                if (cVar instanceof n) {
                    nVar = (n) cVar;
                    int i3 = nVar.w;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nVar.w = i3 - Integer.MIN_VALUE;
                        Object obj2 = nVar.u;
                        b71.a aVar = b71.a.r;
                        i = nVar.w;
                        if (i != 0) {
                            sy.y.j(obj2);
                            if (obj == null) {
                                obj = z71.b.b;
                            }
                            nVar.w = 1;
                            if (((x71.s) this.s).u.l(nVar, obj) == aVar) {
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
                nVar = new n(this, cVar);
                Object obj22 = nVar.u;
                b71.a aVar2 = b71.a.r;
                i = nVar.w;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof z71.p) {
                    pVar = (z71.p) cVar;
                    int i4 = pVar.w;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        pVar.w = i4 - Integer.MIN_VALUE;
                        Object obj3 = pVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = pVar.w;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            x71.s sVar = (x71.s) this.s;
                            sVar.getClass();
                            if (obj == null) {
                                obj = z71.b.b;
                            }
                            pVar.w = 1;
                            if (sVar.u.l(pVar, obj) == aVar3) {
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
                pVar = new z71.p(this, cVar);
                Object obj32 = pVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = pVar.w;
                if (i2 != 0) {
                }
                return w61.a0.a;
            default:
                Object l = ((x71.s) this.s).u.l(cVar, (aa.f) obj);
                return l == b71.a.r ? l : w61.a0.a;
        }
    }
}
