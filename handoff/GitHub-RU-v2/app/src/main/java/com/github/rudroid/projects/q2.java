package com.github.rudroid.projects;

import android.app.Application;
import com.github.rudroid.searchandfilter.e0;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.d;
import com.github.service.models.response.ProjectV2OrderField;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class q2 extends androidx.lifecycle.a implements com.github.rudroid.utilities.viewmodel.d {
    public y71.i1 A;
    public p2 B;
    public v71.q1 C;
    public v71.q1 D;
    public String E;
    public ProjectV2OrderField F;
    public v01.a G;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d.a f17786t;

    /* renamed from: u, reason: collision with root package name */
    public il.r f17787u;

    /* renamed from: v, reason: collision with root package name */
    public il.j f17788v;

    /* renamed from: w, reason: collision with root package name */
    public il.w f17789w;

    /* renamed from: x, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f17790x;

    /* renamed from: y, reason: collision with root package name */
    public l0 f17791y;

    /* renamed from: z, reason: collision with root package name */
    public y71.y1 f17792z;

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[e0.b.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e0.b bVar = e0.b.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e0.b bVar2 = e0.b.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e0.b bVar3 = e0.b.r;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(il.r rVar, il.j jVar, il.w wVar, com.github.rudroid.activities.util.c cVar, l0 l0Var, Application application) {
        super(application);
        k71.k.g(rVar, "observeUserProjectsUseCase");
        k71.k.g(jVar, "loadUserProjectsUseCase");
        k71.k.g(wVar, "refreshUserProjectsUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f17786t = new d.a();
        this.f17787u = rVar;
        this.f17788v = jVar;
        this.f17789w = wVar;
        this.f17790x = cVar;
        this.f17791y = l0Var;
        y71.y1 c10 = y71.n1Shadow.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        this.f17792z = c10;
        this.A = com.github.rudroid.utilities.w0.f(c10, androidx.lifecycle.d1.k(this), new p2(this, 0));
        this.B = new p2(this, 1);
        this.E = "";
        this.F = ProjectV2OrderField.UPDATED_AT;
        this.G = v01.a.s;
    }

    public final void Q() {
        v71.q1 q1Var = this.C;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.C = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new v2(this, null), 3);
    }

    public final void R(ProjectV2OrderField projectV2OrderField, v01.a aVar) {
        k71.k.g(projectV2OrderField, "order");
        if (this.F == projectV2OrderField && this.G == aVar) {
            return;
        }
        this.F = projectV2OrderField;
        this.G = aVar;
        com.github.rudroid.utilities.w0.n(this.f17792z);
        Q();
    }
}
