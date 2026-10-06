package im;

import a0.i;
import a71.h;
import aa.r0;
import aa.s0;
import aa.z;
import b21.v;
import go0.o;
import ja.n;
import ja.p;
import java.util.List;
import java.util.UUID;
import k71.k;
import k71.w;
import sy.y;
import t00.f8;
import v71.e1;
import w61.a0;
import x71.s;
import y71.j;
import yz0.i6;
import yz0.v2;
import yz0.w6;
import yz0.w7;
import yz0.y7;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements j {
    public final /* synthetic */ int r;
    public final /* synthetic */ j s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public b(h hVar, Object obj, s sVar, j jVar, o oVar, e1 e1Var) {
        this.r = 3;
        this.t = hVar;
        this.u = obj;
        this.x = sVar;
        this.s = jVar;
        this.v = oVar;
        this.w = e1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a aVar;
        int i;
        e eVar;
        int i2;
        n nVar;
        int i3;
        f8 yVar;
        z71.o oVar;
        int i4;
        switch (this.r) {
            case 0:
                if (cVar instanceof a) {
                    aVar = (a) cVar;
                    int i5 = aVar.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        aVar.v = i5 - Integer.MIN_VALUE;
                        Object obj2 = aVar.u;
                        b71.a aVar2 = b71.a.r;
                        i = aVar.v;
                        if (i != 0) {
                            y.j(obj2);
                            w7 w7Var = (w7) obj;
                            v2 v2Var = (v2) this.t;
                            if (v2Var != null) {
                                w7Var.i.add(new i6(w7Var.h, v2Var.getName()));
                            }
                            v2 v2Var2 = (v2) this.u;
                            if (v2Var2 != null) {
                                w7Var.i.add(new w6(w7Var.h, v2Var2.getName()));
                            }
                            ((cn.s) ((d) this.x).b.a((oa.j) this.v)).b((String) this.w, w7Var.i);
                            aVar.v = 1;
                            if (this.s.c(w7Var, aVar) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj2);
                        }
                        return a0.a;
                    }
                }
                aVar = new a(this, cVar);
                Object obj22 = aVar.u;
                b71.a aVar22 = b71.a.r;
                i = aVar.v;
                if (i != 0) {
                }
                return a0.a;
            case 1:
                if (cVar instanceof e) {
                    eVar = (e) cVar;
                    int i6 = eVar.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i6 - Integer.MIN_VALUE;
                        Object obj3 = eVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = eVar.v;
                        if (i2 != 0) {
                            y.j(obj3);
                            y7 y7Var = (y7) obj;
                            v2 v2Var3 = (v2) this.t;
                            if (v2Var3 != null) {
                                y7Var.i.add(new i6(y7Var.h, v2Var3.getName()));
                            }
                            v2 v2Var4 = (v2) this.u;
                            if (v2Var4 != null) {
                                y7Var.i.add(new w6(y7Var.h, v2Var4.getName()));
                            }
                            ((cn.s) ((f) this.x).b.a((oa.j) this.v)).b((String) this.w, y7Var.i);
                            eVar.v = 1;
                            if (this.s.c(y7Var, eVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj3);
                        }
                        return a0.a;
                    }
                }
                eVar = new e(this, cVar);
                Object obj32 = eVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = eVar.v;
                if (i2 != 0) {
                }
                return a0.a;
            case 2:
                aa.d dVar = (aa.d) this.t;
                if (cVar instanceof n) {
                    nVar = (n) cVar;
                    int i7 = nVar.v;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        nVar.v = i7 - Integer.MIN_VALUE;
                        Object obj4 = nVar.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = nVar.v;
                        a0 a0Var = a0.a;
                        if (i3 != 0) {
                            y.j(obj4);
                            if (k.b(obj, a0Var)) {
                                s0 s0Var = dVar.a;
                                UUID uuid = dVar.b;
                                k.g(s0Var, "operation");
                                yVar = new f8(21, new aa.f(uuid, s0Var, (r0) null, (List) null, p.a, x61.s.r, z.a, false));
                            } else {
                                yVar = new y71.y(((v) this.u).q(dVar), new an.d((w) this.x, (ja.o) this.v, (aa.d) this.t, (aa.w) this.w, null, 6), 6);
                            }
                            nVar.v = 1;
                            if (this.s.c(yVar, nVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj4);
                        }
                        return a0Var;
                    }
                }
                nVar = new n(this, cVar);
                Object obj42 = nVar.u;
                b71.a aVar42 = b71.a.r;
                i3 = nVar.v;
                a0 a0Var2 = a0.a;
                if (i3 != 0) {
                }
                return a0Var2;
            default:
                if (cVar instanceof z71.o) {
                    oVar = (z71.o) cVar;
                    int i8 = oVar.w;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        oVar.w = i8 - Integer.MIN_VALUE;
                        z71.o oVar2 = oVar;
                        Object obj5 = oVar2.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = oVar2.w;
                        a0 a0Var3 = a0.a;
                        if (i4 != 0) {
                            y.j(obj5);
                            h hVar = (h) this.t;
                            i iVar = new i((s) this.x, this.s, (o) this.v, obj, (e1) this.w, (a71.c) null);
                            oVar2.w = 1;
                            if (z71.b.c(hVar, a0Var3, this.u, iVar, oVar2) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj5);
                        }
                        return a0Var3;
                    }
                }
                oVar = new z71.o(this, cVar);
                z71.o oVar22 = oVar;
                Object obj52 = oVar22.u;
                b71.a aVar52 = b71.a.r;
                i4 = oVar22.w;
                a0 a0Var32 = a0.a;
                if (i4 != 0) {
                }
                return a0Var32;
        }
    }

    public /* synthetic */ b(j jVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.r = i;
        this.s = jVar;
        this.t = obj;
        this.u = obj2;
        this.x = obj3;
        this.v = obj4;
        this.w = obj5;
    }
}
