package t00;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f8 implements y71.i {
    public final /* synthetic */ int r;
    public Object s;

    public /* synthetic */ f8(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(y71.j jVar, a71.c cVar) {
        y71.k kVar;
        int i;
        y71.j jVar2;
        Iterator it;
        y71.a aVar;
        int i2;
        Throwable th2;
        z71.u uVar;
        switch (this.r) {
            case 0:
                Object b = ((q6) this.s).b(new d8(jVar, 1), cVar);
                return b == b71.a.r ? b : w61.a0.a;
            case 1:
                Object b2 = ((b10.b) this.s).b(new d8(jVar, 11), cVar);
                return b2 == b71.a.r ? b2 : w61.a0.a;
            case 2:
                Object b3 = ((q6) this.s).b(new d8(jVar, 18), cVar);
                return b3 == b71.a.r ? b3 : w61.a0.a;
            case 3:
                Object b4 = ((c00.g) this.s).b(new x9(jVar, 12), cVar);
                return b4 == b71.a.r ? b4 : w61.a0.a;
            case 4:
                Object b5 = ((g3) this.s).b(new v00.tShadow(jVar, 9), cVar);
                return b5 == b71.a.r ? b5 : w61.a0.a;
            case 5:
                Object b6 = ((vb0.u) this.s).b(new vb0.y0(jVar, 13), cVar);
                return b6 == b71.a.r ? b6 : w61.a0.a;
            case 6:
                Object b7 = ((vb0.u) this.s).b(new vb0.v2(jVar, 9), cVar);
                return b7 == b71.a.r ? b7 : w61.a0.a;
            case 7:
                Object b8 = ((vb0.t3) this.s).b(new vb0.y5(jVar, 0), cVar);
                return b8 == b71.a.r ? b8 : w61.a0.a;
            case 8:
                Object b9 = ((b10.b) this.s).b(new vb0.y5(jVar, 8), cVar);
                return b9 == b71.a.r ? b9 : w61.a0.a;
            case 9:
                Object b11 = ((rm0.f3) this.s).b(new vb0.y5(jVar, 14), cVar);
                return b11 == b71.a.r ? b11 : w61.a0.a;
            case 10:
                Object b12 = ((vb0.t3) this.s).b(new vb0.y5(jVar, 18), cVar);
                return b12 == b71.a.r ? b12 : w61.a0.a;
            case 11:
                Object b13 = ((vb0.p1) this.s).b(new vb0.r7(jVar, 28), cVar);
                return b13 == b71.a.r ? b13 : w61.a0.a;
            case 12:
                Object b14 = ((vb0.s7) this.s).b(new wy0.t1(jVar, 6), cVar);
                return b14 == b71.a.r ? b14 : w61.a0.a;
            case 13:
                Object b15 = ((wy0.q3) this.s).b(new wy0.p3(jVar, 1), cVar);
                return b15 == b71.a.r ? b15 : w61.a0.a;
            case 14:
                Object b16 = ((wy0.s6) this.s).b(new wy0.m6(jVar, 12), cVar);
                return b16 == b71.a.r ? b16 : w61.a0.a;
            case 15:
                Object b17 = ((b10.b) this.s).b(new wy0.m6(jVar, 22), cVar);
                return b17 == b71.a.r ? b17 : w61.a0.a;
            case 16:
                Object b18 = ((rm0.f3) this.s).b(new wy0.m6(jVar, 28), cVar);
                return b18 == b71.a.r ? b18 : w61.a0.a;
            case 17:
                Object b19 = ((wy0.s6) this.s).b(new wy0.e8(jVar, 2), cVar);
                return b19 == b71.a.r ? b19 : w61.a0.a;
            case 18:
                Object b21 = ((c00.g) this.s).b(new wy0.e8(jVar, 29), cVar);
                return b21 == b71.a.r ? b21 : w61.a0.a;
            case 19:
                Object b22 = ((wy0.d6) this.s).b(new xo0.b(jVar, 1), cVar);
                return b22 == b71.a.r ? b22 : w61.a0.a;
            case 20:
                if (cVar instanceof y71.k) {
                    kVar = (y71.k) cVar;
                    int i3 = kVar.v;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kVar.v = i3 - Integer.MIN_VALUE;
                        Object obj = kVar.u;
                        b71.a aVar2 = b71.a.r;
                        i = kVar.v;
                        if (i != 0) {
                            sy.y.j(obj);
                            jVar2 = jVar;
                            it = ((Iterable) this.s).iterator();
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            it = kVar.y;
                            y71.j jVar3 = kVar.x;
                            sy.y.j(obj);
                            jVar2 = jVar3;
                        }
                        while (it.hasNext()) {
                            Object next = it.next();
                            kVar.x = jVar2;
                            kVar.y = it;
                            kVar.v = 1;
                            if (jVar2.c(next, kVar) == aVar2) {
                                return aVar2;
                            }
                        }
                        return w61.a0.a;
                    }
                }
                kVar = new y71.k(this, cVar);
                Object obj2 = kVar.u;
                b71.a aVar22 = b71.a.r;
                i = kVar.v;
                if (i != 0) {
                }
                while (it.hasNext()) {
                }
                return w61.a0.a;
            case 21:
                Object c = jVar.c(this.s, cVar);
                return c == b71.a.r ? c : w61.a0.a;
            case 22:
                if (cVar instanceof y71.a) {
                    aVar = (y71.a) cVar;
                    int i4 = aVar.x;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        aVar.x = i4 - Integer.MIN_VALUE;
                        Object obj3 = aVar.v;
                        b71.a aVar3 = b71.a.r;
                        i2 = aVar.x;
                        w61.a0 a0Var = w61.a0.a;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            a71.h hVar = ((c71.c) aVar).s;
                            k71.k.d(hVar);
                            z71.u uVar2 = new z71.u(jVar, hVar);
                            try {
                                aVar.u = uVar2;
                                aVar.x = 1;
                                Object s = ((c71.j) this.s).s(uVar2, aVar);
                                if (s != aVar3) {
                                    s = a0Var;
                                }
                                if (s == aVar3) {
                                    return aVar3;
                                }
                                uVar = uVar2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                uVar = uVar2;
                                uVar.w();
                                throw th2;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            uVar = aVar.u;
                            try {
                                sy.y.j(obj3);
                            } catch (Throwable th4) {
                                th2 = th4;
                                uVar.w();
                                throw th2;
                            }
                        }
                        uVar.w();
                        return a0Var;
                    }
                }
                aVar = new y71.a(this, cVar);
                Object obj32 = aVar.v;
                b71.a aVar32 = b71.a.r;
                i2 = aVar.x;
                w61.a0 a0Var2 = w61.a0.a;
                if (i2 != 0) {
                }
                uVar.w();
                return a0Var2;
            case 23:
                yl.b bVar = new yl.b((y71.p) this.s, jVar, null, 4);
                v71.r1 r1Var = new v71.r1(cVar.q(), cVar, 1);
                Object o0 = com.google.android.gms.internal.measurement.i4.o0(r1Var, true, r1Var, bVar);
                return o0 == b71.a.r ? o0 : w61.a0.a;
            default:
                Object b23 = ((y00.l) this.s).b(new yo0.c(jVar, 16), cVar);
                return b23 == b71.a.r ? b23 : w61.a0.a;
        }
    }

    public f8(j71.e eVar) {
        this.r = 22;
        this.s = (c71.j) eVar;
    }
}
