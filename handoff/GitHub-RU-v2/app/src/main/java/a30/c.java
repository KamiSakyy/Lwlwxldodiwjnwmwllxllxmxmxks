package a30;

import a7.i;
import aa.u0;
import bo0.e;
import com.github.service.models.ApiFailureType;
import com.github.service.wrapper.j;
import f01.f;
import ga.h;
import gn0.q8;
import hc0.e8;
import in.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jn0.ld;
import jn0.lj;
import jn0.u80;
import jn0.yf0;
import jo.ib0;
import jo.ie;
import jo.mi0;
import jo.qk;
import k71.k;
import kc0.rc;
import kc0.uh;
import kc0.x40;
import kc0.yb0;
import m10.vc;
import pz0.r9;
import s01.o;
import s01.p;
import sy.f0;
import u10.jc;
import u10.sg;
import u10.y90;
import u10.z20;
import v71.v;
import x61.n;
import y71.n1;
import y71.y;
import z01.t;
import zg.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements t, y90, mi0, yb0, yf0 {
    public final /* synthetic */ int r;
    public j s;
    public com.github.service.wrapper.b t;
    public v u;
    public p v;

    public c(j jVar, com.github.service.wrapper.b bVar, v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k.g(jVar, "client");
                k.g(bVar, "cachedApolloClient");
                k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new a00.b(jVar, bVar, vVar, new bp.a(29), new e(16), o.r, new e(17), new bq.a(0), new bq.a(1), new bq.a(2), new bq.a(3), null, f0.n(r.b, ApiFailureType.NO_ROOT_COMMIT), 110592);
                break;
            case 2:
                k.g(jVar, "client");
                k.g(bVar, "cachedApolloClient");
                k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new jy.d(jVar, bVar, vVar, new q00.c(21), new py0.o(19), o.r, new py0.o(20), new q00.c(22), new q00.c(23), new q00.c(24), new q00.c(25), null, f0.n(r.b, ApiFailureType.NO_ROOT_COMMIT), 110592);
                break;
            case 3:
                k.g(jVar, "client");
                k.g(bVar, "cachedApolloClient");
                k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new sw0.c(jVar, bVar, vVar, new ze.a(8), new m(3), o.r, new m(4), new ze.a(9), new ze.a(10), new ze.a(11), new ze.a(12), (j71.e) null, f0.n(r.b, ApiFailureType.NO_ROOT_COMMIT), 110592);
                break;
            default:
                k.g(jVar, "client");
                k.g(bVar, "cachedApolloClient");
                k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new a00.b(jVar, bVar, vVar, new i(14), new a00.a(13, (byte) 0), o.r, new a00.a(14, (byte) 0), new i(15), new i(16), new i(17), new i(18), null, f0.n(r.b, ApiFailureType.NO_ROOT_COMMIT), 110592);
                break;
        }
    }

    public final y71.i a(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "owner");
                k.g(str2, "name");
                return ((a00.b) this.v).b(new b30.b(str, i, str2));
            case 1:
                k.g(str, "owner");
                k.g(str2, "name");
                return ((a00.b) this.v).b(new bq.b(str, i, str2));
            case 2:
                k.g(str, "owner");
                k.g(str2, "name");
                return ((jy.d) this.v).b(new rd0.a(str, i, str2));
            default:
                k.g(str, "owner");
                k.g(str2, "name");
                return this.v.b(new zo0.a(str, i, str2));
        }
    }

    public final Object b(String str, String str2) {
        switch (this.r) {
            case 0:
                return n1.y(r.l(new y(r.h(this.s.d(new z20(str, str2))), new b(this, str2, null, 1), 6)), this.u);
            case 1:
                return n1.y(r.l(new y(r.h(this.s.d(new ib0(str, str2))), new aq.a(this, str2, null, 1), 6)), this.u);
            case 2:
                return n1.y(r.l(new y(r.h(this.s.d(new x40(str, str2))), new qd0.a(this, str2, (a71.c) null, 1), 6)), this.u);
            default:
                return n1.y(r.l(new y(r.h(this.s.d(new u80(str, str2))), new yo0.a(this, str2, (a71.c) null, 1), 6)), this.u);
        }
    }

    public final Object c(int i, String str, String str2, String str3, List list) {
        switch (this.r) {
            case 0:
                ArrayList arrayList = new ArrayList(n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    k.g(fVar, "<this>");
                    arrayList.add(new e8(fVar.b, fVar.a));
                }
                return n1.y(r.l(new y(com.github.service.wrapper.a.o(this.t, new jc(str, str2, i, str3, new u0(arrayList)), (h) null, false, (LinkedHashSet) null, (Set) null, 58), new a(this, str, str2, i, str3, null, 0), 6)), this.u);
            case 1:
                ArrayList arrayList2 = new ArrayList(n.F(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    f fVar2 = (f) it2.next();
                    k.g(fVar2, "<this>");
                    arrayList2.add(new vc(fVar2.b, fVar2.a));
                }
                return n1.y(r.l(new y(com.github.service.wrapper.a.o(this.t, new ie(str, str2, i, str3, new u0(arrayList2)), (h) null, false, (LinkedHashSet) null, (Set) null, 58), new a(this, str, str2, i, str3, null, 1), 6)), this.u);
            case 2:
                ArrayList arrayList3 = new ArrayList(n.F(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    f fVar3 = (f) it3.next();
                    k.g(fVar3, "<this>");
                    arrayList3.add(new q8(fVar3.b, fVar3.a));
                }
                return n1.y(r.l(new y(com.github.service.wrapper.a.o(this.t, new rc(str, str2, i, str3, new u0(arrayList3)), (h) null, false, (LinkedHashSet) null, (Set) null, 58), new a(this, str, str2, i, str3, null, 2), 6)), this.u);
            default:
                ArrayList arrayList4 = new ArrayList(n.F(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    f fVar4 = (f) it4.next();
                    k.g(fVar4, "<this>");
                    arrayList4.add(new r9(fVar4.b, fVar4.a));
                }
                return n1.y(r.l(new y(com.github.service.wrapper.a.o(this.t, new ld(str, str2, i, str3, new u0(arrayList4)), (h) null, false, (LinkedHashSet) null, (Set) null, 58), new a(this, str, str2, i, str3, null, 3), 6)), this.u);
        }
    }

    public final Object d(String str, String str2) {
        switch (this.r) {
            case 0:
                return n1.y(r.l(new y(r.h(this.s.d(new sg(str, str2))), new b(this, str2, null, 0), 6)), this.u);
            case 1:
                return n1.y(r.l(new y(r.h(this.s.d(new qk(str, str2))), new aq.a(this, str2, null, 0), 6)), this.u);
            case 2:
                return n1.y(r.l(new y(r.h(this.s.d(new uh(str, str2))), new qd0.a(this, str2, (a71.c) null, 0), 6)), this.u);
            default:
                return n1.y(r.l(new y(r.h(this.s.d(new lj(str, str2))), new yo0.a(this, str2, (a71.c) null, 0), 6)), this.u);
        }
    }

    public final y71.i e(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "owner");
                k.g(str2, "name");
                return ((a00.b) this.v).h(new b30.b(str, i, str2));
            case 1:
                k.g(str, "owner");
                k.g(str2, "name");
                return ((a00.b) this.v).h(new bq.b(str, i, str2));
            case 2:
                k.g(str, "owner");
                k.g(str2, "name");
                return ((jy.d) this.v).h(new rd0.a(str, i, str2));
            default:
                k.g(str, "owner");
                k.g(str2, "name");
                return this.v.h(new zo0.a(str, i, str2));
        }
    }

    public final y71.i f(String str, int i, String str2) {
        switch (this.r) {
            case 0:
                k.g(str, "owner");
                k.g(str2, "name");
                return ((a00.b) this.v).e(new b30.b(str, i, str2));
            case 1:
                k.g(str, "owner");
                k.g(str2, "name");
                return ((a00.b) this.v).e(new bq.b(str, i, str2));
            case 2:
                k.g(str, "owner");
                k.g(str2, "name");
                return ((jy.d) this.v).e(new rd0.a(str, i, str2));
            default:
                k.g(str, "owner");
                k.g(str2, "name");
                return this.v.e(new zo0.a(str, i, str2));
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
    public Object j(Object p1) { return null; }
    public Object v(Object p1) { return null; }
    public Object v(Object p1) { return null; }
}
