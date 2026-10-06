package com.github.rudroid.uitoolkit.listitems;

import com.github.rudroid.viewmodels.l0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class z implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;

    public /* synthetic */ z(String str, int i) {
        this.r = i;
        this.s = str;
    }

    public final Object k(Object obj) {
        v7.c F0;
        switch (this.r) {
            case 0:
                d3.c0 c0Var = (d3.c0) obj;
                k71.k.g(c0Var, "$this$semantics");
                d3.z.g(c0Var, this.s);
                return w61.a0.a;
            case 1:
                d3.c0 c0Var2 = (d3.c0) obj;
                k71.k.g(c0Var2, "$this$clearAndSetSemantics");
                d3.z.g(c0Var2, this.s);
                return w61.a0.a;
            case 2:
                d3.c0 c0Var3 = (d3.c0) obj;
                k71.k.g(c0Var3, "$this$semantics");
                d3.z.g(c0Var3, this.s);
                return w61.a0.a;
            case 3:
                d3.c0 c0Var4 = (d3.c0) obj;
                k71.k.g(c0Var4, "$this$semantics");
                d3.z.g(c0Var4, this.s);
                return w61.a0.a;
            case 4:
                d3.c0 c0Var5 = (d3.c0) obj;
                k71.k.g(c0Var5, "$this$clearAndSetSemantics");
                d3.z.g(c0Var5, this.s);
                d3.z.i(c0Var5, 0);
                return w61.a0.a;
            case 5:
                d3.c0 c0Var6 = (d3.c0) obj;
                k71.k.g(c0Var6, "$this$clearAndSetSemantics");
                d3.z.g(c0Var6, this.s);
                d3.z.i(c0Var6, 0);
                return w61.a0.a;
            case 6:
                l0.b bVar = (l0.b) obj;
                k71.k.g(bVar, "state");
                return l0.b.a(bVar, this.s, false, 6);
            case 7:
                List list = (List) obj;
                k71.k.g(list, "list");
                return com.github.rudroid.viewmodels.notifications.g.e(list, sy.f0.r(this.s));
            case 8:
                List list2 = (List) obj;
                k71.k.g(list2, "list");
                return com.github.rudroid.viewmodels.notifications.g.c(list2, sy.f0.r(this.s));
            case 9:
                List list3 = (List) obj;
                k71.k.g(list3, "list");
                return com.github.rudroid.viewmodels.notifications.g.i(list3, sy.f0.r(this.s));
            case 10:
                List list4 = (List) obj;
                k71.k.g(list4, "list");
                return com.github.rudroid.viewmodels.notifications.g.f(list4, sy.f0.r(this.s));
            case 11:
                List list5 = (List) obj;
                k71.k.g(list5, "list");
                return com.github.rudroid.viewmodels.notifications.g.b(list5, sy.f0.r(this.s));
            case 12:
                List list6 = (List) obj;
                k71.k.g(list6, "list");
                return com.github.rudroid.viewmodels.notifications.g.h(list6, sy.f0.r(this.s));
            case 13:
                List list7 = (List) obj;
                k71.k.g(list7, "list");
                return com.github.rudroid.viewmodels.notifications.g.g(list7, sy.f0.r(this.s));
            case 14:
                List list8 = (List) obj;
                k71.k.g(list8, "list");
                return com.github.rudroid.viewmodels.notifications.g.d(list8, sy.f0.r(this.s));
            case 15:
                return com.github.rudroid.viewmodels.notifications.g.b((List) obj, sy.f0.r(this.s));
            case 16:
                return com.github.rudroid.viewmodels.notifications.g.c((List) obj, sy.f0.r(this.s));
            case 17:
                return com.github.rudroid.viewmodels.notifications.g.d((List) obj, sy.f0.r(this.s));
            case 18:
                return com.github.rudroid.viewmodels.notifications.g.f((List) obj, sy.f0.r(this.s));
            case 19:
                return com.github.rudroid.viewmodels.notifications.g.g((List) obj, sy.f0.r(this.s));
            case 20:
                return com.github.rudroid.viewmodels.notifications.g.h((List) obj, sy.f0.r(this.s));
            case 21:
                List<le.s> list9 = (List) obj;
                ArrayList arrayList = new ArrayList(x61.n.F(list9, 10));
                for (le.s sVar : list9) {
                    if (k71.k.b(sVar.j.c(), this.s)) {
                        sVar = le.s.a(sVar, false, false, false, (le.a0) null, 65527);
                    }
                    arrayList.add(sVar);
                }
                return arrayList;
            case 22:
                return com.github.rudroid.viewmodels.notifications.g.e((List) obj, sy.f0.r(this.s));
            case 23:
                return com.github.rudroid.viewmodels.notifications.g.i((List) obj, sy.f0.r(this.s));
            case 24:
                String str = this.s;
                v7.a aVar = (v7.a) obj;
                k71.k.g(aVar, "_connection");
                F0 = aVar.F0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    F0.k0(str, 1);
                    boolean z = F0.B0() ? ((int) F0.getLong(0)) != 0 : false;
                    F0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 25:
                String str2 = this.s;
                v7.a aVar2 = (v7.a) obj;
                k71.k.g(aVar2, "_connection");
                F0 = aVar2.F0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    F0.k0(str2, 1);
                    ArrayList arrayList2 = new ArrayList();
                    while (F0.B0()) {
                        arrayList2.add(F0.l0(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 26:
                String str3 = this.s;
                v7.a aVar3 = (v7.a) obj;
                k71.k.g(aVar3, "_connection");
                F0 = aVar3.F0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    F0.k0(str3, 1);
                    boolean z2 = F0.B0() ? ((int) F0.getLong(0)) != 0 : false;
                    F0.close();
                    return Boolean.valueOf(z2);
                } finally {
                }
            case 27:
                String str4 = this.s;
                v7.a aVar4 = (v7.a) obj;
                k71.k.g(aVar4, "_connection");
                F0 = aVar4.F0("SELECT long_value FROM Preference where `key`=?");
                try {
                    F0.k0(str4, 1);
                    Long l = null;
                    if (F0.B0() && !F0.isNull(0)) {
                        l = Long.valueOf(F0.getLong(0));
                    }
                    return l;
                } finally {
                }
            case 28:
                String str5 = this.s;
                v7.a aVar5 = (v7.a) obj;
                k71.k.g(aVar5, "_connection");
                F0 = aVar5.F0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    F0.k0(str5, 1);
                    F0.B0();
                    F0.close();
                    return w61.a0.a;
                } finally {
                }
            default:
                String str6 = this.s;
                v7.a aVar6 = (v7.a) obj;
                k71.k.g(aVar6, "_connection");
                F0 = aVar6.F0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    F0.k0(str6, 1);
                    ArrayList arrayList3 = new ArrayList();
                    while (F0.B0()) {
                        arrayList3.add(F0.l0(0));
                    }
                    return arrayList3;
                } finally {
                }
        }
    }
    public Object a(Object p1, Object p2, Object p3, Object p4, int p5) { return null; }
}
