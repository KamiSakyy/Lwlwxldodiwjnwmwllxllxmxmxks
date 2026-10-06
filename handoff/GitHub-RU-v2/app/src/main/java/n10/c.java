package n10;

import a0.s0;
import a5.g1;
import aa.u0;
import aa.w;
import ea.e;
import ea.f;
import java.util.Iterator;
import jo.f4;
import k71.k;
import m10.ac0;
import m10.d80;
import m10.dg0;
import m10.if0;
import m10.lf0;
import m10.sa0;
import m10.td0;
import m10.wg0;
import m10.y70;
import m10.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final c b = new c(0);
    public static final c c = new c(1);
    public static final c d = new c(2);
    public static final c e = new c(3);
    public static final c f = new c(4);
    public static final c g = new c(5);
    public static final c h = new c(6);
    public static final c i = new c(7);
    public static final c j = new c(8);
    public static final c k = new c(9);
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i2) {
        this.a = i2;
    }

    public final Object a(e eVar, w wVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        switch (this.a) {
            case 0:
                String g2 = s0.g(eVar, "reader", wVar, "customScalarAdapters");
                y70.Companion.getClass();
                g1 it = y70.z.iterator();
                while (true) {
                    g1 g1Var = it;
                    if (g1Var.hasNext()) {
                        obj = g1Var.next();
                        if (((y70) obj).r.equals(g2)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                y70 y70Var = (y70) obj;
                return y70Var == null ? y70.x : y70Var;
            case 1:
                throw s0.e(eVar, "reader", wVar, "customScalarAdapters", "Input type used in output position");
            case 2:
                throw s0.e(eVar, "reader", wVar, "customScalarAdapters", "Input type used in output position");
            case 3:
                String g3 = s0.g(eVar, "reader", wVar, "customScalarAdapters");
                ya0.Companion.getClass();
                Iterator it2 = ya0.A.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((ya0) obj2).r.equals(g3)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ya0 ya0Var = (ya0) obj2;
                return ya0Var == null ? ya0.y : ya0Var;
            case 4:
                String g4 = s0.g(eVar, "reader", wVar, "customScalarAdapters");
                ac0.Companion.getClass();
                Iterator it3 = ac0.x.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (((ac0) obj3).r.equals(g4)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                ac0 ac0Var = (ac0) obj3;
                return ac0Var == null ? ac0.v : ac0Var;
            case 5:
                throw s0.e(eVar, "reader", wVar, "customScalarAdapters", "Input type used in output position");
            case 6:
                throw s0.e(eVar, "reader", wVar, "customScalarAdapters", "Input type used in output position");
            case 7:
                throw s0.e(eVar, "reader", wVar, "customScalarAdapters", "Input type used in output position");
            case 8:
                String g5 = s0.g(eVar, "reader", wVar, "customScalarAdapters");
                dg0.Companion.getClass();
                g1 it4 = dg0.C.iterator();
                while (true) {
                    g1 g1Var2 = it4;
                    if (g1Var2.hasNext()) {
                        obj4 = g1Var2.next();
                        if (((dg0) obj4).r.equals(g5)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                dg0 dg0Var = (dg0) obj4;
                return dg0Var == null ? dg0.A : dg0Var;
            default:
                throw s0.e(eVar, "reader", wVar, "customScalarAdapters", "Input type used in output position");
        }
    }

    public final void b(f fVar, w wVar, Object obj) {
        switch (this.a) {
            case 0:
                y70 y70Var = (y70) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(y70Var, "value");
                fVar.I(y70Var.r);
                break;
            case 1:
                d80 d80Var = (d80) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(d80Var, "value");
                u0 u0Var = d80Var.a;
                if (u0Var instanceof u0) {
                    fVar.z0("clientMutationId");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
                }
                fVar.z0("shortcuts");
                aa.c.a(aa.c.c(b.C, false)).e(fVar, wVar, d80Var.b);
                break;
            case 2:
                sa0 sa0Var = (sa0) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(sa0Var, "value");
                u0 u0Var2 = sa0Var.a;
                if (u0Var2 instanceof u0) {
                    fVar.z0("clientMutationId");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
                    break;
                }
                break;
            case 3:
                ya0 ya0Var = (ya0) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(ya0Var, "value");
                fVar.I(ya0Var.r);
                break;
            case 4:
                ac0 ac0Var = (ac0) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(ac0Var, "value");
                fVar.I(ac0Var.r);
                break;
            case 5:
                td0 td0Var = (td0) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(td0Var, "value");
                u0 u0Var3 = td0Var.h;
                u0 u0Var4 = td0Var.g;
                u0 u0Var5 = td0Var.f;
                u0 u0Var6 = td0Var.e;
                u0 u0Var7 = td0Var.d;
                u0 u0Var8 = td0Var.c;
                u0 u0Var9 = td0Var.b;
                u0 u0Var10 = td0Var.a;
                if (u0Var10 instanceof u0) {
                    fVar.z0("clientMutationId");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var10);
                }
                if (u0Var9 instanceof u0) {
                    fVar.z0("color");
                    aa.c.d(aa.c.b(b.D)).d(fVar, wVar, u0Var9);
                }
                if (u0Var8 instanceof u0) {
                    fVar.z0("description");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var8);
                }
                if (u0Var7 instanceof u0) {
                    fVar.z0("icon");
                    aa.c.d(aa.c.b(b.E)).d(fVar, wVar, u0Var7);
                }
                if (u0Var6 instanceof u0) {
                    fVar.z0("name");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var6);
                }
                if (u0Var5 instanceof u0) {
                    fVar.z0("query");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var5);
                }
                if (u0Var4 instanceof u0) {
                    fVar.z0("scopingRepository");
                    aa.c.d(aa.c.b(aa.c.c(b.y, false))).d(fVar, wVar, u0Var4);
                }
                if (u0Var3 instanceof u0) {
                    fVar.z0("searchType");
                    aa.c.d(aa.c.b(b)).d(fVar, wVar, u0Var3);
                }
                fVar.z0("shortcutId");
                aa.c.a.b(fVar, wVar, td0Var.i);
                break;
            case 6:
                if0 if0Var = (if0) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(if0Var, "value");
                u0 u0Var11 = if0Var.e;
                u0 u0Var12 = if0Var.c;
                u0 u0Var13 = if0Var.b;
                u0 u0Var14 = if0Var.a;
                if (u0Var14 instanceof u0) {
                    fVar.z0("clientMutationId");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var14);
                }
                if (u0Var13 instanceof u0) {
                    fVar.z0("description");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var13);
                }
                if (u0Var12 instanceof u0) {
                    fVar.z0("isPrivate");
                    aa.c.d(aa.c.k).d(fVar, wVar, u0Var12);
                }
                fVar.z0("listId");
                aa.c.a.b(fVar, wVar, if0Var.d);
                if (u0Var11 instanceof u0) {
                    fVar.z0("name");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var11);
                    break;
                }
                break;
            case 7:
                lf0 lf0Var = (lf0) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(lf0Var, "value");
                u0 u0Var15 = lf0Var.d;
                u0 u0Var16 = lf0Var.a;
                if (u0Var16 instanceof u0) {
                    fVar.z0("clientMutationId");
                    aa.c.d(aa.c.i).d(fVar, wVar, u0Var16);
                }
                fVar.z0("itemId");
                aa.b bVar = aa.c.a;
                bVar.b(fVar, wVar, lf0Var.b);
                fVar.z0("listIds");
                aa.c.a(bVar).e(fVar, wVar, lf0Var.c);
                if (u0Var15 instanceof u0) {
                    f4.e(fVar, "suggestedListIds", bVar).d(fVar, wVar, u0Var15);
                    break;
                }
                break;
            case 8:
                dg0 dg0Var = (dg0) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(dg0Var, "value");
                fVar.I(dg0Var.r);
                break;
            default:
                wg0 wg0Var = (wg0) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(wg0Var, "value");
                fVar.z0("titleId");
                aa.b bVar2 = aa.c.a;
                bVar2.b(fVar, wVar, wg0Var.a);
                fVar.z0("value");
                bVar2.b(fVar, wVar, wg0Var.b);
                break;
        }
    }
    public static final Object i = null;
    public Object C = null;
    public Object D = null;
    public Object E = null;
    public Object y = null;
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
    public Object g(Object, Object) { return null; }
}
