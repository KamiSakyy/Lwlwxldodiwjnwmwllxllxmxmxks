package xo0;

import bb0.i;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.ContributionLevel;
import fb0.a1;
import fb0.c1;
import fb0.e1;
import fb0.g0;
import fb0.r0;
import fb0.t0;
import fb0.v0;
import fb0.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.ae;
import jn0.be;
import jn0.ee;
import jn0.fe;
import jn0.he;
import jn0.yd;
import jn0.zd;
import jo.dj0;
import jo.e50;
import jo.ei0;
import jo.f50;
import jo.fi0;
import jo.g50;
import jo.h50;
import jo.h70;
import jo.hh0;
import jo.hj0;
import jo.i70;
import jo.ih;
import jo.iy;
import jo.j70;
import jo.jh;
import jo.jh0;
import jo.jy;
import jo.k70;
import jo.kh;
import jo.ky;
import jo.l70;
import jo.lh;
import jo.lh0;
import jo.ly;
import jo.mh;
import jo.my;
import jo.n70;
import jo.nh;
import jo.ny;
import jo.oh;
import jo.ph;
import jo.pj;
import jo.qh;
import jo.qj;
import jo.qy;
import jo.rj;
import jo.ry;
import jo.sh0;
import jo.si0;
import jo.sj;
import jo.sw;
import jo.sy;
import jo.tw;
import jo.ty;
import jo.uh0;
import jo.uw;
import jo.uy;
import jo.v7;
import jo.vh0;
import jo.vw;
import jo.vy;
import jo.w7;
import jo.wh0;
import jo.ww;
import jo.x7;
import jo.xw;
import jo.y7;
import jo.z7;
import jo.zi0;
import kotlin.NoWhenBranchMatchedException;
import m10.gb0;
import m10.m8;
import org.json.JSONArray;
import org.json.JSONObject;
import sy.d0;
import sy.w;
import sy.y;
import t.q;
import tu.s;
import w61.a0;
import w61.k;
import x61.m;
import x61.n;
import x61.r;
import xn.d1;
import xn.g4;
import y00.o;
import y00.p;
import y00.t;
import y00.u;
import y00.v;
import y71.j;
import y71.m0;
import y71.n1;
import y71.z0;
import yi.f;
import yi.g;
import yi.h;
import yz0.a3;
import yz0.b2;
import yz0.d5;
import yz0.d8;
import yz0.e8;
import yz0.f8;
import yz0.g8;
import yz0.l4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements j {
    public final /* synthetic */ int r;
    public final /* synthetic */ j s;

    public /* synthetic */ b(j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        u uVar;
        int i;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i2 = uVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = uVar.u;
                b71.a aVar = b71.a.r;
                i = uVar.v;
                a0 a0Var = a0.a;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                    return a0Var;
                }
                y.j(obj2);
                uVar.v = 1;
                return this.s.c(a0Var, uVar) == aVar ? aVar : a0Var;
            }
        }
        uVar = new u(this, cVar);
        Object obj22 = uVar.u;
        b71.a aVar2 = b71.a.r;
        i = uVar.v;
        a0 a0Var2 = a0.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v0, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        v vVar;
        int i;
        ?? r4;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i2 = vVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = vVar.u;
                b71.a aVar = b71.a.r;
                i = vVar.v;
                if (i != 0) {
                    y.j(obj2);
                    wh0 wh0Var = ((sh0) obj).a;
                    f8 f8Var = null;
                    if (wh0Var != null) {
                        List<uh0> list = wh0Var.d.a;
                        if (list != null) {
                            r4 = new ArrayList();
                            for (uh0 uh0Var : list) {
                                e8 D = uh0Var != null ? d0.D(uh0Var.c) : null;
                                if (D != null) {
                                    r4.add(D);
                                }
                            }
                        } else {
                            r4 = r.r;
                        }
                        List<vh0> list2 = wh0Var.c;
                        ArrayList arrayList = new ArrayList(n.F(list2, 10));
                        for (vh0 vh0Var : list2) {
                            String str = vh0Var.b;
                            String str2 = "";
                            if (str == null) {
                                str = "";
                            }
                            String str3 = vh0Var.a;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            arrayList.add(new g8(str, str2));
                        }
                        f8Var = new f8(wh0Var.b, arrayList, r4);
                    }
                    if (f8Var != null) {
                        vVar.v = 1;
                        if (this.s.c(f8Var, vVar) == aVar) {
                            return aVar;
                        }
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
        vVar = new v(this, cVar);
        Object obj22 = vVar.u;
        b71.a aVar2 = b71.a.r;
        i = vVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        z0 z0Var;
        int i;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i2 = z0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = z0Var.u;
                b71.a aVar = b71.a.r;
                i = z0Var.v;
                if (i != 0) {
                    y.j(obj2);
                    if (obj != null) {
                        z0Var.v = 1;
                        if (this.s.c(obj, z0Var) == aVar) {
                            return aVar;
                        }
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
        z0Var = new z0(this, cVar);
        Object obj22 = z0Var.u;
        b71.a aVar2 = b71.a.r;
        i = z0Var.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        yb0.b bVar;
        int i;
        if (cVar instanceof yb0.b) {
            bVar = (yb0.b) cVar;
            int i2 = bVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.u;
                b71.a aVar = b71.a.r;
                i = bVar.v;
                if (i != 0) {
                    y.j(obj2);
                    fb0.d dVar = (fb0.d) obj;
                    i iVar = new i(dVar);
                    g0 g0Var = dVar.a.b.a;
                    k kVar = new k(iVar, new x01.i(g0Var.b, g0Var.a, false));
                    bVar.v = 1;
                    if (this.s.c(kVar, bVar) == aVar) {
                        return aVar;
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
        bVar = new yb0.b(this, cVar);
        Object obj22 = bVar.u;
        b71.a aVar2 = b71.a.r;
        i = bVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        yb0.c cVar2;
        int i;
        if (cVar instanceof yb0.c) {
            cVar2 = (yb0.c) cVar;
            int i2 = cVar2.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.v = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar2.u;
                b71.a aVar = b71.a.r;
                i = cVar2.v;
                if (i != 0) {
                    y.j(obj2);
                    fb0.d dVar = (fb0.d) obj;
                    i iVar = new i(dVar);
                    g0 g0Var = dVar.a.b.a;
                    k kVar = new k(iVar, new x01.i(g0Var.b, g0Var.a, false));
                    cVar2.v = 1;
                    if (this.s.c(kVar, cVar2) == aVar) {
                        return aVar;
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
        cVar2 = new yb0.c(this, cVar);
        Object obj22 = cVar2.u;
        b71.a aVar2 = b71.a.r;
        i = cVar2.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        yb0.d dVar;
        int i;
        v0 v0Var;
        if (cVar instanceof yb0.d) {
            dVar = (yb0.d) cVar;
            int i2 = dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.u;
                b71.a aVar = b71.a.r;
                i = dVar.v;
                if (i != 0) {
                    y.j(obj2);
                    Iterable<t0> iterable = ((r0) obj).a.a.a;
                    if (iterable == null) {
                        iterable = r.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (t0 t0Var : iterable) {
                        j01.b bVar = null;
                        if (t0Var != null && (v0Var = t0Var.c.b) != null) {
                            int i3 = t0Var.a;
                            int i4 = t0Var.b;
                            String str = v0Var.a;
                            String str2 = v0Var.b;
                            w0 w0Var = v0Var.c;
                            bVar = new j01.b(i3, i4, q.q(w0Var.d), str, str2, w0Var.c);
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    }
                    dVar.v = 1;
                    if (this.s.c(arrayList, dVar) == aVar) {
                        return aVar;
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
        dVar = new yb0.d(this, cVar);
        Object obj22 = dVar.u;
        b71.a aVar2 = b71.a.r;
        i = dVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        yb0.e eVar;
        int i;
        j01.a aVar;
        if (cVar instanceof yb0.e) {
            eVar = (yb0.e) cVar;
            int i2 = eVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = eVar.u;
                b71.a aVar2 = b71.a.r;
                i = eVar.v;
                if (i != 0) {
                    y.j(obj2);
                    a1 a1Var = (a1) obj;
                    k71.k.g(a1Var, "<this>");
                    e1 e1Var = a1Var.a;
                    int i3 = e1Var.a.a;
                    Iterable<c1> iterable = e1Var.b.a;
                    if (iterable == null) {
                        iterable = r.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (c1 c1Var : iterable) {
                        if (c1Var != null) {
                            e70.a aVar3 = c1Var.c;
                            aVar = new j01.a(aVar3.c, aVar3.a, aVar3.b, aVar3.d, aVar3.e);
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    a3 a3Var = new a3(i3, arrayList);
                    eVar.v = 1;
                    if (this.s.c(a3Var, eVar) == aVar2) {
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
        eVar = new yb0.e(this, cVar);
        Object obj22 = eVar.u;
        b71.a aVar22 = b71.a.r;
        i = eVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r6.equals("github.memex.v0.MemexProjectColumnValueUpdate") == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        r1 = r4.optJSONObject("payload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r1 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r7 = new yi.c(r1.optInt("column_id"), r1.optInt("item_id"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r6.equals("github.memex.v0.MemexProjectColumnValueCreate") == false) goto L73;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v2, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(a71.c cVar, Object obj) {
        yi.a aVar;
        int i;
        yi.c cVar2;
        ArrayList arrayList;
        yi.i iVar;
        yi.i iVar2;
        if (cVar instanceof yi.a) {
            aVar = (yi.a) cVar;
            int i2 = aVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = aVar.u;
                b71.a aVar2 = b71.a.r;
                i = aVar.v;
                if (i != 0) {
                    y.j(obj2);
                    qn.c cVar3 = (qn.c) obj;
                    String.valueOf(cVar3);
                    JSONObject jSONObject = cVar3.a;
                    String optString = jSONObject.optString("type");
                    if (optString != null) {
                        switch (optString.hashCode()) {
                            case -1733015259:
                                if (optString.equals("github.memex.v0.ProjectItemCreate")) {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("payload");
                                    if (optJSONObject != null) {
                                        cVar2 = new f(optJSONObject.optInt("id"));
                                        break;
                                    }
                                    cVar2 = null;
                                    break;
                                }
                                break;
                            case -1655046927:
                                if (optString.equals("github.memex.v0.ProjectItemDestroy")) {
                                    JSONObject optJSONObject2 = jSONObject.optJSONObject("payload");
                                    if (optJSONObject2 != null) {
                                        cVar2 = new g(optJSONObject2.optInt("id"));
                                        break;
                                    }
                                    cVar2 = null;
                                    break;
                                }
                                break;
                            case -989437109:
                                if (optString.equals("memex_item_denormalized_to_elasticsearch")) {
                                    yi.e.Companion.getClass();
                                    JSONArray optJSONArray = jSONObject.optJSONArray("items");
                                    ?? r8 = r.r;
                                    if (optJSONArray != null) {
                                        q71.g b0 = aa1.b.b0(0, optJSONArray.length());
                                        arrayList = new ArrayList();
                                        q71.f it = b0.iterator();
                                        while (it.t) {
                                            JSONObject optJSONObject3 = optJSONArray.optJSONObject(((x61.v) it).nextInt());
                                            if (optJSONObject3 != null) {
                                                int optInt = optJSONObject3.optInt("id");
                                                String optString2 = optJSONObject3.optString("gid");
                                                k71.k.f(optString2, "optString(...)");
                                                iVar2 = new yi.i(optString2, optInt);
                                            } else {
                                                iVar2 = null;
                                            }
                                            if (iVar2 != null) {
                                                arrayList.add(iVar2);
                                            }
                                        }
                                    } else {
                                        arrayList = r8;
                                    }
                                    JSONArray optJSONArray2 = jSONObject.optJSONArray("models");
                                    if (optJSONArray2 != null) {
                                        q71.g b02 = aa1.b.b0(0, optJSONArray2.length());
                                        r8 = new ArrayList();
                                        q71.f it2 = b02.iterator();
                                        while (it2.t) {
                                            JSONObject optJSONObject4 = optJSONArray2.optJSONObject(((x61.v) it2).nextInt());
                                            if (optJSONObject4 != null) {
                                                int optInt2 = optJSONObject4.optInt("id");
                                                String optString3 = optJSONObject4.optString("gid");
                                                k71.k.f(optString3, "optString(...)");
                                                iVar = new yi.i(optString3, optInt2);
                                            } else {
                                                iVar = null;
                                            }
                                            if (iVar != null) {
                                                r8.add(iVar);
                                            }
                                        }
                                    }
                                    cVar2 = new yi.e(arrayList, (List) r8);
                                    break;
                                }
                                break;
                            case -840560062:
                                if (optString.equals("github.memex.v0.MemexProjectViewUpdate")) {
                                    JSONObject optJSONObject5 = jSONObject.optJSONObject("payload");
                                    if (optJSONObject5 != null) {
                                        cVar2 = new h(optJSONObject5.optInt("memex_project_view_id"));
                                        break;
                                    }
                                    cVar2 = null;
                                    break;
                                }
                                break;
                            case -627696733:
                                break;
                            case -114248848:
                                break;
                        }
                        if (cVar2 != null) {
                            aVar.v = 1;
                            if (this.s.c(cVar2, aVar) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                    cVar3.toString();
                    cVar2 = null;
                    if (cVar2 != null) {
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
        aVar = new yi.a(this, cVar);
        Object obj22 = aVar.u;
        b71.a aVar22 = b71.a.r;
        i = aVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(y71.i iVar, a71.c cVar) {
        m0 m0Var;
        int i;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i2 = m0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m0Var.w = i2 - Integer.MIN_VALUE;
                Object obj = m0Var.u;
                b71.a aVar = b71.a.r;
                i = m0Var.w;
                if (i != 0) {
                    y.j(obj);
                    m0Var.w = 1;
                    if (n1.q(this.s, iVar, m0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            }
        }
        m0Var = new m0(this, cVar);
        Object obj2 = m0Var.u;
        b71.a aVar2 = b71.a.r;
        i = m0Var.w;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b0, code lost:
    
        if (r14 != null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /* JADX WARN: Type inference failed for: r15v6, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v30, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a aVar;
        int i;
        Set set;
        List list;
        c cVar2;
        int i2;
        ?? r15;
        d dVar;
        int i3;
        y00.b bVar;
        int i4;
        w7 w7Var;
        x7 x7Var;
        String str;
        w7 w7Var2;
        x7 x7Var2;
        v7 v7Var;
        v7 v7Var2;
        y00.c cVar3;
        int i5;
        qj qjVar;
        String str2;
        qj qjVar2;
        pj pjVar;
        pj pjVar2;
        y00.d dVar2;
        int i6;
        k kVar;
        ww wwVar;
        y00.e eVar;
        int i7;
        y00.f fVar;
        int i8;
        k kVar2;
        oh ohVar;
        y00.g gVar;
        int i9;
        k kVar3;
        oh ohVar2;
        y00.h hVar;
        int i10;
        k70 k70Var;
        l4 l4Var;
        s sVar;
        qx.c1 c1Var;
        y00.i iVar;
        int i12;
        k kVar4;
        ly lyVar;
        y00.j jVar;
        int i13;
        b2 b2Var;
        y00.k kVar5;
        int i14;
        ContributionLevel contributionLevel;
        y00.n nVar;
        int i15;
        g50 g50Var;
        o oVar;
        int i16;
        p pVar;
        int i17;
        y00.q qVar;
        int i18;
        y00.r rVar;
        int i19;
        k kVar6;
        ty tyVar;
        y00.s sVar2;
        int i20;
        t tVar;
        int i22;
        ym0.a aVar2;
        int i23;
        Object obj2;
        zm0.k kVar7;
        ?? r6;
        List<zm0.h> list2;
        zm0.i iVar2;
        zm0.g gVar2;
        zm0.j jVar2;
        switch (this.r) {
            case 0:
                if (cVar instanceof a) {
                    aVar = (a) cVar;
                    int i24 = aVar.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        aVar.v = i24 - Integer.MIN_VALUE;
                        Object obj3 = aVar.u;
                        b71.a aVar3 = b71.a.r;
                        i = aVar.v;
                        if (i != 0) {
                            y.j(obj3);
                            ee eeVar = ((fe) obj).a.c;
                            if (eeVar == null || (list = eeVar.a.a) == null) {
                                set = null;
                            } else {
                                ArrayList arrayList = new ArrayList(n.F(list, 10));
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    kr0.a aVar4 = ((he) it.next()).b;
                                    arrayList.add(new t10.f(aVar4.b, w.B(aVar4.c), aVar4.a));
                                }
                                set = m.K0(arrayList);
                            }
                            if (set != null) {
                                aVar.v = 1;
                                if (this.s.c(set, aVar) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj3);
                        }
                        return a0.a;
                    }
                }
                aVar = new a(this, cVar);
                Object obj32 = aVar.u;
                b71.a aVar32 = b71.a.r;
                i = aVar.v;
                if (i != 0) {
                }
                return a0.a;
            case 1:
                if (cVar instanceof c) {
                    cVar2 = (c) cVar;
                    int i25 = cVar2.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        cVar2.v = i25 - Integer.MIN_VALUE;
                        Object obj4 = cVar2.u;
                        b71.a aVar5 = b71.a.r;
                        i2 = cVar2.v;
                        if (i2 != 0) {
                            y.j(obj4);
                            List<zd> list3 = ((ae) obj).a;
                            if (list3 != null) {
                                r15 = new ArrayList();
                                for (zd zdVar : list3) {
                                    t10.k g = zdVar != null ? vo0.a.g(zdVar.c) : null;
                                    if (g != null) {
                                        r15.add(g);
                                    }
                                }
                            } else {
                                r15 = r.r;
                            }
                            cVar2.v = 1;
                            if (this.s.c((Object) r15, cVar2) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj4);
                        }
                        return a0.a;
                    }
                }
                cVar2 = new c(this, cVar);
                Object obj42 = cVar2.u;
                b71.a aVar52 = b71.a.r;
                i2 = cVar2.v;
                if (i2 != 0) {
                }
                return a0.a;
            case 2:
                if (cVar instanceof d) {
                    dVar = (d) cVar;
                    int i26 = dVar.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i26 - Integer.MIN_VALUE;
                        Object obj5 = dVar.u;
                        b71.a aVar6 = b71.a.r;
                        i3 = dVar.v;
                        if (i3 != 0) {
                            y.j(obj5);
                            be beVar = ((yd) obj).a;
                            ae aeVar = beVar != null ? beVar.b : null;
                            if (aeVar != null) {
                                dVar.v = 1;
                                if (this.s.c(aeVar, dVar) == aVar6) {
                                    return aVar6;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj5);
                        }
                        return a0.a;
                    }
                }
                dVar = new d(this, cVar);
                Object obj52 = dVar.u;
                b71.a aVar62 = b71.a.r;
                i3 = dVar.v;
                if (i3 != 0) {
                }
                return a0.a;
            case 3:
                if (cVar instanceof y00.b) {
                    bVar = (y00.b) cVar;
                    int i27 = bVar.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i27 - Integer.MIN_VALUE;
                        Object obj6 = bVar.u;
                        b71.a aVar7 = b71.a.r;
                        i4 = bVar.v;
                        if (i4 != 0) {
                            y.j(obj6);
                            z7 z7Var = (z7) obj;
                            k71.k.g(z7Var, "<this>");
                            y7 y7Var = z7Var.a;
                            boolean z = ((y7Var == null || (v7Var2 = y7Var.b) == null || !v7Var2.a) && (y7Var == null || (x7Var = y7Var.c) == null || !x7Var.a) && (y7Var == null || (w7Var = y7Var.d) == null || !w7Var.a)) ? false : true;
                            if (y7Var != null && (v7Var = y7Var.b) != null) {
                                str = v7Var.b;
                            } else if (y7Var == null || (x7Var2 = y7Var.c) == null) {
                                str = (y7Var == null || (w7Var2 = y7Var.d) == null) ? null : w7Var2.b;
                                if (str == null) {
                                    str = "";
                                }
                            } else {
                                str = x7Var2.b;
                            }
                            sz0.c cVar4 = new sz0.c(str, z);
                            bVar.v = 1;
                            if (this.s.c(cVar4, bVar) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj6);
                        }
                        return a0.a;
                    }
                }
                bVar = new y00.b(this, cVar);
                Object obj62 = bVar.u;
                b71.a aVar72 = b71.a.r;
                i4 = bVar.v;
                if (i4 != 0) {
                }
                return a0.a;
            case 4:
                if (cVar instanceof y00.c) {
                    cVar3 = (y00.c) cVar;
                    int i28 = cVar3.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        cVar3.v = i28 - Integer.MIN_VALUE;
                        Object obj7 = cVar3.u;
                        b71.a aVar8 = b71.a.r;
                        i5 = cVar3.v;
                        if (i5 != 0) {
                            y.j(obj7);
                            sj sjVar = (sj) obj;
                            k71.k.g(sjVar, "<this>");
                            rj rjVar = sjVar.a;
                            boolean z2 = ((rjVar == null || (pjVar2 = rjVar.b) == null || !pjVar2.a) && (rjVar == null || (qjVar = rjVar.c) == null || !qjVar.a)) ? false : true;
                            if (rjVar == null || (pjVar = rjVar.b) == null) {
                                str2 = (rjVar == null || (qjVar2 = rjVar.c) == null) ? null : qjVar2.b;
                                if (str2 == null) {
                                    str2 = "";
                                }
                            } else {
                                str2 = pjVar.b;
                            }
                            sz0.c cVar5 = new sz0.c(str2, z2);
                            cVar3.v = 1;
                            if (this.s.c(cVar5, cVar3) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj7);
                        }
                        return a0.a;
                    }
                }
                cVar3 = new y00.c(this, cVar);
                Object obj72 = cVar3.u;
                b71.a aVar82 = b71.a.r;
                i5 = cVar3.v;
                if (i5 != 0) {
                }
                return a0.a;
            case 5:
                if (cVar instanceof y00.d) {
                    dVar2 = (y00.d) cVar;
                    int i29 = dVar2.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        dVar2.v = i29 - Integer.MIN_VALUE;
                        Object obj8 = dVar2.u;
                        b71.a aVar9 = b71.a.r;
                        i6 = dVar2.v;
                        if (i6 != 0) {
                            y.j(obj8);
                            vw vwVar = ((tw) obj).a;
                            if (vwVar == null || (wwVar = vwVar.c) == null) {
                                kVar = null;
                            } else {
                                sw swVar = wwVar.a;
                                Iterable iterable = swVar.b;
                                if (iterable == null) {
                                    iterable = r.r;
                                }
                                ArrayList S = m.S(iterable);
                                ArrayList arrayList2 = new ArrayList(n.F(S, 10));
                                int size = S.size();
                                int i30 = 0;
                                while (i30 < size) {
                                    Object obj9 = S.get(i30);
                                    i30++;
                                    arrayList2.add(sy.r.l(((uw) obj9).c));
                                }
                                ArrayList arrayList3 = new ArrayList();
                                int size2 = arrayList2.size();
                                int i32 = 0;
                                while (i32 < size2) {
                                    Object obj10 = arrayList2.get(i32);
                                    i32++;
                                    if (!((l4) obj10).f) {
                                        arrayList3.add(obj10);
                                    }
                                }
                                xw xwVar = swVar.a;
                                kVar = new k(arrayList3, new x01.i(xwVar.b, xwVar.a, false));
                            }
                            if (kVar != null) {
                                dVar2.v = 1;
                                if (this.s.c(kVar, dVar2) == aVar9) {
                                    return aVar9;
                                }
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj8);
                        }
                        return a0.a;
                    }
                }
                dVar2 = new y00.d(this, cVar);
                Object obj82 = dVar2.u;
                b71.a aVar92 = b71.a.r;
                i6 = dVar2.v;
                if (i6 != 0) {
                }
                return a0.a;
            case 6:
                if (cVar instanceof y00.e) {
                    eVar = (y00.e) cVar;
                    int i33 = eVar.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i33 - Integer.MIN_VALUE;
                        Object obj11 = eVar.u;
                        b71.a aVar10 = b71.a.r;
                        i7 = eVar.v;
                        if (i7 != 0) {
                            y.j(obj11);
                            jo.zd zdVar2 = ((jo.yd) obj).a;
                            d5 d5Var = new d5(zdVar2 != null ? zdVar2.a : "", (zdVar2 != null ? zdVar2.b : null) == gb0.t);
                            eVar.v = 1;
                            if (this.s.c(d5Var, eVar) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj11);
                        }
                        return a0.a;
                    }
                }
                eVar = new y00.e(this, cVar);
                Object obj112 = eVar.u;
                b71.a aVar102 = b71.a.r;
                i7 = eVar.v;
                if (i7 != 0) {
                }
                return a0.a;
            case 7:
                if (cVar instanceof y00.f) {
                    fVar = (y00.f) cVar;
                    int i34 = fVar.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i34 - Integer.MIN_VALUE;
                        Object obj12 = fVar.u;
                        b71.a aVar11 = b71.a.r;
                        i8 = fVar.v;
                        if (i8 != 0) {
                            y.j(obj12);
                            nh nhVar = ((ih) obj).a;
                            if (nhVar == null || (ohVar = nhVar.c) == null) {
                                kVar2 = null;
                            } else {
                                jh jhVar = ohVar.b;
                                Iterable iterable2 = jhVar.b;
                                if (iterable2 == null) {
                                    iterable2 = r.r;
                                }
                                ArrayList S2 = m.S(iterable2);
                                ArrayList arrayList4 = new ArrayList(n.F(S2, 10));
                                int size3 = S2.size();
                                int i35 = 0;
                                while (i35 < size3) {
                                    Object obj13 = S2.get(i35);
                                    i35++;
                                    arrayList4.add(sy.r.l(((mh) obj13).c));
                                }
                                ph phVar = jhVar.a;
                                kVar2 = new k(arrayList4, new x01.i(phVar.b, phVar.a, false));
                            }
                            if (kVar2 != null) {
                                fVar.v = 1;
                                if (this.s.c(kVar2, fVar) == aVar11) {
                                    return aVar11;
                                }
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj12);
                        }
                        return a0.a;
                    }
                }
                fVar = new y00.f(this, cVar);
                Object obj122 = fVar.u;
                b71.a aVar112 = b71.a.r;
                i8 = fVar.v;
                if (i8 != 0) {
                }
                return a0.a;
            case 8:
                if (cVar instanceof y00.g) {
                    gVar = (y00.g) cVar;
                    int i36 = gVar.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        gVar.v = i36 - Integer.MIN_VALUE;
                        Object obj14 = gVar.u;
                        b71.a aVar12 = b71.a.r;
                        i9 = gVar.v;
                        if (i9 != 0) {
                            y.j(obj14);
                            nh nhVar2 = ((ih) obj).a;
                            if (nhVar2 == null || (ohVar2 = nhVar2.c) == null) {
                                kVar3 = null;
                            } else {
                                kh khVar = ohVar2.a;
                                Iterable iterable3 = khVar.b;
                                if (iterable3 == null) {
                                    iterable3 = r.r;
                                }
                                ArrayList S3 = m.S(iterable3);
                                ArrayList arrayList5 = new ArrayList(n.F(S3, 10));
                                int size4 = S3.size();
                                int i37 = 0;
                                while (i37 < size4) {
                                    Object obj15 = S3.get(i37);
                                    i37++;
                                    arrayList5.add(sy.r.l(((lh) obj15).c));
                                }
                                qh qhVar = khVar.a;
                                kVar3 = new k(arrayList5, new x01.i(qhVar.b, qhVar.a, false));
                            }
                            if (kVar3 != null) {
                                gVar.v = 1;
                                if (this.s.c(kVar3, gVar) == aVar12) {
                                    return aVar12;
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj14);
                        }
                        return a0.a;
                    }
                }
                gVar = new y00.g(this, cVar);
                Object obj142 = gVar.u;
                b71.a aVar122 = b71.a.r;
                i9 = gVar.v;
                if (i9 != 0) {
                }
                return a0.a;
            case 9:
                if (cVar instanceof y00.h) {
                    hVar = (y00.h) cVar;
                    int i38 = hVar.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        hVar.v = i38 - Integer.MIN_VALUE;
                        Object obj16 = hVar.u;
                        b71.a aVar13 = b71.a.r;
                        i10 = hVar.v;
                        if (i10 != 0) {
                            y.j(obj16);
                            j70 j70Var = ((h70) obj).a;
                            k kVar8 = null;
                            if (j70Var != null && (k70Var = j70Var.c) != null) {
                                n70 n70Var = k70Var.a;
                                Iterable<i70> iterable4 = n70Var.b;
                                if (iterable4 == null) {
                                    iterable4 = r.r;
                                }
                                ArrayList arrayList6 = new ArrayList();
                                for (i70 i70Var : iterable4) {
                                    if (i70Var != null && (c1Var = i70Var.a.b) != null) {
                                        l4Var = sy.r.l(c1Var);
                                    } else if (i70Var == null || (sVar = i70Var.a.c) == null) {
                                        l4Var = null;
                                    } else {
                                        String str3 = sVar.b;
                                        String str4 = sVar.e;
                                        String str5 = sVar.d;
                                        String str6 = sVar.c;
                                        if (str6 == null) {
                                            str6 = "";
                                        }
                                        l4Var = new l4(w8.s.A(sVar.g), str3, str4, str5, str6);
                                    }
                                    if (l4Var != null) {
                                        arrayList6.add(l4Var);
                                    }
                                }
                                l70 l70Var = n70Var.a;
                                kVar8 = new k(arrayList6, new x01.i(l70Var.b, l70Var.a, false));
                            }
                            if (kVar8 != null) {
                                hVar.v = 1;
                                if (this.s.c(kVar8, hVar) == aVar13) {
                                    return aVar13;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj16);
                        }
                        return a0.a;
                    }
                }
                hVar = new y00.h(this, cVar);
                Object obj162 = hVar.u;
                b71.a aVar132 = b71.a.r;
                i10 = hVar.v;
                if (i10 != 0) {
                }
                return a0.a;
            case 10:
                if (cVar instanceof y00.i) {
                    iVar = (y00.i) cVar;
                    int i39 = iVar.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        iVar.v = i39 - Integer.MIN_VALUE;
                        Object obj17 = iVar.u;
                        b71.a aVar14 = b71.a.r;
                        i12 = iVar.v;
                        if (i12 != 0) {
                            y.j(obj17);
                            ky kyVar = ((iy) obj).a;
                            if (kyVar == null || (lyVar = kyVar.c) == null) {
                                kVar4 = null;
                            } else {
                                ny nyVar = lyVar.a;
                                Iterable iterable5 = nyVar.b;
                                if (iterable5 == null) {
                                    iterable5 = r.r;
                                }
                                ArrayList S4 = m.S(iterable5);
                                ArrayList arrayList7 = new ArrayList(n.F(S4, 10));
                                int size5 = S4.size();
                                int i40 = 0;
                                while (i40 < size5) {
                                    Object obj18 = S4.get(i40);
                                    i40++;
                                    arrayList7.add(sy.r.l(((jy) obj18).c));
                                }
                                my myVar = nyVar.a;
                                kVar4 = new k(arrayList7, new x01.i(myVar.b, myVar.a, false));
                            }
                            if (kVar4 != null) {
                                iVar.v = 1;
                                if (this.s.c(kVar4, iVar) == aVar14) {
                                    return aVar14;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj17);
                        }
                        return a0.a;
                    }
                }
                iVar = new y00.i(this, cVar);
                Object obj172 = iVar.u;
                b71.a aVar142 = b71.a.r;
                i12 = iVar.v;
                if (i12 != 0) {
                }
                return a0.a;
            case 11:
                if (cVar instanceof y00.j) {
                    jVar = (y00.j) cVar;
                    int i42 = jVar.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        jVar.v = i42 - Integer.MIN_VALUE;
                        Object obj19 = jVar.u;
                        b71.a aVar15 = b71.a.r;
                        i13 = jVar.v;
                        if (i13 != 0) {
                            y.j(obj19);
                            fi0 fi0Var = ((ei0) obj).a;
                            if (fi0Var != null) {
                                String str7 = fi0Var.b;
                                Avatar A = w8.s.A(fi0Var.e);
                                String str8 = fi0Var.c;
                                String str9 = fi0Var.d;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                b2Var = new b2(str7, A, str8, str9, false, false, 112);
                            } else {
                                b2Var = null;
                            }
                            if (b2Var != null) {
                                jVar.v = 1;
                                if (this.s.c(b2Var, jVar) == aVar15) {
                                    return aVar15;
                                }
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj19);
                        }
                        return a0.a;
                    }
                }
                jVar = new y00.j(this, cVar);
                Object obj192 = jVar.u;
                b71.a aVar152 = b71.a.r;
                i13 = jVar.v;
                if (i13 != 0) {
                }
                return a0.a;
            case 12:
                if (cVar instanceof y00.k) {
                    kVar5 = (y00.k) cVar;
                    int i43 = kVar5.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        kVar5.v = i43 - Integer.MIN_VALUE;
                        Object obj20 = kVar5.u;
                        b71.a aVar16 = b71.a.r;
                        i14 = kVar5.v;
                        if (i14 != 0) {
                            y.j(obj20);
                            jh0 jh0Var = (jh0) obj;
                            k71.k.g(jh0Var, "<this>");
                            ArrayList arrayList8 = jh0Var.a.a.a.a;
                            ArrayList arrayList9 = new ArrayList(n.F(arrayList8, 10));
                            int size6 = arrayList8.size();
                            int i44 = 0;
                            while (i44 < size6) {
                                Object obj21 = arrayList8.get(i44);
                                i44++;
                                ArrayList arrayList10 = ((lh0) obj21).a;
                                ArrayList arrayList11 = new ArrayList(n.F(arrayList10, 10));
                                int size7 = arrayList10.size();
                                int i45 = 0;
                                while (i45 < size7) {
                                    Object obj22 = arrayList10.get(i45);
                                    i45++;
                                    int ordinal = ((hh0) obj22).a.ordinal();
                                    if (ordinal == 0) {
                                        contributionLevel = ContributionLevel.FIRST_QUARTILE;
                                    } else if (ordinal == 1) {
                                        contributionLevel = ContributionLevel.FOURTH_QUARTILE;
                                    } else if (ordinal == 2) {
                                        contributionLevel = ContributionLevel.NONE;
                                    } else if (ordinal == 3) {
                                        contributionLevel = ContributionLevel.SECOND_QUARTILE;
                                    } else if (ordinal == 4) {
                                        contributionLevel = ContributionLevel.THIRD_QUARTILE;
                                    } else {
                                        if (ordinal != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        contributionLevel = ContributionLevel.UNKNOWN__;
                                    }
                                    arrayList11.add(contributionLevel);
                                }
                                arrayList9.add(arrayList11);
                            }
                            d8 d8Var = new d8(arrayList9);
                            kVar5.v = 1;
                            if (this.s.c(d8Var, kVar5) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj20);
                        }
                        return a0.a;
                    }
                }
                kVar5 = new y00.k(this, cVar);
                Object obj202 = kVar5.u;
                b71.a aVar162 = b71.a.r;
                i14 = kVar5.v;
                if (i14 != 0) {
                }
                return a0.a;
            case 13:
                if (cVar instanceof y00.n) {
                    nVar = (y00.n) cVar;
                    int i46 = nVar.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        nVar.v = i46 - Integer.MIN_VALUE;
                        Object obj23 = nVar.u;
                        b71.a aVar17 = b71.a.r;
                        i15 = nVar.v;
                        if (i15 != 0) {
                            y.j(obj23);
                            e50 e50Var = (e50) obj;
                            Iterable<f50> iterable6 = e50Var.a.c;
                            if (iterable6 == null) {
                                iterable6 = r.r;
                            }
                            ArrayList arrayList12 = new ArrayList();
                            for (f50 f50Var : iterable6) {
                                qx.c1 c1Var2 = (f50Var == null || (g50Var = f50Var.b) == null) ? null : g50Var.c;
                                if (c1Var2 != null) {
                                    arrayList12.add(c1Var2);
                                }
                            }
                            ArrayList arrayList13 = new ArrayList(n.F(arrayList12, 10));
                            int size8 = arrayList12.size();
                            int i47 = 0;
                            while (i47 < size8) {
                                Object obj24 = arrayList12.get(i47);
                                i47++;
                                arrayList13.add(sy.r.l((qx.c1) obj24));
                            }
                            h50 h50Var = e50Var.a.b;
                            k kVar9 = new k(arrayList13, new x01.i(h50Var.b, h50Var.a, false));
                            nVar.v = 1;
                            if (this.s.c(kVar9, nVar) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj23);
                        }
                        return a0.a;
                    }
                }
                nVar = new y00.n(this, cVar);
                Object obj232 = nVar.u;
                b71.a aVar172 = b71.a.r;
                i15 = nVar.v;
                if (i15 != 0) {
                }
                return a0.a;
            case 14:
                if (cVar instanceof o) {
                    oVar = (o) cVar;
                    int i48 = oVar.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i48 - Integer.MIN_VALUE;
                        Object obj25 = oVar.u;
                        b71.a aVar18 = b71.a.r;
                        i16 = oVar.v;
                        if (i16 != 0) {
                            y.j(obj25);
                            d1 d1Var = xn.e1.Companion;
                            m8 m8Var = ((si0) obj).a.a;
                            String str10 = m8Var != null ? m8Var.r : null;
                            if (str10 == null) {
                                str10 = "";
                            }
                            d1Var.getClass();
                            xn.e1 a = d1.a(str10);
                            oVar.v = 1;
                            if (this.s.c(a, oVar) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj25);
                        }
                        return a0.a;
                    }
                }
                oVar = new o(this, cVar);
                Object obj252 = oVar.u;
                b71.a aVar182 = b71.a.r;
                i16 = oVar.v;
                if (i16 != 0) {
                }
                return a0.a;
            case 15:
                if (cVar instanceof p) {
                    pVar = (p) cVar;
                    int i49 = pVar.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        pVar.v = i49 - Integer.MIN_VALUE;
                        Object obj26 = pVar.u;
                        b71.a aVar19 = b71.a.r;
                        i17 = pVar.v;
                        if (i17 != 0) {
                            y.j(obj26);
                            Boolean valueOf = Boolean.valueOf(((dj0) obj).a.a);
                            pVar.v = 1;
                            if (this.s.c(valueOf, pVar) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj26);
                        }
                        return a0.a;
                    }
                }
                pVar = new p(this, cVar);
                Object obj262 = pVar.u;
                b71.a aVar192 = b71.a.r;
                i17 = pVar.v;
                if (i17 != 0) {
                }
                return a0.a;
            case 16:
                if (cVar instanceof y00.q) {
                    qVar = (y00.q) cVar;
                    int i50 = qVar.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        qVar.v = i50 - Integer.MIN_VALUE;
                        Object obj27 = qVar.u;
                        b71.a aVar20 = b71.a.r;
                        i18 = qVar.v;
                        if (i18 != 0) {
                            y.j(obj27);
                            Boolean valueOf2 = Boolean.valueOf(((hj0) obj).a.a);
                            qVar.v = 1;
                            if (this.s.c(valueOf2, qVar) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj27);
                        }
                        return a0.a;
                    }
                }
                qVar = new y00.q(this, cVar);
                Object obj272 = qVar.u;
                b71.a aVar202 = b71.a.r;
                i18 = qVar.v;
                if (i18 != 0) {
                }
                return a0.a;
            case 17:
                if (cVar instanceof y00.r) {
                    rVar = (y00.r) cVar;
                    int i52 = rVar.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        rVar.v = i52 - Integer.MIN_VALUE;
                        Object obj28 = rVar.u;
                        b71.a aVar21 = b71.a.r;
                        i19 = rVar.v;
                        if (i19 != 0) {
                            y.j(obj28);
                            sy syVar = ((qy) obj).a;
                            if (syVar == null || (tyVar = syVar.c) == null) {
                                kVar6 = null;
                            } else {
                                vy vyVar = tyVar.a;
                                Iterable iterable7 = vyVar.b;
                                if (iterable7 == null) {
                                    iterable7 = r.r;
                                }
                                ArrayList S5 = m.S(iterable7);
                                ArrayList arrayList14 = new ArrayList(n.F(S5, 10));
                                int size9 = S5.size();
                                int i53 = 0;
                                while (i53 < size9) {
                                    Object obj29 = S5.get(i53);
                                    i53++;
                                    arrayList14.add(sy.r.l(((ry) obj29).c));
                                }
                                uy uyVar = vyVar.a;
                                kVar6 = new k(arrayList14, new x01.i(uyVar.b, uyVar.a, false));
                            }
                            if (kVar6 != null) {
                                rVar.v = 1;
                                if (this.s.c(kVar6, rVar) == aVar21) {
                                    return aVar21;
                                }
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj28);
                        }
                        return a0.a;
                    }
                }
                rVar = new y00.r(this, cVar);
                Object obj282 = rVar.u;
                b71.a aVar212 = b71.a.r;
                i19 = rVar.v;
                if (i19 != 0) {
                }
                return a0.a;
            case 18:
                if (cVar instanceof y00.s) {
                    sVar2 = (y00.s) cVar;
                    int i54 = sVar2.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        sVar2.v = i54 - Integer.MIN_VALUE;
                        Object obj30 = sVar2.u;
                        b71.a aVar22 = b71.a.r;
                        i20 = sVar2.v;
                        a0 a0Var = a0.a;
                        if (i20 != 0) {
                            y.j(obj30);
                            sVar2.v = 1;
                            if (this.s.c(a0Var, sVar2) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj30);
                        }
                        return a0Var;
                    }
                }
                sVar2 = new y00.s(this, cVar);
                Object obj302 = sVar2.u;
                b71.a aVar222 = b71.a.r;
                i20 = sVar2.v;
                a0 a0Var2 = a0.a;
                if (i20 != 0) {
                }
                return a0Var2;
            case 19:
                if (cVar instanceof t) {
                    tVar = (t) cVar;
                    int i55 = tVar.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        tVar.v = i55 - Integer.MIN_VALUE;
                        Object obj31 = tVar.u;
                        b71.a aVar23 = b71.a.r;
                        i22 = tVar.v;
                        if (i22 != 0) {
                            y.j(obj31);
                            g4 X = aa1.b.X((zi0) obj);
                            tVar.v = 1;
                            if (this.s.c(X, tVar) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj31);
                        }
                        return a0.a;
                    }
                }
                tVar = new t(this, cVar);
                Object obj312 = tVar.u;
                b71.a aVar232 = b71.a.r;
                i22 = tVar.v;
                if (i22 != 0) {
                }
                return a0.a;
            case 20:
                return b(cVar, obj);
            case 21:
                return d(cVar, obj);
            case 22:
                return a((y71.i) obj, cVar);
            case 23:
                return e(cVar, obj);
            case 24:
                return f(cVar, obj);
            case 25:
                return g(cVar, obj);
            case 26:
                return h(cVar, obj);
            case 27:
                return i(cVar, obj);
            case 28:
                return j(cVar, obj);
            default:
                if (cVar instanceof ym0.a) {
                    aVar2 = (ym0.a) cVar;
                    int i56 = aVar2.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        aVar2.v = i56 - Integer.MIN_VALUE;
                        Object obj33 = aVar2.u;
                        b71.a aVar24 = b71.a.r;
                        i23 = aVar2.v;
                        if (i23 != 0) {
                            y.j(obj33);
                            zm0.m mVar = ((zm0.e) obj).b;
                            if (mVar == null || (jVar2 = mVar.b) == null) {
                                String str11 = null;
                                c11.e eVar2 = c11.e.a;
                                if (mVar != null && (iVar2 = mVar.d) != null) {
                                    List list4 = iVar2.b.a;
                                    if (list4 != null && (gVar2 = (zm0.g) m.W(list4)) != null) {
                                        str11 = gVar2.b.a;
                                    }
                                    if (str11 != null) {
                                        obj2 = new c11.b(iVar2.a, str11);
                                    }
                                    obj2 = eVar2;
                                } else if (mVar != null && (kVar7 = mVar.c) != null) {
                                    String str12 = kVar7.a;
                                    zm0.a aVar25 = kVar7.b;
                                    String str13 = aVar25.a;
                                    zm0.f fVar2 = aVar25.b;
                                    if (fVar2 == null || (list2 = fVar2.a) == null) {
                                        r6 = r.r;
                                    } else {
                                        r6 = new ArrayList();
                                        for (zm0.h hVar2 : list2) {
                                            String str14 = hVar2 != null ? hVar2.a : null;
                                            if (str14 != null) {
                                                r6.add(str14);
                                            }
                                        }
                                    }
                                    obj2 = new c11.d(str12, str13, r6);
                                    break;
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            } else {
                                obj2 = new c11.c(jVar2.a);
                            }
                            aVar2.v = 1;
                            if (this.s.c(obj2, aVar2) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj33);
                        }
                        return a0.a;
                    }
                }
                aVar2 = new ym0.a(this, cVar);
                Object obj332 = aVar2.u;
                b71.a aVar242 = b71.a.r;
                i23 = aVar2.v;
                if (i23 != 0) {
                }
                return a0.a;
        }
    }
}
