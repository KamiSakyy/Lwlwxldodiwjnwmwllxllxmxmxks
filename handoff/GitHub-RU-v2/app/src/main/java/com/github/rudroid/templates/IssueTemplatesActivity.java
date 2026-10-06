package com.github.rudroid.templates;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.l1;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.rudroid.activities.p2;
import com.github.rudroid.createissue.CreateIssueComposeActivity;
import com.github.rudroid.interfaces.x;
import com.github.rudroid.m0;
import com.github.rudroid.templates.l;
import com.github.rudroid.utilities.i1;
import com.github.rudroid.utilities.w0;
import com.github.rudroid.views.UiStateRecyclerView;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.MobileSubjectType;
import com.google.android.material.appbar.AppBarLayout;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import le.p;
import sy.d0Shadow;
import yz0.f5;
import yz0.g5;
import yz0.h5;
import yz0.i5;
import yz0.j5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class IssueTemplatesActivity extends com.github.rudroid.templates.b<ic.u> implements x {
    public static final /* synthetic */ r71.e[] C0 = {new k71.p(IssueTemplatesActivity.class, "repoName", "getRepoName()Ljava/lang/String;", 0), m0.q(k71.xShadow.a, IssueTemplatesActivity.class, "repoOwner", "getRepoOwner()Ljava/lang/String;", 0), new k71.p(IssueTemplatesActivity.class, "parentIssueId", "getParentIssueId()Ljava/lang/String;", 0), new k71.p(IssueTemplatesActivity.class, "navigationSource", "getNavigationSource()Lcom/github/service/models/response/type/MobileSubjectType;", 0)};
    public static final a Companion = new a();
    public com.github.rudroid.activities.util.g A0;
    public com.github.rudroid.activities.util.g B0;
    public int v0;
    public g w0;
    public l1 x0;
    public com.github.rudroid.activities.util.g y0;
    public com.github.rudroid.activities.util.g z0;

    public static final class a {
        public static Intent a(a aVar, Context context, String str, String str2, LinkedHashMap linkedHashMap, MobileSubjectType mobileSubjectType, int i) {
            if ((i & 16) != 0) {
                linkedHashMap = x61.s.r;
            }
            if ((i & 32) != 0) {
                mobileSubjectType = null;
            }
            aVar.getClass();
            k71.k.g(context, "context");
            k71.k.g(str, "repoName");
            k71.k.g(str2, "repoOwner");
            l.a aVar2 = l.Companion;
            Intent intent = new Intent(context, (Class<?>) IssueTemplatesActivity.class);
            aVar2.getClass();
            intent.putExtra("EXTRA_REPO_OWNER", str2);
            intent.putExtra("EXTRA_REPO_NAME", str);
            intent.putExtra("EXTRA_PARENT_ISSUE_ID", (String) null);
            if (!linkedHashMap.isEmpty()) {
                intent.putExtra("EXTRA_REPO_QUERY", linkedHashMap);
            }
            intent.putExtra("EXTRA_NAVIGATION_SOURCE", (Serializable) mobileSubjectType);
            return intent;
        }
    }

    public static final class b implements j71.a {
        public b() {
        }

        public final Object a() {
            return IssueTemplatesActivity.this.f0();
        }
    }

    public static final class c implements j71.a {
        public c() {
        }

        public final Object a() {
            return IssueTemplatesActivity.this.K0();
        }
    }

    public static final class d implements j71.a {
        public d() {
        }

        public final Object a() {
            return IssueTemplatesActivity.this.g0();
        }
    }

    public IssueTemplatesActivity() {
        this.u0 = false;
        C(new com.github.rudroid.templates.a(this));
        this.v0 = 2131558439;
        this.x0 = new l1(k71.xShadow.a(l.class), new c(), new b(), new d());
        this.y0 = new com.github.rudroid.activities.util.g("EXTRA_REPO_NAME");
        this.z0 = new com.github.rudroid.activities.util.g("EXTRA_REPO_OWNER");
        this.A0 = new com.github.rudroid.activities.util.g("EXTRA_PARENT_ISSUE_ID", new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(8));
        this.B0 = new com.github.rudroid.activities.util.g("EXTRA_NAVIGATION_SOURCE", new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(8));
    }

    public final int L0() {
        return this.v0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String O0() {
        return (String) this.y0.c(this, C0[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String P0() {
        return (String) this.z0.c(this, C0[1]);
    }

    public final l Q0() {
        return (l) this.x0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    public final void R0(p.c cVar, String str) {
        Map map;
        j5 j5Var = cVar.c;
        boolean z = j5Var instanceof j5;
        com.github.rudroid.activities.util.g gVar = this.B0;
        r71.e[] eVarArr = C0;
        com.github.rudroid.activities.util.g gVar2 = this.A0;
        if (z) {
            CreateIssueComposeActivity.a aVar = CreateIssueComposeActivity.Companion;
            String str2 = cVar.d;
            String P0 = P0();
            String O0 = O0();
            String str3 = (String) gVar2.c(this, eVarArr[2]);
            String str4 = str == null ? j5Var.u : str;
            j5 j5Var2 = j5Var;
            ec.c cVar2 = new ec.c(new fc.a(str2, P0, O0, str3, str4, j5Var2.v, (Uri) null, j5Var2.s, (List) j5Var2.x, (List) j5Var2.y, j5Var2.z, 64), (MobileSubjectType) gVar.c(this, eVarArr[3]), w0().d().f(com.github.rudroid.common.a.D), 2);
            aVar.getClass();
            Intent a2 = CreateIssueComposeActivity.a.a(this, cVar2);
            a2.addFlags(33554432);
            u0(a2, s0());
            finish();
            return;
        }
        if (k71.k.b(j5Var, f5.s)) {
            CreateIssueComposeActivity.a aVar2 = CreateIssueComposeActivity.Companion;
            ec.c cVar3 = new ec.c(new fc.a(cVar.d, P0(), O0(), (String) gVar2.c(this, eVarArr[2]), (String) null, (String) null, (Uri) null, (String) null, (List) null, (List) null, (IssueType) null, 2032), (MobileSubjectType) gVar.c(this, eVarArr[3]), w0().d().f(com.github.rudroid.common.a.D), 2);
            aVar2.getClass();
            Intent a3 = CreateIssueComposeActivity.a.a(this, cVar3);
            a3.addFlags(33554432);
            u0(a3, s0());
            finish();
            return;
        }
        if (j5Var instanceof g5) {
            p2.E0(this, this, Uri.parse(((g5) j5Var).u), 8);
            return;
        }
        if (j5Var instanceof i5) {
            p2.E0(this, this, Uri.parse(((i5) j5Var).s), 8);
            return;
        }
        if (!(j5Var instanceof h5)) {
            throw new NoWhenBranchMatchedException();
        }
        Uri parse = Uri.parse(((h5) j5Var).u);
        Map map2 = Q0().z;
        if (k71.k.b(parse.getQueryParameter("template"), map2 != null ? (String) map2.get("template") : null) && (map = Q0().z) != null && !map.isEmpty()) {
            LinkedHashMap C = x61.x.C(i1.a(parse));
            Set keySet = C.keySet();
            for (Map.Entry entry : map.entrySet()) {
                if (!keySet.contains(entry.getKey())) {
                    C.put(entry.getKey(), entry.getValue());
                }
            }
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (Map.Entry entry2 : C.entrySet()) {
                clearQuery.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
            }
            parse = clearQuery.build();
            k71.k.f(parse, "build(...)");
        }
        i1.g(this, parse, null);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super/*k.i*/.onActivityResult(i, i2, intent);
        if (i == 42 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, com.github.rudroid.views.UiStateRecyclerView] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        M0(getString(2131952352), getString(2131954768, P0(), O0()));
        this.w0 = new g(this);
        Object recyclerView = J0().P.getRecyclerView();
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        g gVar = this.w0;
        if (gVar == null) {
            k71.k.m("dataAdapter");
            throw null;
        }
        UiStateRecyclerView.w0(recyclerView, d0Shadow.n(gVar), false, 4);
        AppBarLayout appBarLayout = ((k5.f) J0().N).A;
        k71.k.e(appBarLayout, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        recyclerView.u0(appBarLayout);
        J0().P.q(new com.github.rudroid.templates.d(this, 1));
        w0.a(Q0().v, this, w.t, new e(this, null));
    }

    public final void v(p.c cVar) {
        k71.k.g(cVar, "template");
        R0(cVar, null);
    }


    public static Object f0(Object... a) {
        return null;
    }

    public static Object K0(Object... a) {
        return null;
    }

    public static Object g0(Object... a) {
        return null;
    }

    public static Object C(Object... a) {
        return null;
    }

    public static Object w0(Object... a) {
        return null;
    }

    public static Object s0(Object... a) {
        return null;
    }

    public static Object setResult(Object... a) {
        return null;
    }

    public static Object getString(Object... a) {
        return null;
    }

    public static Object J0(Object... a) {
        return null;
    }

    public static Object y0(Object... a) {
        return null;
    }
    public Object getString(Object p1, Object p2, Object p3) { return null; }
    public Object y0() { return null; }
    public Object M0(Object p1, Object p2) { return null; }
    public Object u0(Object p1, Object p2) { return null; }
}
