package um;

import com.github.domain.database.GitHubDatabase;
import d1.e0;
import java.util.ArrayList;
import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ r t;
    public final /* synthetic */ oa.j u;

    public /* synthetic */ e(y71.j jVar, r rVar, oa.j jVar2, int i) {
        this.r = i;
        this.s = jVar;
        this.t = rVar;
        this.u = jVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        d dVar;
        b71.a aVar;
        int i;
        a0 a0Var;
        y71.j jVar;
        int i2;
        o oVar;
        b71.a aVar2;
        int i3;
        a0 a0Var2;
        y71.j jVar2;
        int i4;
        q qVar;
        b71.a aVar3;
        int i5;
        a0 a0Var3;
        y71.j jVar3;
        int i6;
        switch (this.r) {
            case 0:
                if (cVar instanceof d) {
                    dVar = (d) cVar;
                    int i7 = dVar.v;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i7 - Integer.MIN_VALUE;
                        Object obj2 = dVar.u;
                        aVar = b71.a.r;
                        i = dVar.v;
                        a0Var = a0.a;
                        if (i != 0) {
                            y.j(obj2);
                            r rVar = this.t;
                            s sVar = rVar.a;
                            ArrayList c = rVar.c.c((List) obj);
                            y71.j jVar4 = this.s;
                            dVar.x = jVar4;
                            dVar.y = 0;
                            dVar.v = 1;
                            if (sVar.a(this.u, c, dVar) == aVar) {
                                return aVar;
                            }
                            jVar = jVar4;
                            i2 = 0;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y.j(obj2);
                                return a0Var;
                            }
                            i2 = dVar.y;
                            jVar = dVar.x;
                            y.j(obj2);
                        }
                        dVar.x = null;
                        dVar.y = i2;
                        dVar.v = 2;
                        if (jVar.c(a0Var, dVar) == aVar) {
                            return aVar;
                        }
                        return a0Var;
                    }
                }
                dVar = new d(this, cVar);
                Object obj22 = dVar.u;
                aVar = b71.a.r;
                i = dVar.v;
                a0Var = a0.a;
                if (i != 0) {
                }
                dVar.x = null;
                dVar.y = i2;
                dVar.v = 2;
                if (jVar.c(a0Var, dVar) == aVar) {
                }
                return a0Var;
            case 1:
                if (cVar instanceof o) {
                    oVar = (o) cVar;
                    int i8 = oVar.v;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i8 - Integer.MIN_VALUE;
                        Object obj3 = oVar.u;
                        aVar2 = b71.a.r;
                        i3 = oVar.v;
                        a0Var2 = a0.a;
                        if (i3 != 0) {
                            y.j(obj3);
                            r rVar2 = this.t;
                            s sVar2 = rVar2.a;
                            ArrayList c2 = rVar2.c.c((List) obj);
                            y71.j jVar5 = this.s;
                            oVar.x = jVar5;
                            oVar.y = 0;
                            oVar.v = 1;
                            if (sVar2.a(this.u, c2, oVar) == aVar2) {
                                return aVar2;
                            }
                            jVar2 = jVar5;
                            i4 = 0;
                        } else {
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y.j(obj3);
                                return a0Var2;
                            }
                            i4 = oVar.y;
                            jVar2 = oVar.x;
                            y.j(obj3);
                        }
                        oVar.x = null;
                        oVar.y = i4;
                        oVar.v = 2;
                        if (jVar2.c(a0Var2, oVar) == aVar2) {
                            return aVar2;
                        }
                        return a0Var2;
                    }
                }
                oVar = new o(this, cVar);
                Object obj32 = oVar.u;
                aVar2 = b71.a.r;
                i3 = oVar.v;
                a0Var2 = a0.a;
                if (i3 != 0) {
                }
                oVar.x = null;
                oVar.y = i4;
                oVar.v = 2;
                if (jVar2.c(a0Var2, oVar) == aVar2) {
                }
                return a0Var2;
            default:
                if (cVar instanceof q) {
                    qVar = (q) cVar;
                    int i9 = qVar.v;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        qVar.v = i9 - Integer.MIN_VALUE;
                        Object obj4 = qVar.u;
                        aVar3 = b71.a.r;
                        i5 = qVar.v;
                        a0Var3 = a0.a;
                        if (i5 != 0) {
                            y.j(obj4);
                            r rVar3 = this.t;
                            s sVar3 = rVar3.a;
                            ek.e b = rVar3.c.b((q01.r) obj);
                            y71.j jVar6 = this.s;
                            qVar.x = jVar6;
                            qVar.y = 0;
                            qVar.v = 1;
                            ek.d F = ((GitHubDatabase) sVar3.a.a(this.u)).F();
                            Object M = m71.a.M(qVar, F.a, false, true, new e0(17, F, b));
                            if (M != aVar3) {
                                M = a0Var3;
                            }
                            if (M != aVar3) {
                                M = a0Var3;
                            }
                            if (M == aVar3) {
                                return aVar3;
                            }
                            jVar3 = jVar6;
                            i6 = 0;
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y.j(obj4);
                                return a0Var3;
                            }
                            i6 = qVar.y;
                            jVar3 = qVar.x;
                            y.j(obj4);
                        }
                        qVar.x = null;
                        qVar.y = i6;
                        qVar.v = 2;
                        if (jVar3.c(a0Var3, qVar) == aVar3) {
                            return aVar3;
                        }
                        return a0Var3;
                    }
                }
                qVar = new q(this, cVar);
                Object obj42 = qVar.u;
                aVar3 = b71.a.r;
                i5 = qVar.v;
                a0Var3 = a0.a;
                if (i5 != 0) {
                }
                qVar.x = null;
                qVar.y = i6;
                qVar.v = 2;
                if (jVar3.c(a0Var3, qVar) == aVar3) {
                }
                return a0Var3;
        }
    }
}
