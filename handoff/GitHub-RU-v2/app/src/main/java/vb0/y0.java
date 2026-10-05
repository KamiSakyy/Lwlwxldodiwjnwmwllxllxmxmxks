package vb0;

import android.graphics.Color;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Entry$EntryType;
import com.github.service.models.response.Language;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.SpokenLanguage;
import com.github.service.models.response.discussions.PinnedDiscussionPatternState;
import com.github.service.models.response.home.NavLinkIdentifier;
import hc0.bj;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import u10.a10;
import u10.a90;
import u10.aa;
import u10.bm;
import u10.br;
import u10.cr;
import u10.dd;
import u10.dr;
import u10.ed;
import u10.em;
import u10.fd;
import u10.fm;
import u10.g50;
import u10.gd;
import u10.gm;
import u10.h50;
import u10.hd;
import u10.i50;
import u10.im;
import u10.j80;
import u10.k80;
import u10.l80;
import u10.l9;
import u10.lc;
import u10.lm;
import u10.mc;
import u10.n9;
import u10.nc;
import u10.nf;
import u10.o40;
import u10.oc;
import u10.p00;
import u10.p9;
import u10.pc;
import u10.q00;
import u10.qc;
import u10.qz;
import u10.r00;
import u10.r30;
import u10.rc;
import u10.rz;
import u10.s00;
import u10.s9;
import u10.sc;
import u10.sk;
import u10.sr;
import u10.t00;
import u10.t30;
import u10.t9;
import u10.tr;
import u10.u00;
import u10.u30;
import u10.ue;
import u10.uk;
import u10.ur;
import u10.v00;
import u10.v9;
import u10.vf;
import u10.vk;
import u10.vr;
import u10.w00;
import u10.wf;
import u10.wk;
import u10.wr;
import u10.x00;
import u10.x9;
import u10.xk;
import u10.xr;
import u10.y00;
import u10.y9;
import u10.yk;
import u10.z00;
import u10.z9;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ y0(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        h2 h2Var;
        int i;
        u10.t4 t4Var;
        if (cVar instanceof h2) {
            h2Var = (h2) cVar;
            int i2 = h2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = h2Var.u;
                b71.a aVar = b71.a.r;
                i = h2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    u10.q4 q4Var = ((u10.s4) obj).a;
                    yz0.x7 n = (q4Var == null || (t4Var = q4Var.a) == null) ? null : sy.o.n(t4Var.c);
                    if (n != null) {
                        h2Var.v = 1;
                        if (this.s.c(n, h2Var) == aVar) {
                            return aVar;
                        }
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
        h2Var = new h2(this, cVar);
        Object obj22 = h2Var.u;
        b71.a aVar2 = b71.a.r;
        i = h2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        i2 i2Var;
        int i;
        u10.l6 l6Var;
        u10.l6 l6Var2;
        u10.l6 l6Var3;
        if (cVar instanceof i2) {
            i2Var = (i2) cVar;
            int i2 = i2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = i2Var.u;
                b71.a aVar = b71.a.r;
                i = i2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    u10.k6 k6Var = (u10.k6) obj;
                    k71.k.g(k6Var, "<this>");
                    u10.j6 j6Var = k6Var.a;
                    Integer num = null;
                    String str = (j6Var == null || (l6Var3 = j6Var.a) == null) ? null : l6Var3.a;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = (j6Var == null || (l6Var2 = j6Var.a) == null) ? null : l6Var2.b;
                    String str3 = str2 != null ? str2 : "";
                    if (j6Var != null && (l6Var = j6Var.a) != null) {
                        num = Integer.valueOf(l6Var.c);
                    }
                    yz0.y0 y0Var = new yz0.y0(num, str, str3);
                    i2Var.v = 1;
                    if (this.s.c(y0Var, i2Var) == aVar) {
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
        i2Var = new i2(this, cVar);
        Object obj22 = i2Var.u;
        b71.a aVar2 = b71.a.r;
        i = i2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        k2 k2Var;
        int i;
        cr crVar;
        if (cVar instanceof k2) {
            k2Var = (k2) cVar;
            int i2 = k2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = k2Var.u;
                b71.a aVar = b71.a.r;
                i = k2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    dr drVar = ((br) obj).a;
                    yz0.x7 n = (drVar == null || (crVar = drVar.a) == null) ? null : sy.o.n(crVar.c);
                    if (n != null) {
                        k2Var.v = 1;
                        if (this.s.c(n, k2Var) == aVar) {
                            return aVar;
                        }
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
        k2Var = new k2(this, cVar);
        Object obj22 = k2Var.u;
        b71.a aVar2 = b71.a.r;
        i = k2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        l2 l2Var;
        int i;
        if (cVar instanceof l2) {
            l2Var = (l2) cVar;
            int i2 = l2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l2Var.u;
                b71.a aVar = b71.a.r;
                i = l2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    yz0.w7 J = sy.n.J((o40) obj);
                    l2Var.v = 1;
                    if (this.s.c(J, l2Var) == aVar) {
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
        l2Var = new l2(this, cVar);
        Object obj22 = l2Var.u;
        b71.a aVar2 = b71.a.r;
        i = l2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        m2 m2Var;
        int i;
        q00 q00Var;
        v00 v00Var;
        z00 z00Var;
        w00 w00Var;
        q00 q00Var2;
        v00 v00Var2;
        z00 z00Var2;
        t00 t00Var;
        q00 q00Var3;
        v00 v00Var3;
        z00 z00Var3;
        w00 w00Var2;
        List list;
        r00 r00Var;
        x00 x00Var;
        q00 q00Var4;
        s00 s00Var;
        a10 a10Var;
        u00 u00Var;
        if (cVar instanceof m2) {
            m2Var = (m2) cVar;
            int i2 = m2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = m2Var.u;
                b71.a aVar = b71.a.r;
                i = m2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    p00 p00Var = (p00) obj;
                    y00 y00Var = p00Var.a;
                    Object obj3 = null;
                    String str = (y00Var == null || (q00Var4 = y00Var.b) == null || (s00Var = q00Var4.b) == null || (a10Var = s00Var.a) == null || (u00Var = a10Var.b) == null) ? null : u00Var.a;
                    String str2 = (y00Var == null || (q00Var3 = y00Var.b) == null || (v00Var3 = q00Var3.c) == null || (z00Var3 = v00Var3.b) == null || (w00Var2 = z00Var3.c) == null || (list = w00Var2.b.a) == null || (r00Var = (r00) x61.m.W(list)) == null || (x00Var = r00Var.a) == null) ? null : x00Var.a;
                    y00 y00Var2 = p00Var.a;
                    String str3 = (y00Var2 == null || (q00Var2 = y00Var2.b) == null || (v00Var2 = q00Var2.c) == null || (z00Var2 = v00Var2.b) == null || (t00Var = z00Var2.b) == null) ? null : t00Var.a;
                    String str4 = (y00Var2 == null || (q00Var = y00Var2.b) == null || (v00Var = q00Var.c) == null || (z00Var = v00Var.b) == null || (w00Var = z00Var.c) == null) ? null : w00Var.a;
                    if (str2 == null || str4 == null) {
                        if (str == null) {
                            str = str2 == null ? str3 : str2;
                        }
                        if (str != null) {
                            obj3 = new z01.d0(str);
                        }
                    } else {
                        obj3 = new z01.e0(str4, str2);
                    }
                    if (obj3 == null) {
                        throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Could not fetch time line id for given url.", null, null, null, null, null, 120);
                    }
                    m2Var.v = 1;
                    if (this.s.c(obj3, m2Var) == aVar) {
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
        m2Var = new m2(this, cVar);
        Object obj22 = m2Var.u;
        b71.a aVar2 = b71.a.r;
        i = m2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        n2 n2Var;
        int i;
        h01.q x;
        na0.l0 l0Var;
        na0.l0 l0Var2;
        if (cVar instanceof n2) {
            n2Var = (n2) cVar;
            int i2 = n2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = n2Var.u;
                b71.a aVar = b71.a.r;
                i = n2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    na0.o0 o0Var = ((na0.k0) obj).a;
                    na0.n0 n0Var = null;
                    if (((o0Var == null || (l0Var2 = o0Var.b) == null) ? null : l0Var2.b) != null) {
                        w50.x xVar = o0Var.b.b.c;
                        String str = xVar.b;
                        w50.w wVar = xVar.c;
                        int i3 = wVar.b;
                        List y = com.google.android.gms.internal.measurement.d5.y(wVar);
                        w50.v vVar = wVar.c;
                        x = new h01.q(str, i3, y, vVar.a, vVar.b, vVar.c, vVar.d);
                    } else {
                        if (o0Var != null && (l0Var = o0Var.b) != null) {
                            n0Var = l0Var.c;
                        }
                        x = n0Var != null ? com.google.android.gms.internal.measurement.d5.x(o0Var.b.c.c) : cb0.c.a;
                    }
                    n2Var.v = 1;
                    if (this.s.c(x, n2Var) == aVar) {
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
        n2Var = new n2(this, cVar);
        Object obj22 = n2Var.u;
        b71.a aVar2 = b71.a.r;
        i = n2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        o2 o2Var;
        int i;
        if (cVar instanceof o2) {
            o2Var = (o2) cVar;
            int i2 = o2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = o2Var.u;
                b71.a aVar = b71.a.r;
                i = o2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List d = sy.q.d((na0.m) obj);
                    o2Var.v = 1;
                    if (this.s.c(d, o2Var) == aVar) {
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
        o2Var = new o2(this, cVar);
        Object obj22 = o2Var.u;
        b71.a aVar2 = b71.a.r;
        i = o2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        r2 r2Var;
        int i;
        if (cVar instanceof r2) {
            r2Var = (r2) cVar;
            int i2 = r2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = r2Var.u;
                b71.a aVar = b71.a.r;
                i = r2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List d = sy.q.d((na0.m) obj);
                    r2Var.v = 1;
                    if (this.s.c(d, r2Var) == aVar) {
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
        r2Var = new r2(this, cVar);
        Object obj22 = r2Var.u;
        b71.a aVar2 = b71.a.r;
        i = r2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x089f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0a0f  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0a1e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016c  */
    /* JADX WARN: Type inference failed for: r1v180 */
    /* JADX WARN: Type inference failed for: r1v181 */
    /* JADX WARN: Type inference failed for: r1v182, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v184, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r1v187, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v11, types: [b01.h] */
    /* JADX WARN: Type inference failed for: r5v8, types: [b01.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        x0 x0Var;
        int i;
        z0 z0Var;
        int i2;
        a1 a1Var;
        int i3;
        y9 y9Var;
        v9 v9Var;
        b1 b1Var;
        int i4;
        xk xkVar;
        vk vkVar;
        sk skVar;
        c1 c1Var;
        int i5;
        bj bjVar;
        int i6;
        int i7;
        int i8;
        PinnedDiscussionPatternState pinnedDiscussionPatternState;
        g1 g1Var;
        int i9;
        s20.k kVar;
        j1 j1Var;
        int i10;
        i50.f fVar;
        r30 r30Var;
        r30 r30Var2;
        m1 m1Var;
        int i12;
        n1 n1Var;
        int i13;
        o1 o1Var;
        int i14;
        w80.q3 q3Var;
        i50 i50Var;
        r1 r1Var;
        int i15;
        Object obj2;
        rc rcVar;
        oc ocVar;
        mc mcVar;
        nc ncVar;
        s1 s1Var;
        int i16;
        fd fdVar;
        gd gdVar;
        ed edVar;
        t1 t1Var;
        int i17;
        ur urVar;
        u1 u1Var;
        int i18;
        x1 x1Var;
        int i19;
        Boolean bool;
        z1 z1Var;
        int i20;
        b2 b2Var;
        int i22;
        ArrayList arrayList;
        c2 c2Var;
        int i23;
        w80.q3 q3Var2;
        d2 d2Var;
        int i24;
        f2 f2Var;
        int i25;
        g2 g2Var;
        int i26;
        java.util.ArrayList r1;
        List<k80> list;
        t2 t2Var;
        int i27;
        Object obj3;
        na0.l0 l0Var;
        na0.l0 l0Var2;
        switch (this.r) {
            case 0:
                if (cVar instanceof x0) {
                    x0Var = (x0) cVar;
                    int i28 = x0Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        x0Var.v = i28 - Integer.MIN_VALUE;
                        Object obj4 = x0Var.u;
                        b71.a aVar = b71.a.r;
                        i = x0Var.v;
                        if (i != 0) {
                            sy.y.j(obj4);
                            l9 l9Var = (l9) obj;
                            p9 p9Var = l9Var.a;
                            List list2 = p9Var != null ? p9Var.b.b : null;
                            if (list2 == null) {
                                list2 = x61.r.r;
                            }
                            ArrayList S = x61.m.S(list2);
                            ArrayList arrayList2 = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i29 = 0;
                            while (i29 < size) {
                                Object obj5 = S.get(i29);
                                i29++;
                                arrayList2.add(sy.p.b(((n9) obj5).c));
                            }
                            p9 p9Var2 = l9Var.a;
                            b01.d dVar = new b01.d(p9Var2 != null ? p9Var2.a : null, arrayList2, new x01.i(p9Var2 != null ? p9Var2.b.a.b : null, p9Var2 != null ? p9Var2.b.a.a : false, false));
                            x0Var.v = 1;
                            if (this.s.c(dVar, x0Var) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                x0Var = new x0(this, cVar);
                Object obj42 = x0Var.u;
                b71.a aVar2 = b71.a.r;
                i = x0Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof z0) {
                    z0Var = (z0) cVar;
                    int i30 = z0Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        z0Var.v = i30 - Integer.MIN_VALUE;
                        Object obj6 = z0Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = z0Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj6);
                            t9 t9Var = ((s9) obj).a;
                            b01.e b = t9Var != null ? sy.p.b(t9Var.c) : null;
                            z0Var.v = 1;
                            if (this.s.c(b, z0Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                z0Var = new z0(this, cVar);
                Object obj62 = z0Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = z0Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof a1) {
                    a1Var = (a1) cVar;
                    int i32 = a1Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        a1Var.v = i32 - Integer.MIN_VALUE;
                        Object obj7 = a1Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = a1Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj7);
                            aa aaVar = ((x9) obj).a;
                            if (aaVar != null && (y9Var = aaVar.b) != null && (v9Var = y9Var.b) != null) {
                                String str = v9Var.a;
                                z9 z9Var = v9Var.b;
                                r2 = new b01.h(str, z9Var != null ? z9Var.a : null);
                            }
                            if (r2 != null) {
                                a1Var.v = 1;
                                if (this.s.c(r2, a1Var) == aVar4) {
                                    return aVar4;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                a1Var = new a1(this, cVar);
                Object obj72 = a1Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = a1Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof b1) {
                    b1Var = (b1) cVar;
                    int i33 = b1Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        b1Var.v = i33 - Integer.MIN_VALUE;
                        Object obj8 = b1Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = b1Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj8);
                            wk wkVar = ((uk) obj).a;
                            if (wkVar != null && (xkVar = wkVar.a) != null && (vkVar = xkVar.b) != null && (skVar = vkVar.a) != null) {
                                String str2 = skVar.a;
                                yk ykVar = skVar.b;
                                r2 = new b01.h(str2, ykVar != null ? ykVar.a : null);
                            }
                            if (r2 != null) {
                                b1Var.v = 1;
                                if (this.s.c(r2, b1Var) == aVar5) {
                                    return aVar5;
                                }
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                b1Var = new b1(this, cVar);
                Object obj82 = b1Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = b1Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof c1) {
                    c1Var = (c1) cVar;
                    int i34 = c1Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        c1Var.v = i34 - Integer.MIN_VALUE;
                        Object obj9 = c1Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = c1Var.v;
                        int i35 = 1;
                        if (i5 != 0) {
                            sy.y.j(obj9);
                            im imVar = ((em) obj).a;
                            List list3 = imVar != null ? imVar.b.a : null;
                            if (list3 == null) {
                                list3 = x61.r.r;
                            }
                            ArrayList S2 = x61.m.S(list3);
                            ArrayList arrayList3 = new ArrayList(x61.n.F(S2, 10));
                            int size2 = S2.size();
                            int i36 = 0;
                            while (i36 < size2) {
                                Object obj10 = S2.get(i36);
                                i36++;
                                gm gmVar = (gm) obj10;
                                k71.k.g(gmVar, "<this>");
                                String str3 = gmVar.a;
                                fm fmVar = gmVar.b;
                                int i37 = fmVar.a;
                                bm bmVar = fmVar.c;
                                com.github.service.models.response.a c = t.e.c(bmVar != null ? bmVar.b : null);
                                String str4 = fmVar.b;
                                String str5 = fmVar.d.a;
                                bj bjVar2 = gmVar.c;
                                ArrayList arrayList4 = gmVar.d;
                                ArrayList arrayList5 = S2;
                                try {
                                    bjVar = bjVar2;
                                    try {
                                        i6 = Color.parseColor("#" + x61.m.W(arrayList4));
                                    } catch (Exception unused) {
                                        arrayList4.toString();
                                        i6 = -16777216;
                                        i7 = size2;
                                        try {
                                            i8 = Color.parseColor("#" + x61.m.f0(arrayList4));
                                        } catch (Exception unused2) {
                                            arrayList4.toString();
                                            i8 = -1;
                                            switch (bjVar.ordinal()) {
                                            }
                                            arrayList3.add(new b01.p(str3, i37, c, str4, str5, new b01.n(i6, i8, pinnedDiscussionPatternState)));
                                            S2 = arrayList5;
                                            size2 = i7;
                                            i35 = 1;
                                        }
                                        switch (bjVar.ordinal()) {
                                        }
                                        arrayList3.add(new b01.p(str3, i37, c, str4, str5, new b01.n(i6, i8, pinnedDiscussionPatternState)));
                                        S2 = arrayList5;
                                        size2 = i7;
                                        i35 = 1;
                                    }
                                } catch (Exception unused3) {
                                    bjVar = bjVar2;
                                }
                                try {
                                    i7 = size2;
                                    i8 = Color.parseColor("#" + x61.m.f0(arrayList4));
                                } catch (Exception unused4) {
                                    i7 = size2;
                                }
                                switch (bjVar.ordinal()) {
                                    case 0:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.CHEVRON_UP;
                                        break;
                                    case 1:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.DOT;
                                        break;
                                    case 2:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.DOT_FILL;
                                        break;
                                    case 3:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.HEART_FILL;
                                        break;
                                    case 4:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.PLUS;
                                        break;
                                    case 5:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.ZAP;
                                        break;
                                    case 6:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.UNKNOWN__;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList3.add(new b01.p(str3, i37, c, str4, str5, new b01.n(i6, i8, pinnedDiscussionPatternState)));
                                S2 = arrayList5;
                                size2 = i7;
                                i35 = 1;
                            }
                            c1Var.v = i35;
                            if (this.s.c(arrayList3, c1Var) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                c1Var = new c1(this, cVar);
                Object obj92 = c1Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = c1Var.v;
                int i352 = 1;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof g1) {
                    g1Var = (g1) cVar;
                    int i38 = g1Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        g1Var.v = i38 - Integer.MIN_VALUE;
                        Object obj11 = g1Var.u;
                        b71.a aVar7 = b71.a.r;
                        i9 = g1Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj11);
                            s20.l lVar = ((s20.j) obj).a;
                            b01.f c2 = (lVar == null || (kVar = lVar.a) == null) ? null : sy.t.c(kVar.c);
                            if (c2 != null) {
                                g1Var.v = 1;
                                if (this.s.c(c2, g1Var) == aVar7) {
                                    return aVar7;
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                g1Var = new g1(this, cVar);
                Object obj112 = g1Var.u;
                b71.a aVar72 = b71.a.r;
                i9 = g1Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof j1) {
                    j1Var = (j1) cVar;
                    int i39 = j1Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        j1Var.v = i39 - Integer.MIN_VALUE;
                        Object obj12 = j1Var.u;
                        b71.a aVar8 = b71.a.r;
                        i10 = j1Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj12);
                            u30 u30Var = ((t30) obj).a;
                            String str6 = null;
                            c40.c cVar2 = (u30Var == null || (r30Var2 = u30Var.a) == null) ? null : r30Var2.c.j;
                            i80.c cVar3 = (u30Var == null || (r30Var = u30Var.a) == null) ? null : r30Var.d;
                            if (cVar2 == null || cVar3 == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                            }
                            r30 r30Var3 = u30Var.a;
                            i50.h hVar = r30Var3.c;
                            String str7 = hVar.c;
                            y60.a aVar9 = hVar.l;
                            i50.n nVar = r30Var3.e;
                            boolean z = hVar.d;
                            boolean z2 = hVar.e;
                            boolean z3 = hVar.f;
                            boolean z4 = hVar.g;
                            i50.g gVar = hVar.i;
                            if (gVar != null && (fVar = gVar.c) != null) {
                                str6 = fVar.b;
                            }
                            String str8 = str6;
                            e50.d1 d1Var = hVar.m;
                            g70.a aVar10 = hVar.k;
                            b01.g c3 = sy.r.c(cVar2, str7, cVar3, aVar9, nVar, z, z2, z3, z4, str8, false, d1Var, aVar10.b, aVar10.c, sy.r.A(hVar));
                            j1Var.v = 1;
                            if (this.s.c(c3, j1Var) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                j1Var = new j1(this, cVar);
                Object obj122 = j1Var.u;
                b71.a aVar82 = b71.a.r;
                i10 = j1Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof m1) {
                    m1Var = (m1) cVar;
                    int i40 = m1Var.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        m1Var.v = i40 - Integer.MIN_VALUE;
                        Object obj13 = m1Var.u;
                        b71.a aVar11 = b71.a.r;
                        i12 = m1Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj13);
                            vf vfVar = (vf) obj;
                            k71.k.g(vfVar, "<this>");
                            ArrayList arrayList6 = vfVar.a;
                            ArrayList arrayList7 = new ArrayList();
                            int size3 = arrayList6.size();
                            int i42 = 0;
                            while (i42 < size3) {
                                Object obj14 = arrayList6.get(i42);
                                i42++;
                                wf wfVar = (wf) obj14;
                                Language language = wfVar != null ? new Language(wfVar.a, wfVar.b) : null;
                                if (language != null) {
                                    arrayList7.add(language);
                                }
                            }
                            m1Var.v = 1;
                            if (this.s.c(arrayList7, m1Var) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                m1Var = new m1(this, cVar);
                Object obj132 = m1Var.u;
                b71.a aVar112 = b71.a.r;
                i12 = m1Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof n1) {
                    n1Var = (n1) cVar;
                    int i43 = n1Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        n1Var.v = i43 - Integer.MIN_VALUE;
                        Object obj15 = n1Var.u;
                        b71.a aVar12 = b71.a.r;
                        i13 = n1Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj15);
                            qz qzVar = (qz) obj;
                            k71.k.g(qzVar, "<this>");
                            ArrayList arrayList8 = qzVar.a;
                            ArrayList arrayList9 = new ArrayList();
                            int size4 = arrayList8.size();
                            int i44 = 0;
                            while (i44 < size4) {
                                Object obj16 = arrayList8.get(i44);
                                i44++;
                                rz rzVar = (rz) obj16;
                                SpokenLanguage spokenLanguage = rzVar != null ? new SpokenLanguage(rzVar.a, rzVar.b) : null;
                                if (spokenLanguage != null) {
                                    arrayList9.add(spokenLanguage);
                                }
                            }
                            n1Var.v = 1;
                            if (this.s.c(arrayList9, n1Var) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                n1Var = new n1(this, cVar);
                Object obj152 = n1Var.u;
                b71.a aVar122 = b71.a.r;
                i13 = n1Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof o1) {
                    o1Var = (o1) cVar;
                    int i45 = o1Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        o1Var.v = i45 - Integer.MIN_VALUE;
                        Object obj17 = o1Var.u;
                        b71.a aVar13 = b71.a.r;
                        i14 = o1Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj17);
                            h50 h50Var = ((g50) obj).a;
                            List<ea0.h> list4 = (h50Var == null || (i50Var = h50Var.a) == null) ? null : i50Var.c.a.a;
                            if (list4 == null) {
                                list4 = x61.r.r;
                            }
                            ArrayList arrayList10 = new ArrayList();
                            for (ea0.h hVar2 : list4) {
                                SimpleRepository q = (hVar2 == null || (q3Var = hVar2.c) == null) ? null : sy.e0.q(q3Var);
                                if (q != null) {
                                    arrayList10.add(q);
                                }
                            }
                            o1Var.v = 1;
                            if (this.s.c(arrayList10, o1Var) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                o1Var = new o1(this, cVar);
                Object obj172 = o1Var.u;
                b71.a aVar132 = b71.a.r;
                i14 = o1Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof r1) {
                    r1Var = (r1) cVar;
                    int i46 = r1Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        r1Var.v = i46 - Integer.MIN_VALUE;
                        Object obj18 = r1Var.u;
                        b71.a aVar14 = b71.a.r;
                        i15 = r1Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj18);
                            sc scVar = ((lc) obj).a;
                            if (scVar == null || (rcVar = scVar.b) == null || (ocVar = rcVar.c) == null || (mcVar = ocVar.b) == null || (ncVar = mcVar.b) == null) {
                                obj2 = null;
                            } else {
                                String str9 = scVar.a;
                                qc qcVar = ncVar.c;
                                if (qcVar != null) {
                                    obj2 = new yz0.j1(qcVar.a, str9);
                                } else {
                                    pc pcVar = ncVar.b;
                                    obj2 = pcVar != null ? new yz0.h1(pcVar.a, str9) : yz0.k1.a;
                                }
                            }
                            if (obj2 != null) {
                                r1Var.v = 1;
                                if (this.s.c(obj2, r1Var) == aVar14) {
                                    return aVar14;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                r1Var = new r1(this, cVar);
                Object obj182 = r1Var.u;
                b71.a aVar142 = b71.a.r;
                i15 = r1Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof s1) {
                    s1Var = (s1) cVar;
                    int i47 = s1Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        s1Var.v = i47 - Integer.MIN_VALUE;
                        Object obj19 = s1Var.u;
                        b71.a aVar15 = b71.a.r;
                        i16 = s1Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj19);
                            hd hdVar = ((dd) obj).a;
                            String str10 = (hdVar == null || (fdVar = hdVar.b) == null || (gdVar = fdVar.c) == null || (edVar = gdVar.b) == null) ? null : edVar.a;
                            Boolean valueOf = Boolean.valueOf(!(str10 == null || str10.length() == 0));
                            s1Var.v = 1;
                            if (this.s.c(valueOf, s1Var) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                s1Var = new s1(this, cVar);
                Object obj192 = s1Var.u;
                b71.a aVar152 = b71.a.r;
                i16 = s1Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof t1) {
                    t1Var = (t1) cVar;
                    int i48 = t1Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        t1Var.v = i48 - Integer.MIN_VALUE;
                        Object obj20 = t1Var.u;
                        b71.a aVar16 = b71.a.r;
                        i17 = t1Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj20);
                            wr wrVar = ((sr) obj).a;
                            vr vrVar = (wrVar == null || (urVar = wrVar.a) == null) ? null : urVar.b;
                            if (vrVar != null) {
                                t1Var.v = 1;
                                if (this.s.c(vrVar, t1Var) == aVar16) {
                                    return aVar16;
                                }
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                t1Var = new t1(this, cVar);
                Object obj202 = t1Var.u;
                b71.a aVar162 = b71.a.r;
                i17 = t1Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof u1) {
                    u1Var = (u1) cVar;
                    int i49 = u1Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        u1Var.v = i49 - Integer.MIN_VALUE;
                        Object obj21 = u1Var.u;
                        b71.a aVar17 = b71.a.r;
                        i18 = u1Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj21);
                            Iterable<tr> iterable = ((vr) obj).a;
                            if (iterable == null) {
                                iterable = x61.r.r;
                            }
                            ArrayList arrayList11 = new ArrayList(x61.n.F(iterable, 10));
                            for (tr trVar : iterable) {
                                String str11 = trVar.a;
                                String str12 = trVar.b;
                                int i50 = trVar.c;
                                xr xrVar = trVar.d;
                                arrayList11.add(new yz0.f1(i50, str11, str12, xrVar != null ? xrVar.a : ""));
                            }
                            List v0 = x61.m.v0(arrayList11, new v1(0));
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = new ArrayList();
                            for (Object obj22 : v0) {
                                Entry$EntryType entry$EntryType = ((yz0.f1) obj22).e;
                                if (entry$EntryType == Entry$EntryType.TREE) {
                                    arrayList12.add(obj22);
                                } else if (entry$EntryType == Entry$EntryType.COMMIT) {
                                    arrayList13.add(obj22);
                                } else {
                                    arrayList14.add(obj22);
                                }
                            }
                            ArrayList l0 = x61.m.l0(x61.m.l0(arrayList12, arrayList14), arrayList13);
                            u1Var.v = 1;
                            if (this.s.c(l0, u1Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                u1Var = new u1(this, cVar);
                Object obj212 = u1Var.u;
                b71.a aVar172 = b71.a.r;
                i18 = u1Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof x1) {
                    x1Var = (x1) cVar;
                    int i52 = x1Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        x1Var.v = i52 - Integer.MIN_VALUE;
                        Object obj23 = x1Var.u;
                        b71.a aVar18 = b71.a.r;
                        i19 = x1Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj23);
                            u10.t tVar = ((u10.v) obj).a;
                            Boolean valueOf2 = Boolean.valueOf((tVar == null || (bool = tVar.a) == null) ? false : bool.booleanValue());
                            x1Var.v = 1;
                            if (this.s.c(valueOf2, x1Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                x1Var = new x1(this, cVar);
                Object obj232 = x1Var.u;
                b71.a aVar182 = b71.a.r;
                i19 = x1Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof z1) {
                    z1Var = (z1) cVar;
                    int i53 = z1Var.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        z1Var.v = i53 - Integer.MIN_VALUE;
                        Object obj24 = z1Var.u;
                        b71.a aVar19 = b71.a.r;
                        i20 = z1Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj24);
                            bb0.e eVar = new bb0.e((ue) obj);
                            z1Var.v = 1;
                            if (this.s.c(eVar, z1Var) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                z1Var = new z1(this, cVar);
                Object obj242 = z1Var.u;
                b71.a aVar192 = b71.a.r;
                i20 = z1Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof b2) {
                    b2Var = (b2) cVar;
                    int i54 = b2Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        b2Var.v = i54 - Integer.MIN_VALUE;
                        Object obj25 = b2Var.u;
                        b71.a aVar20 = b71.a.r;
                        i22 = b2Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj25);
                            ea0.a aVar21 = ((a90) obj).a.c.a;
                            if (aVar21 != null) {
                                ArrayList arrayList15 = aVar21.a;
                                ArrayList arrayList16 = new ArrayList(x61.n.F(arrayList15, 10));
                                int size5 = arrayList15.size();
                                int i55 = 0;
                                int i56 = 0;
                                while (i56 < size5) {
                                    Object obj26 = arrayList15.get(i56);
                                    i56++;
                                    ea0.b bVar = (ea0.b) obj26;
                                    k71.k.g(bVar, "<this>");
                                    arrayList16.add(new g01.d(sy.w.v(bVar.a), bVar.b));
                                }
                                arrayList = new ArrayList();
                                int size6 = arrayList16.size();
                                while (i55 < size6) {
                                    Object obj27 = arrayList16.get(i55);
                                    i55++;
                                    if (((g01.d) obj27).a != NavLinkIdentifier.UNKNOWN__) {
                                        arrayList.add(obj27);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                b2Var.v = 1;
                                if (this.s.c(arrayList, b2Var) == aVar20) {
                                    return aVar20;
                                }
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                b2Var = new b2(this, cVar);
                Object obj252 = b2Var.u;
                b71.a aVar202 = b71.a.r;
                i22 = b2Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof c2) {
                    c2Var = (c2) cVar;
                    int i57 = c2Var.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        c2Var.v = i57 - Integer.MIN_VALUE;
                        Object obj28 = c2Var.u;
                        b71.a aVar22 = b71.a.r;
                        i23 = c2Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj28);
                            Iterable<ea0.h> iterable2 = ((lm) obj).a.c.a.a;
                            if (iterable2 == null) {
                                iterable2 = x61.r.r;
                            }
                            ArrayList arrayList17 = new ArrayList();
                            for (ea0.h hVar3 : iterable2) {
                                SimpleRepository q2 = (hVar3 == null || (q3Var2 = hVar3.c) == null) ? null : sy.e0.q(q3Var2);
                                if (q2 != null) {
                                    arrayList17.add(q2);
                                }
                            }
                            c2Var.v = 1;
                            if (this.s.c(arrayList17, c2Var) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                c2Var = new c2(this, cVar);
                Object obj282 = c2Var.u;
                b71.a aVar222 = b71.a.r;
                i23 = c2Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof d2) {
                    d2Var = (d2) cVar;
                    int i58 = d2Var.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        d2Var.v = i58 - Integer.MIN_VALUE;
                        Object obj29 = d2Var.u;
                        b71.a aVar23 = b71.a.r;
                        i24 = d2Var.v;
                        if (i24 != 0) {
                            sy.y.j(obj29);
                            g01.a d = sy.u.d((nf) obj);
                            d2Var.v = 1;
                            if (this.s.c(d, d2Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                        }
                        return w61.a0.a;
                    }
                }
                d2Var = new d2(this, cVar);
                Object obj292 = d2Var.u;
                b71.a aVar232 = b71.a.r;
                i24 = d2Var.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof f2) {
                    f2Var = (f2) cVar;
                    int i59 = f2Var.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        f2Var.v = i59 - Integer.MIN_VALUE;
                        Object obj30 = f2Var.u;
                        b71.a aVar24 = b71.a.r;
                        i25 = f2Var.v;
                        if (i25 != 0) {
                            sy.y.j(obj30);
                            g01.a d2 = sy.u.d((nf) obj);
                            f2Var.v = 1;
                            if (this.s.c(d2, f2Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj30);
                        }
                        return w61.a0.a;
                    }
                }
                f2Var = new f2(this, cVar);
                Object obj302 = f2Var.u;
                b71.a aVar242 = b71.a.r;
                i25 = f2Var.v;
                if (i25 != 0) {
                }
                return w61.a0.a;
            case 20:
                if (cVar instanceof g2) {
                    g2Var = (g2) cVar;
                    int i60 = g2Var.v;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        g2Var.v = i60 - Integer.MIN_VALUE;
                        Object obj31 = g2Var.u;
                        b71.a aVar25 = b71.a.r;
                        i26 = g2Var.v;
                        if (i26 != 0) {
                            sy.y.j(obj31);
                            j80 j80Var = (j80) obj;
                            k71.k.g(j80Var, "<this>");
                            l80 l80Var = j80Var.a;
                            if (l80Var == null || (list = l80Var.a) == null) {
                                r1 = 0;
                            } else {
                                ArrayList arrayList18 = new ArrayList(x61.n.F(list, 10));
                                for (k80 k80Var : list) {
                                    arrayList18.add(new g01.d(sy.w.v(k80Var.a), k80Var.b));
                                }
                                r1 = new ArrayList();
                                int size7 = arrayList18.size();
                                int i62 = 0;
                                while (i62 < size7) {
                                    Object obj32 = arrayList18.get(i62);
                                    i62++;
                                    if (((g01.d) obj32).a != NavLinkIdentifier.UNKNOWN__) {
                                        r1.add(obj32);
                                    }
                                }
                            }
                            if (r1 == 0) {
                                r1 = x61.r.r;
                            }
                            g2Var.v = 1;
                            if (this.s.c((Object) r1, g2Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj31);
                        }
                        return w61.a0.a;
                    }
                }
                g2Var = new g2(this, cVar);
                Object obj312 = g2Var.u;
                b71.a aVar252 = b71.a.r;
                i26 = g2Var.v;
                if (i26 != 0) {
                }
                return w61.a0.a;
            case 21:
                return a(cVar, obj);
            case 22:
                return b(cVar, obj);
            case 23:
                return d(cVar, obj);
            case 24:
                return e(cVar, obj);
            case 25:
                return f(cVar, obj);
            case 26:
                return g(cVar, obj);
            case 27:
                return h(cVar, obj);
            case 28:
                return i(cVar, obj);
            default:
                if (cVar instanceof t2) {
                    t2Var = (t2) cVar;
                    int i63 = t2Var.v;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        t2Var.v = i63 - Integer.MIN_VALUE;
                        Object obj33 = t2Var.u;
                        b71.a aVar26 = b71.a.r;
                        i27 = t2Var.v;
                        if (i27 != 0) {
                            sy.y.j(obj33);
                            na0.o0 o0Var = ((na0.k0) obj).a;
                            na0.n0 n0Var = null;
                            if (((o0Var == null || (l0Var2 = o0Var.b) == null) ? null : l0Var2.b) != null) {
                                obj3 = com.google.android.gms.internal.measurement.d5.y(o0Var.b.b.c.c);
                            } else {
                                if (o0Var != null && (l0Var = o0Var.b) != null) {
                                    n0Var = l0Var.c;
                                }
                                obj3 = n0Var != null ? com.google.android.gms.internal.measurement.d5.x(o0Var.b.c.c).c : x61.r.r;
                            }
                            t2Var.v = 1;
                            if (this.s.c(obj3, t2Var) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i27 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj33);
                        }
                        return w61.a0.a;
                    }
                }
                t2Var = new t2(this, cVar);
                Object obj332 = t2Var.u;
                b71.a aVar262 = b71.a.r;
                i27 = t2Var.v;
                if (i27 != 0) {
                }
                return w61.a0.a;
        }
    }

    public y0(y71.j jVar, rm0.c4 c4Var) {
        this.r = 25;
        this.s = jVar;
    }
}
