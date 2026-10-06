package t00;

import android.content.Context;
import android.os.Build;
import com.github.domain.database.GitHubDatabase;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import jn0.du;
import jn0.fw;
import jn0.k20;
import jn0.nd;
import jn0.o20;
import jn0.s20;
import jn0.sd;
import jn0.t20;
import jn0.u20;
import jn0.v20;
import jn0.xv;
import jo.gy;
import jo.ke;
import jo.pe;
import jo.ux;
import k71.k;
import u10.ax;
import u10.ex;
import u10.fx;
import u10.hx;
import u10.xw;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z1 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(j71.e eVar, x3.h hVar, a71.c cVar) {
        super(2, cVar);
        this.v = 10;
        this.y = (c71.j) eVar;
        this.z = hVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                z1 z1Var = new z1((rm0.k2) this.y, (pe) this.z, cVar, 0);
                z1Var.x = obj;
                return z1Var;
            case 1:
                z1 z1Var2 = new z1((rm0.j4) this.y, (String) this.z, cVar, 1);
                z1Var2.x = obj;
                return z1Var2;
            case 2:
                return new z1((rm0.j4) this.x, (String) this.y, (String) this.z, cVar, 2);
            case 3:
                z1 z1Var3 = new z1((h5) this.y, (rz.y) this.z, cVar, 3);
                z1Var3.x = obj;
                return z1Var3;
            case 4:
                z1 z1Var4 = new z1((l5) this.y, (rz.v0) this.z, cVar, 4);
                z1Var4.x = obj;
                return z1Var4;
            case 5:
                z1 z1Var5 = new z1((c9) this.y, (gy) this.z, cVar, 5);
                z1Var5.x = obj;
                return z1Var5;
            case 6:
                return new z1((ky.j) this.x, (String) this.y, (CloseReason) this.z, cVar, 6);
            case 7:
                return new z1((ky.j) this.x, (String) this.y, (String) this.z, cVar, 7);
            case 8:
                return new z1((ky.j) this.x, (v20) this.y, (String) this.z, cVar, 8);
            case 9:
                z1 z1Var6 = new z1((um.r) this.y, (oa.j) this.z, cVar, 9);
                z1Var6.x = obj;
                return z1Var6;
            case 10:
                z1 z1Var7 = new z1((c71.j) this.y, (x3.h) this.z, cVar);
                z1Var7.x = obj;
                return z1Var7;
            case 11:
                z1 z1Var8 = new z1((vb0.k1) this.y, (String) this.z, cVar, 11);
                z1Var8.x = obj;
                return z1Var8;
            case 12:
                return new z1((hl0.f) this.x, (hx) this.y, (String) this.z, cVar, 12);
            case 13:
                z1 z1Var9 = new z1((rm0.j4) this.y, (String) this.z, cVar, 13);
                z1Var9.x = obj;
                return z1Var9;
            case 14:
                return new z1((rm0.j4) this.x, (String) this.y, (String) this.z, cVar, 14);
            case 15:
                return new z1((x71.hShadow) this.z, cVar);
            case 16:
                return new z1((w8.a0) this.x, (v8.w) this.y, (e9.r) this.z, cVar, 16);
            case 17:
                z1 z1Var10 = new z1((wy0.l1) this.y, (String) this.z, cVar, 17);
                z1Var10.x = obj;
                return z1Var10;
            case 18:
                z1 z1Var11 = new z1((rm0.k2) this.y, (sd) this.z, cVar, 18);
                z1Var11.x = obj;
                return z1Var11;
            case 19:
                z1 z1Var12 = new z1((rm0.j4) this.y, (String) this.z, cVar, 19);
                z1Var12.x = obj;
                return z1Var12;
            case 20:
                return new z1((rm0.j4) this.x, (String) this.y, (String) this.z, cVar, 20);
            case 21:
                z1 z1Var13 = new z1((h5) this.y, (ux0.y) this.z, cVar, 21);
                z1Var13.x = obj;
                return z1Var13;
            case 22:
                z1 z1Var14 = new z1((l5) this.y, (ux0.v0) this.z, cVar, 22);
                z1Var14.x = obj;
                return z1Var14;
            case 23:
                z1 z1Var15 = new z1((c9) this.y, (fw) this.z, cVar, 23);
                z1Var15.x = obj;
                return z1Var15;
            case 24:
                z1 z1Var16 = new z1((x71.w) this.y, this.z, cVar, 24);
                z1Var16.x = obj;
                return z1Var16;
            case 25:
                z1 z1Var17 = new z1((xk.c) this.y, (oa.j) this.z, cVar, 25);
                z1Var17.x = obj;
                return z1Var17;
            case 26:
                z1 z1Var18 = new z1((xk.j) this.y, (oa.j) this.z, cVar, 26);
                z1Var18.x = obj;
                return z1Var18;
            case 27:
                return new z1((y0.j) this.y, (z0.e) this.z, cVar, 27);
            case 28:
                z1 z1Var19 = new z1((nm.g) this.y, (k71.w) this.z, cVar, 28);
                z1Var19.x = obj;
                return z1Var19;
            default:
                return new z1((yl.a) this.x, (oa.j) this.y, (fk.f) this.z, cVar, 29);
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (ke) obj).v(w61.a0.a);
            case 1:
                return r((a71.c) obj2, (ly.c) obj).v(w61.a0.a);
            case 2:
                return r((a71.c) obj2, (ly.g) obj).v(w61.a0.a);
            case 3:
                return r((a71.c) obj2, (w61.k) obj).v(w61.a0.a);
            case 4:
                return r((a71.c) obj2, (w61.k) obj).v(w61.a0.a);
            case 5:
                return r((a71.c) obj2, (ux) obj).v(w61.a0.a);
            case 6:
                return r((a71.c) obj2, (jn0.y4) obj).v(w61.a0.a);
            case 7:
                return r((a71.c) obj2, (du) obj).v(w61.a0.a);
            case 8:
                return r((a71.c) obj2, (ow0.a1) obj).v(w61.a0.a);
            case 9:
                return r((a71.c) obj2, (List) obj).v(w61.a0.a);
            case 10:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            case 11:
                return r((a71.c) obj2, (u10.k) obj).v(w61.a0.a);
            case 12:
                return r((a71.c) obj2, (na0.r0) obj).v(w61.a0.a);
            case 13:
                return r((a71.c) obj2, (ra0.c) obj).v(w61.a0.a);
            case 14:
                return r((a71.c) obj2, (ra0.g) obj).v(w61.a0.a);
            case 15:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            case 16:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            case 17:
                return r((a71.c) obj2, (jn0.k) obj).v(w61.a0.a);
            case 18:
                return r((a71.c) obj2, (nd) obj).v(w61.a0.a);
            case 19:
                return r((a71.c) obj2, (uw0.c) obj).v(w61.a0.a);
            case 20:
                return r((a71.c) obj2, (uw0.g) obj).v(w61.a0.a);
            case 21:
                return r((a71.c) obj2, (w61.k) obj).v(w61.a0.a);
            case 22:
                return r((a71.c) obj2, (w61.k) obj).v(w61.a0.a);
            case 23:
                return r((a71.c) obj2, (xv) obj).v(w61.a0.a);
            case 24:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            case 25:
                return r((a71.c) obj2, (List) obj).v(w61.a0.a);
            case 26:
                return r((a71.c) obj2, (List) obj).v(w61.a0.a);
            case 27:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            case 28:
                return r((a71.c) obj2, (x71.t) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:228:0x03f5, code lost:
    
        if (r3 == r2) goto L221;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0452 A[Catch: all -> 0x0425, TryCatch #3 {all -> 0x0425, blocks: (B:234:0x041f, B:236:0x044a, B:238:0x0452, B:239:0x045f, B:246:0x046f, B:248:0x043d, B:252:0x0472, B:256:0x0477, B:257:0x0478, B:264:0x0438, B:241:0x0460, B:243:0x0466), top: B:230:0x0413, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v48, types: [x71.v] */
    /* JADX WARN: Type inference failed for: r3v50, types: [x71.hShadow] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [x71.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x0447 -> B:212:0x044a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        ly.d dVar;
        Object f;
        t20 t20Var;
        s20 s20Var;
        ArrayList arrayList;
        Object s;
        u10.h hVar;
        Object f2;
        fx fxVar;
        ex exVar;
        ArrayList arrayList2;
        ra0.d dVar2;
        x71.c cVar;
        Object b;
        boolean z;
        jn0.h hVar2;
        uw0.d dVar3;
        w61.m d;
        j71.c cVar2;
        int i = 4;
        x71.v r3 = (x71.v) (14);
        int i2 = 0;
        a71.c cVar3 = null;
        final int i3 = 1;
        switch (this.v) {
            case 0:
                ke keVar = (ke) this.x;
                b71.a aVar = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar = ((rm0.k2) this.y).t;
                    pe peVar = (pe) this.z;
                    this.x = null;
                    this.w = 1;
                    if (bVar.j(peVar, keVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 1:
                ly.c cVar4 = (ly.c) this.x;
                b71.a aVar2 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    sy.y.j(obj);
                    ly.b bVar2 = cVar4.a;
                    if (bVar2 != null && (dVar = bVar2.a) != null) {
                        qx.z0Shadow z0Var = dVar.c;
                        rm0.j4 j4Var = (rm0.j4) this.y;
                        String str = (String) this.z;
                        this.x = null;
                        this.w = 1;
                        if (rm0.j4.k(j4Var, z0Var, str, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i6 = this.w;
                if (i6 == 0) {
                    sy.y.j(obj);
                    rm0.j4 j4Var2 = (rm0.j4) this.x;
                    String str2 = (String) this.y;
                    String str3 = (String) this.z;
                    this.w = 1;
                    if (rm0.j4.n(j4Var2, str2, str3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 3:
                w61.k kVar = (w61.k) this.x;
                b71.a aVar4 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    sy.y.j(obj);
                    rz.u uVar = (rz.u) kVar.r;
                    com.github.service.wrapper.b bVar3 = ((h5) this.y).t;
                    rz.y yVar = (rz.y) this.z;
                    this.x = null;
                    this.w = 1;
                    if (bVar3.j(yVar, uVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 4:
                w61.k kVar2 = (w61.k) this.x;
                b71.a aVar5 = b71.a.r;
                int i8 = this.w;
                if (i8 == 0) {
                    sy.y.j(obj);
                    rz.s0 s0Var = (rz.s0) kVar2.r;
                    com.github.service.wrapper.b bVar4 = ((l5) this.y).t;
                    rz.v0 v0Var = (rz.v0) this.z;
                    this.x = null;
                    this.w = 1;
                    if (bVar4.j(v0Var, s0Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 5:
                ux uxVar = (ux) this.x;
                b71.a aVar6 = b71.a.r;
                int i9 = this.w;
                if (i9 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar5 = ((c9) this.y).t;
                    gy gyVar = (gy) this.z;
                    this.x = null;
                    this.w = 1;
                    if (bVar5.j(gyVar, uxVar, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 6:
                b71.a aVar7 = b71.a.r;
                int i11 = this.w;
                if (i11 == 0) {
                    sy.y.j(obj);
                    bz0.c0 c0Var = (bz0.c0) ((ky.j) this.x).x;
                    String str4 = (String) this.y;
                    CloseReason closeReason = (CloseReason) this.z;
                    this.w = 1;
                    if (c0Var.c(str4, closeReason, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 7:
                b71.a aVar8 = b71.a.r;
                int i12 = this.w;
                if (i12 == 0) {
                    sy.y.j(obj);
                    bz0.c0 c0Var2 = (bz0.c0) ((ky.j) this.x).y;
                    String str5 = (String) this.y;
                    String str6 = (String) this.z;
                    this.w = 1;
                    if (c0Var2.d(str5, str6, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 8:
                v20 v20Var = (v20) this.y;
                com.github.service.wrapper.b bVar6 = ((ky.j) this.x).s;
                b71.a aVar9 = b71.a.r;
                int i13 = this.w;
                if (i13 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    f = bVar6.f(v20Var);
                    if (f == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                    f = obj;
                }
                k20 k20Var = (k20) f;
                if (k20Var != null) {
                    String str7 = (String) this.z;
                    t20 t20Var2 = k20Var.a;
                    if (t20Var2 != null) {
                        s20 s20Var2 = t20Var2.e;
                        if (s20Var2 != null) {
                            List list = s20Var2.a;
                            if (list != null) {
                                ArrayList S = x61.m.S(list);
                                arrayList = new ArrayList();
                                int size = S.size();
                                while (i2 < size) {
                                    Object obj2 = S.get(i2);
                                    i2++;
                                    if (!((o20) obj2).a.b.equals(str7)) {
                                        arrayList.add(obj2);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            s20Var = new s20(arrayList);
                        } else {
                            s20Var = null;
                        }
                        t20Var = new t20(t20Var2.a, t20Var2.b, t20Var2.c, t20Var2.d, s20Var);
                    } else {
                        t20Var = null;
                    }
                    k20 a = k20.a(k20Var, t20Var, (u20) null, 14);
                    this.w = 2;
                    if (bVar6.j(v20Var, a, this) == aVar9) {
                        return aVar9;
                    }
                }
                return w61.a0.a;
            case 9:
                List list2 = (List) this.x;
                b71.a aVar10 = b71.a.r;
                int i14 = this.w;
                if (i14 == 0) {
                    sy.y.j(obj);
                    um.r rVar = (um.r) this.y;
                    um.s sVar = rVar.a;
                    oa.j jVar = (oa.j) this.z;
                    ArrayList c = rVar.c.c(list2);
                    this.x = null;
                    this.w = 1;
                    if (sVar.a(jVar, c, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 10:
                x3.h hVar3 = (x3.h) this.z;
                b71.a aVar11 = b71.a.r;
                int i15 = this.w;
                try {
                    if (i15 == 0) {
                        sy.y.j(obj);
                        v71.z zVar = (v71.z) this.x;
                        c71.j jVar2 = (c71.j) this.y;
                        this.w = 1;
                        s = jVar2.s(zVar, this);
                        if (s == aVar11) {
                            return aVar11;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        s = obj;
                    }
                    hVar3.a(s);
                } catch (CancellationException unused) {
                    hVar3.d = true;
                    x3.k kVar3 = hVar3.b;
                    if (kVar3 != null && kVar3.s.cancel(true)) {
                        hVar3.a = null;
                        hVar3.b = null;
                        hVar3.c = null;
                    }
                } catch (Throwable th2) {
                    hVar3.b(th2);
                }
                return w61.a0.a;
            case 11:
                u10.k kVar4 = (u10.k) this.x;
                b71.a aVar12 = b71.a.r;
                int i16 = this.w;
                if (i16 == 0) {
                    sy.y.j(obj);
                    u10.g gVar = kVar4.a;
                    if (gVar != null && (hVar = gVar.a) != null) {
                        i50.h hVar4 = hVar.d;
                        vb0.k1 k1Var = (vb0.k1) this.y;
                        String str8 = (String) this.z;
                        wb0.q qVar = k1Var.x;
                        this.x = null;
                        this.w = 1;
                        if (qVar.a(str8, hVar4, this) == aVar12) {
                            return aVar12;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 12:
                hx hxVar = (hx) this.y;
                com.github.service.wrapper.b bVar7 = ((hl0.f) this.x).t;
                b71.a aVar13 = b71.a.r;
                int i17 = this.w;
                if (i17 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    f2 = bVar7.f(hxVar);
                    if (f2 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                    f2 = obj;
                }
                xw xwVar = (xw) f2;
                if (xwVar != null) {
                    String str9 = (String) this.z;
                    fx fxVar2 = xwVar.a;
                    if (fxVar2 != null) {
                        ex exVar2 = fxVar2.d;
                        if (exVar2 != null) {
                            List list3 = exVar2.a;
                            if (list3 != null) {
                                ArrayList S2 = x61.m.S(list3);
                                arrayList2 = new ArrayList();
                                int size2 = S2.size();
                                while (i2 < size2) {
                                    Object obj3 = S2.get(i2);
                                    i2++;
                                    if (!((ax) obj3).a.b.equals(str9)) {
                                        arrayList2.add(obj3);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                            exVar = new ex(arrayList2);
                        } else {
                            exVar = null;
                        }
                        fxVar = new fx(fxVar2.a, fxVar2.b, fxVar2.c, exVar);
                    } else {
                        fxVar = null;
                    }
                    xw a2 = xw.a(xwVar, fxVar, null, 2);
                    this.w = 2;
                    if (bVar7.j(hxVar, a2, this) == aVar13) {
                        return aVar13;
                    }
                }
                return w61.a0.a;
            case 13:
                ra0.c cVar5 = (ra0.c) this.x;
                b71.a aVar14 = b71.a.r;
                int i18 = this.w;
                if (i18 == 0) {
                    sy.y.j(obj);
                    ra0.b bVar8 = cVar5.a;
                    if (bVar8 != null && (dVar2 = bVar8.a) != null) {
                        ea0.z0Shadow z0Var2 = dVar2.c;
                        rm0.j4 j4Var3 = (rm0.j4) this.y;
                        String str10 = (String) this.z;
                        this.x = null;
                        this.w = 1;
                        if (rm0.j4.i(j4Var3, z0Var2, str10, this) == aVar14) {
                            return aVar14;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 14:
                b71.a aVar15 = b71.a.r;
                int i19 = this.w;
                if (i19 == 0) {
                    sy.y.j(obj);
                    rm0.j4 j4Var4 = (rm0.j4) this.x;
                    String str11 = (String) this.y;
                    String str12 = (String) this.z;
                    this.w = 1;
                    if (rm0.j4.o(j4Var4, str11, str12, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 15:
                b71.a aVar16 = b71.a.r;
                int i21 = this.w;
                try {
                    if (i21 == 0) {
                        sy.y.j(obj);
                        r3 = (x71.hShadow) this.z;
                        cVar = new x71.c((x71.hShadow) r3);
                        this.x = r3;
                        this.y = cVar;
                        this.w = 1;
                        b = cVar.b(this);
                        r3 = r3;
                        if (b == aVar16) {
                        }
                        if (((Boolean) b).booleanValue()) {
                        }
                    } else {
                        if (i21 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        cVar = (x71.c) this.y;
                        x71.v vVar = (x71.v) this.x;
                        sy.y.j(obj);
                        b = obj;
                        r3 = vVar;
                        if (((Boolean) b).booleanValue()) {
                            w2.l1.b.set(false);
                            synchronized (v1.m.c) {
                                x.i0 i0Var = ((v1.b) v1.m.j).h;
                                z = i0Var != null && i0Var.h();
                            }
                            if (z) {
                                v1.m.a();
                            }
                            this.x = r3;
                            this.y = cVar;
                            this.w = 1;
                            b = cVar.b(this);
                            r3 = r3;
                            if (b == aVar16) {
                                return aVar16;
                            }
                            if (((Boolean) b).booleanValue()) {
                                r3.m((CancellationException) null);
                                return w61.a0.a;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        t.q.g((x71.v) r3, th3);
                        throw th4;
                    }
                }
                break;
            case 16:
                v8.w wVar = (v8.w) this.y;
                w8.a0 a0Var = (w8.a0) this.x;
                w61.a0 a0Var2 = b71.a.r;
                int i22 = this.w;
                if (i22 == 0) {
                    sy.y.j(obj);
                    Context context = a0Var.b;
                    d9.q qVar2 = a0Var.a;
                    e9.rShadow rVar2 = (e9.r) this.z;
                    f9.a aVar17 = a0Var.d;
                    this.w = 1;
                    int i23 = e9.q.a;
                    w61.a0 a0Var3 = w61.a0.a;
                    if (qVar2.q && Build.VERSION.SDK_INT < 31) {
                        com.google.android.gms.measurement.internal.h2 h2Var = aVar17.d;
                        k71.k.f(h2Var, "getMainThreadExecutor(...)");
                        Object L = v71.b0.L(v71.b0.o(h2Var), new a0.h(wVar, qVar2, rVar2, context, (a71.c) null, 15), this);
                        if (L == a0Var2) {
                            a0Var3 = L;
                            break;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                }
                int i24 = w8.b0.a;
                v8.x.a().getClass();
                x3.k b2 = wVar.b();
                this.w = 2;
                Object a3 = w8.b0.a(b2, wVar, this);
                if (a3 != a0Var2) {
                    return a3;
                }
                return a0Var2;
            case 17:
                jn0.k kVar5 = (jn0.k) this.x;
                b71.a aVar18 = b71.a.r;
                int i25 = this.w;
                if (i25 == 0) {
                    sy.y.j(obj);
                    jn0.g gVar2 = kVar5.a;
                    if (gVar2 != null && (hVar2 = gVar2.a) != null) {
                        er0.i iVar = hVar2.d;
                        wy0.l1 l1Var = (wy0.l1) this.y;
                        String str13 = (String) this.z;
                        xy0.q qVar3 = l1Var.x;
                        this.x = null;
                        this.w = 1;
                        if (qVar3.a(str13, iVar, this) == aVar18) {
                            return aVar18;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 18:
                nd ndVar = (nd) this.x;
                b71.a aVar19 = b71.a.r;
                int i26 = this.w;
                if (i26 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar9 = ((rm0.k2) this.y).t;
                    sd sdVar = (sd) this.z;
                    this.x = null;
                    this.w = 1;
                    if (bVar9.j(sdVar, ndVar, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 19:
                uw0.c cVar6 = (uw0.c) this.x;
                b71.a aVar20 = b71.a.r;
                int i27 = this.w;
                if (i27 == 0) {
                    sy.y.j(obj);
                    uw0.b bVar10 = cVar6.a;
                    if (bVar10 != null && (dVar3 = bVar10.a) != null) {
                        fw0.z0Shadow z0Var3 = dVar3.c;
                        rm0.j4 j4Var5 = (rm0.j4) this.y;
                        String str14 = (String) this.z;
                        this.x = null;
                        this.w = 1;
                        if (rm0.j4.j(j4Var5, z0Var3, str14, this) == aVar20) {
                            return aVar20;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 20:
                b71.a aVar21 = b71.a.r;
                int i28 = this.w;
                if (i28 == 0) {
                    sy.y.j(obj);
                    rm0.j4 j4Var6 = (rm0.j4) this.x;
                    String str15 = (String) this.y;
                    String str16 = (String) this.z;
                    this.w = 1;
                    if (rm0.j4.p(j4Var6, str15, str16, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 21:
                w61.k kVar6 = (w61.k) this.x;
                b71.a aVar22 = b71.a.r;
                int i29 = this.w;
                if (i29 == 0) {
                    sy.y.j(obj);
                    ux0.u uVar2 = (ux0.u) kVar6.r;
                    com.github.service.wrapper.b bVar11 = ((h5) this.y).t;
                    ux0.y yVar2 = (ux0.y) this.z;
                    this.x = null;
                    this.w = 1;
                    if (bVar11.j(yVar2, uVar2, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 22:
                w61.k kVar7 = (w61.k) this.x;
                b71.a aVar23 = b71.a.r;
                int i31 = this.w;
                if (i31 == 0) {
                    sy.y.j(obj);
                    ux0.s0 s0Var2 = (ux0.s0) kVar7.r;
                    com.github.service.wrapper.b bVar12 = ((l5) this.y).t;
                    ux0.v0 v0Var2 = (ux0.v0) this.z;
                    this.x = null;
                    this.w = 1;
                    if (bVar12.j(v0Var2, s0Var2, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 23:
                xv xvVar = (xv) this.x;
                b71.a aVar24 = b71.a.r;
                int i32 = this.w;
                if (i32 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar13 = ((c9) this.y).t;
                    fw fwVar = (fw) this.z;
                    this.x = null;
                    this.w = 1;
                    if (bVar13.j(fwVar, xvVar, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 24:
                w61.m mVar = w61.a0.a;
                b71.a aVar25 = b71.a.r;
                int i33 = this.w;
                try {
                    if (i33 == 0) {
                        sy.y.j(obj);
                        x71.w wVar2 = (x71.w) this.y;
                        Object obj4 = this.z;
                        this.w = 1;
                        if (wVar2.l(this, obj4) == aVar25) {
                            return aVar25;
                        }
                    } else {
                        if (i33 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                    }
                    d = mVar;
                } catch (Throwable th5) {
                    d = sy.y.d(th5);
                }
                if (d instanceof w61.m) {
                    mVar = new x71.m(w61.n.a(d));
                }
                return new x71.o(mVar);
            case 25:
                w61.a0 a0Var4 = w61.a0.a;
                List list4 = (List) this.x;
                b71.a aVar26 = b71.a.r;
                int i34 = this.w;
                if (i34 != 0) {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var4;
                }
                sy.y.j(obj);
                xk.e eVar = ((xk.c) this.y).a;
                oa.j jVar3 = (oa.j) this.z;
                this.x = null;
                this.w = 1;
                m7.w wVar3 = (m7.w) eVar.a.a(jVar3);
                Object O = y9.a.O(wVar3, new a10.b(wVar3, (j71.c) new n5.k(eVar, jVar3, list4, (a71.c) null), (a71.c) null), this);
                if (O != aVar26) {
                    O = a0Var4;
                }
                return O == aVar26 ? aVar26 : a0Var4;
            case 26:
                w61.a0 a0Var5 = w61.a0.a;
                List list5 = (List) this.x;
                b71.a aVar27 = b71.a.r;
                int i35 = this.w;
                if (i35 != 0) {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var5;
                }
                sy.y.j(obj);
                xk.l lVar = ((xk.j) this.y).a;
                oa.j jVar4 = (oa.j) this.z;
                this.x = null;
                this.w = 1;
                m7.w wVar4 = (m7.w) lVar.a.a(jVar4);
                Object O2 = y9.a.O(wVar4, new a10.b(wVar4, new nm.j(lVar, jVar4, list5, null), (a71.c) null), this);
                if (O2 != aVar27) {
                    O2 = a0Var5;
                }
                return O2 == aVar27 ? aVar27 : a0Var5;
            case 27:
                y0.j jVar5 = (y0.j) this.y;
                b71.a aVar28 = b71.a.r;
                int i36 = this.w;
                try {
                    if (i36 == 0) {
                        sy.y.j(obj);
                        c71.j jVar6 = jVar5.I;
                        if (jVar6 != null) {
                            this.w = 1;
                            if (jVar6.k(this) == aVar28) {
                                return aVar28;
                            }
                        }
                    } else {
                        if (i36 != 1) {
                            if (i36 == 2) {
                                sy.y.j(obj);
                                cVar2 = jVar5.J;
                                if (cVar2 != null) {
                                    this.w = 3;
                                    if (cVar2.k(this) == aVar28) {
                                        return aVar28;
                                    }
                                }
                                return w61.a0.a;
                            }
                            if (i36 == 3) {
                                sy.y.j(obj);
                                return w61.a0.a;
                            }
                            if (i36 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th6 = (Throwable) this.x;
                            sy.y.j(obj);
                            throw th6;
                        }
                        sy.y.j(obj);
                    }
                    z0.e eVar2 = (z0.e) this.z;
                    this.w = 2;
                    if (eVar2.a(jVar5, this) == aVar28) {
                        return aVar28;
                    }
                    cVar2 = jVar5.J;
                    if (cVar2 != null) {
                    }
                    return w61.a0.a;
                } catch (Throwable th7) {
                    j71.c cVar7 = jVar5.J;
                    if (cVar7 == null) {
                        throw th7;
                    }
                    this.x = th7;
                    this.w = 4;
                    if (cVar7.k(this) == aVar28) {
                        return aVar28;
                    }
                    throw th7;
                }
            case 28:
                w61.a0 a0Var6 = w61.a0.a;
                k71.w wVar5 = (k71.w) this.z;
                x71.t tVar = (x71.t) this.x;
                b71.a aVar29 = b71.a.r;
                int i37 = this.w;
                if (i37 != 0) {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var6;
                }
                sy.y.j(obj);
                y71.p pVar = new y71.p(new androidx.compose.foundation.lazy.layout.p1(wVar5, 6), new rm0.r3(18, new y71.y((nm.g) this.y, new rm0.v4(tVar, (a71.c) null, 24), 6), k71.xShadow.a(yi.l.class)), (a71.c) null);
                rm0.u7 u7Var = new rm0.u7(20, wVar5, tVar);
                this.x = null;
                this.w = 1;
                yl.b bVar14 = new yl.b(pVar, u7Var, cVar3, i);
                v71.r1 r1Var = new v71.r1(q(), this, 1);
                Object o0 = com.google.android.gms.internal.measurement.i4.o0(r1Var, true, r1Var, bVar14);
                if (o0 != b71.a.r) {
                    o0 = a0Var6;
                }
                return o0 == aVar29 ? aVar29 : a0Var6;
            default:
                w61.a0 a0Var7 = w61.a0.a;
                b71.a aVar30 = b71.a.r;
                int i38 = this.w;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return a0Var7;
                }
                sy.y.j(obj);
                zl.b bVar15 = ((yl.a) this.x).a;
                oa.j jVar7 = (oa.j) this.y;
                com.github.domain.database.serialization.b bVar16 = (com.github.domain.database.serialization.b) ((fk.f) this.z);
                this.w = 1;
                final xj.c z2 = ((GitHubDatabase) bVar15.a.a(jVar7)).z();
                final xj.e eVar3 = new xj.e(14, bVar16.r, (String) null, (String) null);
                Object M = m71.a.M(this, z2.a, false, true, new j71.c() { // from class: xj.a
                    public final Object k(Object obj5) {
                        v7.a aVar31 = (v7.a) obj5;
                        switch (i3) {
                            case 0:
                                k.g(aVar31, "_connection");
                                z2.b.p(aVar31, eVar3);
                                break;
                            default:
                                k.g(aVar31, "_connection");
                                z2.c.z(aVar31, eVar3);
                                break;
                        }
                        return a0.a;
                    }
                });
                if (M != aVar30) {
                    M = a0Var7;
                }
                if (M != aVar30) {
                    M = a0Var7;
                }
                return M == aVar30 ? aVar30 : a0Var7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Object obj, Object obj2, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = obj;
        this.z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(Object obj, Object obj2, Object obj3, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(x71.hShadow hVar, a71.c cVar) {
        super(2, cVar);
        this.v = 15;
        this.z = hVar;
    }
}
