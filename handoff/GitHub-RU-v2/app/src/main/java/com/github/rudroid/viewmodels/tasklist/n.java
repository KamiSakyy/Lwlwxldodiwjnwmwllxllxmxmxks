package com.github.rudroid.viewmodels.tasklist;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.webview.viewholders.GitHubWebView;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import v71.a0;
import v71.b0;
import y71.h1;
import y71.n1;
import y71.y1;
import yz0.d0;
import yz0.e0;
import yz0.g0;
import yz0.h0;
import yz0.i0;
import yz0.k0;
import yz0.l0;
import yz0.m0;
import yz0.o0;
import yz0.p0;
import yz0.q0;
import yz0.u;
import yz0.v;
import yz0.w;
import yz0.x;
import yz0.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n extends k1 {
    public y00.l A;
    public an.f s;
    public an.k t;
    public an.j u;
    public an.c v;
    public an.e w;
    public com.github.rudroid.activities.util.c x;
    public y1 y;
    public LinkedHashMap z;

    public n(an.f fVar, an.k kVar, an.j jVar, an.c cVar, an.e eVar, com.github.rudroid.activities.util.c cVar2) {
        k71.k.g(fVar, "checkIssueBodyTaskUseCase");
        k71.k.g(kVar, "checkPullRequestBodyTaskUseCase");
        k71.k.g(jVar, "checkIssueOrPullRequestCommentTaskUseCase");
        k71.k.g(cVar, "checkDiscussionBodyTaskUseCase");
        k71.k.g(eVar, "checkDiscussionCommentTaskUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.s = fVar;
        this.t = kVar;
        this.u = jVar;
        this.v = cVar;
        this.w = eVar;
        this.x = cVar2;
        y1 c = n1.c((Object) null);
        this.y = c;
        this.z = new LinkedHashMap();
        this.A = new y00.l(new h1(c), 10);
    }

    public final void P(a aVar, int i, boolean z) {
        String str = aVar.a;
        q0 q0Var = aVar.b;
        boolean z2 = q0Var instanceof yz0.t;
        y1 y1Var = this.y;
        LinkedHashMap linkedHashMap = this.z;
        if (z2) {
            String str2 = aVar.c;
            linkedHashMap.put(str, new GitHubWebView.f(i, z));
            fl.e eVar = fl.f.Companion;
            b bVar = new b(null, str);
            eVar.getClass();
            fl.f b = fl.e.b(bVar);
            y1Var.getClass();
            y1Var.k((Object) null, b);
            b0.z(d1.k(this), (a71.h) null, (a0) null, new e(this, str, str2, i, z, null), 3);
            return;
        }
        if (q0Var instanceof u) {
            String str3 = aVar.c;
            linkedHashMap.put(str, new GitHubWebView.f(i, z));
            fl.e eVar2 = fl.f.Companion;
            b bVar2 = new b(null, str);
            eVar2.getClass();
            fl.f b2 = fl.e.b(bVar2);
            y1Var.getClass();
            y1Var.k((Object) null, b2);
            b0.z(d1.k(this), (a71.h) null, (a0) null, new g(this, str, str3, i, z, null), 3);
            return;
        }
        if (q0Var instanceof yz0.a0) {
            String str4 = aVar.c;
            linkedHashMap.put(str, new GitHubWebView.f(i, z));
            fl.e eVar3 = fl.f.Companion;
            b bVar3 = new b(null, str);
            eVar3.getClass();
            fl.f b3 = fl.e.b(bVar3);
            y1Var.getClass();
            y1Var.k((Object) null, b3);
            b0.z(d1.k(this), (a71.h) null, (a0) null, new i(this, str, str4, i, z, null), 3);
            return;
        }
        if (q0Var instanceof yz0.b0) {
            String str5 = aVar.c;
            linkedHashMap.put(str, new GitHubWebView.f(i, z));
            fl.e eVar4 = fl.f.Companion;
            b bVar4 = new b(null, str);
            eVar4.getClass();
            fl.f b4 = fl.e.b(bVar4);
            y1Var.getClass();
            y1Var.k((Object) null, b4);
            b0.z(d1.k(this), (a71.h) null, (a0) null, new m(this, str, str5, i, z, null), 3);
            return;
        }
        if (q0Var instanceof d0) {
            String str6 = aVar.c;
            linkedHashMap.put(str, new GitHubWebView.f(i, z));
            fl.e eVar5 = fl.f.Companion;
            b bVar5 = new b(null, str);
            eVar5.getClass();
            fl.f b5 = fl.e.b(bVar5);
            y1Var.getClass();
            y1Var.k((Object) null, b5);
            b0.z(d1.k(this), (a71.h) null, (a0) null, new k(this, str, str6, i, z, null), 3);
            return;
        }
        if (!(q0Var instanceof v) && !(q0Var instanceof w) && !(q0Var instanceof x) && !(q0Var instanceof y) && !(q0Var instanceof k0) && !(q0Var instanceof e0) && !(q0Var instanceof g0) && !(q0Var instanceof h0) && !(q0Var instanceof i0) && !(q0Var instanceof l0) && !(q0Var instanceof m0) && !(q0Var instanceof o0) && !k71.k.b(q0Var, p0.s)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean Q(String str, q0 q0Var) {
        k71.k.g(str, "id");
        k71.k.g(q0Var, "type");
        if (this.z.keySet().contains(str)) {
            return false;
        }
        return (q0Var instanceof yz0.a0) || (q0Var instanceof yz0.b0) || (q0Var instanceof d0) || (q0Var instanceof yz0.t) || (q0Var instanceof u);
    }
}
