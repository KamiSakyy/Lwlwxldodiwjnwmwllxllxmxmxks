package aq;

import aa.u0;
import androidx.compose.runtime.f3;
import com.github.service.models.ApiFailureType;
import com.github.service.wrapper.j;
import f01.f;
import ga.h;
import in.r;
import j71.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jn0.u6;
import jn0.yf0;
import jo.e7;
import jo.mi0;
import k71.k;
import m10.vc;
import pz0.r9;
import s01.o;
import s01.p;
import sy.f0;
import v71.v;
import x61.n;
import y71.i;
import y71.n1;
import y71.y;
import z01.x0;
import zg.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements x0, mi0, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.b s;
    public final v t;
    public final p u;

    public d(j jVar, com.github.service.wrapper.b bVar, v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k.g(jVar, "client");
                k.g(bVar, "cachedApolloClient");
                k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                this.u = new sw0.c(jVar, bVar, vVar, new ze.a(13), new m(5), o.r, new m(6), new ze.a(14), new ze.a(15), new ze.a(16), new ze.a(17), (e) null, f0.n(r.b, ApiFailureType.NO_ROOT_COMMIT), 110592);
                break;
            default:
                k.g(jVar, "client");
                k.g(bVar, "cachedApolloClient");
                k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                this.u = new a00.b(jVar, bVar, vVar, new bq.a(4), new bo0.e(18), o.r, new bo0.e(19), new bq.a(5), new bq.a(6), new bq.a(7), new bq.a(8), null, f0.n(r.b, ApiFailureType.NO_ROOT_COMMIT), 110592);
                break;
        }
    }

    public final i a(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return ((a00.b) this.u).e(new bq.c(str, str2, str3, str4));
            default:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return this.u.e(new zo0.b(str, str2, str3, str4));
        }
    }

    public final i b(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return ((a00.b) this.u).b(new bq.c(str, str2, str3, str4));
            default:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return this.u.b(new zo0.b(str, str2, str3, str4));
        }
    }

    public final Object c(String str, String str2, String str3, String str4, String str5, List list) {
        switch (this.r) {
            case 0:
                ArrayList arrayList = new ArrayList(n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    k.g(fVar, "<this>");
                    arrayList.add(new vc(fVar.b, fVar.a));
                }
                return n1.y(new c(new y(com.github.service.wrapper.a.o(this.s, new e7(str, str2, str3, str4, str5, new u0(arrayList)), (h) null, false, (LinkedHashSet) null, (Set) null, 58), new f3(this, str, str2, str3, str4, str5, (a71.c) null, 1), 6), 0), this.t);
            default:
                ArrayList arrayList2 = new ArrayList(n.F(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    f fVar2 = (f) it2.next();
                    k.g(fVar2, "<this>");
                    arrayList2.add(new r9(fVar2.b, fVar2.a));
                }
                return n1.y(new tw0.i(new y(com.github.service.wrapper.a.o(this.s, new u6(str, str2, str3, str4, str5, new u0(arrayList2)), (h) null, false, (LinkedHashSet) null, (Set) null, 58), new f3(this, str, str2, str3, str4, str5, (a71.c) null, 11), 6), 21), this.t);
        }
    }

    public final i d(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return ((a00.b) this.u).h(new bq.c(str, str2, str3, str4));
            default:
                k.g(str, "ownerName");
                k.g(str2, "repoName");
                k.g(str3, "baseRefName");
                k.g(str4, "headRefName");
                return this.u.h(new zo0.b(str, str2, str3, str4));
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
