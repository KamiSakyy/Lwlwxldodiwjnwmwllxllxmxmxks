package rm0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jn0.dv;
import jn0.ev;
import jo.ax;
import jo.bx;
import kc0.ss;
import kc0.ts;
import u10.or;
import u10.pr;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o2 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ File t;
    public final /* synthetic */ String u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Object w;

    public /* synthetic */ o2(y71.j jVar, Object obj, File file, String str, boolean z, int i) {
        this.r = i;
        this.s = jVar;
        this.w = obj;
        this.t = file;
        this.u = str;
        this.v = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        vb0.q1 q1Var;
        int i;
        Object obj2;
        c30.n nVar;
        c30.p pVar;
        c30.l lVar;
        String str;
        c30.p pVar2;
        c30.l lVar2;
        c30.t tVar;
        String str2;
        Object a4Var;
        c30.w wVar;
        boolean z;
        yz0.m1 m1Var;
        c30.w wVar2;
        c30.r rVar;
        c30.w wVar3;
        c30.w wVar4;
        yz0.m1 m1Var2;
        c30.q qVar;
        c30.w wVar5;
        if (cVar instanceof vb0.q1) {
            q1Var = (vb0.q1) cVar;
            int i2 = q1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q1Var.v = i2 - Integer.MIN_VALUE;
                Object obj3 = q1Var.u;
                b71.a aVar = b71.a.r;
                i = q1Var.v;
                if (i != 0) {
                    sy.y.j(obj3);
                    or orVar = (or) obj;
                    pr prVar = orVar.a;
                    if (prVar != null && (nVar = prVar.c.c) != null && (pVar = nVar.b) != null && (lVar = pVar.a) != null) {
                        c30.m mVar = lVar.c;
                        if ((mVar != null ? mVar.d : null) != null) {
                            q81.u uVar = ((a3) this.w).t;
                            String str3 = mVar.d.a;
                            if (str3 == null) {
                                str3 = "";
                            }
                            str = i21.a.q(uVar, this.t, this.u, str3);
                        } else {
                            str = null;
                        }
                        c30.y yVar = orVar.a.c;
                        String str4 = yVar.a;
                        String str5 = yVar.f.b;
                        Integer num = yVar.b;
                        c30.v vVar = yVar.e;
                        c30.n nVar2 = yVar.c;
                        if (nVar2 != null && (pVar2 = nVar2.b) != null && (lVar2 = pVar2.a) != null) {
                            String str6 = lVar2.b;
                            c30.m mVar2 = lVar2.c;
                            if (mVar2 == null || (qVar = mVar2.c) == null) {
                                int i3 = 2;
                                Collection<c30.o> collection = x61.r.r;
                                if (mVar2 == null || (rVar = mVar2.b) == null) {
                                    if (mVar2 != null && mVar2.d != null) {
                                        if (str == null) {
                                            throw new ApiFailure(ApiFailureType.UNKNOWN, null, null, null, null, null, null, 120);
                                        }
                                        boolean z2 = vVar != null ? vVar.c : false;
                                        boolean z3 = yVar.d;
                                        String str7 = str6 == null ? "" : str6;
                                        int intValue = num != null ? num.intValue() : 0;
                                        String str8 = (vVar == null || (wVar2 = vVar.d) == null) ? null : wVar2.b;
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        String concat = vVar != null ? "refs/heads/".concat(vVar.b) : null;
                                        obj2 = new yz0.y3(str4, intValue, z2, z3, str7, str8, concat == null ? "" : concat, str5, yVar.g, str);
                                        if (obj2 != null) {
                                            q1Var.v = 1;
                                            if (this.s.c(obj2, q1Var) == aVar) {
                                                return aVar;
                                            }
                                        }
                                    } else if (mVar2 != null && (tVar = mVar2.e) != null) {
                                        String str9 = lVar2.a;
                                        if (str9 != null) {
                                            str2 = str9.toLowerCase(Locale.ROOT);
                                            k71.k.f(str2, "toLowerCase(...)");
                                        } else {
                                            str2 = null;
                                        }
                                        if (k71.k.b(str2, ".webp") || k71.k.b(str2, ".ipynb")) {
                                            throw new ApiFailure(ApiFailureType.UNKNOWN, null, null, -100, null, null, null, 112);
                                        }
                                        boolean z4 = vVar != null ? vVar.c : false;
                                        boolean z5 = yVar.d;
                                        String str10 = lVar2.a;
                                        Collection collection2 = tVar.a;
                                        if (collection2 != null) {
                                            collection = collection2;
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        for (c30.x xVar : collection) {
                                            if (xVar != null) {
                                                w61.p pVar3 = wz0.d.a;
                                                o50.a aVar2 = xVar.b;
                                                wz0.e c = wz0.d.c(aVar2.a, 2);
                                                z = z5;
                                                m1Var = new yz0.m1(c.b, c.a, aVar2.b);
                                            } else {
                                                z = z5;
                                                m1Var = null;
                                            }
                                            if (m1Var != null) {
                                                arrayList.add(m1Var);
                                            }
                                            z5 = z;
                                        }
                                        boolean z6 = z5;
                                        String str11 = str6 == null ? "" : str6;
                                        int intValue2 = num != null ? num.intValue() : 0;
                                        String str12 = (vVar == null || (wVar = vVar.d) == null) ? null : wVar.b;
                                        String str13 = str12 == null ? "" : str12;
                                        String concat2 = vVar != null ? "refs/heads/".concat(vVar.b) : null;
                                        a4Var = new yz0.a4(str4, intValue2, z4, z6, str11, str13, concat2 == null ? "" : concat2, str5, yVar.g, str10, arrayList);
                                    }
                                } else if (this.v) {
                                    boolean z7 = vVar != null ? vVar.c : false;
                                    boolean z8 = yVar.d;
                                    Collection collection3 = rVar.b;
                                    if (collection3 != null) {
                                        collection = collection3;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    for (c30.o oVar : collection) {
                                        if (oVar != null) {
                                            w61.p pVar4 = wz0.d.a;
                                            o50.a aVar3 = oVar.b;
                                            wz0.e c2 = wz0.d.c(aVar3.a, i3);
                                            m1Var2 = new yz0.m1(c2.b, c2.a, aVar3.b);
                                        } else {
                                            m1Var2 = null;
                                        }
                                        if (m1Var2 != null) {
                                            arrayList2.add(m1Var2);
                                        }
                                        i3 = 2;
                                    }
                                    String str14 = str6 == null ? "" : str6;
                                    int intValue3 = num != null ? num.intValue() : 0;
                                    String str15 = (vVar == null || (wVar4 = vVar.d) == null) ? null : wVar4.b;
                                    String str16 = str15 == null ? "" : str15;
                                    String concat3 = vVar != null ? "refs/heads/".concat(vVar.b) : null;
                                    a4Var = new yz0.z3(str4, intValue3, z7, z8, str14, str16, concat3 == null ? "" : concat3, str5, yVar.g, arrayList2);
                                } else {
                                    boolean z9 = vVar != null ? vVar.c : false;
                                    boolean z10 = yVar.d;
                                    String str17 = rVar.a;
                                    String str18 = str17 == null ? "" : str17;
                                    String str19 = str6 == null ? "" : str6;
                                    int intValue4 = num != null ? num.intValue() : 0;
                                    String str20 = (vVar == null || (wVar3 = vVar.d) == null) ? null : wVar3.b;
                                    String str21 = str20 == null ? "" : str20;
                                    String concat4 = vVar != null ? "refs/heads/".concat(vVar.b) : null;
                                    a4Var = new yz0.x3(str4, intValue4, z9, z10, str19, str21, concat4 == null ? "" : concat4, str5, yVar.g, str18);
                                }
                            } else {
                                boolean z12 = vVar != null ? vVar.c : false;
                                boolean z13 = yVar.d;
                                String str22 = qVar.a;
                                String str23 = str22 == null ? "" : str22;
                                String str24 = str6 == null ? "" : str6;
                                int intValue5 = num != null ? num.intValue() : 0;
                                String str25 = (vVar == null || (wVar5 = vVar.d) == null) ? null : wVar5.b;
                                String str26 = str25 == null ? "" : str25;
                                String concat5 = vVar != null ? "refs/heads/".concat(vVar.b) : null;
                                a4Var = new yz0.w3(str4, intValue5, z12, z13, str24, str26, concat5 == null ? "" : concat5, str5, yVar.g, str23);
                            }
                            obj2 = a4Var;
                            if (obj2 != null) {
                            }
                        }
                    }
                    obj2 = null;
                    if (obj2 != null) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj3);
                }
                return w61.a0.a;
            }
        }
        q1Var = new vb0.q1(this, cVar);
        Object obj32 = q1Var.u;
        b71.a aVar4 = b71.a.r;
        i = q1Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x066b  */
    /* JADX WARN: Type inference failed for: r24v0, types: [yz0.y3] */
    /* JADX WARN: Type inference failed for: r24v1, types: [yz0.y3] */
    /* JADX WARN: Type inference failed for: r24v2, types: [yz0.y3] */
    /* JADX WARN: Type inference failed for: r35v0, types: [yz0.a4] */
    /* JADX WARN: Type inference failed for: r35v1, types: [yz0.x3] */
    /* JADX WARN: Type inference failed for: r35v10, types: [yz0.a4] */
    /* JADX WARN: Type inference failed for: r35v11, types: [yz0.x3] */
    /* JADX WARN: Type inference failed for: r35v12, types: [yz0.z3] */
    /* JADX WARN: Type inference failed for: r35v14, types: [yz0.w3] */
    /* JADX WARN: Type inference failed for: r35v2, types: [yz0.z3] */
    /* JADX WARN: Type inference failed for: r35v4, types: [yz0.w3] */
    /* JADX WARN: Type inference failed for: r35v5, types: [yz0.a4] */
    /* JADX WARN: Type inference failed for: r35v6, types: [yz0.x3] */
    /* JADX WARN: Type inference failed for: r35v7, types: [yz0.z3] */
    /* JADX WARN: Type inference failed for: r35v9, types: [yz0.w3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        n2 n2Var;
        int i;
        sd0.w wVar;
        sd0.y yVar;
        sd0.u uVar;
        String str;
        sd0.y yVar2;
        sd0.u uVar2;
        sd0.c0 c0Var;
        String str2;
        sd0.f0 f0Var;
        yz0.m1 m1Var;
        sd0.f0 f0Var2;
        sd0.a0 a0Var;
        sd0.f0 f0Var3;
        sd0.f0 f0Var4;
        yz0.m1 m1Var2;
        String str3;
        sd0.z zVar;
        sd0.f0 f0Var5;
        t00.e2 e2Var;
        int i2;
        cq.k4 k4Var;
        cq.m4 m4Var;
        cq.i4 i4Var;
        String str4;
        cq.m4 m4Var2;
        cq.i4 i4Var2;
        cq.q4 q4Var;
        String str5;
        cq.t4 t4Var;
        Iterator it;
        yz0.m1 m1Var3;
        cq.t4 t4Var2;
        cq.o4 o4Var;
        cq.t4 t4Var3;
        cq.t4 t4Var4;
        yz0.m1 m1Var4;
        String str6;
        cq.n4 n4Var;
        cq.t4 t4Var5;
        w61.a0 a0Var2;
        wy0.w1Shadow w1Var;
        int i3;
        ap0.o3 o3Var;
        ap0.q3 q3Var;
        ap0.m3 m3Var;
        String str7;
        ap0.q3 q3Var2;
        ap0.m3 m3Var2;
        ap0.u3 u3Var;
        String str8;
        ap0.x3 x3Var;
        Iterator it2;
        yz0.m1 m1Var5;
        ap0.x3 x3Var2;
        ap0.s3 s3Var;
        ap0.x3 x3Var3;
        ap0.x3 x3Var4;
        yz0.m1 m1Var6;
        String str9;
        ap0.r3Shadow r3Var;
        ap0.x3 x3Var5;
        int i4 = this.r;
        w61.a0 a0Var3 = w61.a0.a;
        x61.r rVar = x61.r.r;
        boolean z = this.v;
        String str10 = this.u;
        File file = this.t;
        Object obj2 = this.w;
        y71.j jVar = this.s;
        switch (i4) {
            case 0:
                if (cVar instanceof n2) {
                    n2Var = (n2) cVar;
                    int i5 = n2Var.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        n2Var.v = i5 - Integer.MIN_VALUE;
                        Object obj3 = n2Var.u;
                        b71.a aVar = b71.a.r;
                        i = n2Var.v;
                        if (i != 0) {
                            sy.y.j(obj3);
                            ss ssVar = (ss) obj;
                            ts tsVar = ssVar.a;
                            if (tsVar != null && (wVar = tsVar.c.c) != null && (yVar = wVar.b) != null && (uVar = yVar.a) != null) {
                                sd0.v vVar = uVar.c;
                                if ((vVar != null ? vVar.d : null) != null) {
                                    q81.u uVar3 = ((a3) obj2).t;
                                    String str11 = vVar.d.a;
                                    if (str11 == null) {
                                        str11 = "";
                                    }
                                    str = i21.a.q(uVar3, file, str10, str11);
                                } else {
                                    str = null;
                                }
                                sd0.h0Shadow h0Var = ssVar.a.c;
                                String str12 = h0Var.a;
                                String str13 = h0Var.f.b;
                                Integer num = h0Var.b;
                                sd0.e0 e0Var = h0Var.e;
                                sd0.w wVar2 = h0Var.c;
                                if (wVar2 != null && (yVar2 = wVar2.b) != null && (uVar2 = yVar2.a) != null) {
                                    String str14 = uVar2.b;
                                    sd0.v vVar2 = uVar2.c;
                                    if (vVar2 != null && (zVar = vVar2.c) != null) {
                                        boolean z2 = e0Var != null ? e0Var.c : false;
                                        boolean z3 = h0Var.d;
                                        String str15 = zVar.a;
                                        String str16 = str15 == null ? "" : str15;
                                        String str17 = str14 == null ? "" : str14;
                                        int intValue = num != null ? num.intValue() : 0;
                                        String str18 = (e0Var == null || (f0Var5 = e0Var.d) == null) ? null : f0Var5.b;
                                        String str19 = str18 == null ? "" : str18;
                                        r17 = e0Var != null ? "refs/heads/".concat(e0Var.b) : null;
                                        str3 = new yz0.w3(str12, intValue, z2, z3, str17, str19, r17 == null ? "" : r17, str13, h0Var.g, str16);
                                    } else if (vVar2 == null || (a0Var = vVar2.b) == null) {
                                        if (vVar2 != null && vVar2.d != null) {
                                            if (str == null) {
                                                throw new ApiFailure(ApiFailureType.UNKNOWN, null, null, null, null, null, null, 120);
                                            }
                                            boolean z4 = e0Var != null ? e0Var.c : false;
                                            boolean z5 = h0Var.d;
                                            String str20 = str14 == null ? "" : str14;
                                            int intValue2 = num != null ? num.intValue() : 0;
                                            String str21 = (e0Var == null || (f0Var2 = e0Var.d) == null) ? null : f0Var2.b;
                                            String str22 = str21 == null ? "" : str21;
                                            r17 = e0Var != null ? "refs/heads/".concat(e0Var.b) : null;
                                            r17 = new yz0.y3(str12, intValue2, z4, z5, str20, str22, r17 == null ? "" : r17, str13, h0Var.g, str);
                                        } else if (vVar2 != null && (c0Var = vVar2.e) != null) {
                                            String str23 = uVar2.a;
                                            if (str23 != null) {
                                                str2 = str23.toLowerCase(Locale.ROOT);
                                                k71.k.f(str2, "toLowerCase(...)");
                                            } else {
                                                str2 = null;
                                            }
                                            if (k71.k.b(str2, ".webp") || k71.k.b(str2, ".ipynb")) {
                                                throw new ApiFailure(ApiFailureType.UNKNOWN, null, null, -100, null, null, null, 112);
                                            }
                                            boolean z6 = e0Var != null ? e0Var.c : false;
                                            boolean z7 = h0Var.d;
                                            String str24 = uVar2.a;
                                            List<sd0.g0> list = c0Var.a;
                                            if (list == null) {
                                                list = rVar;
                                            }
                                            ArrayList arrayList = new ArrayList();
                                            for (sd0.g0 g0Var : list) {
                                                if (g0Var != null) {
                                                    w61.p pVar = wz0.d.a;
                                                    eg0.a aVar2 = g0Var.b;
                                                    wz0.e c = wz0.d.c(aVar2.a, 2);
                                                    m1Var = new yz0.m1(c.b, c.a, aVar2.b);
                                                } else {
                                                    m1Var = null;
                                                }
                                                if (m1Var != null) {
                                                    arrayList.add(m1Var);
                                                }
                                            }
                                            String str25 = str14 == null ? "" : str14;
                                            int intValue3 = num != null ? num.intValue() : 0;
                                            String str26 = (e0Var == null || (f0Var = e0Var.d) == null) ? null : f0Var.b;
                                            String str27 = str26 == null ? "" : str26;
                                            r17 = e0Var != null ? "refs/heads/".concat(e0Var.b) : null;
                                            str3 = new yz0.a4(str12, intValue3, z6, z7, str25, str27, r17 == null ? "" : r17, str13, h0Var.g, str24, arrayList);
                                        }
                                    } else if (z) {
                                        boolean z8 = e0Var != null ? e0Var.c : false;
                                        boolean z9 = h0Var.d;
                                        List<sd0.x> list2 = a0Var.b;
                                        if (list2 == null) {
                                            list2 = rVar;
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        for (sd0.x xVar : list2) {
                                            if (xVar != null) {
                                                w61.p pVar2 = wz0.d.a;
                                                eg0.a aVar3 = xVar.b;
                                                wz0.e c2 = wz0.d.c(aVar3.a, 2);
                                                m1Var2 = new yz0.m1(c2.b, c2.a, aVar3.b);
                                            } else {
                                                m1Var2 = null;
                                            }
                                            if (m1Var2 != null) {
                                                arrayList2.add(m1Var2);
                                            }
                                        }
                                        String str28 = str14 == null ? "" : str14;
                                        int intValue4 = num != null ? num.intValue() : 0;
                                        String str29 = (e0Var == null || (f0Var4 = e0Var.d) == null) ? null : f0Var4.b;
                                        String str30 = str29 == null ? "" : str29;
                                        r17 = e0Var != null ? "refs/heads/".concat(e0Var.b) : null;
                                        str3 = new yz0.z3(str12, intValue4, z8, z9, str28, str30, r17 == null ? "" : r17, str13, h0Var.g, arrayList2);
                                    } else {
                                        boolean z10 = e0Var != null ? e0Var.c : false;
                                        boolean z12 = h0Var.d;
                                        String str31 = a0Var.a;
                                        String str32 = str31 == null ? "" : str31;
                                        String str33 = str14 == null ? "" : str14;
                                        int intValue5 = num != null ? num.intValue() : 0;
                                        String str34 = (e0Var == null || (f0Var3 = e0Var.d) == null) ? null : f0Var3.b;
                                        String str35 = str34 == null ? "" : str34;
                                        r17 = e0Var != null ? "refs/heads/".concat(e0Var.b) : null;
                                        str3 = new yz0.x3(str12, intValue5, z10, z12, str33, str35, r17 == null ? "" : r17, str13, h0Var.g, str32);
                                    }
                                    r17 = str3;
                                }
                            }
                            String str36 = r17;
                            if (str36 != null) {
                                n2Var.v = 1;
                                if (jVar.c(str36, n2Var) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return a0Var3;
                    }
                }
                n2Var = new n2(this, cVar);
                Object obj32 = n2Var.u;
                b71.a aVar4 = b71.a.r;
                i = n2Var.v;
                if (i != 0) {
                }
                return a0Var3;
            case 1:
                if (cVar instanceof t00.e2) {
                    e2Var = (t00.e2) cVar;
                    int i6 = e2Var.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        e2Var.v = i6 - Integer.MIN_VALUE;
                        Object obj4 = e2Var.u;
                        b71.a aVar5 = b71.a.r;
                        i2 = e2Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            ax axVar = (ax) obj;
                            bx bxVar = axVar.a;
                            if (bxVar != null && (k4Var = bxVar.c.c) != null && (m4Var = k4Var.b) != null && (i4Var = m4Var.a) != null) {
                                cq.j4 j4Var = i4Var.c;
                                if ((j4Var != null ? j4Var.d : null) != null) {
                                    q81.u uVar4 = ((a3) obj2).t;
                                    String str37 = j4Var.d.a;
                                    if (str37 == null) {
                                        str37 = "";
                                    }
                                    str4 = i21.a.q(uVar4, file, str10, str37);
                                } else {
                                    str4 = null;
                                }
                                cq.v4 v4Var = axVar.a.c;
                                String str38 = v4Var.a;
                                String str39 = v4Var.f.b;
                                Integer num2 = v4Var.b;
                                cq.s4 s4Var = v4Var.e;
                                cq.k4 k4Var2 = v4Var.c;
                                if (k4Var2 != null && (m4Var2 = k4Var2.b) != null && (i4Var2 = m4Var2.a) != null) {
                                    String str40 = i4Var2.b;
                                    cq.j4 j4Var2 = i4Var2.c;
                                    if (j4Var2 != null && (n4Var = j4Var2.c) != null) {
                                        boolean z13 = s4Var != null ? s4Var.c : false;
                                        boolean z14 = v4Var.d;
                                        String str41 = n4Var.a;
                                        String str42 = str41 == null ? "" : str41;
                                        String str43 = str40 == null ? "" : str40;
                                        int intValue6 = num2 != null ? num2.intValue() : 0;
                                        String str44 = (s4Var == null || (t4Var5 = s4Var.d) == null) ? null : t4Var5.b;
                                        String str45 = str44 == null ? "" : str44;
                                        r17 = s4Var != null ? "refs/heads/".concat(s4Var.b) : null;
                                        str6 = new yz0.w3(str38, intValue6, z13, z14, str43, str45, r17 == null ? "" : r17, str39, v4Var.g, str42);
                                    } else if (j4Var2 == null || (o4Var = j4Var2.b) == null) {
                                        if (j4Var2 != null && j4Var2.d != null) {
                                            if (str4 == null) {
                                                throw new ApiFailure(ApiFailureType.UNKNOWN, null, null, null, null, null, null, 120);
                                            }
                                            boolean z15 = s4Var != null ? s4Var.c : false;
                                            boolean z16 = v4Var.d;
                                            String str46 = str40 == null ? "" : str40;
                                            int intValue7 = num2 != null ? num2.intValue() : 0;
                                            String str47 = (s4Var == null || (t4Var2 = s4Var.d) == null) ? null : t4Var2.b;
                                            String str48 = str47 == null ? "" : str47;
                                            r17 = s4Var != null ? "refs/heads/".concat(s4Var.b) : null;
                                            r17 = new yz0.y3(str38, intValue7, z15, z16, str46, str48, r17 == null ? "" : r17, str39, v4Var.g, str4);
                                        } else if (j4Var2 != null && (q4Var = j4Var2.e) != null) {
                                            String str49 = i4Var2.a;
                                            if (str49 != null) {
                                                str5 = str49.toLowerCase(Locale.ROOT);
                                                k71.k.f(str5, "toLowerCase(...)");
                                            } else {
                                                str5 = null;
                                            }
                                            if (k71.k.b(str5, ".webp") || k71.k.b(str5, ".ipynb")) {
                                                throw new ApiFailure(ApiFailureType.UNKNOWN, null, null, -100, null, null, null, 112);
                                            }
                                            boolean z17 = s4Var != null ? s4Var.c : false;
                                            boolean z18 = v4Var.d;
                                            String str50 = i4Var2.a;
                                            List list3 = q4Var.a;
                                            if (list3 == null) {
                                                list3 = rVar;
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator it3 = list3.iterator();
                                            while (it3.hasNext()) {
                                                cq.u4 u4Var = (cq.u4) it3.next();
                                                if (u4Var != null) {
                                                    w61.p pVar3 = wz0.d.a;
                                                    us.a aVar6 = u4Var.b;
                                                    wz0.e c3 = wz0.d.c(aVar6.a, 2);
                                                    it = it3;
                                                    m1Var3 = new yz0.m1(c3.b, c3.a, aVar6.b);
                                                } else {
                                                    it = it3;
                                                    m1Var3 = null;
                                                }
                                                if (m1Var3 != null) {
                                                    arrayList3.add(m1Var3);
                                                }
                                                it3 = it;
                                            }
                                            String str51 = str40 == null ? "" : str40;
                                            int intValue8 = num2 != null ? num2.intValue() : 0;
                                            String str52 = (s4Var == null || (t4Var = s4Var.d) == null) ? null : t4Var.b;
                                            String str53 = str52 == null ? "" : str52;
                                            r17 = s4Var != null ? "refs/heads/".concat(s4Var.b) : null;
                                            str6 = new yz0.a4(str38, intValue8, z17, z18, str51, str53, r17 == null ? "" : r17, str39, v4Var.g, str50, arrayList3);
                                        }
                                    } else if (z) {
                                        boolean z19 = s4Var != null ? s4Var.c : false;
                                        boolean z20 = v4Var.d;
                                        List<cq.l4> list4 = o4Var.b;
                                        if (list4 == null) {
                                            list4 = rVar;
                                        }
                                        ArrayList arrayList4 = new ArrayList();
                                        for (cq.l4 l4Var : list4) {
                                            if (l4Var != null) {
                                                w61.p pVar4 = wz0.d.a;
                                                us.a aVar7 = l4Var.b;
                                                wz0.e c4 = wz0.d.c(aVar7.a, 2);
                                                m1Var4 = new yz0.m1(c4.b, c4.a, aVar7.b);
                                            } else {
                                                m1Var4 = null;
                                            }
                                            if (m1Var4 != null) {
                                                arrayList4.add(m1Var4);
                                            }
                                        }
                                        String str54 = str40 == null ? "" : str40;
                                        int intValue9 = num2 != null ? num2.intValue() : 0;
                                        String str55 = (s4Var == null || (t4Var4 = s4Var.d) == null) ? null : t4Var4.b;
                                        String str56 = str55 == null ? "" : str55;
                                        r17 = s4Var != null ? "refs/heads/".concat(s4Var.b) : null;
                                        str6 = new yz0.z3(str38, intValue9, z19, z20, str54, str56, r17 == null ? "" : r17, str39, v4Var.g, arrayList4);
                                    } else {
                                        boolean z22 = s4Var != null ? s4Var.c : false;
                                        boolean z23 = v4Var.d;
                                        String str57 = o4Var.a;
                                        String str58 = str57 == null ? "" : str57;
                                        String str59 = str40 == null ? "" : str40;
                                        int intValue10 = num2 != null ? num2.intValue() : 0;
                                        String str60 = (s4Var == null || (t4Var3 = s4Var.d) == null) ? null : t4Var3.b;
                                        String str61 = str60 == null ? "" : str60;
                                        r17 = s4Var != null ? "refs/heads/".concat(s4Var.b) : null;
                                        str6 = new yz0.x3(str38, intValue10, z22, z23, str59, str61, r17 == null ? "" : r17, str39, v4Var.g, str58);
                                    }
                                    r17 = str6;
                                }
                            }
                            String str62 = r17;
                            if (str62 != null) {
                                e2Var.v = 1;
                                if (jVar.c(str62, e2Var) == aVar5) {
                                    return aVar5;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return a0Var3;
                    }
                }
                e2Var = new t00.e2(this, cVar);
                Object obj42 = e2Var.u;
                b71.a aVar52 = b71.a.r;
                i2 = e2Var.v;
                if (i2 != 0) {
                }
                return a0Var3;
            case 2:
                return a(cVar, obj);
            default:
                if (cVar instanceof wy0.w1) {
                    w1Var = (wy0.w1) cVar;
                    a0Var2 = a0Var3;
                    int i7 = w1Var.v;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        w1Var.v = i7 - Integer.MIN_VALUE;
                        Object obj5 = w1Var.u;
                        b71.a aVar8 = b71.a.r;
                        i3 = w1Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj5);
                            dv dvVar = (dv) obj;
                            ev evVar = dvVar.a;
                            if (evVar != null && (o3Var = evVar.c.c) != null && (q3Var = o3Var.b) != null && (m3Var = q3Var.a) != null) {
                                ap0.n3 n3Var = m3Var.c;
                                if ((n3Var != null ? n3Var.d : null) != null) {
                                    q81.u uVar5 = ((a3) obj2).t;
                                    String str63 = n3Var.d.a;
                                    if (str63 == null) {
                                        str63 = "";
                                    }
                                    str7 = i21.a.q(uVar5, file, str10, str63);
                                } else {
                                    str7 = null;
                                }
                                ap0.z3 z3Var = dvVar.a.c;
                                String str64 = z3Var.a;
                                String str65 = z3Var.f.b;
                                Integer num3 = z3Var.b;
                                ap0.w3 w3Var = z3Var.e;
                                ap0.o3 o3Var2 = z3Var.c;
                                if (o3Var2 != null && (q3Var2 = o3Var2.b) != null && (m3Var2 = q3Var2.a) != null) {
                                    String str66 = m3Var2.b;
                                    ap0.n3 n3Var2 = m3Var2.c;
                                    if (n3Var2 != null && (r3Var = n3Var2.c) != null) {
                                        boolean z24 = w3Var != null ? w3Var.c : false;
                                        boolean z25 = z3Var.d;
                                        String str67 = r3Var.a;
                                        String str68 = str67 == null ? "" : str67;
                                        String str69 = str66 == null ? "" : str66;
                                        int intValue11 = num3 != null ? num3.intValue() : 0;
                                        String str70 = (w3Var == null || (x3Var5 = w3Var.d) == null) ? null : x3Var5.b;
                                        String str71 = str70 == null ? "" : str70;
                                        r17 = w3Var != null ? "refs/heads/".concat(w3Var.b) : null;
                                        str9 = new yz0.w3(str64, intValue11, z24, z25, str69, str71, r17 == null ? "" : r17, str65, z3Var.g, str68);
                                    } else if (n3Var2 == null || (s3Var = n3Var2.b) == null) {
                                        if (n3Var2 != null && n3Var2.d != null) {
                                            if (str7 == null) {
                                                throw new ApiFailure(ApiFailureType.UNKNOWN, null, null, null, null, null, null, 120);
                                            }
                                            boolean z26 = w3Var != null ? w3Var.c : false;
                                            boolean z27 = z3Var.d;
                                            String str72 = str66 == null ? "" : str66;
                                            int intValue12 = num3 != null ? num3.intValue() : 0;
                                            String str73 = (w3Var == null || (x3Var2 = w3Var.d) == null) ? null : x3Var2.b;
                                            String str74 = str73 == null ? "" : str73;
                                            r17 = w3Var != null ? "refs/heads/".concat(w3Var.b) : null;
                                            r17 = new yz0.y3(str64, intValue12, z26, z27, str72, str74, r17 == null ? "" : r17, str65, z3Var.g, str7);
                                        } else if (n3Var2 != null && (u3Var = n3Var2.e) != null) {
                                            String str75 = m3Var2.a;
                                            if (str75 != null) {
                                                str8 = str75.toLowerCase(Locale.ROOT);
                                                k71.k.f(str8, "toLowerCase(...)");
                                            } else {
                                                str8 = null;
                                            }
                                            if (k71.k.b(str8, ".webp") || k71.k.b(str8, ".ipynb")) {
                                                throw new ApiFailure(ApiFailureType.UNKNOWN, null, null, -100, null, null, null, 112);
                                            }
                                            boolean z28 = w3Var != null ? w3Var.c : false;
                                            boolean z29 = z3Var.d;
                                            String str76 = m3Var2.a;
                                            List list5 = u3Var.a;
                                            if (list5 == null) {
                                                list5 = rVar;
                                            }
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator it4 = list5.iterator();
                                            while (it4.hasNext()) {
                                                ap0.y3 y3Var = (ap0.y3) it4.next();
                                                if (y3Var != null) {
                                                    w61.p pVar5 = wz0.d.a;
                                                    mr0.a aVar9 = y3Var.b;
                                                    wz0.e c5 = wz0.d.c(aVar9.a, 2);
                                                    it2 = it4;
                                                    m1Var5 = new yz0.m1(c5.b, c5.a, aVar9.b);
                                                } else {
                                                    it2 = it4;
                                                    m1Var5 = null;
                                                }
                                                if (m1Var5 != null) {
                                                    arrayList5.add(m1Var5);
                                                }
                                                it4 = it2;
                                            }
                                            String str77 = str66 == null ? "" : str66;
                                            int intValue13 = num3 != null ? num3.intValue() : 0;
                                            String str78 = (w3Var == null || (x3Var = w3Var.d) == null) ? null : x3Var.b;
                                            String str79 = str78 == null ? "" : str78;
                                            r17 = w3Var != null ? "refs/heads/".concat(w3Var.b) : null;
                                            str9 = new yz0.a4(str64, intValue13, z28, z29, str77, str79, r17 == null ? "" : r17, str65, z3Var.g, str76, arrayList5);
                                        }
                                    } else if (z) {
                                        boolean z30 = w3Var != null ? w3Var.c : false;
                                        boolean z32 = z3Var.d;
                                        List<ap0.p3> list6 = s3Var.b;
                                        if (list6 == null) {
                                            list6 = rVar;
                                        }
                                        ArrayList arrayList6 = new ArrayList();
                                        for (ap0.p3 p3Var : list6) {
                                            if (p3Var != null) {
                                                w61.p pVar6 = wz0.d.a;
                                                mr0.a aVar10 = p3Var.b;
                                                wz0.e c6 = wz0.d.c(aVar10.a, 2);
                                                m1Var6 = new yz0.m1(c6.b, c6.a, aVar10.b);
                                            } else {
                                                m1Var6 = null;
                                            }
                                            if (m1Var6 != null) {
                                                arrayList6.add(m1Var6);
                                            }
                                        }
                                        String str80 = str66 == null ? "" : str66;
                                        int intValue14 = num3 != null ? num3.intValue() : 0;
                                        String str81 = (w3Var == null || (x3Var4 = w3Var.d) == null) ? null : x3Var4.b;
                                        String str82 = str81 == null ? "" : str81;
                                        r17 = w3Var != null ? "refs/heads/".concat(w3Var.b) : null;
                                        str9 = new yz0.z3(str64, intValue14, z30, z32, str80, str82, r17 == null ? "" : r17, str65, z3Var.g, arrayList6);
                                    } else {
                                        boolean z33 = w3Var != null ? w3Var.c : false;
                                        boolean z34 = z3Var.d;
                                        String str83 = s3Var.a;
                                        String str84 = str83 == null ? "" : str83;
                                        String str85 = str66 == null ? "" : str66;
                                        int intValue15 = num3 != null ? num3.intValue() : 0;
                                        String str86 = (w3Var == null || (x3Var3 = w3Var.d) == null) ? null : x3Var3.b;
                                        String str87 = str86 == null ? "" : str86;
                                        r17 = w3Var != null ? "refs/heads/".concat(w3Var.b) : null;
                                        str9 = new yz0.x3(str64, intValue15, z33, z34, str85, str87, r17 == null ? "" : r17, str65, z3Var.g, str84);
                                    }
                                    r17 = str9;
                                }
                            }
                            String str88 = r17;
                            if (str88 != null) {
                                w1Var.v = 1;
                                if (jVar.c(str88, w1Var) == aVar8) {
                                    return aVar8;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return a0Var2;
                    }
                } else {
                    a0Var2 = a0Var3;
                }
                w1Var = new wy0.w1(this, cVar);
                Object obj52 = w1Var.u;
                b71.a aVar82 = b71.a.r;
                i3 = w1Var.v;
                if (i3 != 0) {
                }
                return a0Var2;
        }
    }
}
