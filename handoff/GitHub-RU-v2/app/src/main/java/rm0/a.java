package rm0;

import com.github.service.models.response.type.MobileEventContext;
import com.github.service.models.response.type.MobileSubjectType;
import gn0.ah;
import gn0.bh;
import gn0.ch;
import gn0.eh;
import gn0.hh;
import gn0.rh;
import gn0.vg;
import gn0.wg;
import gn0.xg;
import gn0.yg;
import gn0.zg;
import hc0.ag;
import hc0.bg;
import hc0.cg;
import hc0.eg;
import hc0.hg;
import hc0.rg;
import hc0.vf;
import hc0.wf;
import hc0.xf;
import hc0.yf;
import hc0.zf;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.hn;
import jn0.yf0;
import jo.ap;
import jo.mi0;
import kc0.ql;
import kc0.yb0;
import kotlin.NoWhenBranchMatchedException;
import m10.bp;
import m10.ep;
import m10.nn;
import m10.on;
import m10.op;
import m10.pn;
import m10.qn;
import m10.rn;
import m10.sn;
import m10.yo;
import m10.zo;
import pz0.ak;
import pz0.dk;
import pz0.jj;
import pz0.kj;
import pz0.lj;
import pz0.mj;
import pz0.nj;
import pz0.nk;
import pz0.oj;
import pz0.xj;
import pz0.yj;
import u10.mk;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements z01.a, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public v71.v t;

    public a(com.github.service.wrapper.j jVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = vVar;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f0, code lost:
    
        if (r5 == hc0.eg.M) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(List list) {
        rg rgVar;
        Object obj;
        Object obj2;
        eg egVar;
        rg rgVar2;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yz0.d dVar = (yz0.d) it.next();
            k71.k.g(dVar, "<this>");
            vf vfVar = wf.Companion;
            String str = dVar.b;
            vfVar.getClass();
            k71.k.g(str, "rawValue");
            d71.bShadow bVar = wf.u;
            bVar.getClass();
            a5.g1 g1Var = new a5.g1(8, bVar);
            while (true) {
                rgVar = null;
                if (g1Var.hasNext()) {
                    obj = g1Var.next();
                    if (((wf) obj).r.equals(str)) {
                    }
                } else {
                    obj = null;
                }
            }
            wf wfVar = (wf) obj;
            if (wfVar == null) {
                wfVar = wf.s;
            }
            wf wfVar2 = wfVar;
            xf xfVar = yf.Companion;
            String str2 = dVar.a;
            xfVar.getClass();
            k71.k.g(str2, "rawValue");
            d71.bShadow bVar2 = yf.u;
            bVar2.getClass();
            a5.g1 g1Var2 = new a5.g1(8, bVar2);
            while (true) {
                if (g1Var2.hasNext()) {
                    obj2 = g1Var2.next();
                    if (((yf) obj2).r.equals(str2)) {
                    }
                } else {
                    obj2 = null;
                }
            }
            yf yfVar = (yf) obj2;
            if (yfVar == null) {
                yfVar = yf.s;
            }
            yf yfVar2 = yfVar;
            zf zfVar = ag.Companion;
            String str3 = dVar.e;
            if (str3 != null) {
                MobileEventContext.Companion.getClass();
                MobileEventContext a = r01.k.a(str3);
                k71.k.g(a, "<this>");
                switch (ab0.e.a[a.ordinal()]) {
                    case 1:
                        egVar = eg.F;
                        break;
                    case 2:
                        egVar = eg.K;
                        break;
                    case 3:
                        egVar = eg.y;
                        break;
                    case 4:
                        egVar = eg.I;
                        break;
                    case 5:
                        egVar = eg.D;
                        break;
                    case 6:
                        egVar = eg.J;
                        break;
                    case 7:
                        egVar = eg.G;
                        break;
                    case 8:
                        egVar = eg.L;
                        break;
                    case 9:
                        egVar = eg.v;
                        break;
                    case 10:
                        egVar = eg.s;
                        break;
                    case 11:
                        egVar = eg.A;
                        break;
                    case 12:
                        egVar = eg.E;
                        break;
                    case 13:
                        egVar = eg.u;
                        break;
                    case 14:
                        egVar = eg.B;
                        break;
                    case 15:
                        egVar = eg.x;
                        break;
                    case 16:
                        egVar = eg.w;
                        break;
                    case 17:
                        egVar = eg.C;
                        break;
                    case 18:
                        egVar = eg.t;
                        break;
                    case 19:
                        egVar = eg.z;
                        break;
                    case 20:
                        egVar = eg.H;
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                        egVar = eg.M;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            egVar = null;
            aa1.bShadow bVar3 = aa.t0.d;
            aa1.bShadow u0Var = egVar == null ? bVar3 : new aa.u0(egVar);
            bg bgVar = cg.Companion;
            ZonedDateTime parse = ZonedDateTime.parse(dVar.c);
            k71.k.f(parse, "parse(...)");
            String str4 = dVar.d;
            if (str4 != null) {
                MobileSubjectType.Companion.getClass();
                MobileSubjectType a2 = r01.l.a(str4);
                k71.k.g(a2, "<this>");
                switch (ab0.f.a[a2.ordinal()]) {
                    case 1:
                        rgVar2 = rg.s;
                        break;
                    case 2:
                        rgVar2 = rg.t;
                        break;
                    case 3:
                        rgVar2 = rg.u;
                        break;
                    case 4:
                        rgVar2 = rg.F0;
                        break;
                    case 5:
                        rgVar2 = rg.F0;
                        break;
                    case 6:
                        rgVar2 = rg.v;
                        break;
                    case 7:
                        rgVar2 = rg.F0;
                        break;
                    case 8:
                        rgVar2 = rg.w;
                        break;
                    case 9:
                        rgVar2 = rg.x;
                        break;
                    case 10:
                        rgVar2 = rg.F0;
                        break;
                    case 11:
                        rgVar2 = rg.y;
                        break;
                    case 12:
                        rgVar2 = rg.F0;
                        break;
                    case 13:
                        rgVar2 = rg.A;
                        break;
                    case 14:
                        rgVar2 = rg.z;
                        break;
                    case 15:
                        rgVar2 = rg.B;
                        break;
                    case 16:
                        rgVar2 = rg.C;
                        break;
                    case 17:
                        rgVar2 = rg.D;
                        break;
                    case 18:
                        rgVar2 = rg.E;
                        break;
                    case 19:
                        rgVar2 = rg.F;
                        break;
                    case 20:
                        rgVar2 = rg.G;
                        break;
                    case 21:
                        rgVar2 = rg.H;
                        break;
                    case 22:
                        rgVar2 = rg.J;
                        break;
                    case 23:
                        rgVar2 = rg.L;
                        break;
                    case 24:
                        rgVar2 = rg.M;
                        break;
                    case 25:
                        rgVar2 = rg.K;
                        break;
                    case 26:
                        rgVar2 = rg.N;
                        break;
                    case 27:
                        rgVar2 = rg.O;
                        break;
                    case 28:
                        rgVar2 = rg.P;
                        break;
                    case 29:
                        rgVar2 = rg.Q;
                        break;
                    case 30:
                        rgVar2 = rg.R;
                        break;
                    case 31:
                        rgVar2 = rg.S;
                        break;
                    case 32:
                        rgVar2 = rg.U;
                        break;
                    case 33:
                        rgVar2 = rg.V;
                        break;
                    case 34:
                        rgVar2 = rg.W;
                        break;
                    case 35:
                        rgVar2 = rg.X;
                        break;
                    case 36:
                        rgVar2 = rg.Y;
                        break;
                    case 37:
                        rgVar2 = rg.Z;
                        break;
                    case 38:
                        rgVar2 = rg.a0;
                        break;
                    case 39:
                        rgVar2 = rg.b0;
                        break;
                    case 40:
                        rgVar2 = rg.c0;
                        break;
                    case 41:
                        rgVar2 = rg.d0;
                        break;
                    case 42:
                        rgVar2 = rg.e0;
                        break;
                    case 43:
                        rgVar2 = rg.f0;
                        break;
                    case 44:
                        rgVar2 = rg.g0;
                        break;
                    case 45:
                        rgVar2 = rg.h0;
                        break;
                    case 46:
                        rgVar2 = rg.i0;
                        break;
                    case 47:
                        rgVar2 = rg.j0;
                        break;
                    case 48:
                        rgVar2 = rg.n0;
                        break;
                    case 49:
                        rgVar2 = rg.p0;
                        break;
                    case 50:
                        rgVar2 = rg.q0;
                        break;
                    case 51:
                        rgVar2 = rg.l0;
                        break;
                    case 52:
                        rgVar2 = rg.m0;
                        break;
                    case 53:
                        rgVar2 = rg.r0;
                        break;
                    case 54:
                        rgVar2 = rg.s0;
                        break;
                    case 55:
                        rgVar2 = rg.t0;
                        break;
                    case 56:
                        rgVar2 = rg.u0;
                        break;
                    case 57:
                        rgVar2 = rg.v0;
                        break;
                    case 58:
                        rgVar2 = rg.w0;
                        break;
                    case 59:
                        rgVar2 = rg.x0;
                        break;
                    case 60:
                        rgVar2 = rg.y0;
                        break;
                    case 61:
                        rgVar2 = rg.z0;
                        break;
                    case 62:
                        rgVar2 = rg.A0;
                        break;
                    case 63:
                        rgVar2 = rg.B0;
                        break;
                    case 64:
                        rgVar2 = rg.E0;
                        break;
                    case 65:
                        rgVar2 = rg.C0;
                        break;
                    case 66:
                        rgVar2 = rg.D0;
                        break;
                    case 67:
                        rgVar2 = rg.o0;
                        break;
                    case 68:
                        rgVar2 = rg.T;
                        break;
                    case 69:
                        rgVar2 = rg.I;
                        break;
                    case 70:
                        rgVar2 = rg.k0;
                        break;
                    case 71:
                        rgVar2 = rg.F0;
                        break;
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                        rgVar2 = rg.F0;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (rgVar2 != rg.F0) {
                    rgVar = rgVar2;
                }
            }
            if (rgVar != null) {
                bVar3 = new aa.u0(rgVar);
            }
            arrayList.add(new hg(wfVar2, yfVar2, u0Var, parse, bVar3));
        }
        return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.d(new mk(arrayList)))), this.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x0475, code lost:
    
        if (r11 == m10.bp.F0) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x063d, code lost:
    
        if (r7 == m10.op.s1) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012b, code lost:
    
        if (r11 == pz0.ak.Z) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02ad, code lost:
    
        if (r7 == pz0.nk.Z0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0751, code lost:
    
        if (r11 == gn0.eh.M) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x08b9, code lost:
    
        if (r7 == gn0.rh.O0) goto L546;
     */
    @Override // z01.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list) {
        Object obj;
        Object obj2;
        eh ehVar;
        rh rhVar;
        Object obj3;
        Object obj4;
        bp bpVar;
        op opVar;
        Object obj5;
        Object obj6;
        ak akVar;
        nk nkVar;
        int i = this.r;
        v71.v vVar = this.t;
        aa1.bShadow bVar = aa.t0.d;
        com.github.service.wrapper.j jVar = this.s;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    yz0.d dVar = (yz0.d) it.next();
                    k71.k.g(dVar, "<this>");
                    vg vgVar = wg.Companion;
                    String str = dVar.b;
                    vgVar.getClass();
                    k71.k.g(str, "rawValue");
                    d71.bShadow bVar2 = wg.u;
                    bVar2.getClass();
                    a5.g1 g1Var = new a5.g1(8, bVar2);
                    while (true) {
                        if (g1Var.hasNext()) {
                            obj = g1Var.next();
                            if (((wg) obj).r.equals(str)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    wg wgVar = (wg) obj;
                    if (wgVar == null) {
                        wgVar = wg.s;
                    }
                    wg wgVar2 = wgVar;
                    xg xgVar = yg.Companion;
                    String str2 = dVar.a;
                    xgVar.getClass();
                    k71.k.g(str2, "rawValue");
                    d71.bShadow bVar3 = yg.u;
                    bVar3.getClass();
                    a5.g1 g1Var2 = new a5.g1(8, bVar3);
                    while (true) {
                        if (g1Var2.hasNext()) {
                            obj2 = g1Var2.next();
                            if (((yg) obj2).r.equals(str2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    yg ygVar = (yg) obj2;
                    if (ygVar == null) {
                        ygVar = yg.s;
                    }
                    yg ygVar2 = ygVar;
                    zg zgVar = ah.Companion;
                    String str3 = dVar.e;
                    if (str3 != null) {
                        MobileEventContext.Companion.getClass();
                        MobileEventContext a = r01.k.a(str3);
                        k71.k.g(a, "<this>");
                        switch (vl0.e.a[a.ordinal()]) {
                            case 1:
                                ehVar = eh.F;
                                break;
                            case 2:
                                ehVar = eh.K;
                                break;
                            case 3:
                                ehVar = eh.y;
                                break;
                            case 4:
                                ehVar = eh.I;
                                break;
                            case 5:
                                ehVar = eh.D;
                                break;
                            case 6:
                                ehVar = eh.J;
                                break;
                            case 7:
                                ehVar = eh.G;
                                break;
                            case 8:
                                ehVar = eh.L;
                                break;
                            case 9:
                                ehVar = eh.v;
                                break;
                            case 10:
                                ehVar = eh.s;
                                break;
                            case 11:
                                ehVar = eh.A;
                                break;
                            case 12:
                                ehVar = eh.E;
                                break;
                            case 13:
                                ehVar = eh.u;
                                break;
                            case 14:
                                ehVar = eh.B;
                                break;
                            case 15:
                                ehVar = eh.x;
                                break;
                            case 16:
                                ehVar = eh.w;
                                break;
                            case 17:
                                ehVar = eh.C;
                                break;
                            case 18:
                                ehVar = eh.t;
                                break;
                            case 19:
                                ehVar = eh.z;
                                break;
                            case 20:
                                ehVar = eh.H;
                                break;
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                                ehVar = eh.M;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        break;
                    }
                    ehVar = null;
                    aa1.bShadow u0Var = ehVar == null ? bVar : new aa.u0(ehVar);
                    bh bhVar = ch.Companion;
                    ZonedDateTime parse = ZonedDateTime.parse(dVar.c);
                    k71.k.f(parse, "parse(...)");
                    String str4 = dVar.d;
                    if (str4 != null) {
                        MobileSubjectType.Companion.getClass();
                        MobileSubjectType a2 = r01.l.a(str4);
                        k71.k.g(a2, "<this>");
                        switch (vl0.f.a[a2.ordinal()]) {
                            case 1:
                                rhVar = rh.s;
                                break;
                            case 2:
                                rhVar = rh.u;
                                break;
                            case 3:
                                rhVar = rh.v;
                                break;
                            case 4:
                                rhVar = rh.O0;
                                break;
                            case 5:
                                rhVar = rh.O0;
                                break;
                            case 6:
                                rhVar = rh.x;
                                break;
                            case 7:
                                rhVar = rh.O0;
                                break;
                            case 8:
                                rhVar = rh.y;
                                break;
                            case 9:
                                rhVar = rh.z;
                                break;
                            case 10:
                                rhVar = rh.O0;
                                break;
                            case 11:
                                rhVar = rh.A;
                                break;
                            case 12:
                                rhVar = rh.O0;
                                break;
                            case 13:
                                rhVar = rh.C;
                                break;
                            case 14:
                                rhVar = rh.B;
                                break;
                            case 15:
                                rhVar = rh.D;
                                break;
                            case 16:
                                rhVar = rh.E;
                                break;
                            case 17:
                                rhVar = rh.F;
                                break;
                            case 18:
                                rhVar = rh.G;
                                break;
                            case 19:
                                rhVar = rh.H;
                                break;
                            case 20:
                                rhVar = rh.I;
                                break;
                            case 21:
                                rhVar = rh.J;
                                break;
                            case 22:
                                rhVar = rh.L;
                                break;
                            case 23:
                                rhVar = rh.N;
                                break;
                            case 24:
                                rhVar = rh.O;
                                break;
                            case 25:
                                rhVar = rh.M;
                                break;
                            case 26:
                                rhVar = rh.P;
                                break;
                            case 27:
                                rhVar = rh.Q;
                                break;
                            case 28:
                                rhVar = rh.R;
                                break;
                            case 29:
                                rhVar = rh.S;
                                break;
                            case 30:
                                rhVar = rh.T;
                                break;
                            case 31:
                                rhVar = rh.U;
                                break;
                            case 32:
                                rhVar = rh.W;
                                break;
                            case 33:
                                rhVar = rh.X;
                                break;
                            case 34:
                                rhVar = rh.Y;
                                break;
                            case 35:
                                rhVar = rh.Z;
                                break;
                            case 36:
                                rhVar = rh.a0;
                                break;
                            case 37:
                                rhVar = rh.b0;
                                break;
                            case 38:
                                rhVar = rh.d0;
                                break;
                            case 39:
                                rhVar = rh.e0;
                                break;
                            case 40:
                                rhVar = rh.f0;
                                break;
                            case 41:
                                rhVar = rh.i0;
                                break;
                            case 42:
                                rhVar = rh.j0;
                                break;
                            case 43:
                                rhVar = rh.l0;
                                break;
                            case 44:
                                rhVar = rh.m0;
                                break;
                            case 45:
                                rhVar = rh.n0;
                                break;
                            case 46:
                                rhVar = rh.o0;
                                break;
                            case 47:
                                rhVar = rh.p0;
                                break;
                            case 48:
                                rhVar = rh.t0;
                                break;
                            case 49:
                                rhVar = rh.v0;
                                break;
                            case 50:
                                rhVar = rh.w0;
                                break;
                            case 51:
                                rhVar = rh.x0;
                                break;
                            case 52:
                                rhVar = rh.r0;
                                break;
                            case 53:
                                rhVar = rh.s0;
                                break;
                            case 54:
                                rhVar = rh.y0;
                                break;
                            case 55:
                                rhVar = rh.z0;
                                break;
                            case 56:
                                rhVar = rh.A0;
                                break;
                            case 57:
                                rhVar = rh.B0;
                                break;
                            case 58:
                                rhVar = rh.C0;
                                break;
                            case 59:
                                rhVar = rh.D0;
                                break;
                            case 60:
                                rhVar = rh.E0;
                                break;
                            case 61:
                                rhVar = rh.F0;
                                break;
                            case 62:
                                rhVar = rh.H0;
                                break;
                            case 63:
                                rhVar = rh.I0;
                                break;
                            case 64:
                                rhVar = rh.J0;
                                break;
                            case 65:
                                rhVar = rh.N0;
                                break;
                            case 66:
                                rhVar = rh.L0;
                                break;
                            case 67:
                                rhVar = rh.M0;
                                break;
                            case 68:
                                rhVar = rh.u0;
                                break;
                            case 69:
                                rhVar = rh.V;
                                break;
                            case 70:
                                rhVar = rh.K;
                                break;
                            case 71:
                                rhVar = rh.q0;
                                break;
                            case 72:
                                rhVar = rh.K0;
                                break;
                            case 73:
                                rhVar = rh.G0;
                                break;
                            case 74:
                                rhVar = rh.h0;
                                break;
                            case 75:
                                rhVar = rh.w;
                                break;
                            case 76:
                                rhVar = rh.O0;
                                break;
                            case 77:
                                rhVar = rh.t;
                                break;
                            case 78:
                                rhVar = rh.c0;
                                break;
                            case 79:
                                rhVar = rh.g0;
                                break;
                            case 80:
                                rhVar = rh.k0;
                                break;
                            case 81:
                                rhVar = rh.O0;
                                break;
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                                rhVar = rh.O0;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        break;
                    }
                    rhVar = null;
                    arrayList.add(new hh(wgVar2, ygVar2, u0Var, parse, rhVar == null ? bVar : new aa.u0(rhVar)));
                }
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(jVar.d(new ql(arrayList)))), vVar);
            case 1:
                ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    yz0.d dVar2 = (yz0.d) it2.next();
                    k71.k.g(dVar2, "<this>");
                    nn nnVar = on.Companion;
                    String str5 = dVar2.b;
                    nnVar.getClass();
                    k71.k.g(str5, "rawValue");
                    d71.bShadow bVar4 = on.u;
                    bVar4.getClass();
                    a5.g1 g1Var3 = new a5.g1(8, bVar4);
                    while (true) {
                        if (g1Var3.hasNext()) {
                            obj3 = g1Var3.next();
                            if (((on) obj3).r.equals(str5)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    on onVar = (on) obj3;
                    if (onVar == null) {
                        onVar = on.s;
                    }
                    on onVar2 = onVar;
                    pn pnVar = qn.Companion;
                    String str6 = dVar2.a;
                    pnVar.getClass();
                    k71.k.g(str6, "rawValue");
                    d71.bShadow bVar5 = qn.K3;
                    bVar5.getClass();
                    a5.g1 g1Var4 = new a5.g1(8, bVar5);
                    while (true) {
                        if (g1Var4.hasNext()) {
                            obj4 = g1Var4.next();
                            if (((qn) obj4).r.equals(str6)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    qn qnVar = (qn) obj4;
                    if (qnVar == null) {
                        qnVar = qn.I3;
                    }
                    qn qnVar2 = qnVar;
                    rn rnVar = sn.Companion;
                    String str7 = dVar2.e;
                    if (str7 != null) {
                        MobileEventContext.Companion.getClass();
                        MobileEventContext a3 = r01.k.a(str7);
                        k71.k.g(a3, "<this>");
                        switch (dz.e.a[a3.ordinal()]) {
                            case 1:
                                bpVar = bp.u0;
                                break;
                            case 2:
                                bpVar = bp.z0;
                                break;
                            case 3:
                                bpVar = bp.R;
                                break;
                            case 4:
                                bpVar = bp.x0;
                                break;
                            case 5:
                                bpVar = bp.q0;
                                break;
                            case 6:
                                bpVar = bp.y0;
                                break;
                            case 7:
                                bpVar = bp.v0;
                                break;
                            case 8:
                                bpVar = bp.A0;
                                break;
                            case 9:
                                bpVar = bp.M;
                                break;
                            case 10:
                                bpVar = bp.A;
                                break;
                            case 11:
                                bpVar = bp.Y;
                                break;
                            case 12:
                                bpVar = bp.t0;
                                break;
                            case 13:
                                bpVar = bp.C;
                                break;
                            case 14:
                                bpVar = bp.c0;
                                break;
                            case 15:
                                bpVar = bp.Q;
                                break;
                            case 16:
                                bpVar = bp.P;
                                break;
                            case 17:
                                bpVar = bp.d0;
                                break;
                            case 18:
                                bpVar = bp.B;
                                break;
                            case 19:
                                bpVar = bp.T;
                                break;
                            case 20:
                                bpVar = bp.w0;
                                break;
                            case 21:
                                bpVar = bp.F;
                                break;
                            case 22:
                                bpVar = bp.L;
                                break;
                            case 23:
                                bpVar = bp.U;
                                break;
                            case 24:
                                bpVar = bp.b0;
                                break;
                            case 25:
                                bpVar = bp.a0;
                                break;
                            case 26:
                                bpVar = bp.e0;
                                break;
                            case 27:
                                bpVar = bp.f0;
                                break;
                            case 28:
                                bpVar = bp.g0;
                                break;
                            case 29:
                                bpVar = bp.h0;
                                break;
                            case 30:
                                bpVar = bp.i0;
                                break;
                            case 31:
                                bpVar = bp.j0;
                                break;
                            case 32:
                                bpVar = bp.k0;
                                break;
                            case 33:
                                bpVar = bp.E;
                                break;
                            case 34:
                                bpVar = bp.v;
                                break;
                            case 35:
                                bpVar = bp.w;
                                break;
                            case 36:
                                bpVar = bp.x;
                                break;
                            case 37:
                                bpVar = bp.V;
                                break;
                            case 38:
                                bpVar = bp.r0;
                                break;
                            case 39:
                                bpVar = bp.G;
                                break;
                            case 40:
                                bpVar = bp.H;
                                break;
                            case 41:
                                bpVar = bp.I;
                                break;
                            case 42:
                                bpVar = bp.S;
                                break;
                            case 43:
                                bpVar = bp.D;
                                break;
                            case 44:
                                bpVar = bp.X;
                                break;
                            case 45:
                                bpVar = bp.m0;
                                break;
                            case 46:
                                bpVar = bp.n0;
                                break;
                            case 47:
                                bpVar = bp.o0;
                                break;
                            case 48:
                                bpVar = bp.s0;
                                break;
                            case 49:
                                bpVar = bp.B0;
                                break;
                            case 50:
                                bpVar = bp.C0;
                                break;
                            case 51:
                                bpVar = bp.D0;
                                break;
                            case 52:
                                bpVar = bp.E0;
                                break;
                            case 53:
                                bpVar = bp.p0;
                                break;
                            case 54:
                                bpVar = bp.s;
                                break;
                            case 55:
                                bpVar = bp.t;
                                break;
                            case 56:
                                bpVar = bp.J;
                                break;
                            case 57:
                                bpVar = bp.K;
                                break;
                            case 58:
                                bpVar = bp.W;
                                break;
                            case 59:
                                bpVar = bp.Z;
                                break;
                            case 60:
                                bpVar = bp.u;
                                break;
                            case 61:
                                bpVar = bp.y;
                                break;
                            case 62:
                                bpVar = bp.z;
                                break;
                            case 63:
                                bpVar = bp.N;
                                break;
                            case 64:
                                bpVar = bp.O;
                                break;
                            case 65:
                                bpVar = bp.l0;
                                break;
                            case 66:
                                bpVar = bp.F0;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        break;
                    }
                    bpVar = null;
                    aa1.bShadow u0Var2 = bpVar == null ? bVar : new aa.u0(bpVar);
                    yo yoVar = zo.Companion;
                    ZonedDateTime parse2 = ZonedDateTime.parse(dVar2.c);
                    k71.k.f(parse2, "parse(...)");
                    String str8 = dVar2.d;
                    if (str8 != null) {
                        MobileSubjectType.Companion.getClass();
                        MobileSubjectType a4 = r01.l.a(str8);
                        k71.k.g(a4, "<this>");
                        switch (dz.f.a[a4.ordinal()]) {
                            case 1:
                                opVar = op.z;
                                break;
                            case 2:
                                opVar = op.B;
                                break;
                            case 3:
                                opVar = op.C;
                                break;
                            case 4:
                                opVar = op.D;
                                break;
                            case 5:
                                opVar = op.E;
                                break;
                            case 6:
                                opVar = op.I;
                                break;
                            case 7:
                                opVar = op.J;
                                break;
                            case 8:
                                opVar = op.K;
                                break;
                            case 9:
                                opVar = op.L;
                                break;
                            case 10:
                                opVar = op.M;
                                break;
                            case 11:
                                opVar = op.P;
                                break;
                            case 12:
                                opVar = op.Q;
                                break;
                            case 13:
                                opVar = op.V;
                                break;
                            case 14:
                                opVar = op.U;
                                break;
                            case 15:
                                opVar = op.W;
                                break;
                            case 16:
                                opVar = op.X;
                                break;
                            case 17:
                                opVar = op.Y;
                                break;
                            case 18:
                                opVar = op.Z;
                                break;
                            case 19:
                                opVar = op.b0;
                                break;
                            case 20:
                                opVar = op.d0;
                                break;
                            case 21:
                                opVar = op.e0;
                                break;
                            case 22:
                                opVar = op.g0;
                                break;
                            case 23:
                                opVar = op.j0;
                                break;
                            case 24:
                                opVar = op.k0;
                                break;
                            case 25:
                                opVar = op.h0;
                                break;
                            case 26:
                                opVar = op.i0;
                                break;
                            case 27:
                                opVar = op.l0;
                                break;
                            case 28:
                                opVar = op.m0;
                                break;
                            case 29:
                                opVar = op.n0;
                                break;
                            case 30:
                                opVar = op.o0;
                                break;
                            case 31:
                                opVar = op.p0;
                                break;
                            case 32:
                                opVar = op.q0;
                                break;
                            case 33:
                                opVar = op.s0;
                                break;
                            case 34:
                                opVar = op.t0;
                                break;
                            case 35:
                                opVar = op.u0;
                                break;
                            case 36:
                                opVar = op.v0;
                                break;
                            case 37:
                                opVar = op.w0;
                                break;
                            case 38:
                                opVar = op.y0;
                                break;
                            case 39:
                                opVar = op.A0;
                                break;
                            case 40:
                                opVar = op.B0;
                                break;
                            case 41:
                                opVar = op.C0;
                                break;
                            case 42:
                                opVar = op.F0;
                                break;
                            case 43:
                                opVar = op.G0;
                                break;
                            case 44:
                                opVar = op.I0;
                                break;
                            case 45:
                                opVar = op.J0;
                                break;
                            case 46:
                                opVar = op.K0;
                                break;
                            case 47:
                                opVar = op.L0;
                                break;
                            case 48:
                                opVar = op.M0;
                                break;
                            case 49:
                                opVar = op.S0;
                                break;
                            case 50:
                                opVar = op.U0;
                                break;
                            case 51:
                                opVar = op.V0;
                                break;
                            case 52:
                                opVar = op.W0;
                                break;
                            case 53:
                                opVar = op.O0;
                                break;
                            case 54:
                                opVar = op.P0;
                                break;
                            case 55:
                                opVar = op.Q0;
                                break;
                            case 56:
                                opVar = op.R0;
                                break;
                            case 57:
                                opVar = op.X0;
                                break;
                            case 58:
                                opVar = op.Y0;
                                break;
                            case 59:
                                opVar = op.Z0;
                                break;
                            case 60:
                                opVar = op.a1;
                                break;
                            case 61:
                                opVar = op.b1;
                                break;
                            case 62:
                                opVar = op.d1;
                                break;
                            case 63:
                                opVar = op.e1;
                                break;
                            case 64:
                                opVar = op.g1;
                                break;
                            case 65:
                                opVar = op.j1;
                                break;
                            case 66:
                                opVar = op.m1;
                                break;
                            case 67:
                                opVar = op.n1;
                                break;
                            case 68:
                                opVar = op.r1;
                                break;
                            case 69:
                                opVar = op.p1;
                                break;
                            case 70:
                                opVar = op.q1;
                                break;
                            case 71:
                                opVar = op.T0;
                                break;
                            case 72:
                                opVar = op.r0;
                                break;
                            case 73:
                                opVar = op.f0;
                                break;
                            case 74:
                                opVar = op.N0;
                                break;
                            case 75:
                                opVar = op.o1;
                                break;
                            case 76:
                                opVar = op.i1;
                                break;
                            case 77:
                                opVar = op.E0;
                                break;
                            case 78:
                                opVar = op.H;
                                break;
                            case 79:
                                opVar = op.s1;
                                break;
                            case 80:
                                opVar = op.s1;
                                break;
                            case 81:
                                opVar = op.A;
                                break;
                            case 82:
                                opVar = op.z0;
                                break;
                            case 83:
                                opVar = op.D0;
                                break;
                            case 84:
                                opVar = op.H0;
                                break;
                            case 85:
                                opVar = op.k1;
                                break;
                            case 86:
                                opVar = op.F;
                                break;
                            case 87:
                                opVar = op.c0;
                                break;
                            case 88:
                                opVar = op.y;
                                break;
                            case 89:
                                opVar = op.l1;
                                break;
                            case 90:
                                opVar = op.s;
                                break;
                            case 91:
                                opVar = op.t;
                                break;
                            case 92:
                                opVar = op.G;
                                break;
                            case 93:
                                opVar = op.N;
                                break;
                            case 94:
                                opVar = op.O;
                                break;
                            case 95:
                                opVar = op.R;
                                break;
                            case 96:
                                opVar = op.f1;
                                break;
                            case 97:
                                opVar = op.h1;
                                break;
                            case 98:
                                opVar = op.a0;
                                break;
                            case 99:
                                opVar = op.x0;
                                break;
                            case 100:
                                opVar = op.T;
                                break;
                            case 101:
                                opVar = op.S;
                                break;
                            case 102:
                                opVar = op.u;
                                break;
                            case 103:
                                opVar = op.v;
                                break;
                            case 104:
                                opVar = op.w;
                                break;
                            case 105:
                                opVar = op.x;
                                break;
                            case 106:
                                opVar = op.c1;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        break;
                    }
                    opVar = null;
                    arrayList2.add(new ep(onVar2, qnVar2, u0Var2, parse2, opVar == null ? bVar : new aa.u0(opVar)));
                }
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(jVar.d(new ap(arrayList2)))), vVar);
            case 2:
                return b(list);
            default:
                ArrayList arrayList3 = new ArrayList(x61.n.F(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    yz0.d dVar3 = (yz0.d) it3.next();
                    k71.k.g(dVar3, "<this>");
                    jj jjVar = kj.Companion;
                    String str9 = dVar3.b;
                    jjVar.getClass();
                    k71.k.g(str9, "rawValue");
                    d71.bShadow bVar6 = kj.u;
                    bVar6.getClass();
                    a5.g1 g1Var5 = new a5.g1(8, bVar6);
                    while (true) {
                        if (g1Var5.hasNext()) {
                            obj5 = g1Var5.next();
                            if (((kj) obj5).r.equals(str9)) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    kj kjVar = (kj) obj5;
                    if (kjVar == null) {
                        kjVar = kj.s;
                    }
                    kj kjVar2 = kjVar;
                    lj ljVar = mj.Companion;
                    String str10 = dVar3.a;
                    ljVar.getClass();
                    k71.k.g(str10, "rawValue");
                    d71.bShadow bVar7 = mj.u;
                    bVar7.getClass();
                    a5.g1 g1Var6 = new a5.g1(8, bVar7);
                    while (true) {
                        if (g1Var6.hasNext()) {
                            obj6 = g1Var6.next();
                            if (((mj) obj6).r.equals(str10)) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    mj mjVar = (mj) obj6;
                    if (mjVar == null) {
                        mjVar = mj.s;
                    }
                    mj mjVar2 = mjVar;
                    nj njVar = oj.Companion;
                    String str11 = dVar3.e;
                    if (str11 != null) {
                        MobileEventContext.Companion.getClass();
                        MobileEventContext a5 = r01.k.a(str11);
                        k71.k.g(a5, "<this>");
                        switch (jx0.e.a[a5.ordinal()]) {
                            case 1:
                                akVar = ak.S;
                                break;
                            case 2:
                                akVar = ak.X;
                                break;
                            case 3:
                                akVar = ak.B;
                                break;
                            case 4:
                                akVar = ak.V;
                                break;
                            case 5:
                                akVar = ak.Q;
                                break;
                            case 6:
                                akVar = ak.W;
                                break;
                            case 7:
                                akVar = ak.T;
                                break;
                            case 8:
                                akVar = ak.Y;
                                break;
                            case 9:
                                akVar = ak.y;
                                break;
                            case 10:
                                akVar = ak.s;
                                break;
                            case 11:
                                akVar = ak.E;
                                break;
                            case 12:
                                akVar = ak.R;
                                break;
                            case 13:
                                akVar = ak.u;
                                break;
                            case 14:
                                akVar = ak.H;
                                break;
                            case 15:
                                akVar = ak.A;
                                break;
                            case 16:
                                akVar = ak.z;
                                break;
                            case 17:
                                akVar = ak.I;
                                break;
                            case 18:
                                akVar = ak.t;
                                break;
                            case 19:
                                akVar = ak.C;
                                break;
                            case 20:
                                akVar = ak.U;
                                break;
                            case 21:
                                akVar = ak.w;
                                break;
                            case 22:
                                akVar = ak.x;
                                break;
                            case 23:
                                akVar = ak.D;
                                break;
                            case 24:
                                akVar = ak.G;
                                break;
                            case 25:
                                akVar = ak.F;
                                break;
                            case 26:
                                akVar = ak.J;
                                break;
                            case 27:
                                akVar = ak.K;
                                break;
                            case 28:
                                akVar = ak.L;
                                break;
                            case 29:
                                akVar = ak.M;
                                break;
                            case 30:
                                akVar = ak.N;
                                break;
                            case 31:
                                akVar = ak.O;
                                break;
                            case 32:
                                akVar = ak.P;
                                break;
                            case 33:
                                akVar = ak.v;
                                break;
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                                akVar = ak.Z;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        break;
                    }
                    akVar = null;
                    aa1.bShadow u0Var3 = akVar == null ? bVar : new aa.u0(akVar);
                    xj xjVar = yj.Companion;
                    ZonedDateTime parse3 = ZonedDateTime.parse(dVar3.c);
                    k71.k.f(parse3, "parse(...)");
                    String str12 = dVar3.d;
                    if (str12 != null) {
                        MobileSubjectType.Companion.getClass();
                        MobileSubjectType a6 = r01.l.a(str12);
                        k71.k.g(a6, "<this>");
                        switch (jx0.f.a[a6.ordinal()]) {
                            case 1:
                                nkVar = nk.t;
                                break;
                            case 2:
                                nkVar = nk.v;
                                break;
                            case 3:
                                nkVar = nk.w;
                                break;
                            case 4:
                                nkVar = nk.x;
                                break;
                            case 5:
                                nkVar = nk.y;
                                break;
                            case 6:
                                nkVar = nk.B;
                                break;
                            case 7:
                                nkVar = nk.C;
                                break;
                            case 8:
                                nkVar = nk.D;
                                break;
                            case 9:
                                nkVar = nk.E;
                                break;
                            case 10:
                                nkVar = nk.F;
                                break;
                            case 11:
                                nkVar = nk.G;
                                break;
                            case 12:
                                nkVar = nk.H;
                                break;
                            case 13:
                                nkVar = nk.J;
                                break;
                            case 14:
                                nkVar = nk.I;
                                break;
                            case 15:
                                nkVar = nk.K;
                                break;
                            case 16:
                                nkVar = nk.L;
                                break;
                            case 17:
                                nkVar = nk.M;
                                break;
                            case 18:
                                nkVar = nk.N;
                                break;
                            case 19:
                                nkVar = nk.O;
                                break;
                            case 20:
                                nkVar = nk.Q;
                                break;
                            case 21:
                                nkVar = nk.R;
                                break;
                            case 22:
                                nkVar = nk.T;
                                break;
                            case 23:
                                nkVar = nk.W;
                                break;
                            case 24:
                                nkVar = nk.X;
                                break;
                            case 25:
                                nkVar = nk.U;
                                break;
                            case 26:
                                nkVar = nk.V;
                                break;
                            case 27:
                                nkVar = nk.Y;
                                break;
                            case 28:
                                nkVar = nk.Z;
                                break;
                            case 29:
                                nkVar = nk.a0;
                                break;
                            case 30:
                                nkVar = nk.b0;
                                break;
                            case 31:
                                nkVar = nk.c0;
                                break;
                            case 32:
                                nkVar = nk.d0;
                                break;
                            case 33:
                                nkVar = nk.f0;
                                break;
                            case 34:
                                nkVar = nk.g0;
                                break;
                            case 35:
                                nkVar = nk.h0;
                                break;
                            case 36:
                                nkVar = nk.i0;
                                break;
                            case 37:
                                nkVar = nk.j0;
                                break;
                            case 38:
                                nkVar = nk.k0;
                                break;
                            case 39:
                                nkVar = nk.m0;
                                break;
                            case 40:
                                nkVar = nk.n0;
                                break;
                            case 41:
                                nkVar = nk.o0;
                                break;
                            case 42:
                                nkVar = nk.r0;
                                break;
                            case 43:
                                nkVar = nk.s0;
                                break;
                            case 44:
                                nkVar = nk.u0;
                                break;
                            case 45:
                                nkVar = nk.v0;
                                break;
                            case 46:
                                nkVar = nk.w0;
                                break;
                            case 47:
                                nkVar = nk.x0;
                                break;
                            case 48:
                                nkVar = nk.y0;
                                break;
                            case 49:
                                nkVar = nk.C0;
                                break;
                            case 50:
                                nkVar = nk.E0;
                                break;
                            case 51:
                                nkVar = nk.F0;
                                break;
                            case 52:
                                nkVar = nk.G0;
                                break;
                            case 53:
                                nkVar = nk.A0;
                                break;
                            case 54:
                                nkVar = nk.B0;
                                break;
                            case 55:
                                nkVar = nk.H0;
                                break;
                            case 56:
                                nkVar = nk.I0;
                                break;
                            case 57:
                                nkVar = nk.J0;
                                break;
                            case 58:
                                nkVar = nk.K0;
                                break;
                            case 59:
                                nkVar = nk.L0;
                                break;
                            case 60:
                                nkVar = nk.M0;
                                break;
                            case 61:
                                nkVar = nk.N0;
                                break;
                            case 62:
                                nkVar = nk.O0;
                                break;
                            case 63:
                                nkVar = nk.Q0;
                                break;
                            case 64:
                                nkVar = nk.T0;
                                break;
                            case 65:
                                nkVar = nk.U0;
                                break;
                            case 66:
                                nkVar = nk.Y0;
                                break;
                            case 67:
                                nkVar = nk.W0;
                                break;
                            case 68:
                                nkVar = nk.X0;
                                break;
                            case 69:
                                nkVar = nk.D0;
                                break;
                            case 70:
                                nkVar = nk.e0;
                                break;
                            case 71:
                                nkVar = nk.S;
                                break;
                            case 72:
                                nkVar = nk.z0;
                                break;
                            case 73:
                                nkVar = nk.V0;
                                break;
                            case 74:
                                nkVar = nk.P0;
                                break;
                            case 75:
                                nkVar = nk.q0;
                                break;
                            case 76:
                                nkVar = nk.A;
                                break;
                            case 77:
                                nkVar = nk.Z0;
                                break;
                            case 78:
                                nkVar = nk.Z0;
                                break;
                            case 79:
                                nkVar = nk.u;
                                break;
                            case 80:
                                nkVar = nk.l0;
                                break;
                            case 81:
                                nkVar = nk.p0;
                                break;
                            case 82:
                                nkVar = nk.t0;
                                break;
                            case 83:
                                nkVar = nk.R0;
                                break;
                            case 84:
                                nkVar = nk.z;
                                break;
                            case 85:
                                nkVar = nk.P;
                                break;
                            case 86:
                                nkVar = nk.s;
                                break;
                            case 87:
                                nkVar = nk.S0;
                                break;
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                                nkVar = nk.Z0;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        break;
                    }
                    nkVar = null;
                    arrayList3.add(new dk(kjVar2, mjVar2, u0Var3, parse3, nkVar == null ? bVar : new aa.u0(nkVar)));
                }
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(jVar.d(new hn(arrayList3)))), vVar);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
    public static Object f0(Object p1) { return null; }
    public static final Object b = null;
    public Object C(Object p1) { return null; }
    public Object G(Object p1) { return null; }
    public Object I(Object p1) { return null; }
    public Object d(Object p1) { return null; }
}
