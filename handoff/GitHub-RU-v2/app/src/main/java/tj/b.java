package tj;

import d3.c0;
import d3.z;
import i50.h;
import i50.l;
import i50.u;
import is.p;
import java.util.ArrayList;
import java.util.List;
import jn0.w80;
import jn0.x80;
import jn0.y80;
import jn0.z80;
import k71.k;
import ms.i;
import ms.m;
import ms.n;
import ms.o;
import ms.v;
import u00.q;
import u10.b30;
import u10.c30;
import u10.d30;
import u10.e30;
import w61.a0;
import xj.e;
import yz0.o6;
import yz0.s7;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;

    public /* synthetic */ b(String str, int i) {
        this.r = i;
        this.s = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [xj.e] */
    public final Object k(Object obj) {
        v7.c F0;
        m mVar;
        l lVar;
        er0.m mVar2;
        switch (this.r) {
            case 0:
                String str = this.s;
                v7.a aVar = (v7.a) obj;
                k.g(aVar, "_connection");
                F0 = aVar.F0("SELECT selected_model FROM chat_threads WHERE id IS ?");
                try {
                    F0.k0(str, 1);
                    String str2 = null;
                    if (F0.B0() && !F0.isNull(0)) {
                        str2 = F0.l0(0);
                    }
                    return str2;
                } finally {
                }
            case 1:
                p pVar = (p) obj;
                k.g(pVar, "commentNode");
                u00.a aVar2 = q.Companion;
                i iVar = pVar.c;
                aVar2.getClass();
                String str3 = this.s;
                i c = u00.a.c(iVar, str3);
                o oVar = pVar.e;
                n nVar = oVar.b;
                List<m> list = nVar.b;
                ArrayList arrayList = null;
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
                    for (m mVar3 : list) {
                        if (mVar3 != null) {
                            u00.a aVar3 = q.Companion;
                            v vVar = mVar3.c;
                            aVar3.getClass();
                            mVar = new m(mVar3.a, mVar3.b, u00.a.d(vVar, str3));
                        } else {
                            mVar = null;
                        }
                        arrayList2.add(mVar);
                    }
                    arrayList = arrayList2;
                }
                return p.a(pVar, c, o.a(oVar, new n(nVar.a, arrayList)), 11);
            case 2:
                p pVar2 = (p) obj;
                k.g(pVar2, "commentNode");
                u00.a aVar4 = q.Companion;
                i iVar2 = pVar2.c;
                aVar4.getClass();
                return p.a(pVar2, u00.a.c(iVar2, this.s), null, 27);
            case 3:
                c0 c0Var = (c0) obj;
                k.g(c0Var, "$this$semantics");
                z.g(c0Var, this.s);
                return a0.a;
            case 4:
                c0 c0Var2 = (c0) obj;
                k.g(c0Var2, "$this$semantics");
                z.g(c0Var2, this.s);
                return a0.a;
            case 5:
                y60.a aVar5 = (y60.a) obj;
                k.g(aVar5, "fragment");
                return new b30(new d30(new e30(aVar5.a, new c30(this.s), y60.a.a(aVar5, false, null, 25))));
            case 6:
                String str4 = this.s;
                v7.a aVar6 = (v7.a) obj;
                k.g(aVar6, "_connection");
                F0 = aVar6.F0("SELECT last_seen FROM deeplink_hashes WHERE hash IS ?");
                try {
                    F0.k0(str4, 1);
                    Long l = null;
                    if (F0.B0() && !F0.isNull(0)) {
                        l = Long.valueOf(F0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 7:
                c0 c0Var3 = (c0) obj;
                k.g(c0Var3, "$this$clearAndSetSemantics");
                z.g(c0Var3, this.s);
                return a0.a;
            case 8:
                c0 c0Var4 = (c0) obj;
                k.g(c0Var4, "$this$clearAndSetSemantics");
                z.g(c0Var4, this.s);
                return a0.a;
            case 9:
                c0 c0Var5 = (c0) obj;
                k.g(c0Var5, "$this$clearAndSetSemantics");
                z.g(c0Var5, this.s);
                return a0.a;
            case 10:
                c0 c0Var6 = (c0) obj;
                k.g(c0Var6, "$this$semantics");
                z.g(c0Var6, this.s);
                return a0.a;
            case 11:
                e50.n nVar2 = (e50.n) obj;
                k.g(nVar2, "commentNode");
                wb0.a aVar7 = wb0.q.Companion;
                h hVar = nVar2.c;
                aVar7.getClass();
                String str5 = this.s;
                h c2 = wb0.a.c(hVar, str5);
                i50.n nVar3 = nVar2.e;
                i50.m mVar4 = nVar3.b;
                List<l> list2 = mVar4.b;
                ArrayList arrayList3 = null;
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(x61.n.F(list2, 10));
                    for (l lVar2 : list2) {
                        if (lVar2 != null) {
                            wb0.a aVar8 = wb0.q.Companion;
                            u uVar = lVar2.c;
                            aVar8.getClass();
                            lVar = new l(lVar2.a, lVar2.b, wb0.a.d(uVar, str5));
                        } else {
                            lVar = null;
                        }
                        arrayList4.add(lVar);
                    }
                    arrayList3 = arrayList4;
                }
                return e50.n.a(nVar2, c2, i50.n.a(nVar3, new i50.m(mVar4.a, arrayList3)), 11);
            case 12:
                e50.n nVar4 = (e50.n) obj;
                k.g(nVar4, "commentNode");
                wb0.a aVar9 = wb0.q.Companion;
                h hVar2 = nVar4.c;
                aVar9.getClass();
                return e50.n.a(nVar4, wb0.a.c(hVar2, this.s), null, 27);
            case 13:
                at0.a aVar10 = (at0.a) obj;
                k.g(aVar10, "fragment");
                return new w80(new y80(new z80(aVar10.a, new x80(this.s), at0.a.a(aVar10, false, (String) null, 25))));
            case 14:
                String str6 = this.s;
                v7.a aVar11 = (v7.a) obj;
                k.g(aVar11, "_connection");
                F0 = aVar11.F0("SELECT * FROM filter_bars WHERE id IS ?");
                try {
                    F0.k0(str6, 1);
                    int o = y9.a.o(F0, "id");
                    int o2 = y9.a.o(F0, "filter");
                    int o3 = y9.a.o(F0, "metadata");
                    return F0.B0() ? new e(F0.getLong(y9.a.o(F0, "timestamp")), F0.l0(o), F0.isNull(o2) ? null : F0.l0(o2), F0.l0(o3)) : null;
                } finally {
                }
            case 15:
                ar0.p pVar3 = (ar0.p) obj;
                k.g(pVar3, "commentNode");
                xy0.a aVar12 = xy0.q.Companion;
                er0.i iVar3 = pVar3.c;
                aVar12.getClass();
                return ar0.p.a(pVar3, xy0.a.c(iVar3, this.s), (er0.o) null, 27);
            case 16:
                ar0.p pVar4 = (ar0.p) obj;
                k.g(pVar4, "commentNode");
                xy0.a aVar13 = xy0.q.Companion;
                er0.i iVar4 = pVar4.c;
                aVar13.getClass();
                String str7 = this.s;
                er0.i c3 = xy0.a.c(iVar4, str7);
                er0.o oVar2 = pVar4.e;
                er0.n nVar5 = oVar2.b;
                List<er0.m> list3 = nVar5.b;
                ArrayList arrayList5 = null;
                if (list3 != null) {
                    ArrayList arrayList6 = new ArrayList(x61.n.F(list3, 10));
                    for (er0.m mVar5 : list3) {
                        if (mVar5 != null) {
                            xy0.a aVar14 = xy0.q.Companion;
                            er0.v vVar2 = mVar5.c;
                            aVar14.getClass();
                            mVar2 = new er0.m(mVar5.a, mVar5.b, xy0.a.d(vVar2, str7));
                        } else {
                            mVar2 = null;
                        }
                        arrayList6.add(mVar2);
                    }
                    arrayList5 = arrayList6;
                }
                return ar0.p.a(pVar4, c3, er0.o.a(oVar2, new er0.n(nVar5.a, arrayList5)), 11);
            case 17:
                c0 c0Var7 = (c0) obj;
                k.g(c0Var7, "$this$semantics");
                z.g(c0Var7, this.s);
                return a0.a;
            case 18:
                c0 c0Var8 = (c0) obj;
                k.g(c0Var8, "$this$clearAndSetSemantics");
                z.g(c0Var8, this.s);
                return a0.a;
            case 19:
                c0 c0Var9 = (c0) obj;
                k.g(c0Var9, "$this$semantics");
                z.n(c0Var9, this.s);
                return a0.a;
            case 20:
                w61.k kVar = (w61.k) obj;
                k.g(kVar, "it");
                return Boolean.valueOf(k.b(kVar.r, this.s));
            case 21:
                c0 c0Var10 = (c0) obj;
                k.g(c0Var10, "$this$semantics");
                z.g(c0Var10, this.s);
                return a0.a;
            case 22:
                c0 c0Var11 = (c0) obj;
                k.g(c0Var11, "$this$semantics");
                z.g(c0Var11, this.s);
                return a0.a;
            case 23:
                c0 c0Var12 = (c0) obj;
                k.g(c0Var12, "$this$clearAndSetSemantics");
                z.g(c0Var12, this.s);
                return a0.a;
            case 24:
                c0 c0Var13 = (c0) obj;
                k.g(c0Var13, "$this$semantics");
                z.g(c0Var13, this.s);
                return a0.a;
            default:
                o6 o6Var = (s7) obj;
                if ((o6Var instanceof o6) && k.b(o6Var.a.getId(), this.s)) {
                    return null;
                }
                return o6Var;
        }
    }
}
