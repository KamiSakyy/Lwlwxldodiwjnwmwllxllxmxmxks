package com.github.rudroid.templates;

import android.content.Intent;
import android.net.Uri;
import com.github.rudroid.activities.p2;
import com.github.rudroid.createissue.CreateIssueComposeActivity;
import com.github.rudroid.templates.IssueTemplatesActivity;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.MobileSubjectType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import le.p;
import sy.y;
import w61.a0;
import yz0.j5;

@c71.e(c = "com.github.rudroid.templates.IssueTemplatesActivity$onCreate$3", f = "IssueTemplatesActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ IssueTemplatesActivity w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(IssueTemplatesActivity issueTemplatesActivity, a71.c cVar) {
        super(2, cVar);
        this.w = issueTemplatesActivity;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        e eVar = new e(this.w, cVar);
        eVar.v = obj;
        return eVar;
    }

    public final Object s(Object obj, Object obj2) {
        e r = r((a71.c) obj2, (g1) obj);
        a0 a0Var = a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        g1 g1Var = (g1) this.v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        IssueTemplatesActivity.a aVar2 = IssueTemplatesActivity.Companion;
        u uVar = (u) g1Var.getData();
        ArrayList arrayList = uVar != null ? uVar.a : x61.r.r;
        p2 p2Var = this.w;
        g gVar = p2Var.w0;
        if (gVar == null) {
            k71.k.m("dataAdapter");
            throw null;
        }
        ArrayList arrayList2 = gVar.e;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        gVar.n();
        int i = 0;
        p2Var.J0().P.r(h1.i(g1Var), p2Var, new d(p2Var, 0), new com.github.rudroid.views.listemptystate.h(2131952356, 28, 2131952357));
        Map map = p2Var.Q0().z;
        if (map != null) {
            u uVar2 = (u) g1Var.getData();
            String str = uVar2 != null ? uVar2.b : null;
            String str2 = (String) map.get("template");
            if (str2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof p.c) {
                        arrayList3.add(obj2);
                    }
                }
                int size = arrayList3.size();
                while (i < size) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    p.c cVar = (p.c) obj3;
                    j5 j5Var = cVar.c;
                    if ((j5Var instanceof j5) && k71.k.b(j5Var.w, str2)) {
                        Map map2 = p2Var.Q0().z;
                        p2Var.R0(cVar, map2 != null ? (String) map2.get("title") : null);
                    }
                }
            }
            String str3 = (String) map.get("title");
            String str4 = (String) map.get("body");
            if (str != null && (str3 != null || str4 != null)) {
                CreateIssueComposeActivity.a aVar3 = CreateIssueComposeActivity.Companion;
                String P0 = p2Var.P0();
                String O0 = p2Var.O0();
                com.github.rudroid.activities.util.g gVar2 = p2Var.A0;
                r71.e[] eVarArr = IssueTemplatesActivity.C0;
                ec.c cVar2 = new ec.c(new fc.a(str, P0, O0, (String) gVar2.c(p2Var, eVarArr[2]), str3, str4, (Uri) null, (String) null, (List) null, (List) null, (IssueType) null, 1984), (MobileSubjectType) p2Var.B0.c(p2Var, eVarArr[3]), p2Var.w0().d().f(com.github.rudroid.common.a.D), 2);
                aVar3.getClass();
                Intent a = CreateIssueComposeActivity.a.a(p2Var, cVar2);
                a.addFlags(33554432);
                p2Var.u0(a, p2Var.s0());
                p2Var.finish();
            }
        }
        return a0.a;
    }
    public Object u = null;
}
