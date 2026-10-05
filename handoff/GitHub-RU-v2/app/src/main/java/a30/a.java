package a30;

import aa.q;
import c71.j;
import gn0.p8;
import gv.a1;
import gv.d1;
import gv.h1;
import gv.w0;
import gv.z0;
import hc0.d8;
import j71.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.az;
import jn0.bz;
import jn0.eg;
import jn0.fd;
import jn0.fg;
import jn0.gd;
import jn0.hd;
import jn0.hg;
import jn0.id;
import jn0.ig;
import jn0.jd;
import jn0.kd;
import jn0.uy;
import jn0.vy;
import jn0.wy;
import jn0.xy;
import jn0.yy;
import jo.a10;
import jo.b10;
import jo.bh;
import jo.ce;
import jo.ch;
import jo.de;
import jo.ee;
import jo.eh;
import jo.fe;
import jo.fh;
import jo.ge;
import jo.he;
import jo.u00;
import jo.v00;
import jo.w00;
import jo.x00;
import jo.y00;
import k71.k;
import kc0.lc;
import kc0.mc;
import kc0.me;
import kc0.nc;
import kc0.ne;
import kc0.oc;
import kc0.pc;
import kc0.pe;
import kc0.qc;
import kc0.qe;
import m10.uc;
import pz0.q9;
import ri0.g0;
import ri0.j0;
import ri0.m0;
import ri0.q0;
import ri0.t0;
import ri0.x0;
import sy.y;
import u10.dc;
import u10.ec;
import u10.fc;
import u10.gc;
import u10.hc;
import u10.ic;
import u10.td;
import u10.ud;
import u10.wd;
import u10.xd;
import v7.c;
import w61.a0;
import x61.n;
import yu.d;
import yu.h;
import z70.e0;
import z70.f0;
import z70.l0;
import z70.o0;
import z70.p0;
import z70.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends j implements e {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, String str, String str2, int i, String str3, a71.c cVar, int i2) {
        super(2, cVar);
        this.v = i2;
        this.C = obj;
        this.y = str;
        this.z = str2;
        this.A = i;
        this.B = str3;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                a aVar = new a((c) this.C, this.y, this.z, this.A, this.B, cVar, 0);
                aVar.x = obj;
                return aVar;
            case 1:
                a aVar2 = new a((c) this.C, this.y, this.z, this.A, this.B, cVar, 1);
                aVar2.x = obj;
                return aVar2;
            case 2:
                a aVar3 = new a((c) this.C, this.y, this.z, this.A, this.B, cVar, 2);
                aVar3.x = obj;
                return aVar3;
            default:
                a aVar4 = new a((c) this.C, this.y, this.z, this.A, this.B, cVar, 3);
                aVar4.x = obj;
                return aVar4;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (dc) obj).v(a0.a);
            case 1:
                return r((a71.c) obj2, (ce) obj).v(a0.a);
            case 2:
                return r((a71.c) obj2, (lc) obj).v(a0.a);
            default:
                return r((a71.c) obj2, (fd) obj).v(a0.a);
        }
    }

    public final Object v(Object obj) {
        hc hcVar;
        ec ecVar;
        gc gcVar;
        List list;
        ge geVar;
        de deVar;
        fe feVar;
        List list2;
        pc pcVar;
        mc mcVar;
        oc ocVar;
        List list3;
        jd jdVar;
        gd gdVar;
        id idVar;
        List list4;
        switch (this.v) {
            case 0:
                dc dcVar = (dc) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                a0 a0Var = a0.a;
                if (i == 0) {
                    y.j(obj);
                    ic icVar = dcVar.a;
                    if (icVar != null && (hcVar = icVar.b) != null && (ecVar = hcVar.a) != null && (gcVar = ecVar.a) != null && (list = gcVar.a) != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                fc fcVar = (fc) it.next();
                                a50.a aVar2 = fcVar != null ? fcVar.b : null;
                                if (aVar2 != null) {
                                    arrayList.add(aVar2);
                                }
                            } else {
                                a00.b bVar = (a00.b) ((c) this.C).v;
                                b30.b bVar2 = new b30.b(this.y, this.A, this.z);
                                this.x = null;
                                this.w = 1;
                                bVar.getClass();
                                final ArrayList arrayList2 = new ArrayList(n.F(arrayList, 10));
                                int size = arrayList.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    Object obj2 = arrayList.get(i2);
                                    i2++;
                                    d8.Companion.getClass();
                                    arrayList2.add(new f0(((q) d8.a).a, (a50.a) obj2));
                                }
                                final int i3 = 0;
                                final String str = this.B;
                                Object c = bVar.c(bVar2, new j71.c() { // from class: b30.a
                                    public final Object k(Object obj3) {
                                        xd xdVar;
                                        ud udVar;
                                        wd wdVar;
                                        e0 e0Var;
                                        ArrayList arrayList3;
                                        String str2;
                                        p0 p0Var;
                                        l0 l0Var;
                                        ud udVar2;
                                        fh fhVar;
                                        ch chVar;
                                        eh ehVar;
                                        gv.p0 p0Var2;
                                        ArrayList arrayList4;
                                        String str3;
                                        a1 a1Var;
                                        w0 w0Var;
                                        ch chVar2;
                                        b10 b10Var;
                                        v00 v00Var;
                                        u00 u00Var;
                                        x00 x00Var;
                                        ArrayList arrayList5;
                                        String str4;
                                        yu.e eVar;
                                        d dVar;
                                        v00 v00Var2;
                                        qe qeVar;
                                        ne neVar;
                                        pe peVar;
                                        ri0.f0 f0Var;
                                        ArrayList arrayList6;
                                        String str5;
                                        q0 q0Var;
                                        m0 m0Var;
                                        ne neVar2;
                                        ig igVar;
                                        fg fgVar;
                                        hg hgVar;
                                        xt0.f0 f0Var2;
                                        ArrayList arrayList7;
                                        String str6;
                                        xt0.q0 q0Var2;
                                        xt0.m0 m0Var2;
                                        fg fgVar2;
                                        bz bzVar;
                                        vy vyVar;
                                        uy uyVar;
                                        xy xyVar;
                                        ArrayList arrayList8;
                                        String str7;
                                        pt0.e eVar2;
                                        pt0.d dVar2;
                                        vy vyVar2;
                                        switch (i3) {
                                            case 0:
                                                td tdVar = (td) obj3;
                                                k.g(tdVar, "cached");
                                                xd xdVar2 = tdVar.a;
                                                wd wdVar2 = (xdVar2 == null || (udVar2 = xdVar2.b) == null) ? null : udVar2.c;
                                                e0 e0Var2 = wdVar2 != null ? wdVar2.c.l : null;
                                                if (xdVar2 != null) {
                                                    ud udVar3 = xdVar2.b;
                                                    if (udVar3 != null) {
                                                        if (wdVar2 != null) {
                                                            z70.w0 w0Var2 = wdVar2.c;
                                                            if (e0Var2 != null) {
                                                                s0 s0Var = e0Var2.a;
                                                                List<o0> list5 = s0Var.b;
                                                                if (list5 != null) {
                                                                    arrayList3 = new ArrayList(n.F(list5, 10));
                                                                    for (o0 o0Var : list5) {
                                                                        if (o0Var == null || (l0Var = o0Var.d) == null || (str2 = l0Var.a) == null) {
                                                                            str2 = (o0Var == null || (p0Var = o0Var.c) == null) ? null : p0Var.a;
                                                                        }
                                                                        if (k.b(str2, str)) {
                                                                            o0Var = o0Var != null ? new o0(o0Var.a, o0Var.b, o0Var.c, o0Var.d, arrayList2, o0Var.f, o0Var.g, o0Var.h, o0Var.i, o0Var.j, o0Var.k) : null;
                                                                        }
                                                                        arrayList3.add(o0Var);
                                                                    }
                                                                } else {
                                                                    arrayList3 = null;
                                                                }
                                                                e0Var = new e0(new s0(s0Var.a, arrayList3));
                                                            } else {
                                                                e0Var = null;
                                                            }
                                                            wdVar = wd.a(wdVar2, z70.w0.a(w0Var2, e0Var, null, 30719));
                                                        } else {
                                                            wdVar = null;
                                                        }
                                                        udVar = ud.a(udVar3, wdVar);
                                                    } else {
                                                        udVar = null;
                                                    }
                                                    xdVar = xd.a(xdVar2, udVar);
                                                } else {
                                                    xdVar = null;
                                                }
                                                return new td(xdVar);
                                            case 1:
                                                bh bhVar = (bh) obj3;
                                                k.g(bhVar, "cached");
                                                fh fhVar2 = bhVar.a;
                                                eh ehVar2 = (fhVar2 == null || (chVar2 = fhVar2.b) == null) ? null : chVar2.c;
                                                gv.p0 p0Var3 = ehVar2 != null ? ehVar2.c.l : null;
                                                if (fhVar2 != null) {
                                                    ch chVar3 = fhVar2.b;
                                                    if (chVar3 != null) {
                                                        if (ehVar2 != null) {
                                                            h1 h1Var = ehVar2.c;
                                                            if (p0Var3 != null) {
                                                                d1 d1Var = p0Var3.c;
                                                                List<z0> list6 = d1Var.b;
                                                                if (list6 != null) {
                                                                    arrayList4 = new ArrayList(n.F(list6, 10));
                                                                    for (z0 z0Var : list6) {
                                                                        if (z0Var == null || (w0Var = z0Var.d) == null || (str3 = w0Var.a) == null) {
                                                                            str3 = (z0Var == null || (a1Var = z0Var.c) == null) ? null : a1Var.a;
                                                                        }
                                                                        if (k.b(str3, str)) {
                                                                            z0Var = z0Var != null ? new z0(z0Var.a, z0Var.b, z0Var.c, z0Var.d, arrayList2, z0Var.f, z0Var.g, z0Var.h, z0Var.i, z0Var.j, z0Var.k) : null;
                                                                        }
                                                                        arrayList4.add(z0Var);
                                                                    }
                                                                } else {
                                                                    arrayList4 = null;
                                                                }
                                                                p0Var2 = gv.p0.a(p0Var3, new d1(d1Var.a, arrayList4));
                                                            } else {
                                                                p0Var2 = null;
                                                            }
                                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var2, null, 30719));
                                                        } else {
                                                            ehVar = null;
                                                        }
                                                        chVar = ch.a(chVar3, ehVar);
                                                    } else {
                                                        chVar = null;
                                                    }
                                                    fhVar = fh.a(fhVar2, chVar);
                                                } else {
                                                    fhVar = null;
                                                }
                                                return bh.a(bhVar, fhVar);
                                            case 2:
                                                w00 w00Var = (w00) obj3;
                                                k.g(w00Var, "cached");
                                                b10 b10Var2 = w00Var.a;
                                                u00 u00Var2 = (b10Var2 == null || (v00Var2 = b10Var2.b) == null) ? null : v00Var2.b;
                                                x00 x00Var2 = u00Var2 != null ? u00Var2.b : null;
                                                if (b10Var2 != null) {
                                                    v00 v00Var3 = b10Var2.b;
                                                    if (v00Var3 != null) {
                                                        if (u00Var2 != null) {
                                                            if (x00Var2 != null) {
                                                                a10 a10Var = x00Var2.d;
                                                                List<y00> list7 = a10Var.b;
                                                                if (list7 != null) {
                                                                    ArrayList arrayList9 = new ArrayList(n.F(list7, 10));
                                                                    for (y00 y00Var : list7) {
                                                                        if (y00Var == null || (dVar = y00Var.c.e) == null || (str4 = dVar.a) == null) {
                                                                            str4 = (y00Var == null || (eVar = y00Var.c.d) == null) ? null : eVar.a;
                                                                        }
                                                                        if (k.b(str4, str)) {
                                                                            if (y00Var != null) {
                                                                                h hVar = y00Var.c;
                                                                                y00Var = new y00(y00Var.a, y00Var.b, new h(hVar.a, hVar.b, hVar.c, hVar.d, hVar.e, arrayList2, hVar.g, hVar.h, hVar.i, hVar.j, hVar.k));
                                                                            } else {
                                                                                y00Var = null;
                                                                            }
                                                                        }
                                                                        arrayList9.add(y00Var);
                                                                    }
                                                                    arrayList5 = arrayList9;
                                                                } else {
                                                                    arrayList5 = null;
                                                                }
                                                                x00Var = x00.a(x00Var2, new a10(a10Var.a, arrayList5));
                                                            } else {
                                                                x00Var = null;
                                                            }
                                                            u00Var = u00.a(u00Var2, x00Var);
                                                        } else {
                                                            u00Var = null;
                                                        }
                                                        v00Var = v00.a(v00Var3, u00Var);
                                                    } else {
                                                        v00Var = null;
                                                    }
                                                    b10Var = b10.a(b10Var2, v00Var);
                                                } else {
                                                    b10Var = null;
                                                }
                                                return w00.a(w00Var, b10Var);
                                            case 3:
                                                me meVar = (me) obj3;
                                                k.g(meVar, "cached");
                                                qe qeVar2 = meVar.a;
                                                pe peVar2 = (qeVar2 == null || (neVar2 = qeVar2.b) == null) ? null : neVar2.c;
                                                ri0.f0 f0Var3 = peVar2 != null ? peVar2.c.l : null;
                                                if (qeVar2 != null) {
                                                    ne neVar3 = qeVar2.b;
                                                    if (neVar3 != null) {
                                                        if (peVar2 != null) {
                                                            x0 x0Var = peVar2.c;
                                                            if (f0Var3 != null) {
                                                                t0 t0Var = f0Var3.a;
                                                                List<ri0.p0> list8 = t0Var.b;
                                                                if (list8 != null) {
                                                                    arrayList6 = new ArrayList(n.F(list8, 10));
                                                                    for (ri0.p0 p0Var4 : list8) {
                                                                        if (p0Var4 == null || (m0Var = p0Var4.d) == null || (str5 = m0Var.a) == null) {
                                                                            str5 = (p0Var4 == null || (q0Var = p0Var4.c) == null) ? null : q0Var.a;
                                                                        }
                                                                        if (k.b(str5, str)) {
                                                                            p0Var4 = p0Var4 != null ? new ri0.p0(p0Var4.a, p0Var4.b, p0Var4.c, p0Var4.d, arrayList2, p0Var4.f, p0Var4.g, p0Var4.h, p0Var4.i, p0Var4.j, p0Var4.k) : null;
                                                                        }
                                                                        arrayList6.add(p0Var4);
                                                                    }
                                                                } else {
                                                                    arrayList6 = null;
                                                                }
                                                                f0Var = new ri0.f0(new t0(t0Var.a, arrayList6));
                                                            } else {
                                                                f0Var = null;
                                                            }
                                                            peVar = pe.a(peVar2, x0.a(x0Var, f0Var, (j0) null, 30719));
                                                        } else {
                                                            peVar = null;
                                                        }
                                                        neVar = ne.a(neVar3, peVar);
                                                    } else {
                                                        neVar = null;
                                                    }
                                                    qeVar = qe.a(qeVar2, neVar);
                                                } else {
                                                    qeVar = null;
                                                }
                                                return new me(qeVar);
                                            case 4:
                                                ArrayList arrayList10 = arrayList2;
                                                v7.a aVar3 = (v7.a) obj3;
                                                k.g(aVar3, "_connection");
                                                c F0 = aVar3.F0(str);
                                                try {
                                                    int size2 = arrayList10.size();
                                                    int i4 = 1;
                                                    int i5 = 0;
                                                    while (i5 < size2) {
                                                        Object obj4 = arrayList10.get(i5);
                                                        i5++;
                                                        F0.k0((String) obj4, i4);
                                                        i4++;
                                                    }
                                                    F0.B0();
                                                    F0.close();
                                                    return a0.a;
                                                } catch (Throwable th2) {
                                                    F0.close();
                                                    throw th2;
                                                }
                                            case 5:
                                                eg egVar = (eg) obj3;
                                                k.g(egVar, "cached");
                                                ig igVar2 = egVar.a;
                                                hg hgVar2 = (igVar2 == null || (fgVar2 = igVar2.b) == null) ? null : fgVar2.c;
                                                xt0.f0 f0Var4 = hgVar2 != null ? hgVar2.c.l : null;
                                                if (igVar2 != null) {
                                                    fg fgVar3 = igVar2.b;
                                                    if (fgVar3 != null) {
                                                        if (hgVar2 != null) {
                                                            xt0.x0 x0Var2 = hgVar2.c;
                                                            if (f0Var4 != null) {
                                                                xt0.t0 t0Var2 = f0Var4.a;
                                                                List<xt0.p0> list9 = t0Var2.b;
                                                                if (list9 != null) {
                                                                    arrayList7 = new ArrayList(n.F(list9, 10));
                                                                    for (xt0.p0 p0Var5 : list9) {
                                                                        if (p0Var5 == null || (m0Var2 = p0Var5.d) == null || (str6 = m0Var2.a) == null) {
                                                                            str6 = (p0Var5 == null || (q0Var2 = p0Var5.c) == null) ? null : q0Var2.a;
                                                                        }
                                                                        if (k.b(str6, str)) {
                                                                            p0Var5 = p0Var5 != null ? new xt0.p0(p0Var5.a, p0Var5.b, p0Var5.c, p0Var5.d, arrayList2, p0Var5.f, p0Var5.g, p0Var5.h, p0Var5.i, p0Var5.j, p0Var5.k) : null;
                                                                        }
                                                                        arrayList7.add(p0Var5);
                                                                    }
                                                                } else {
                                                                    arrayList7 = null;
                                                                }
                                                                f0Var2 = new xt0.f0(new xt0.t0(t0Var2.a, arrayList7));
                                                            } else {
                                                                f0Var2 = null;
                                                            }
                                                            hgVar = hg.a(hgVar2, xt0.x0.a(x0Var2, f0Var2, (xt0.j0) null, 30719));
                                                        } else {
                                                            hgVar = null;
                                                        }
                                                        fgVar = fg.a(fgVar3, hgVar);
                                                    } else {
                                                        fgVar = null;
                                                    }
                                                    igVar = ig.a(igVar2, fgVar);
                                                } else {
                                                    igVar = null;
                                                }
                                                return eg.a(egVar, igVar);
                                            default:
                                                wy wyVar = (wy) obj3;
                                                k.g(wyVar, "cached");
                                                bz bzVar2 = wyVar.a;
                                                uy uyVar2 = (bzVar2 == null || (vyVar2 = bzVar2.b) == null) ? null : vyVar2.b;
                                                xy xyVar2 = uyVar2 != null ? uyVar2.b : null;
                                                if (bzVar2 != null) {
                                                    vy vyVar3 = bzVar2.b;
                                                    if (vyVar3 != null) {
                                                        if (uyVar2 != null) {
                                                            if (xyVar2 != null) {
                                                                az azVar = xyVar2.d;
                                                                List<yy> list10 = azVar.b;
                                                                if (list10 != null) {
                                                                    ArrayList arrayList11 = new ArrayList(n.F(list10, 10));
                                                                    for (yy yyVar : list10) {
                                                                        if (yyVar == null || (dVar2 = yyVar.c.e) == null || (str7 = dVar2.a) == null) {
                                                                            str7 = (yyVar == null || (eVar2 = yyVar.c.d) == null) ? null : eVar2.a;
                                                                        }
                                                                        if (k.b(str7, str)) {
                                                                            if (yyVar != null) {
                                                                                pt0.h hVar2 = yyVar.c;
                                                                                yyVar = new yy(yyVar.a, yyVar.b, new pt0.h(hVar2.a, hVar2.b, hVar2.c, hVar2.d, hVar2.e, arrayList2, hVar2.g, hVar2.h, hVar2.i, hVar2.j, hVar2.k));
                                                                            } else {
                                                                                yyVar = null;
                                                                            }
                                                                        }
                                                                        arrayList11.add(yyVar);
                                                                    }
                                                                    arrayList8 = arrayList11;
                                                                } else {
                                                                    arrayList8 = null;
                                                                }
                                                                xyVar = xy.a(xyVar2, new az(azVar.a, arrayList8));
                                                            } else {
                                                                xyVar = null;
                                                            }
                                                            uyVar = uy.a(uyVar2, xyVar);
                                                        } else {
                                                            uyVar = null;
                                                        }
                                                        vyVar = vy.a(vyVar3, uyVar);
                                                    } else {
                                                        vyVar = null;
                                                    }
                                                    bzVar = bz.a(bzVar2, vyVar);
                                                } else {
                                                    bzVar = null;
                                                }
                                                return wy.a(wyVar, bzVar);
                                        }
                                    }
                                }, this);
                                if (c != b71.a.r) {
                                    c = a0Var;
                                }
                                if (c == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var;
            case 1:
                ce ceVar = (ce) this.x;
                b71.a aVar3 = b71.a.r;
                int i4 = this.w;
                a0 a0Var2 = a0.a;
                if (i4 == 0) {
                    y.j(obj);
                    he heVar = ceVar.a;
                    if (heVar != null && (geVar = heVar.b) != null && (deVar = geVar.a) != null && (feVar = deVar.a) != null && (list2 = feVar.a) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                ee eeVar = (ee) it2.next();
                                es.a aVar4 = eeVar != null ? eeVar.b : null;
                                if (aVar4 != null) {
                                    arrayList3.add(aVar4);
                                }
                            } else {
                                a00.b bVar3 = (a00.b) ((c) this.C).v;
                                bq.b bVar4 = new bq.b(this.y, this.A, this.z);
                                this.x = null;
                                this.w = 1;
                                bVar3.getClass();
                                final ArrayList arrayList4 = new ArrayList(n.F(arrayList3, 10));
                                int size2 = arrayList3.size();
                                int i5 = 0;
                                while (i5 < size2) {
                                    Object obj3 = arrayList3.get(i5);
                                    i5++;
                                    uc.Companion.getClass();
                                    arrayList4.add(new gv.q0(((q) uc.a).a, (es.a) obj3));
                                }
                                final int i6 = 1;
                                final String str2 = this.B;
                                Object c2 = bVar3.c(bVar4, new j71.c() { // from class: b30.a
                                    public final Object k(Object obj32) {
                                        xd xdVar;
                                        ud udVar;
                                        wd wdVar;
                                        e0 e0Var;
                                        ArrayList arrayList32;
                                        String str22;
                                        p0 p0Var;
                                        l0 l0Var;
                                        ud udVar2;
                                        fh fhVar;
                                        ch chVar;
                                        eh ehVar;
                                        gv.p0 p0Var2;
                                        ArrayList arrayList42;
                                        String str3;
                                        a1 a1Var;
                                        w0 w0Var;
                                        ch chVar2;
                                        b10 b10Var;
                                        v00 v00Var;
                                        u00 u00Var;
                                        x00 x00Var;
                                        ArrayList arrayList5;
                                        String str4;
                                        yu.e eVar;
                                        d dVar;
                                        v00 v00Var2;
                                        qe qeVar;
                                        ne neVar;
                                        pe peVar;
                                        ri0.f0 f0Var;
                                        ArrayList arrayList6;
                                        String str5;
                                        q0 q0Var;
                                        m0 m0Var;
                                        ne neVar2;
                                        ig igVar;
                                        fg fgVar;
                                        hg hgVar;
                                        xt0.f0 f0Var2;
                                        ArrayList arrayList7;
                                        String str6;
                                        xt0.q0 q0Var2;
                                        xt0.m0 m0Var2;
                                        fg fgVar2;
                                        bz bzVar;
                                        vy vyVar;
                                        uy uyVar;
                                        xy xyVar;
                                        ArrayList arrayList8;
                                        String str7;
                                        pt0.e eVar2;
                                        pt0.d dVar2;
                                        vy vyVar2;
                                        switch (i6) {
                                            case 0:
                                                td tdVar = (td) obj32;
                                                k.g(tdVar, "cached");
                                                xd xdVar2 = tdVar.a;
                                                wd wdVar2 = (xdVar2 == null || (udVar2 = xdVar2.b) == null) ? null : udVar2.c;
                                                e0 e0Var2 = wdVar2 != null ? wdVar2.c.l : null;
                                                if (xdVar2 != null) {
                                                    ud udVar3 = xdVar2.b;
                                                    if (udVar3 != null) {
                                                        if (wdVar2 != null) {
                                                            z70.w0 w0Var2 = wdVar2.c;
                                                            if (e0Var2 != null) {
                                                                s0 s0Var = e0Var2.a;
                                                                List<o0> list5 = s0Var.b;
                                                                if (list5 != null) {
                                                                    arrayList32 = new ArrayList(n.F(list5, 10));
                                                                    for (o0 o0Var : list5) {
                                                                        if (o0Var == null || (l0Var = o0Var.d) == null || (str22 = l0Var.a) == null) {
                                                                            str22 = (o0Var == null || (p0Var = o0Var.c) == null) ? null : p0Var.a;
                                                                        }
                                                                        if (k.b(str22, str2)) {
                                                                            o0Var = o0Var != null ? new o0(o0Var.a, o0Var.b, o0Var.c, o0Var.d, arrayList4, o0Var.f, o0Var.g, o0Var.h, o0Var.i, o0Var.j, o0Var.k) : null;
                                                                        }
                                                                        arrayList32.add(o0Var);
                                                                    }
                                                                } else {
                                                                    arrayList32 = null;
                                                                }
                                                                e0Var = new e0(new s0(s0Var.a, arrayList32));
                                                            } else {
                                                                e0Var = null;
                                                            }
                                                            wdVar = wd.a(wdVar2, z70.w0.a(w0Var2, e0Var, null, 30719));
                                                        } else {
                                                            wdVar = null;
                                                        }
                                                        udVar = ud.a(udVar3, wdVar);
                                                    } else {
                                                        udVar = null;
                                                    }
                                                    xdVar = xd.a(xdVar2, udVar);
                                                } else {
                                                    xdVar = null;
                                                }
                                                return new td(xdVar);
                                            case 1:
                                                bh bhVar = (bh) obj32;
                                                k.g(bhVar, "cached");
                                                fh fhVar2 = bhVar.a;
                                                eh ehVar2 = (fhVar2 == null || (chVar2 = fhVar2.b) == null) ? null : chVar2.c;
                                                gv.p0 p0Var3 = ehVar2 != null ? ehVar2.c.l : null;
                                                if (fhVar2 != null) {
                                                    ch chVar3 = fhVar2.b;
                                                    if (chVar3 != null) {
                                                        if (ehVar2 != null) {
                                                            h1 h1Var = ehVar2.c;
                                                            if (p0Var3 != null) {
                                                                d1 d1Var = p0Var3.c;
                                                                List<z0> list6 = d1Var.b;
                                                                if (list6 != null) {
                                                                    arrayList42 = new ArrayList(n.F(list6, 10));
                                                                    for (z0 z0Var : list6) {
                                                                        if (z0Var == null || (w0Var = z0Var.d) == null || (str3 = w0Var.a) == null) {
                                                                            str3 = (z0Var == null || (a1Var = z0Var.c) == null) ? null : a1Var.a;
                                                                        }
                                                                        if (k.b(str3, str2)) {
                                                                            z0Var = z0Var != null ? new z0(z0Var.a, z0Var.b, z0Var.c, z0Var.d, arrayList4, z0Var.f, z0Var.g, z0Var.h, z0Var.i, z0Var.j, z0Var.k) : null;
                                                                        }
                                                                        arrayList42.add(z0Var);
                                                                    }
                                                                } else {
                                                                    arrayList42 = null;
                                                                }
                                                                p0Var2 = gv.p0.a(p0Var3, new d1(d1Var.a, arrayList42));
                                                            } else {
                                                                p0Var2 = null;
                                                            }
                                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var2, null, 30719));
                                                        } else {
                                                            ehVar = null;
                                                        }
                                                        chVar = ch.a(chVar3, ehVar);
                                                    } else {
                                                        chVar = null;
                                                    }
                                                    fhVar = fh.a(fhVar2, chVar);
                                                } else {
                                                    fhVar = null;
                                                }
                                                return bh.a(bhVar, fhVar);
                                            case 2:
                                                w00 w00Var = (w00) obj32;
                                                k.g(w00Var, "cached");
                                                b10 b10Var2 = w00Var.a;
                                                u00 u00Var2 = (b10Var2 == null || (v00Var2 = b10Var2.b) == null) ? null : v00Var2.b;
                                                x00 x00Var2 = u00Var2 != null ? u00Var2.b : null;
                                                if (b10Var2 != null) {
                                                    v00 v00Var3 = b10Var2.b;
                                                    if (v00Var3 != null) {
                                                        if (u00Var2 != null) {
                                                            if (x00Var2 != null) {
                                                                a10 a10Var = x00Var2.d;
                                                                List<y00> list7 = a10Var.b;
                                                                if (list7 != null) {
                                                                    ArrayList arrayList9 = new ArrayList(n.F(list7, 10));
                                                                    for (y00 y00Var : list7) {
                                                                        if (y00Var == null || (dVar = y00Var.c.e) == null || (str4 = dVar.a) == null) {
                                                                            str4 = (y00Var == null || (eVar = y00Var.c.d) == null) ? null : eVar.a;
                                                                        }
                                                                        if (k.b(str4, str2)) {
                                                                            if (y00Var != null) {
                                                                                h hVar = y00Var.c;
                                                                                y00Var = new y00(y00Var.a, y00Var.b, new h(hVar.a, hVar.b, hVar.c, hVar.d, hVar.e, arrayList4, hVar.g, hVar.h, hVar.i, hVar.j, hVar.k));
                                                                            } else {
                                                                                y00Var = null;
                                                                            }
                                                                        }
                                                                        arrayList9.add(y00Var);
                                                                    }
                                                                    arrayList5 = arrayList9;
                                                                } else {
                                                                    arrayList5 = null;
                                                                }
                                                                x00Var = x00.a(x00Var2, new a10(a10Var.a, arrayList5));
                                                            } else {
                                                                x00Var = null;
                                                            }
                                                            u00Var = u00.a(u00Var2, x00Var);
                                                        } else {
                                                            u00Var = null;
                                                        }
                                                        v00Var = v00.a(v00Var3, u00Var);
                                                    } else {
                                                        v00Var = null;
                                                    }
                                                    b10Var = b10.a(b10Var2, v00Var);
                                                } else {
                                                    b10Var = null;
                                                }
                                                return w00.a(w00Var, b10Var);
                                            case 3:
                                                me meVar = (me) obj32;
                                                k.g(meVar, "cached");
                                                qe qeVar2 = meVar.a;
                                                pe peVar2 = (qeVar2 == null || (neVar2 = qeVar2.b) == null) ? null : neVar2.c;
                                                ri0.f0 f0Var3 = peVar2 != null ? peVar2.c.l : null;
                                                if (qeVar2 != null) {
                                                    ne neVar3 = qeVar2.b;
                                                    if (neVar3 != null) {
                                                        if (peVar2 != null) {
                                                            x0 x0Var = peVar2.c;
                                                            if (f0Var3 != null) {
                                                                t0 t0Var = f0Var3.a;
                                                                List<ri0.p0> list8 = t0Var.b;
                                                                if (list8 != null) {
                                                                    arrayList6 = new ArrayList(n.F(list8, 10));
                                                                    for (ri0.p0 p0Var4 : list8) {
                                                                        if (p0Var4 == null || (m0Var = p0Var4.d) == null || (str5 = m0Var.a) == null) {
                                                                            str5 = (p0Var4 == null || (q0Var = p0Var4.c) == null) ? null : q0Var.a;
                                                                        }
                                                                        if (k.b(str5, str2)) {
                                                                            p0Var4 = p0Var4 != null ? new ri0.p0(p0Var4.a, p0Var4.b, p0Var4.c, p0Var4.d, arrayList4, p0Var4.f, p0Var4.g, p0Var4.h, p0Var4.i, p0Var4.j, p0Var4.k) : null;
                                                                        }
                                                                        arrayList6.add(p0Var4);
                                                                    }
                                                                } else {
                                                                    arrayList6 = null;
                                                                }
                                                                f0Var = new ri0.f0(new t0(t0Var.a, arrayList6));
                                                            } else {
                                                                f0Var = null;
                                                            }
                                                            peVar = pe.a(peVar2, x0.a(x0Var, f0Var, (j0) null, 30719));
                                                        } else {
                                                            peVar = null;
                                                        }
                                                        neVar = ne.a(neVar3, peVar);
                                                    } else {
                                                        neVar = null;
                                                    }
                                                    qeVar = qe.a(qeVar2, neVar);
                                                } else {
                                                    qeVar = null;
                                                }
                                                return new me(qeVar);
                                            case 4:
                                                ArrayList arrayList10 = arrayList4;
                                                v7.a aVar32 = (v7.a) obj32;
                                                k.g(aVar32, "_connection");
                                                c F0 = aVar32.F0(str2);
                                                try {
                                                    int size22 = arrayList10.size();
                                                    int i42 = 1;
                                                    int i52 = 0;
                                                    while (i52 < size22) {
                                                        Object obj4 = arrayList10.get(i52);
                                                        i52++;
                                                        F0.k0((String) obj4, i42);
                                                        i42++;
                                                    }
                                                    F0.B0();
                                                    F0.close();
                                                    return a0.a;
                                                } catch (Throwable th2) {
                                                    F0.close();
                                                    throw th2;
                                                }
                                            case 5:
                                                eg egVar = (eg) obj32;
                                                k.g(egVar, "cached");
                                                ig igVar2 = egVar.a;
                                                hg hgVar2 = (igVar2 == null || (fgVar2 = igVar2.b) == null) ? null : fgVar2.c;
                                                xt0.f0 f0Var4 = hgVar2 != null ? hgVar2.c.l : null;
                                                if (igVar2 != null) {
                                                    fg fgVar3 = igVar2.b;
                                                    if (fgVar3 != null) {
                                                        if (hgVar2 != null) {
                                                            xt0.x0 x0Var2 = hgVar2.c;
                                                            if (f0Var4 != null) {
                                                                xt0.t0 t0Var2 = f0Var4.a;
                                                                List<xt0.p0> list9 = t0Var2.b;
                                                                if (list9 != null) {
                                                                    arrayList7 = new ArrayList(n.F(list9, 10));
                                                                    for (xt0.p0 p0Var5 : list9) {
                                                                        if (p0Var5 == null || (m0Var2 = p0Var5.d) == null || (str6 = m0Var2.a) == null) {
                                                                            str6 = (p0Var5 == null || (q0Var2 = p0Var5.c) == null) ? null : q0Var2.a;
                                                                        }
                                                                        if (k.b(str6, str2)) {
                                                                            p0Var5 = p0Var5 != null ? new xt0.p0(p0Var5.a, p0Var5.b, p0Var5.c, p0Var5.d, arrayList4, p0Var5.f, p0Var5.g, p0Var5.h, p0Var5.i, p0Var5.j, p0Var5.k) : null;
                                                                        }
                                                                        arrayList7.add(p0Var5);
                                                                    }
                                                                } else {
                                                                    arrayList7 = null;
                                                                }
                                                                f0Var2 = new xt0.f0(new xt0.t0(t0Var2.a, arrayList7));
                                                            } else {
                                                                f0Var2 = null;
                                                            }
                                                            hgVar = hg.a(hgVar2, xt0.x0.a(x0Var2, f0Var2, (xt0.j0) null, 30719));
                                                        } else {
                                                            hgVar = null;
                                                        }
                                                        fgVar = fg.a(fgVar3, hgVar);
                                                    } else {
                                                        fgVar = null;
                                                    }
                                                    igVar = ig.a(igVar2, fgVar);
                                                } else {
                                                    igVar = null;
                                                }
                                                return eg.a(egVar, igVar);
                                            default:
                                                wy wyVar = (wy) obj32;
                                                k.g(wyVar, "cached");
                                                bz bzVar2 = wyVar.a;
                                                uy uyVar2 = (bzVar2 == null || (vyVar2 = bzVar2.b) == null) ? null : vyVar2.b;
                                                xy xyVar2 = uyVar2 != null ? uyVar2.b : null;
                                                if (bzVar2 != null) {
                                                    vy vyVar3 = bzVar2.b;
                                                    if (vyVar3 != null) {
                                                        if (uyVar2 != null) {
                                                            if (xyVar2 != null) {
                                                                az azVar = xyVar2.d;
                                                                List<yy> list10 = azVar.b;
                                                                if (list10 != null) {
                                                                    ArrayList arrayList11 = new ArrayList(n.F(list10, 10));
                                                                    for (yy yyVar : list10) {
                                                                        if (yyVar == null || (dVar2 = yyVar.c.e) == null || (str7 = dVar2.a) == null) {
                                                                            str7 = (yyVar == null || (eVar2 = yyVar.c.d) == null) ? null : eVar2.a;
                                                                        }
                                                                        if (k.b(str7, str2)) {
                                                                            if (yyVar != null) {
                                                                                pt0.h hVar2 = yyVar.c;
                                                                                yyVar = new yy(yyVar.a, yyVar.b, new pt0.h(hVar2.a, hVar2.b, hVar2.c, hVar2.d, hVar2.e, arrayList4, hVar2.g, hVar2.h, hVar2.i, hVar2.j, hVar2.k));
                                                                            } else {
                                                                                yyVar = null;
                                                                            }
                                                                        }
                                                                        arrayList11.add(yyVar);
                                                                    }
                                                                    arrayList8 = arrayList11;
                                                                } else {
                                                                    arrayList8 = null;
                                                                }
                                                                xyVar = xy.a(xyVar2, new az(azVar.a, arrayList8));
                                                            } else {
                                                                xyVar = null;
                                                            }
                                                            uyVar = uy.a(uyVar2, xyVar);
                                                        } else {
                                                            uyVar = null;
                                                        }
                                                        vyVar = vy.a(vyVar3, uyVar);
                                                    } else {
                                                        vyVar = null;
                                                    }
                                                    bzVar = bz.a(bzVar2, vyVar);
                                                } else {
                                                    bzVar = null;
                                                }
                                                return wy.a(wyVar, bzVar);
                                        }
                                    }
                                }, this);
                                if (c2 != b71.a.r) {
                                    c2 = a0Var2;
                                }
                                if (c2 == aVar3) {
                                    return aVar3;
                                }
                            }
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var2;
            case 2:
                lc lcVar = (lc) this.x;
                b71.a aVar5 = b71.a.r;
                int i7 = this.w;
                a0 a0Var3 = a0.a;
                if (i7 == 0) {
                    y.j(obj);
                    qc qcVar = lcVar.a;
                    if (qcVar != null && (pcVar = qcVar.b) != null && (mcVar = pcVar.a) != null && (ocVar = mcVar.a) != null && (list3 = ocVar.a) != null) {
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                nc ncVar = (nc) it3.next();
                                qf0.a aVar6 = ncVar != null ? ncVar.b : null;
                                if (aVar6 != null) {
                                    arrayList5.add(aVar6);
                                }
                            } else {
                                jy.d dVar = (jy.d) ((c) this.C).v;
                                rd0.a aVar7 = new rd0.a(this.y, this.A, this.z);
                                this.x = null;
                                this.w = 1;
                                dVar.getClass();
                                final ArrayList arrayList6 = new ArrayList(n.F(arrayList5, 10));
                                int size3 = arrayList5.size();
                                int i8 = 0;
                                while (i8 < size3) {
                                    Object obj4 = arrayList5.get(i8);
                                    i8++;
                                    p8.Companion.getClass();
                                    arrayList6.add(new g0(((q) p8.a).a, (qf0.a) obj4));
                                }
                                final int i9 = 3;
                                final String str3 = this.B;
                                Object c3 = dVar.c(aVar7, new j71.c() { // from class: b30.a
                                    public final Object k(Object obj32) {
                                        xd xdVar;
                                        ud udVar;
                                        wd wdVar;
                                        e0 e0Var;
                                        ArrayList arrayList32;
                                        String str22;
                                        p0 p0Var;
                                        l0 l0Var;
                                        ud udVar2;
                                        fh fhVar;
                                        ch chVar;
                                        eh ehVar;
                                        gv.p0 p0Var2;
                                        ArrayList arrayList42;
                                        String str32;
                                        a1 a1Var;
                                        w0 w0Var;
                                        ch chVar2;
                                        b10 b10Var;
                                        v00 v00Var;
                                        u00 u00Var;
                                        x00 x00Var;
                                        ArrayList arrayList52;
                                        String str4;
                                        yu.e eVar;
                                        d dVar2;
                                        v00 v00Var2;
                                        qe qeVar;
                                        ne neVar;
                                        pe peVar;
                                        ri0.f0 f0Var;
                                        ArrayList arrayList62;
                                        String str5;
                                        q0 q0Var;
                                        m0 m0Var;
                                        ne neVar2;
                                        ig igVar;
                                        fg fgVar;
                                        hg hgVar;
                                        xt0.f0 f0Var2;
                                        ArrayList arrayList7;
                                        String str6;
                                        xt0.q0 q0Var2;
                                        xt0.m0 m0Var2;
                                        fg fgVar2;
                                        bz bzVar;
                                        vy vyVar;
                                        uy uyVar;
                                        xy xyVar;
                                        ArrayList arrayList8;
                                        String str7;
                                        pt0.e eVar2;
                                        pt0.d dVar22;
                                        vy vyVar2;
                                        switch (i9) {
                                            case 0:
                                                td tdVar = (td) obj32;
                                                k.g(tdVar, "cached");
                                                xd xdVar2 = tdVar.a;
                                                wd wdVar2 = (xdVar2 == null || (udVar2 = xdVar2.b) == null) ? null : udVar2.c;
                                                e0 e0Var2 = wdVar2 != null ? wdVar2.c.l : null;
                                                if (xdVar2 != null) {
                                                    ud udVar3 = xdVar2.b;
                                                    if (udVar3 != null) {
                                                        if (wdVar2 != null) {
                                                            z70.w0 w0Var2 = wdVar2.c;
                                                            if (e0Var2 != null) {
                                                                s0 s0Var = e0Var2.a;
                                                                List<o0> list5 = s0Var.b;
                                                                if (list5 != null) {
                                                                    arrayList32 = new ArrayList(n.F(list5, 10));
                                                                    for (o0 o0Var : list5) {
                                                                        if (o0Var == null || (l0Var = o0Var.d) == null || (str22 = l0Var.a) == null) {
                                                                            str22 = (o0Var == null || (p0Var = o0Var.c) == null) ? null : p0Var.a;
                                                                        }
                                                                        if (k.b(str22, str3)) {
                                                                            o0Var = o0Var != null ? new o0(o0Var.a, o0Var.b, o0Var.c, o0Var.d, arrayList6, o0Var.f, o0Var.g, o0Var.h, o0Var.i, o0Var.j, o0Var.k) : null;
                                                                        }
                                                                        arrayList32.add(o0Var);
                                                                    }
                                                                } else {
                                                                    arrayList32 = null;
                                                                }
                                                                e0Var = new e0(new s0(s0Var.a, arrayList32));
                                                            } else {
                                                                e0Var = null;
                                                            }
                                                            wdVar = wd.a(wdVar2, z70.w0.a(w0Var2, e0Var, null, 30719));
                                                        } else {
                                                            wdVar = null;
                                                        }
                                                        udVar = ud.a(udVar3, wdVar);
                                                    } else {
                                                        udVar = null;
                                                    }
                                                    xdVar = xd.a(xdVar2, udVar);
                                                } else {
                                                    xdVar = null;
                                                }
                                                return new td(xdVar);
                                            case 1:
                                                bh bhVar = (bh) obj32;
                                                k.g(bhVar, "cached");
                                                fh fhVar2 = bhVar.a;
                                                eh ehVar2 = (fhVar2 == null || (chVar2 = fhVar2.b) == null) ? null : chVar2.c;
                                                gv.p0 p0Var3 = ehVar2 != null ? ehVar2.c.l : null;
                                                if (fhVar2 != null) {
                                                    ch chVar3 = fhVar2.b;
                                                    if (chVar3 != null) {
                                                        if (ehVar2 != null) {
                                                            h1 h1Var = ehVar2.c;
                                                            if (p0Var3 != null) {
                                                                d1 d1Var = p0Var3.c;
                                                                List<z0> list6 = d1Var.b;
                                                                if (list6 != null) {
                                                                    arrayList42 = new ArrayList(n.F(list6, 10));
                                                                    for (z0 z0Var : list6) {
                                                                        if (z0Var == null || (w0Var = z0Var.d) == null || (str32 = w0Var.a) == null) {
                                                                            str32 = (z0Var == null || (a1Var = z0Var.c) == null) ? null : a1Var.a;
                                                                        }
                                                                        if (k.b(str32, str3)) {
                                                                            z0Var = z0Var != null ? new z0(z0Var.a, z0Var.b, z0Var.c, z0Var.d, arrayList6, z0Var.f, z0Var.g, z0Var.h, z0Var.i, z0Var.j, z0Var.k) : null;
                                                                        }
                                                                        arrayList42.add(z0Var);
                                                                    }
                                                                } else {
                                                                    arrayList42 = null;
                                                                }
                                                                p0Var2 = gv.p0.a(p0Var3, new d1(d1Var.a, arrayList42));
                                                            } else {
                                                                p0Var2 = null;
                                                            }
                                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var2, null, 30719));
                                                        } else {
                                                            ehVar = null;
                                                        }
                                                        chVar = ch.a(chVar3, ehVar);
                                                    } else {
                                                        chVar = null;
                                                    }
                                                    fhVar = fh.a(fhVar2, chVar);
                                                } else {
                                                    fhVar = null;
                                                }
                                                return bh.a(bhVar, fhVar);
                                            case 2:
                                                w00 w00Var = (w00) obj32;
                                                k.g(w00Var, "cached");
                                                b10 b10Var2 = w00Var.a;
                                                u00 u00Var2 = (b10Var2 == null || (v00Var2 = b10Var2.b) == null) ? null : v00Var2.b;
                                                x00 x00Var2 = u00Var2 != null ? u00Var2.b : null;
                                                if (b10Var2 != null) {
                                                    v00 v00Var3 = b10Var2.b;
                                                    if (v00Var3 != null) {
                                                        if (u00Var2 != null) {
                                                            if (x00Var2 != null) {
                                                                a10 a10Var = x00Var2.d;
                                                                List<y00> list7 = a10Var.b;
                                                                if (list7 != null) {
                                                                    ArrayList arrayList9 = new ArrayList(n.F(list7, 10));
                                                                    for (y00 y00Var : list7) {
                                                                        if (y00Var == null || (dVar2 = y00Var.c.e) == null || (str4 = dVar2.a) == null) {
                                                                            str4 = (y00Var == null || (eVar = y00Var.c.d) == null) ? null : eVar.a;
                                                                        }
                                                                        if (k.b(str4, str3)) {
                                                                            if (y00Var != null) {
                                                                                h hVar = y00Var.c;
                                                                                y00Var = new y00(y00Var.a, y00Var.b, new h(hVar.a, hVar.b, hVar.c, hVar.d, hVar.e, arrayList6, hVar.g, hVar.h, hVar.i, hVar.j, hVar.k));
                                                                            } else {
                                                                                y00Var = null;
                                                                            }
                                                                        }
                                                                        arrayList9.add(y00Var);
                                                                    }
                                                                    arrayList52 = arrayList9;
                                                                } else {
                                                                    arrayList52 = null;
                                                                }
                                                                x00Var = x00.a(x00Var2, new a10(a10Var.a, arrayList52));
                                                            } else {
                                                                x00Var = null;
                                                            }
                                                            u00Var = u00.a(u00Var2, x00Var);
                                                        } else {
                                                            u00Var = null;
                                                        }
                                                        v00Var = v00.a(v00Var3, u00Var);
                                                    } else {
                                                        v00Var = null;
                                                    }
                                                    b10Var = b10.a(b10Var2, v00Var);
                                                } else {
                                                    b10Var = null;
                                                }
                                                return w00.a(w00Var, b10Var);
                                            case 3:
                                                me meVar = (me) obj32;
                                                k.g(meVar, "cached");
                                                qe qeVar2 = meVar.a;
                                                pe peVar2 = (qeVar2 == null || (neVar2 = qeVar2.b) == null) ? null : neVar2.c;
                                                ri0.f0 f0Var3 = peVar2 != null ? peVar2.c.l : null;
                                                if (qeVar2 != null) {
                                                    ne neVar3 = qeVar2.b;
                                                    if (neVar3 != null) {
                                                        if (peVar2 != null) {
                                                            x0 x0Var = peVar2.c;
                                                            if (f0Var3 != null) {
                                                                t0 t0Var = f0Var3.a;
                                                                List<ri0.p0> list8 = t0Var.b;
                                                                if (list8 != null) {
                                                                    arrayList62 = new ArrayList(n.F(list8, 10));
                                                                    for (ri0.p0 p0Var4 : list8) {
                                                                        if (p0Var4 == null || (m0Var = p0Var4.d) == null || (str5 = m0Var.a) == null) {
                                                                            str5 = (p0Var4 == null || (q0Var = p0Var4.c) == null) ? null : q0Var.a;
                                                                        }
                                                                        if (k.b(str5, str3)) {
                                                                            p0Var4 = p0Var4 != null ? new ri0.p0(p0Var4.a, p0Var4.b, p0Var4.c, p0Var4.d, arrayList6, p0Var4.f, p0Var4.g, p0Var4.h, p0Var4.i, p0Var4.j, p0Var4.k) : null;
                                                                        }
                                                                        arrayList62.add(p0Var4);
                                                                    }
                                                                } else {
                                                                    arrayList62 = null;
                                                                }
                                                                f0Var = new ri0.f0(new t0(t0Var.a, arrayList62));
                                                            } else {
                                                                f0Var = null;
                                                            }
                                                            peVar = pe.a(peVar2, x0.a(x0Var, f0Var, (j0) null, 30719));
                                                        } else {
                                                            peVar = null;
                                                        }
                                                        neVar = ne.a(neVar3, peVar);
                                                    } else {
                                                        neVar = null;
                                                    }
                                                    qeVar = qe.a(qeVar2, neVar);
                                                } else {
                                                    qeVar = null;
                                                }
                                                return new me(qeVar);
                                            case 4:
                                                ArrayList arrayList10 = arrayList6;
                                                v7.a aVar32 = (v7.a) obj32;
                                                k.g(aVar32, "_connection");
                                                c F0 = aVar32.F0(str3);
                                                try {
                                                    int size22 = arrayList10.size();
                                                    int i42 = 1;
                                                    int i52 = 0;
                                                    while (i52 < size22) {
                                                        Object obj42 = arrayList10.get(i52);
                                                        i52++;
                                                        F0.k0((String) obj42, i42);
                                                        i42++;
                                                    }
                                                    F0.B0();
                                                    F0.close();
                                                    return a0.a;
                                                } catch (Throwable th2) {
                                                    F0.close();
                                                    throw th2;
                                                }
                                            case 5:
                                                eg egVar = (eg) obj32;
                                                k.g(egVar, "cached");
                                                ig igVar2 = egVar.a;
                                                hg hgVar2 = (igVar2 == null || (fgVar2 = igVar2.b) == null) ? null : fgVar2.c;
                                                xt0.f0 f0Var4 = hgVar2 != null ? hgVar2.c.l : null;
                                                if (igVar2 != null) {
                                                    fg fgVar3 = igVar2.b;
                                                    if (fgVar3 != null) {
                                                        if (hgVar2 != null) {
                                                            xt0.x0 x0Var2 = hgVar2.c;
                                                            if (f0Var4 != null) {
                                                                xt0.t0 t0Var2 = f0Var4.a;
                                                                List<xt0.p0> list9 = t0Var2.b;
                                                                if (list9 != null) {
                                                                    arrayList7 = new ArrayList(n.F(list9, 10));
                                                                    for (xt0.p0 p0Var5 : list9) {
                                                                        if (p0Var5 == null || (m0Var2 = p0Var5.d) == null || (str6 = m0Var2.a) == null) {
                                                                            str6 = (p0Var5 == null || (q0Var2 = p0Var5.c) == null) ? null : q0Var2.a;
                                                                        }
                                                                        if (k.b(str6, str3)) {
                                                                            p0Var5 = p0Var5 != null ? new xt0.p0(p0Var5.a, p0Var5.b, p0Var5.c, p0Var5.d, arrayList6, p0Var5.f, p0Var5.g, p0Var5.h, p0Var5.i, p0Var5.j, p0Var5.k) : null;
                                                                        }
                                                                        arrayList7.add(p0Var5);
                                                                    }
                                                                } else {
                                                                    arrayList7 = null;
                                                                }
                                                                f0Var2 = new xt0.f0(new xt0.t0(t0Var2.a, arrayList7));
                                                            } else {
                                                                f0Var2 = null;
                                                            }
                                                            hgVar = hg.a(hgVar2, xt0.x0.a(x0Var2, f0Var2, (xt0.j0) null, 30719));
                                                        } else {
                                                            hgVar = null;
                                                        }
                                                        fgVar = fg.a(fgVar3, hgVar);
                                                    } else {
                                                        fgVar = null;
                                                    }
                                                    igVar = ig.a(igVar2, fgVar);
                                                } else {
                                                    igVar = null;
                                                }
                                                return eg.a(egVar, igVar);
                                            default:
                                                wy wyVar = (wy) obj32;
                                                k.g(wyVar, "cached");
                                                bz bzVar2 = wyVar.a;
                                                uy uyVar2 = (bzVar2 == null || (vyVar2 = bzVar2.b) == null) ? null : vyVar2.b;
                                                xy xyVar2 = uyVar2 != null ? uyVar2.b : null;
                                                if (bzVar2 != null) {
                                                    vy vyVar3 = bzVar2.b;
                                                    if (vyVar3 != null) {
                                                        if (uyVar2 != null) {
                                                            if (xyVar2 != null) {
                                                                az azVar = xyVar2.d;
                                                                List<yy> list10 = azVar.b;
                                                                if (list10 != null) {
                                                                    ArrayList arrayList11 = new ArrayList(n.F(list10, 10));
                                                                    for (yy yyVar : list10) {
                                                                        if (yyVar == null || (dVar22 = yyVar.c.e) == null || (str7 = dVar22.a) == null) {
                                                                            str7 = (yyVar == null || (eVar2 = yyVar.c.d) == null) ? null : eVar2.a;
                                                                        }
                                                                        if (k.b(str7, str3)) {
                                                                            if (yyVar != null) {
                                                                                pt0.h hVar2 = yyVar.c;
                                                                                yyVar = new yy(yyVar.a, yyVar.b, new pt0.h(hVar2.a, hVar2.b, hVar2.c, hVar2.d, hVar2.e, arrayList6, hVar2.g, hVar2.h, hVar2.i, hVar2.j, hVar2.k));
                                                                            } else {
                                                                                yyVar = null;
                                                                            }
                                                                        }
                                                                        arrayList11.add(yyVar);
                                                                    }
                                                                    arrayList8 = arrayList11;
                                                                } else {
                                                                    arrayList8 = null;
                                                                }
                                                                xyVar = xy.a(xyVar2, new az(azVar.a, arrayList8));
                                                            } else {
                                                                xyVar = null;
                                                            }
                                                            uyVar = uy.a(uyVar2, xyVar);
                                                        } else {
                                                            uyVar = null;
                                                        }
                                                        vyVar = vy.a(vyVar3, uyVar);
                                                    } else {
                                                        vyVar = null;
                                                    }
                                                    bzVar = bz.a(bzVar2, vyVar);
                                                } else {
                                                    bzVar = null;
                                                }
                                                return wy.a(wyVar, bzVar);
                                        }
                                    }
                                }, this);
                                if (c3 != b71.a.r) {
                                    c3 = a0Var3;
                                }
                                if (c3 == aVar5) {
                                    return aVar5;
                                }
                            }
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var3;
            default:
                fd fdVar = (fd) this.x;
                b71.a aVar8 = b71.a.r;
                int i11 = this.w;
                a0 a0Var4 = a0.a;
                if (i11 == 0) {
                    y.j(obj);
                    kd kdVar = fdVar.a;
                    if (kdVar != null && (jdVar = kdVar.b) != null && (gdVar = jdVar.a) != null && (idVar = gdVar.a) != null && (list4 = idVar.a) != null) {
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it4 = list4.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                hd hdVar = (hd) it4.next();
                                wq0.a aVar9 = hdVar != null ? hdVar.b : null;
                                if (aVar9 != null) {
                                    arrayList7.add(aVar9);
                                }
                            } else {
                                sw0.c cVar = ((c) this.C).v;
                                zo0.a aVar10 = new zo0.a(this.y, this.A, this.z);
                                this.x = null;
                                this.w = 1;
                                cVar.getClass();
                                final ArrayList arrayList8 = new ArrayList(n.F(arrayList7, 10));
                                int size4 = arrayList7.size();
                                int i12 = 0;
                                while (i12 < size4) {
                                    Object obj5 = arrayList7.get(i12);
                                    i12++;
                                    q9.Companion.getClass();
                                    arrayList8.add(new xt0.g0(((q) q9.a).a, (wq0.a) obj5));
                                }
                                final int i13 = 5;
                                final String str4 = this.B;
                                Object c4 = cVar.c(aVar10, new j71.c() { // from class: b30.a
                                    public final Object k(Object obj32) {
                                        xd xdVar;
                                        ud udVar;
                                        wd wdVar;
                                        e0 e0Var;
                                        ArrayList arrayList32;
                                        String str22;
                                        p0 p0Var;
                                        l0 l0Var;
                                        ud udVar2;
                                        fh fhVar;
                                        ch chVar;
                                        eh ehVar;
                                        gv.p0 p0Var2;
                                        ArrayList arrayList42;
                                        String str32;
                                        a1 a1Var;
                                        w0 w0Var;
                                        ch chVar2;
                                        b10 b10Var;
                                        v00 v00Var;
                                        u00 u00Var;
                                        x00 x00Var;
                                        ArrayList arrayList52;
                                        String str42;
                                        yu.e eVar;
                                        d dVar2;
                                        v00 v00Var2;
                                        qe qeVar;
                                        ne neVar;
                                        pe peVar;
                                        ri0.f0 f0Var;
                                        ArrayList arrayList62;
                                        String str5;
                                        q0 q0Var;
                                        m0 m0Var;
                                        ne neVar2;
                                        ig igVar;
                                        fg fgVar;
                                        hg hgVar;
                                        xt0.f0 f0Var2;
                                        ArrayList arrayList72;
                                        String str6;
                                        xt0.q0 q0Var2;
                                        xt0.m0 m0Var2;
                                        fg fgVar2;
                                        bz bzVar;
                                        vy vyVar;
                                        uy uyVar;
                                        xy xyVar;
                                        ArrayList arrayList82;
                                        String str7;
                                        pt0.e eVar2;
                                        pt0.d dVar22;
                                        vy vyVar2;
                                        switch (i13) {
                                            case 0:
                                                td tdVar = (td) obj32;
                                                k.g(tdVar, "cached");
                                                xd xdVar2 = tdVar.a;
                                                wd wdVar2 = (xdVar2 == null || (udVar2 = xdVar2.b) == null) ? null : udVar2.c;
                                                e0 e0Var2 = wdVar2 != null ? wdVar2.c.l : null;
                                                if (xdVar2 != null) {
                                                    ud udVar3 = xdVar2.b;
                                                    if (udVar3 != null) {
                                                        if (wdVar2 != null) {
                                                            z70.w0 w0Var2 = wdVar2.c;
                                                            if (e0Var2 != null) {
                                                                s0 s0Var = e0Var2.a;
                                                                List<o0> list5 = s0Var.b;
                                                                if (list5 != null) {
                                                                    arrayList32 = new ArrayList(n.F(list5, 10));
                                                                    for (o0 o0Var : list5) {
                                                                        if (o0Var == null || (l0Var = o0Var.d) == null || (str22 = l0Var.a) == null) {
                                                                            str22 = (o0Var == null || (p0Var = o0Var.c) == null) ? null : p0Var.a;
                                                                        }
                                                                        if (k.b(str22, str4)) {
                                                                            o0Var = o0Var != null ? new o0(o0Var.a, o0Var.b, o0Var.c, o0Var.d, arrayList8, o0Var.f, o0Var.g, o0Var.h, o0Var.i, o0Var.j, o0Var.k) : null;
                                                                        }
                                                                        arrayList32.add(o0Var);
                                                                    }
                                                                } else {
                                                                    arrayList32 = null;
                                                                }
                                                                e0Var = new e0(new s0(s0Var.a, arrayList32));
                                                            } else {
                                                                e0Var = null;
                                                            }
                                                            wdVar = wd.a(wdVar2, z70.w0.a(w0Var2, e0Var, null, 30719));
                                                        } else {
                                                            wdVar = null;
                                                        }
                                                        udVar = ud.a(udVar3, wdVar);
                                                    } else {
                                                        udVar = null;
                                                    }
                                                    xdVar = xd.a(xdVar2, udVar);
                                                } else {
                                                    xdVar = null;
                                                }
                                                return new td(xdVar);
                                            case 1:
                                                bh bhVar = (bh) obj32;
                                                k.g(bhVar, "cached");
                                                fh fhVar2 = bhVar.a;
                                                eh ehVar2 = (fhVar2 == null || (chVar2 = fhVar2.b) == null) ? null : chVar2.c;
                                                gv.p0 p0Var3 = ehVar2 != null ? ehVar2.c.l : null;
                                                if (fhVar2 != null) {
                                                    ch chVar3 = fhVar2.b;
                                                    if (chVar3 != null) {
                                                        if (ehVar2 != null) {
                                                            h1 h1Var = ehVar2.c;
                                                            if (p0Var3 != null) {
                                                                d1 d1Var = p0Var3.c;
                                                                List<z0> list6 = d1Var.b;
                                                                if (list6 != null) {
                                                                    arrayList42 = new ArrayList(n.F(list6, 10));
                                                                    for (z0 z0Var : list6) {
                                                                        if (z0Var == null || (w0Var = z0Var.d) == null || (str32 = w0Var.a) == null) {
                                                                            str32 = (z0Var == null || (a1Var = z0Var.c) == null) ? null : a1Var.a;
                                                                        }
                                                                        if (k.b(str32, str4)) {
                                                                            z0Var = z0Var != null ? new z0(z0Var.a, z0Var.b, z0Var.c, z0Var.d, arrayList8, z0Var.f, z0Var.g, z0Var.h, z0Var.i, z0Var.j, z0Var.k) : null;
                                                                        }
                                                                        arrayList42.add(z0Var);
                                                                    }
                                                                } else {
                                                                    arrayList42 = null;
                                                                }
                                                                p0Var2 = gv.p0.a(p0Var3, new d1(d1Var.a, arrayList42));
                                                            } else {
                                                                p0Var2 = null;
                                                            }
                                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var2, null, 30719));
                                                        } else {
                                                            ehVar = null;
                                                        }
                                                        chVar = ch.a(chVar3, ehVar);
                                                    } else {
                                                        chVar = null;
                                                    }
                                                    fhVar = fh.a(fhVar2, chVar);
                                                } else {
                                                    fhVar = null;
                                                }
                                                return bh.a(bhVar, fhVar);
                                            case 2:
                                                w00 w00Var = (w00) obj32;
                                                k.g(w00Var, "cached");
                                                b10 b10Var2 = w00Var.a;
                                                u00 u00Var2 = (b10Var2 == null || (v00Var2 = b10Var2.b) == null) ? null : v00Var2.b;
                                                x00 x00Var2 = u00Var2 != null ? u00Var2.b : null;
                                                if (b10Var2 != null) {
                                                    v00 v00Var3 = b10Var2.b;
                                                    if (v00Var3 != null) {
                                                        if (u00Var2 != null) {
                                                            if (x00Var2 != null) {
                                                                a10 a10Var = x00Var2.d;
                                                                List<y00> list7 = a10Var.b;
                                                                if (list7 != null) {
                                                                    ArrayList arrayList9 = new ArrayList(n.F(list7, 10));
                                                                    for (y00 y00Var : list7) {
                                                                        if (y00Var == null || (dVar2 = y00Var.c.e) == null || (str42 = dVar2.a) == null) {
                                                                            str42 = (y00Var == null || (eVar = y00Var.c.d) == null) ? null : eVar.a;
                                                                        }
                                                                        if (k.b(str42, str4)) {
                                                                            if (y00Var != null) {
                                                                                h hVar = y00Var.c;
                                                                                y00Var = new y00(y00Var.a, y00Var.b, new h(hVar.a, hVar.b, hVar.c, hVar.d, hVar.e, arrayList8, hVar.g, hVar.h, hVar.i, hVar.j, hVar.k));
                                                                            } else {
                                                                                y00Var = null;
                                                                            }
                                                                        }
                                                                        arrayList9.add(y00Var);
                                                                    }
                                                                    arrayList52 = arrayList9;
                                                                } else {
                                                                    arrayList52 = null;
                                                                }
                                                                x00Var = x00.a(x00Var2, new a10(a10Var.a, arrayList52));
                                                            } else {
                                                                x00Var = null;
                                                            }
                                                            u00Var = u00.a(u00Var2, x00Var);
                                                        } else {
                                                            u00Var = null;
                                                        }
                                                        v00Var = v00.a(v00Var3, u00Var);
                                                    } else {
                                                        v00Var = null;
                                                    }
                                                    b10Var = b10.a(b10Var2, v00Var);
                                                } else {
                                                    b10Var = null;
                                                }
                                                return w00.a(w00Var, b10Var);
                                            case 3:
                                                me meVar = (me) obj32;
                                                k.g(meVar, "cached");
                                                qe qeVar2 = meVar.a;
                                                pe peVar2 = (qeVar2 == null || (neVar2 = qeVar2.b) == null) ? null : neVar2.c;
                                                ri0.f0 f0Var3 = peVar2 != null ? peVar2.c.l : null;
                                                if (qeVar2 != null) {
                                                    ne neVar3 = qeVar2.b;
                                                    if (neVar3 != null) {
                                                        if (peVar2 != null) {
                                                            x0 x0Var = peVar2.c;
                                                            if (f0Var3 != null) {
                                                                t0 t0Var = f0Var3.a;
                                                                List<ri0.p0> list8 = t0Var.b;
                                                                if (list8 != null) {
                                                                    arrayList62 = new ArrayList(n.F(list8, 10));
                                                                    for (ri0.p0 p0Var4 : list8) {
                                                                        if (p0Var4 == null || (m0Var = p0Var4.d) == null || (str5 = m0Var.a) == null) {
                                                                            str5 = (p0Var4 == null || (q0Var = p0Var4.c) == null) ? null : q0Var.a;
                                                                        }
                                                                        if (k.b(str5, str4)) {
                                                                            p0Var4 = p0Var4 != null ? new ri0.p0(p0Var4.a, p0Var4.b, p0Var4.c, p0Var4.d, arrayList8, p0Var4.f, p0Var4.g, p0Var4.h, p0Var4.i, p0Var4.j, p0Var4.k) : null;
                                                                        }
                                                                        arrayList62.add(p0Var4);
                                                                    }
                                                                } else {
                                                                    arrayList62 = null;
                                                                }
                                                                f0Var = new ri0.f0(new t0(t0Var.a, arrayList62));
                                                            } else {
                                                                f0Var = null;
                                                            }
                                                            peVar = pe.a(peVar2, x0.a(x0Var, f0Var, (j0) null, 30719));
                                                        } else {
                                                            peVar = null;
                                                        }
                                                        neVar = ne.a(neVar3, peVar);
                                                    } else {
                                                        neVar = null;
                                                    }
                                                    qeVar = qe.a(qeVar2, neVar);
                                                } else {
                                                    qeVar = null;
                                                }
                                                return new me(qeVar);
                                            case 4:
                                                ArrayList arrayList10 = arrayList8;
                                                v7.a aVar32 = (v7.a) obj32;
                                                k.g(aVar32, "_connection");
                                                c F0 = aVar32.F0(str4);
                                                try {
                                                    int size22 = arrayList10.size();
                                                    int i42 = 1;
                                                    int i52 = 0;
                                                    while (i52 < size22) {
                                                        Object obj42 = arrayList10.get(i52);
                                                        i52++;
                                                        F0.k0((String) obj42, i42);
                                                        i42++;
                                                    }
                                                    F0.B0();
                                                    F0.close();
                                                    return a0.a;
                                                } catch (Throwable th2) {
                                                    F0.close();
                                                    throw th2;
                                                }
                                            case 5:
                                                eg egVar = (eg) obj32;
                                                k.g(egVar, "cached");
                                                ig igVar2 = egVar.a;
                                                hg hgVar2 = (igVar2 == null || (fgVar2 = igVar2.b) == null) ? null : fgVar2.c;
                                                xt0.f0 f0Var4 = hgVar2 != null ? hgVar2.c.l : null;
                                                if (igVar2 != null) {
                                                    fg fgVar3 = igVar2.b;
                                                    if (fgVar3 != null) {
                                                        if (hgVar2 != null) {
                                                            xt0.x0 x0Var2 = hgVar2.c;
                                                            if (f0Var4 != null) {
                                                                xt0.t0 t0Var2 = f0Var4.a;
                                                                List<xt0.p0> list9 = t0Var2.b;
                                                                if (list9 != null) {
                                                                    arrayList72 = new ArrayList(n.F(list9, 10));
                                                                    for (xt0.p0 p0Var5 : list9) {
                                                                        if (p0Var5 == null || (m0Var2 = p0Var5.d) == null || (str6 = m0Var2.a) == null) {
                                                                            str6 = (p0Var5 == null || (q0Var2 = p0Var5.c) == null) ? null : q0Var2.a;
                                                                        }
                                                                        if (k.b(str6, str4)) {
                                                                            p0Var5 = p0Var5 != null ? new xt0.p0(p0Var5.a, p0Var5.b, p0Var5.c, p0Var5.d, arrayList8, p0Var5.f, p0Var5.g, p0Var5.h, p0Var5.i, p0Var5.j, p0Var5.k) : null;
                                                                        }
                                                                        arrayList72.add(p0Var5);
                                                                    }
                                                                } else {
                                                                    arrayList72 = null;
                                                                }
                                                                f0Var2 = new xt0.f0(new xt0.t0(t0Var2.a, arrayList72));
                                                            } else {
                                                                f0Var2 = null;
                                                            }
                                                            hgVar = hg.a(hgVar2, xt0.x0.a(x0Var2, f0Var2, (xt0.j0) null, 30719));
                                                        } else {
                                                            hgVar = null;
                                                        }
                                                        fgVar = fg.a(fgVar3, hgVar);
                                                    } else {
                                                        fgVar = null;
                                                    }
                                                    igVar = ig.a(igVar2, fgVar);
                                                } else {
                                                    igVar = null;
                                                }
                                                return eg.a(egVar, igVar);
                                            default:
                                                wy wyVar = (wy) obj32;
                                                k.g(wyVar, "cached");
                                                bz bzVar2 = wyVar.a;
                                                uy uyVar2 = (bzVar2 == null || (vyVar2 = bzVar2.b) == null) ? null : vyVar2.b;
                                                xy xyVar2 = uyVar2 != null ? uyVar2.b : null;
                                                if (bzVar2 != null) {
                                                    vy vyVar3 = bzVar2.b;
                                                    if (vyVar3 != null) {
                                                        if (uyVar2 != null) {
                                                            if (xyVar2 != null) {
                                                                az azVar = xyVar2.d;
                                                                List<yy> list10 = azVar.b;
                                                                if (list10 != null) {
                                                                    ArrayList arrayList11 = new ArrayList(n.F(list10, 10));
                                                                    for (yy yyVar : list10) {
                                                                        if (yyVar == null || (dVar22 = yyVar.c.e) == null || (str7 = dVar22.a) == null) {
                                                                            str7 = (yyVar == null || (eVar2 = yyVar.c.d) == null) ? null : eVar2.a;
                                                                        }
                                                                        if (k.b(str7, str4)) {
                                                                            if (yyVar != null) {
                                                                                pt0.h hVar2 = yyVar.c;
                                                                                yyVar = new yy(yyVar.a, yyVar.b, new pt0.h(hVar2.a, hVar2.b, hVar2.c, hVar2.d, hVar2.e, arrayList8, hVar2.g, hVar2.h, hVar2.i, hVar2.j, hVar2.k));
                                                                            } else {
                                                                                yyVar = null;
                                                                            }
                                                                        }
                                                                        arrayList11.add(yyVar);
                                                                    }
                                                                    arrayList82 = arrayList11;
                                                                } else {
                                                                    arrayList82 = null;
                                                                }
                                                                xyVar = xy.a(xyVar2, new az(azVar.a, arrayList82));
                                                            } else {
                                                                xyVar = null;
                                                            }
                                                            uyVar = uy.a(uyVar2, xyVar);
                                                        } else {
                                                            uyVar = null;
                                                        }
                                                        vyVar = vy.a(vyVar3, uyVar);
                                                    } else {
                                                        vyVar = null;
                                                    }
                                                    bzVar = bz.a(bzVar2, vyVar);
                                                } else {
                                                    bzVar = null;
                                                }
                                                return wy.a(wyVar, bzVar);
                                        }
                                    }
                                }, this);
                                if (c4 != b71.a.r) {
                                    c4 = a0Var4;
                                }
                                if (c4 == aVar8) {
                                    return aVar8;
                                }
                            }
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var4;
        }
    }
}
