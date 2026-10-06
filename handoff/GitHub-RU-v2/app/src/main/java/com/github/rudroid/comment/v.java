package com.github.rudroid.comment;

import com.github.rudroid.utilities.viewmodel.d;
import com.github.service.models.response.type.ReportedContentClassifier;

/* loaded from: /home/user/work/p/classes.dex */
public final class v extends androidx.lifecycle.k1 implements com.github.rudroid.utilities.viewmodel.d {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d.a f9000s;

    /* renamed from: t, reason: collision with root package name */
    public el.b f9001t;

    /* renamed from: u, reason: collision with root package name */
    public el.c f9002u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f9003v;

    /* renamed from: w, reason: collision with root package name */
    public y71.m1 f9004w;

    /* renamed from: x, reason: collision with root package name */
    public y71.h1 f9005x;

    public v(el.b bVar, el.c cVar, com.github.rudroid.activities.util.c cVar2) {
        k71.k.g(bVar, "minimizeCommentUseCase");
        k71.k.g(cVar, "unminimizeCommentUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.f9000s = new d.a();
        this.f9001t = bVar;
        this.f9002u = cVar;
        this.f9003v = cVar2;
        y71.m1 j10 = w8.s.j();
        this.f9004w = j10;
        this.f9005x = new y71.h1(j10);
    }

    public final void P(String str, ReportedContentClassifier reportedContentClassifier) {
        k71.k.g(str, "subjectId");
        k71.k.g(reportedContentClassifier, "reportedContentClassifier");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new s(this, str, reportedContentClassifier, null), 3);
    }

    public final void Q(String str) {
        k71.k.g(str, "subjectId");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new u(this, str, null), 3);
    }
}
