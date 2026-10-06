package com.github.rudroid.issueorpullrequest.triagesheet.milestone;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.issueorpullrequest.x1;
import com.github.rudroid.m0;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.viewmodels.v3;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import java.util.concurrent.CancellationException;
import v71.b0;
import v71.q1;
import y71.n1;
import y71.y1;
import yz0.v2;

/* loaded from: /home/user/work/p/classes.dex */
public final class j extends k1 implements v3 {
    public static final a Companion = new a();
    public final String A;
    public final x1 B;
    public final ProjectsMetaInfo C;
    public final y1 D;
    public final y1 E;
    public final c00.g F;
    public x01.i G;
    public q1 H;

    /* renamed from: s, reason: collision with root package name */
    public final im.g f16480s;

    /* renamed from: t, reason: collision with root package name */
    public final im.d f16481t;

    /* renamed from: u, reason: collision with root package name */
    public final im.f f16482u;

    /* renamed from: v, reason: collision with root package name */
    public final com.github.rudroid.issueorpullrequest.triagesheet.milestone.a f16483v;

    /* renamed from: w, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f16484w;

    /* renamed from: x, reason: collision with root package name */
    public final v2 f16485x;

    /* renamed from: y, reason: collision with root package name */
    public final String f16486y;

    /* renamed from: z, reason: collision with root package name */
    public final String f16487z;

    public static final class a {
    }

    public static final /* synthetic */ class b {
        static {
            int[] iArr = new int[x1.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                x1 x1Var = x1.f16771r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public j(im.g gVar, im.d dVar, im.f fVar, com.github.rudroid.issueorpullrequest.triagesheet.milestone.a aVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        k71.k.g(gVar, "fetchMilestonesUseCase");
        k71.k.g(dVar, "addMilestoneToIssueUseCase");
        k71.k.g(fVar, "addMilestoneToPullRequestUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.f16480s = gVar;
        this.f16481t = dVar;
        this.f16482u = fVar;
        this.f16483v = aVar;
        this.f16484w = cVar;
        v2 v2Var = (v2) a1Var.a("originalSelectedItem");
        this.f16485x = v2Var;
        this.f16486y = (String) h2.a(a1Var, "repoOwner");
        this.f16487z = (String) h2.a(a1Var, "repoName");
        this.A = (String) h2.a(a1Var, "extra_issue_pull_id");
        this.B = (x1) h2.a(a1Var, "extra_source_type");
        this.C = (ProjectsMetaInfo) a1Var.a("EXTRA_PROJECTS_META_INFO");
        y1 c10 = n1.c(v2Var);
        this.D = c10;
        y1 s2 = m0.s(fl.f.Companion, null);
        this.E = s2;
        this.F = new c00.g(c10, s2, new k(this, null), 27);
        x01.i.Companion.getClass();
        this.G = x01.i.d;
        P();
    }

    public final void D() {
        q1 q1Var = this.H;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.H = b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new q(this, null), 3);
    }

    public final void P() {
        x01.i.Companion.getClass();
        this.G = x01.i.d;
        q1 q1Var = this.H;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.H = b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new o(this, null), 3);
    }

    public final boolean a() {
        return i21.a.y((fl.f) this.E.getValue()) && this.G.a();
    }

}
