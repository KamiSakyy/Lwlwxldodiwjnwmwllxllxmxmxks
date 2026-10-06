package l61;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import androidx.lifecycle.o1;
import b1.m;
import com.github.rudroid.r;
import com.github.rudroid.u;
import com.google.android.gms.internal.measurement.n4;
import java.io.Closeable;
import java.util.Arrays;
import k.i;
import k71.k;
import k71.xShadow;
import m7.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements o1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final k1 c(Class cls, t6.c cVar) {
        k1 k1Var;
        t6.e eVar;
        int i = 0;
        switch (this.a) {
            case 0:
                final g gVar = new g();
                m mVar = (m) this.b;
                u uVar = new u((r) mVar.s, (com.github.rudroid.c) mVar.t, d1.d(cVar));
                u uVar2 = (e) k41.b.v(e.class, uVar);
                uVar2.getClass();
                y.q("expectedSize", 209);
                androidx.compose.foundation.lazy.layout.o1 o1Var = new androidx.compose.foundation.lazy.layout.o1(209);
                o1Var.n("com.github.rudroid.actions.routing.k", uVar2.f);
                o1Var.n("com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues.v", uVar2.j);
                o1Var.n("com.github.rudroid.issueorpullrequest.subissues.addexistingsubissues.n0", uVar2.m);
                o1Var.n("com.github.rudroid.advancedsearch.n", uVar2.o);
                o1Var.n("com.github.rudroid.issueorpullrequest.assigncopilot.q", uVar2.t);
                o1Var.n("com.github.rudroid.agents.viewmodel.p", uVar2.u);
                o1Var.n("com.github.rudroid.agents.agenttasks.viewmodel.a", uVar2.H);
                o1Var.n("com.github.rudroid.agents.agenttasks.viewmodel.b0", uVar2.R);
                o1Var.n("com.github.rudroid.activities.i", uVar2.S);
                o1Var.n("com.github.rudroid.settings.applock.settings.o", uVar2.V);
                o1Var.n("com.github.rudroid.fragments.ui.comment.a", uVar2.a0);
                o1Var.n("com.github.rudroid.feed.awesometopics.k0", uVar2.g0);
                o1Var.n("com.github.rudroid.block.h", uVar2.k0);
                o1Var.n("com.github.rudroid.block.u", uVar2.l0);
                o1Var.n("com.github.rudroid.issueorpullrequest.subissues.changeparentissue.a", uVar2.m0);
                o1Var.n("com.github.rudroid.profile.status.a", uVar2.p0);
                o1Var.n("com.github.rudroid.agents.chatthreads.viewmodel.m", uVar2.t0);
                o1Var.n("com.github.rudroid.actions.checkdetail.x", uVar2.B0);
                o1Var.n("com.github.rudroid.actions.checklog.x", uVar2.F0);
                o1Var.n("com.github.rudroid.actions.checkssummary.u", uVar2.L0);
                o1Var.n("com.github.rudroid.checks.b0", uVar2.N0);
                o1Var.n("com.github.rudroid.agents.b1", uVar2.O0);
                o1Var.n("com.github.rudroid.agents.j1", uVar2.S0);
                o1Var.n("com.github.rudroid.agents.b2", uVar2.U0);
                o1Var.n("com.github.rudroid.issueorpullrequest.closeasduplicated.a", uVar2.W0);
                o1Var.n("com.github.rudroid.settings.codeoptions.a0", uVar2.Y0);
                o1Var.n("com.github.rudroid.viewmodels.g", uVar2.a1);
                o1Var.n("com.github.rudroid.commit.c0", uVar2.c1);
                o1Var.n("com.github.rudroid.commits.h", uVar2.j1);
                o1Var.n("com.github.rudroid.issueorpullrequest.createpr.t", uVar2.m1);
                o1Var.n("com.github.rudroid.discussions.a", uVar2.y1);
                o1Var.n("com.github.rudroid.shortcuts.e", uVar2.C1);
                o1Var.n("com.github.rudroid.viewmodels.m", uVar2.E1);
                o1Var.n("com.github.rudroid.settings.copilot.o", uVar2.L1);
                o1Var.n("com.github.rudroid.copilot.g2", uVar2.c2);
                o1Var.n("com.github.rudroid.agents.copilothome.viewmodel.x", uVar2.d2);
                o1Var.n("com.github.rudroid.copilot.inapppurchase.b", uVar2.h2);
                o1Var.n("com.github.rudroid.copilot.boa.a", uVar2.j2);
                o1Var.n("com.github.rudroid.settings.copilot.managesubscription.b0", uVar2.l2);
                o1Var.n("com.github.rudroid.settings.copilot.debug.v", uVar2.m2);
                o1Var.n("com.github.rudroid.copilot.boa.n", uVar2.n2);
                o1Var.n("com.github.rudroid.viewmodels.v", uVar2.p2);
                o1Var.n("com.github.rudroid.copilot.o4", uVar2.q2);
                o1Var.n("com.github.rudroid.copilot.upsellbanner.j", uVar2.s2);
                o1Var.n("com.github.rudroid.agents.w3", uVar2.y2);
                o1Var.n("com.github.rudroid.discussions.d0", uVar2.A2);
                o1Var.n("com.github.rudroid.createissue.j", uVar2.E2);
                o1Var.n("com.github.rudroid.starredreposandlists.createoreditlist.r", uVar2.H2);
                o1Var.n("com.github.rudroid.createrepository.q", uVar2.M2);
                o1Var.n("com.github.rudroid.fileschanged.delete.f0", uVar2.W2);
                o1Var.n("com.github.rudroid.deploymentreview.h0", uVar2.Y2);
                o1Var.n("com.github.rudroid.discussions.a1", uVar2.b3);
                o1Var.n("com.github.rudroid.discussions.replythread.v0", uVar2.o3);
                o1Var.n("com.github.rudroid.discussions.i2", uVar2.C3);
                o1Var.n("com.github.rudroid.discussions.n5", uVar2.J3);
                o1Var.n("com.github.rudroid.discussions.t6", uVar2.K3);
                o1Var.n("com.github.rudroid.discussions.j7", uVar2.M3);
                o1Var.n("com.github.rudroid.actions.workflowruns.dispatchworkflow.i0", uVar2.Q3);
                o1Var.n("com.github.rudroid.draft.u", uVar2.U3);
                o1Var.n("com.github.rudroid.discussions.l8", uVar2.W3);
                o1Var.n("com.github.rudroid.viewmodels.e0", uVar2.Z3);
                o1Var.n("com.github.rudroid.starredreposandlists.createoreditlist.u0", uVar2.c4);
                o1Var.n("com.github.rudroid.favorites.viewmodels.g", uVar2.f4);
                o1Var.n("com.github.rudroid.viewmodels.l0", uVar2.h4);
                o1Var.n("com.github.rudroid.issueorpullrequest.subissues.editsubissues.v", uVar2.i4);
                o1Var.n("com.github.rudroid.deploymentreview.k1", uVar2.l4);
                o1Var.n("com.github.rudroid.searchandfilter.a", uVar2.m4);
                o1Var.n("com.github.rudroid.explore.n0", uVar2.p4);
                o1Var.n("com.github.rudroid.favorites.viewmodels.o", uVar2.t4);
                o1Var.n("com.github.rudroid.feed.filter.z", uVar2.w4);
                o1Var.n("com.github.rudroid.feed.ui.reaction.d", uVar2.x4);
                o1Var.n("com.github.rudroid.feed.r0", uVar2.E4);
                o1Var.n("com.github.rudroid.repository.files.d", uVar2.F4);
                o1Var.n("com.github.rudroid.fileeditor.b0", uVar2.H4);
                o1Var.n("com.github.rudroid.fileschanged.k2", uVar2.U4);
                o1Var.n("com.github.rudroid.searchandfilter.q", uVar2.V4);
                o1Var.n("com.github.rudroid.feed.a1", uVar2.Y4);
                o1Var.n("com.github.rudroid.feed.j1", uVar2.b5);
                o1Var.n("com.github.rudroid.repository.fork.j", uVar2.d5);
                o1Var.n("com.github.rudroid.repositories.a", uVar2.f5);
                o1Var.n("com.github.rudroid.repositorycreation.gitignore.s", uVar2.h5);
                o1Var.n("com.github.rudroid.codesearch.g", uVar2.j5);
                o1Var.n("com.github.rudroid.viewmodels.g1", uVar2.l5);
                o1Var.n("com.github.rudroid.activities.util.u", uVar2.m5);
                o1Var.n("com.github.rudroid.discussions.ta", uVar2.n5);
                o1Var.n("com.github.rudroid.home.u1", uVar2.C5);
                o1Var.n("com.github.rudroid.home.inappupdate.d", uVar2.E5);
                o1Var.n("com.github.rudroid.viewmodels.issuesorpullrequests.l", uVar2.j6);
                o1Var.n("com.github.rudroid.viewmodels.v1", uVar2.k6);
                o1Var.n("com.github.rudroid.templates.l", uVar2.m6);
                o1Var.n("com.github.rudroid.viewmodels.e2", uVar2.n6);
                o1Var.n("com.github.rudroid.viewmodels.issuesorpullrequests.w2", uVar2.o6);
                o1Var.n("com.github.rudroid.repositorycreation.licensetemplate.r", uVar2.q6);
                o1Var.n("com.github.rudroid.repository.v", uVar2.s6);
                o1Var.n("com.github.rudroid.starredreposandlists.listdetails.s0", uVar2.v6);
                o1Var.n("com.github.rudroid.starredreposandlists.bottomsheet.w", uVar2.z6);
                o1Var.n("com.github.rudroid.viewmodels.u2", uVar2.D6);
                o1Var.n("com.github.rudroid.main.y0", uVar2.F6);
                o1Var.n("com.github.rudroid.fragments.ui.comment.i", uVar2.H6);
                o1Var.n("com.github.rudroid.viewmodels.image.a", uVar2.I6);
                o1Var.n("com.github.rudroid.issueorpullrequest.mergebox.g0", uVar2.S6);
                o1Var.n("com.github.rudroid.mergequeue.list.v", uVar2.W6);
                o1Var.n("com.github.rudroid.comment.v", uVar2.Z6);
                o1Var.n("com.github.rudroid.settings.h", uVar2.a7);
                o1Var.n("com.github.rudroid.searchandfilter.h0", uVar2.b7);
                o1Var.n("com.github.rudroid.fragments.onboarding.notifications.viewmodel.c", uVar2.d7);
                o1Var.n("com.github.rudroid.viewmodels.notifications.s", uVar2.w7);
                o1Var.n("com.github.rudroid.agents.viewmodel.v", uVar2.y7);
                o1Var.n("com.github.rudroid.agents.viewmodel.j0", uVar2.z7);
                o1Var.n("com.github.rudroid.viewmodels.k3", uVar2.B7);
                o1Var.n("com.github.rudroid.organizations.t", uVar2.E7);
                o1Var.n("com.github.rudroid.projects.d0", uVar2.I7);
                o1Var.n("com.github.rudroid.projects.ui.quickaction.b0", uVar2.L7);
                o1Var.n("com.github.rudroid.projects.table.c0", uVar2.T7);
                o1Var.n("com.github.rudroid.createissue.propertybar.assignees.f", uVar2.V7);
                o1Var.n("com.github.rudroid.createissue.propertybar.labels.e", uVar2.X7);
                o1Var.n("com.github.rudroid.createissue.propertybar.milestone.f", uVar2.Z7);
                o1Var.n("com.github.rudroid.createissue.propertybar.projects.owner.h", uVar2.b8);
                o1Var.n("com.github.rudroid.createissue.propertybar.projects.f", uVar2.c8);
                o1Var.n("com.github.rudroid.createissue.propertybar.projects.recent.g", uVar2.e8);
                o1Var.n("com.github.rudroid.repository.pullrequestcreation.z", uVar2.g8);
                o1Var.n("com.github.rudroid.viewmodels.c5", uVar2.k8);
                o1Var.n("com.github.rudroid.viewmodels.r5", uVar2.o8);
                o1Var.n("com.github.rudroid.viewmodels.a6", uVar2.q8);
                o1Var.n("com.github.rudroid.fileschanged.i4", uVar2.v8);
                o1Var.n("com.github.rudroid.releases.k0", uVar2.x8);
                o1Var.n("com.github.rudroid.releases.a1", uVar2.z8);
                o1Var.n("com.github.rudroid.repository.files.t", uVar2.B8);
                o1Var.n("com.github.rudroid.repositories.x", uVar2.D8);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.user.assignee.f", uVar2.F8);
                o1Var.n("com.github.rudroid.repository.branches.k0", uVar2.H8);
                o1Var.n("com.github.rudroid.repository.p1", uVar2.S8);
                o1Var.n("com.github.rudroid.discussions.zb", uVar2.V8);
                o1Var.n("com.github.rudroid.repository.file.u0", uVar2.W8);
                o1Var.n("com.github.rudroid.repository.files.e1", uVar2.d9);
                o1Var.n("com.github.rudroid.repository.gitobject.i", uVar2.f9);
                o1Var.n("com.github.rudroid.repository.issuetypes.h", uVar2.k9);
                o1Var.n("com.github.rudroid.repository.issues.k0", uVar2.m9);
                o1Var.n("com.github.rudroid.searchandfilter.q0", uVar2.n9);
                o1Var.n("com.github.rudroid.repositories.repositoryownerrepositories.g", uVar2.r9);
                o1Var.n("com.github.rudroid.projects.c1", uVar2.v9);
                o1Var.n("com.github.rudroid.viewmodels.v6", uVar2.y9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.user.d", uVar2.z9);
                o1Var.n("com.github.rudroid.actions.repositoryworkflows.u", uVar2.D9);
                o1Var.n("com.github.rudroid.comment.e0", uVar2.E9);
                o1Var.n("com.github.rudroid.auth.saml.viewmodels.e", uVar2.G9);
                o1Var.n("com.github.rudroid.starredreposandlists.bottomsheet.g0", uVar2.I9);
                o1Var.n("com.github.rudroid.viewmodels.k7", uVar2.L9);
                o1Var.n("com.github.rudroid.issueorpullrequest.selectissue.v", uVar2.M9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.category.i", uVar2.N9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.label.g", uVar2.O9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.explore.n", uVar2.Q9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.milestone.g", uVar2.R9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.notificationfilter.a0", uVar2.T9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.notificationfilter.s0", uVar2.V9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.organization.o", uVar2.W9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.project.i", uVar2.Y9);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.repository.a", uVar2.aa);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.project.y", uVar2.ca);
                o1Var.n("com.github.rudroid.searchandfilter.complexfilter.explore.i0", uVar2.ea);
                o1Var.n("com.github.rudroid.agents.sessionevents.f1", uVar2.za);
                o1Var.n("com.github.rudroid.fragments.onboarding.notifications.viewmodel.p", uVar2.Aa);
                o1Var.n("com.github.rudroid.settings.r0", uVar2.Ca);
                o1Var.n("com.github.rudroid.settings.i1", uVar2.Fa);
                o1Var.n("com.github.rudroid.settings.privacy.h", uVar2.Ga);
                o1Var.n("com.github.rudroid.settings.t2", uVar2.Ja);
                o1Var.n("com.github.rudroid.shortcuts.w", uVar2.Ma);
                o1Var.n("com.github.rudroid.widget.shortcuts.viewmodel.f", uVar2.Oa);
                o1Var.n("com.github.rudroid.shortcuts.n0", uVar2.Sa);
                o1Var.n("com.github.rudroid.feed.v1", uVar2.Ta);
                o1Var.n("com.github.rudroid.starredreposandlists.h0", uVar2.Va);
                o1Var.n("com.github.rudroid.actions.checkssummary.k0", uVar2.Za);
                o1Var.n("com.github.rudroid.profile.status.o", uVar2.ab);
                o1Var.n("com.github.rudroid.viewmodels.g8", uVar2.db);
                o1Var.n("com.github.rudroid.issueorpullrequest.createpr.r0", uVar2.fb);
                o1Var.n("com.github.rudroid.fileschanged.a5", uVar2.ib);
                o1Var.n("com.github.rudroid.support.s", uVar2.jb);
                o1Var.n("com.github.rudroid.fragments.onboarding.notifications.viewmodel.k0", uVar2.kb);
                o1Var.n("com.github.rudroid.fragments.onboarding.notifications.viewmodel.u0", uVar2.mb);
                o1Var.n("com.github.rudroid.viewmodels.tasklist.n", uVar2.ub);
                o1Var.n("com.github.rudroid.repositorycreation.templaterepository.t", uVar2.yb);
                o1Var.n("com.github.rudroid.projects.triagesheet.textfield.m", uVar2.zb);
                o1Var.n("com.github.rudroid.comment.m0", uVar2.Cb);
                o1Var.n("com.github.rudroid.searchandfilter.z0", uVar2.Db);
                o1Var.n("com.github.rudroid.agents.w6", uVar2.Gb);
                o1Var.n("com.github.rudroid.issueorpullrequest.triagesheet.assignees.h", uVar2.Jb);
                o1Var.n("com.github.rudroid.comment.n1", uVar2.Pb);
                o1Var.n("com.github.rudroid.issueorpullrequest.triagesheet.labels.i", uVar2.Rb);
                o1Var.n("com.github.rudroid.viewmodels.m8", uVar2.Ub);
                o1Var.n("com.github.rudroid.issueorpullrequest.triagesheet.linkeditems.r", uVar2.Xb);
                o1Var.n("com.github.rudroid.issueorpullrequest.triagesheet.milestone.j", uVar2.ac);
                o1Var.n("com.github.rudroid.projects.triagesheet.f0", uVar2.bc);
                o1Var.n("com.github.rudroid.projects.triagesheet.s0", uVar2.dc);
                o1Var.n("com.github.rudroid.projects.triagesheet.h1", uVar2.ec);
                o1Var.n("com.github.rudroid.viewmodels.n9", uVar2.fc);
                o1Var.n("com.github.rudroid.viewmodels.t9", uVar2.jc);
                o1Var.n("com.github.rudroid.issueorpullrequest.triagesheet.projectbetacard.v0", uVar2.mc);
                o1Var.n("com.github.rudroid.issueorpullrequest.triagesheet.t", uVar2.nc);
                o1Var.n("com.github.rudroid.twofactor.h", uVar2.uc);
                o1Var.n("com.github.rudroid.twofactor.g0", uVar2.yc);
                o1Var.n("com.github.rudroid.accounts.b0", uVar2.Ac);
                o1Var.n("com.github.rudroid.achievements.k", uVar2.Ec);
                o1Var.n("com.github.rudroid.searchandfilter.f1", uVar2.Fc);
                o1Var.n("com.github.rudroid.profile.m", uVar2.Lc);
                o1Var.n("com.github.rudroid.searchandfilter.l1", uVar2.Mc);
                o1Var.n("com.github.rudroid.projects.q2", uVar2.Qc);
                o1Var.n("com.github.rudroid.viewmodels.sa", uVar2.Sc);
                o1Var.n("com.github.rudroid.actions.workflowruns.h0", uVar2.Xc);
                o1Var.n("com.github.rudroid.actions.workflowsummary.z", uVar2.ed);
                com.google.common.collect.m d = o1Var.d();
                if (cls == null) {
                    throw new IllegalArgumentException("Key must be a class");
                }
                v61.a aVar = (v61.a) d.get(cls.getName());
                j71.c cVar2 = (j71.c) cVar.a(f.d);
                ((e) k41.b.v(e.class, uVar)).getClass();
                Object obj = com.google.common.collect.m.xShadow.get(cls);
                if (obj == null) {
                    if (cVar2 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (aVar == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    k1Var = (k1) aVar.get();
                } else {
                    if (aVar != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (cVar2 == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    k1Var = (k1) cVar2.k(obj);
                }
                Closeable closeable = new Closeable() { // from class: l61.c
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        g.this.a();
                    }
                };
                k1Var.getClass();
                v6.d dVar = k1Var.r;
                if (dVar != null) {
                    if (dVar.d) {
                        v6.d.a(closeable);
                    } else {
                        synchronized (dVar.a) {
                            dVar.c.add(closeable);
                        }
                    }
                }
                return k1Var;
            case 1:
                n4 n4Var = new n4();
                n4Var.r = cVar != null;
                n4Var.s = cVar;
                return new m61.d(new com.github.rudroid.c(((m61.c) k41.b.v(m61.c.class, com.google.common.util.concurrent.a.t(((i) this.b).getApplicationContext()))).c), n4Var);
            default:
                k.g(cls, "modelClass");
                k.g(cVar, "extras");
                k71.e a = xShadow.a(cls);
                t6.e[] eVarArr = (t6.e[]) this.b;
                t6.e[] eVarArr2 = (t6.e[]) Arrays.copyOf(eVarArr, eVarArr.length);
                k.g(eVarArr2, "initializers");
                int length = eVarArr2.length;
                while (true) {
                    if (i < length) {
                        eVar = eVarArr2[i];
                        if (!eVar.a.equals(a)) {
                            i++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                k1 k1Var2 = eVar != null ? (k1) eVar.b.k(cVar) : null;
                if (k1Var2 != null) {
                    return k1Var2;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + a.b()).toString());
        }
    }

    public d(t6.e[] eVarArr) {
        this.a = 2;
        k.g(eVarArr, "initializers");
        this.b = eVarArr;
    }
}
