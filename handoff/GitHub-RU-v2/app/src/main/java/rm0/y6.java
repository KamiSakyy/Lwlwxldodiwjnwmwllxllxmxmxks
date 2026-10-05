package rm0;

import gn0.ao;
import gn0.bo;
import hc0.ym;
import hc0.zm;
import java.util.ArrayList;
import java.util.List;
import jn0.yf0;
import jo.mi0;
import kc0.yb0;
import kotlin.NoWhenBranchMatchedException;
import m10.y00;
import m10.z00;
import pz0.bv;
import pz0.cv;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y6 implements z01.w0, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.b s;
    public final v71.v t;

    public y6(com.github.service.wrapper.b bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            case 2:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            case 3:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(y6 y6Var, String str, bo boVar, boolean z, c71.c cVar) {
        x6 x6Var;
        int i;
        int i2;
        int i3;
        aj0.c cVar2;
        if (cVar instanceof x6) {
            x6Var = (x6) cVar;
            int i4 = x6Var.z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x6Var.z = i4 - Integer.MIN_VALUE;
                Object obj = x6Var.x;
                b71.a aVar = b71.a.r;
                i = x6Var.z;
                if (i != 0) {
                    sy.y.j(obj);
                    if (z) {
                        i2 = 1;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = -1;
                    }
                    com.github.service.wrapper.b bVar = y6Var.s;
                    aj0.e eVar = new aj0.e();
                    x6Var.u = boVar;
                    x6Var.v = z;
                    x6Var.w = i2;
                    x6Var.z = 1;
                    Object c = bVar.c(eVar, str);
                    if (c == aVar) {
                        return aVar;
                    }
                    int i5 = i2;
                    obj = c;
                    i3 = i5;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = x6Var.w;
                    z = x6Var.v;
                    boVar = x6Var.u;
                    sy.y.j(obj);
                }
                cVar2 = (aj0.c) obj;
                ArrayList arrayList = null;
                if (cVar2 != null) {
                    return null;
                }
                List<aj0.a> list = cVar2.d;
                if (list != null) {
                    arrayList = new ArrayList(x61.n.F(list, 10));
                    for (aj0.a aVar2 : list) {
                        bo boVar2 = aVar2.d;
                        if (boVar2 == boVar) {
                            aj0.b bVar2 = aVar2.c;
                            aVar2 = new aj0.a(aVar2.a, z, new aj0.b(bVar2.a, bVar2.b + i3), boVar2);
                        }
                        arrayList.add(aVar2);
                    }
                }
                return new aj0.c(cVar2.a, cVar2.b, arrayList, cVar2.c);
            }
        }
        x6Var = new x6(y6Var, cVar);
        Object obj2 = x6Var.x;
        b71.a aVar3 = b71.a.r;
        i = x6Var.z;
        if (i != 0) {
        }
        cVar2 = (aj0.c) obj2;
        ArrayList arrayList2 = null;
        if (cVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(y6 y6Var, String str, zm zmVar, boolean z, c71.c cVar) {
        vb0.f5 f5Var;
        int i;
        int i2;
        int i3;
        i80.c cVar2;
        if (cVar instanceof vb0.f5) {
            f5Var = (vb0.f5) cVar;
            int i4 = f5Var.z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                f5Var.z = i4 - Integer.MIN_VALUE;
                Object obj = f5Var.x;
                b71.a aVar = b71.a.r;
                i = f5Var.z;
                if (i != 0) {
                    sy.y.j(obj);
                    if (z) {
                        i2 = 1;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = -1;
                    }
                    com.github.service.wrapper.b bVar = y6Var.s;
                    i80.d dVar = new i80.d(0);
                    f5Var.u = zmVar;
                    f5Var.v = z;
                    f5Var.w = i2;
                    f5Var.z = 1;
                    Object c = bVar.c(dVar, str);
                    if (c == aVar) {
                        return aVar;
                    }
                    int i5 = i2;
                    obj = c;
                    i3 = i5;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = f5Var.w;
                    z = f5Var.v;
                    zmVar = f5Var.u;
                    sy.y.j(obj);
                }
                cVar2 = (i80.c) obj;
                ArrayList arrayList = null;
                if (cVar2 != null) {
                    return null;
                }
                List<i80.a> list = cVar2.d;
                if (list != null) {
                    arrayList = new ArrayList(x61.n.F(list, 10));
                    for (i80.a aVar2 : list) {
                        zm zmVar2 = aVar2.d;
                        if (zmVar2 == zmVar) {
                            i80.b bVar2 = aVar2.c;
                            aVar2 = new i80.a(aVar2.a, z, new i80.b(bVar2.a, bVar2.b + i3), zmVar2);
                        }
                        arrayList.add(aVar2);
                    }
                }
                return new i80.c(cVar2.a, cVar2.b, arrayList, cVar2.c);
            }
        }
        f5Var = new vb0.f5(y6Var, cVar);
        Object obj2 = f5Var.x;
        b71.a aVar3 = b71.a.r;
        i = f5Var.z;
        if (i != 0) {
        }
        cVar2 = (i80.c) obj2;
        ArrayList arrayList2 = null;
        if (cVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(y6 y6Var, String str, z00 z00Var, boolean z, c71.c cVar) {
        t00.y6 y6Var2;
        int i;
        int i2;
        int i3;
        pv.c cVar2;
        if (cVar instanceof t00.y6) {
            y6Var2 = (t00.y6) cVar;
            int i4 = y6Var2.z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                y6Var2.z = i4 - Integer.MIN_VALUE;
                Object obj = y6Var2.x;
                b71.a aVar = b71.a.r;
                i = y6Var2.z;
                if (i != 0) {
                    sy.y.j(obj);
                    if (z) {
                        i2 = 1;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = -1;
                    }
                    com.github.service.wrapper.b bVar = y6Var.s;
                    pv.e eVar = new pv.e();
                    y6Var2.u = z00Var;
                    y6Var2.v = z;
                    y6Var2.w = i2;
                    y6Var2.z = 1;
                    Object c = bVar.c(eVar, str);
                    if (c == aVar) {
                        return aVar;
                    }
                    int i5 = i2;
                    obj = c;
                    i3 = i5;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = y6Var2.w;
                    z = y6Var2.v;
                    z00Var = y6Var2.u;
                    sy.y.j(obj);
                }
                cVar2 = (pv.c) obj;
                ArrayList arrayList = null;
                if (cVar2 != null) {
                    return null;
                }
                List<pv.a> list = cVar2.d;
                if (list != null) {
                    arrayList = new ArrayList(x61.n.F(list, 10));
                    for (pv.a aVar2 : list) {
                        z00 z00Var2 = aVar2.d;
                        if (z00Var2 == z00Var) {
                            pv.b bVar2 = aVar2.c;
                            aVar2 = new pv.a(aVar2.a, z, new pv.b(bVar2.a, bVar2.b + i3), z00Var2);
                        }
                        arrayList.add(aVar2);
                    }
                }
                return new pv.c(cVar2.a, cVar2.b, arrayList, cVar2.c);
            }
        }
        y6Var2 = new t00.y6(y6Var, cVar);
        Object obj2 = y6Var2.x;
        b71.a aVar3 = b71.a.r;
        i = y6Var2.z;
        if (i != 0) {
        }
        cVar2 = (pv.c) obj2;
        ArrayList arrayList2 = null;
        if (cVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(y6 y6Var, String str, cv cvVar, boolean z, c71.c cVar) {
        wy0.a6 a6Var;
        int i;
        int i2;
        int i3;
        gu0.c cVar2;
        if (cVar instanceof wy0.a6) {
            a6Var = (wy0.a6) cVar;
            int i4 = a6Var.z;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                a6Var.z = i4 - Integer.MIN_VALUE;
                Object obj = a6Var.x;
                b71.a aVar = b71.a.r;
                i = a6Var.z;
                if (i != 0) {
                    sy.y.j(obj);
                    if (z) {
                        i2 = 1;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = -1;
                    }
                    com.github.service.wrapper.b bVar = y6Var.s;
                    gu0.e eVar = new gu0.e();
                    a6Var.u = cvVar;
                    a6Var.v = z;
                    a6Var.w = i2;
                    a6Var.z = 1;
                    Object c = bVar.c(eVar, str);
                    if (c == aVar) {
                        return aVar;
                    }
                    int i5 = i2;
                    obj = c;
                    i3 = i5;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = a6Var.w;
                    z = a6Var.v;
                    cvVar = a6Var.u;
                    sy.y.j(obj);
                }
                cVar2 = (gu0.c) obj;
                ArrayList arrayList = null;
                if (cVar2 != null) {
                    return null;
                }
                List<gu0.a> list = cVar2.d;
                if (list != null) {
                    arrayList = new ArrayList(x61.n.F(list, 10));
                    for (gu0.a aVar2 : list) {
                        cv cvVar2 = aVar2.d;
                        if (cvVar2 == cvVar) {
                            gu0.b bVar2 = aVar2.c;
                            aVar2 = new gu0.a(aVar2.a, z, new gu0.b(bVar2.a, bVar2.b + i3), cvVar2);
                        }
                        arrayList.add(aVar2);
                    }
                }
                return new gu0.c(cVar2.a, cVar2.b, arrayList, cVar2.c);
            }
        }
        a6Var = new wy0.a6(y6Var, cVar);
        Object obj2 = a6Var.x;
        b71.a aVar3 = b71.a.r;
        i = a6Var.z;
        if (i != 0) {
        }
        cVar2 = (gu0.c) obj2;
        ArrayList arrayList2 = null;
        if (cVar2 != null) {
        }
    }

    @Override // z01.w0
    public final Object a(String str, String str2) {
        switch (this.r) {
            case 0:
                bo.Companion.getClass();
                bo a = ao.a(str2);
                a71.c cVar = null;
                return y71.n1.y(in.r.l(in.r.h(y71.n1.x(new w6(this, str, a, cVar, 0), new t00.f8(new v6(this, str, a, null, 0))))), this.t);
            case 1:
                z00.Companion.getClass();
                z00 a2 = y00.a(str2);
                return y71.n1.y(in.r.l(in.r.h(y71.n1.x(new t00.x6(this, str, a2, (a71.c) null, 0), new t00.f8(new t00.w6(this, str, a2, (a71.c) null, 0))))), this.t);
            case 2:
                zm.Companion.getClass();
                zm a3 = ym.a(str2);
                return y71.n1.y(in.r.l(in.r.h(y71.n1.x(new vb0.e5(this, str, a3, null, 0), new t00.f8(new vb0.d5(this, str, a3, null, 0))))), this.t);
            default:
                cv.Companion.getClass();
                cv a4 = bv.a(str2);
                a71.c cVar2 = null;
                return y71.n1.y(in.r.l(in.r.h(y71.n1.x(new wy0.z5(this, str, a4, cVar2, 0), new t00.f8(new wy0.y5(this, str, a4, null, 0))))), this.t);
        }
    }

    @Override // z01.w0
    public final Object b(String str, String str2) {
        switch (this.r) {
            case 0:
                bo.Companion.getClass();
                bo a = ao.a(str2);
                a71.c cVar = null;
                return y71.n1.y(in.r.l(in.r.h(y71.n1.x(new w6(this, str, a, cVar, 1), new t00.f8(new v6(this, str, a, null, 1))))), this.t);
            case 1:
                z00.Companion.getClass();
                z00 a2 = y00.a(str2);
                return y71.n1.y(in.r.l(in.r.h(y71.n1.x(new t00.x6(this, str, a2, (a71.c) null, 1), new t00.f8(new t00.w6(this, str, a2, (a71.c) null, 1))))), this.t);
            case 2:
                zm.Companion.getClass();
                zm a3 = ym.a(str2);
                return y71.n1.y(in.r.l(in.r.h(y71.n1.x(new vb0.e5(this, str, a3, null, 1), new t00.f8(new vb0.d5(this, str, a3, null, 1))))), this.t);
            default:
                cv.Companion.getClass();
                cv a4 = bv.a(str2);
                a71.c cVar2 = null;
                return y71.n1.y(in.r.l(in.r.h(y71.n1.x(new wy0.z5(this, str, a4, cVar2, 1), new t00.f8(new wy0.y5(this, str, a4, null, 1))))), this.t);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
