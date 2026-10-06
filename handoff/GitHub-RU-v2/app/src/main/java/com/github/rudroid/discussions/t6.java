package com.github.rudroid.discussions;

import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.rudroid.discussions.s6;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class t6 extends androidx.lifecycle.k1 implements com.github.rudroid.viewmodels.v3 {
    public static final a Companion = new a();
    public LinkedHashSet A;
    public v71.q1 B;
    public x01.i C;

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f11818s;

    /* renamed from: t, reason: collision with root package name */
    public ik.n f11819t;

    /* renamed from: u, reason: collision with root package name */
    public String f11820u;

    /* renamed from: v, reason: collision with root package name */
    public String f11821v;

    /* renamed from: w, reason: collision with root package name */
    public DiscussionCategoryData f11822w;

    /* renamed from: x, reason: collision with root package name */
    public y71.y1 f11823x;

    /* renamed from: y, reason: collision with root package name */
    public y71.i1 f11824y;

    /* renamed from: z, reason: collision with root package name */
    public DiscussionCategoryData f11825z;

    public static final class a {
    }

    public t6(com.github.rudroid.activities.util.c cVar, ik.n nVar, androidx.lifecycle.a1 a1Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(nVar, "fetchDiscussionCategoriesUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        this.f11818s = cVar;
        this.f11819t = nVar;
        String str = (String) a1Var.a("repoOwner");
        if (str == null) {
            throw new IllegalStateException("repo owner must be set");
        }
        this.f11820u = str;
        String str2 = (String) a1Var.a("repoName");
        if (str2 == null) {
            throw new IllegalStateException("repo name must be set");
        }
        this.f11821v = str2;
        DiscussionCategoryData discussionCategoryData = (DiscussionCategoryData) a1Var.a("originalSelectedCategory");
        if (discussionCategoryData == null) {
            throw new IllegalStateException("original selected category must be set");
        }
        this.f11822w = discussionCategoryData;
        y71.y1 s2 = com.github.rudroid.m0.s(fl.f.Companion, null);
        this.f11823x = s2;
        this.f11824y = new y71.i1(s2);
        this.f11825z = discussionCategoryData;
        this.A = new LinkedHashSet();
        x01.i.Companion.getClass();
        this.C = x01.i.d;
    }

    public final void D() {
        String str = this.C.b;
        v71.q1 q1Var = this.B;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.B = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new w6(this, str, null), 3);
    }

    public final ArrayList P() {
        ArrayList arrayList = new ArrayList();
        DiscussionCategoryData discussionCategoryData = this.f11825z;
        DiscussionCategoryData discussionCategoryData2 = this.f11822w;
        arrayList.add(new s6.a(discussionCategoryData2, k71.k.b(discussionCategoryData2, discussionCategoryData)));
        LinkedHashSet<DiscussionCategoryData> k10 = sy.f0.k(this.A, discussionCategoryData2);
        if (k10.isEmpty()) {
            arrayList.add(new s6.c());
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(k10, 10));
        for (DiscussionCategoryData discussionCategoryData3 : k10) {
            arrayList2.add(new s6.a(discussionCategoryData3, k71.k.b(discussionCategoryData3, this.f11825z)));
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final boolean a() {
        return i21.a.y((fl.f) this.f11823x.getValue()) && this.C.a();
    }
}
