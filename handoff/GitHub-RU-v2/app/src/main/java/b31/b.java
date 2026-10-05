package b31;

import aa.s0;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.t;
import androidx.glance.session.TimeoutCancellationException;
import b91.g;
import bx0.q;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.rudroid.uitoolkit.markdown.components.v;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.DeploymentState;
import com.github.service.models.response.DeploymentStatusState;
import com.github.service.models.response.InteractionType;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.TimelineItem$LinkedItemConnectorType;
import com.github.service.models.response.TimelineItem$TimelineLockedEvent$Reason;
import com.github.service.models.response.TimelineItem$TimelinePullRequestReview$ReviewState;
import com.github.service.models.response.WorkflowRunEvent;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectViewLayoutType;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.MilestoneState;
import com.github.service.models.response.type.StatusState;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import dn.g0;
import dw.q0;
import f00.g1;
import f00.r0;
import f00.t0;
import f00.x0;
import fw0.o;
import fw0.p;
import fw0.x;
import gn0.u00;
import gn0.xd;
import gn0.zc;
import hc0.of;
import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.ao;
import jn0.fc0;
import jn0.gi;
import jn0.hc0;
import jn0.hi;
import jn0.ic0;
import jn0.jc0;
import jn0.kc0;
import jn0.wn;
import jn0.xn;
import jn0.yn;
import jn0.zn;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import kq0.i;
import ku0.f;
import l01.j0;
import l01.l0;
import l01.p0;
import l01.u;
import l01.u0;
import l01.v0;
import lv0.d;
import lv0.l;
import m10.ew;
import m10.gh0;
import m10.t3;
import m10.xc;
import oa.j;
import pz0.g9;
import pz0.gu;
import pz0.je;
import pz0.y00;
import rm0.z8;
import t71.w;
import uk0.h;
import ur0.a0;
import ur0.c0;
import wp0.m;
import x61.r;
import xt0.a4;
import xt0.y3;
import y71.y;
import yq0.e;
import yz0.a6;
import yz0.a7;
import yz0.b0;
import yz0.b6;
import yz0.b7;
import yz0.c6;
import yz0.c7;
import yz0.d0;
import yz0.d6;
import yz0.d7;
import yz0.e7;
import yz0.f7;
import yz0.g7;
import yz0.h6;
import yz0.h7;
import yz0.i6;
import yz0.i7;
import yz0.j6;
import yz0.j7;
import yz0.k0;
import yz0.k6;
import yz0.k7;
import yz0.l6;
import yz0.l7;
import yz0.m6;
import yz0.m7;
import yz0.n6;
import yz0.n7;
import yz0.o2;
import yz0.o3;
import yz0.o5;
import yz0.o6;
import yz0.o7;
import yz0.p5;
import yz0.p6;
import yz0.p7;
import yz0.q4;
import yz0.q6;
import yz0.q7;
import yz0.r4;
import yz0.r6;
import yz0.r7;
import yz0.s;
import yz0.s5;
import yz0.s6;
import yz0.t5;
import yz0.t6;
import yz0.u5;
import yz0.u6;
import yz0.v5;
import yz0.v6;
import yz0.w5;
import yz0.w6;
import yz0.x1;
import yz0.x2;
import yz0.x5;
import yz0.x6;
import yz0.y5;
import yz0.y6;
import yz0.y7;
import yz0.z4;
import yz0.z5;
import yz0.z6;
import z5.n;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public final /* synthetic */ int a;

    public static final g7 A(kj0.b bVar) {
        k.g(bVar, "<this>");
        kj0.a aVar = bVar.c;
        return new g7(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", b41.b.O(aVar != null ? aVar.b.d : null), (String) null, false, (String) null, 60), bVar.d);
    }

    public static final n7 B(kk0.c cVar) {
        ud0.a aVar;
        ud0.a aVar2;
        k.g(cVar, "<this>");
        kk0.a aVar3 = cVar.c;
        String str = "";
        ud0.c cVar2 = null;
        com.github.service.models.response.a aVar4 = new com.github.service.models.response.a(aVar3 != null ? aVar3.b.b : "", b41.b.O(aVar3 != null ? aVar3.b.d : null), (String) null, false, (String) null, 60);
        kk0.b bVar = cVar.d;
        if (bVar != null && (aVar2 = bVar.b) != null) {
            str = aVar2.b;
        }
        String str2 = str;
        if (bVar != null && (aVar = bVar.b) != null) {
            cVar2 = aVar.d;
        }
        return new n7(aVar4, new com.github.service.models.response.a(str2, b41.b.O(cVar2), (String) null, false, (String) null, 60), cVar.e);
    }

    public static final o7 C(mk0.c cVar) {
        int i;
        k.g(cVar, "<this>");
        qg0.a aVar = cVar.d.c;
        mk0.a aVar2 = cVar.c;
        com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(aVar2 != null ? aVar2.b.b : "", b41.b.O(aVar2 != null ? aVar2.b.d : null), (String) null, false, (String) null, 60);
        String C = w.C(aVar.c, " ", " ");
        try {
            String str = aVar.d;
            if (!w.F(str, "#", false)) {
                str = "#".concat(str);
            }
            i = Color.parseColor(str);
        } catch (Exception unused) {
            i = -16777216;
        }
        return new o7(aVar3, C, i, cVar.e);
    }

    public static final p7 D(ok0.b bVar) {
        k.g(bVar, "<this>");
        ok0.a aVar = bVar.c;
        return new p7(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", b41.b.O(aVar != null ? aVar.b.d : null), (String) null, false, (String) null, 60), bVar.d);
    }

    public static final r7 E(zk0.c cVar) {
        String str;
        String str2;
        ud0.a aVar;
        ud0.a aVar2;
        k.g(cVar, "<this>");
        String str3 = cVar.b;
        zk0.a aVar3 = cVar.c;
        if (aVar3 == null || (aVar2 = aVar3.b) == null || (str = aVar2.b) == null) {
            str = "";
        }
        zk0.b bVar = cVar.d;
        if (bVar == null || (aVar = bVar.c) == null || (str2 = aVar.b) == null) {
            str2 = "";
        }
        return new r7(str3, str, str2, cVar.e != u00.t, cVar.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [yz0.r7] */
    /* JADX WARN: Type inference failed for: r2v22, types: [yz0.m7] */
    /* JADX WARN: Type inference failed for: r2v23, types: [yz0.q7] */
    /* JADX WARN: Type inference failed for: r2v24, types: [yz0.y6] */
    /* JADX WARN: Type inference failed for: r2v25, types: [yz0.u6] */
    /* JADX WARN: Type inference failed for: r2v26, types: [yz0.c6] */
    /* JADX WARN: Type inference failed for: r2v29, types: [yz0.c7] */
    /* JADX WARN: Type inference failed for: r2v30, types: [yz0.h6] */
    /* JADX WARN: Type inference failed for: r2v31, types: [yz0.i6] */
    /* JADX WARN: Type inference failed for: r2v32, types: [yz0.w6] */
    /* JADX WARN: Type inference failed for: r2v33, types: [yz0.p7] */
    /* JADX WARN: Type inference failed for: r2v34, types: [yz0.t6] */
    /* JADX WARN: Type inference failed for: r2v35, types: [yz0.o7] */
    /* JADX WARN: Type inference failed for: r2v36, types: [yz0.q6] */
    /* JADX WARN: Type inference failed for: r2v37, types: [yz0.g7] */
    /* JADX WARN: Type inference failed for: r2v38, types: [yz0.b6] */
    /* JADX WARN: Type inference failed for: r2v39, types: [yz0.n7] */
    /* JADX WARN: Type inference failed for: r2v40, types: [yz0.u5] */
    /* JADX WARN: Type inference failed for: r2v41, types: [yz0.f7] */
    /* JADX WARN: Type inference failed for: r2v43, types: [yz0.o6] */
    /* JADX WARN: Type inference failed for: r7v1, types: [yz0.k7] */
    /* JADX WARN: Type inference failed for: r7v5, types: [yz0.p6] */
    /* JADX WARN: Type inference failed for: r8v20, types: [yz0.s6] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v32, types: [yz0.s6] */
    public static final List F(c0 c0Var) {
        l lVar;
        String str;
        d dVar;
        e eVar;
        Object s6Var;
        l7 l7Var;
        eq0.e eVar2;
        l7 l7Var2;
        iq0.e eVar3;
        iw0.c cVar;
        rv0.c cVar2;
        zv0.b bVar;
        rt0.b bVar2;
        os0.e eVar4;
        aq0.c cVar3;
        f fVar;
        i iVar;
        oq0.b bVar3;
        ys0.b bVar4;
        xv0.b bVar5;
        ms0.b bVar6;
        vv0.c cVar4;
        es0.c cVar5;
        ou0.b bVar7;
        m mVar;
        tv0.c cVar6;
        gp0.c cVar7;
        mu0.b bVar8;
        wr0.a aVar;
        Iterable<a0> iterable = c0Var.d;
        if (iterable == null) {
            iterable = r.r;
        }
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var : iterable) {
            if (a0Var != null && (aVar = a0Var.c) != null) {
                l7Var = b4.k(aVar);
            } else if (a0Var != null && (bVar8 = a0Var.d) != null) {
                l7Var = b4.u(bVar8);
            } else if (a0Var != null && (cVar7 = a0Var.e) != null) {
                l7Var = b4.f(cVar7);
            } else if (a0Var != null && (cVar6 = a0Var.f) != null) {
                l7Var = b4.y(cVar6);
            } else if (a0Var != null && (mVar = a0Var.g) != null) {
                l7Var = b4.g(mVar);
            } else if (a0Var != null && (bVar7 = a0Var.h) != null) {
                l7Var = b4.x(bVar7);
            } else if (a0Var != null && (cVar5 = a0Var.i) != null) {
                l7Var = b4.n(cVar5);
            } else if (a0Var != null && (cVar4 = a0Var.j) != null) {
                l7Var = b4.z(cVar4);
            } else if (a0Var != null && (bVar6 = a0Var.k) != null) {
                l7Var = b4.o(bVar6);
            } else if (a0Var != null && (bVar5 = a0Var.l) != null) {
                l7Var = b4.A(bVar5);
            } else if (a0Var != null && (bVar4 = a0Var.m) != null) {
                l7Var = b4.q(bVar4);
            } else if (a0Var != null && (bVar3 = a0Var.n) != null) {
                l7Var = b4.j(bVar3);
            } else if (a0Var != null && (iVar = a0Var.o) != null) {
                l7Var = b4.i(iVar);
            } else if (a0Var != null && (fVar = a0Var.p) != null) {
                if (fVar.f != null) {
                    l7Var = b4.t(fVar);
                }
                l7Var = null;
            } else if (a0Var != null && (cVar3 = a0Var.s) != null) {
                l7Var = b4.h(cVar3);
            } else if (a0Var == null || (eVar4 = a0Var.u) == null) {
                if (a0Var != null && (bVar2 = a0Var.q) != null) {
                    rt0.a aVar2 = bVar2.c;
                    l7Var = new y6(aVar2 != null ? aVar2.b.b : "", bVar2.d);
                } else if (a0Var != null && (bVar = a0Var.r) != null) {
                    zv0.a aVar3 = bVar.c;
                    l7Var = new q7(aVar3 != null ? aVar3.b.b : "", bVar.d);
                } else if (a0Var != null && (cVar2 = a0Var.t) != null) {
                    rv0.a aVar4 = cVar2.c;
                    String str2 = aVar4 != null ? aVar4.b.b : "";
                    rv0.b bVar9 = cVar2.e;
                    l7Var = new m7(str2, bVar9 != null ? bVar9.b : "", cVar2.d);
                } else if (a0Var == null || (cVar = a0Var.v) == null) {
                    if (a0Var == null || (eVar3 = a0Var.w) == null) {
                        if (a0Var != null && (eVar2 = a0Var.x) != null) {
                            eq0.c cVar8 = eVar2.d.c;
                            TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType = TimelineItem$LinkedItemConnectorType.LINKED;
                            eq0.a aVar5 = eVar2.c;
                            String str3 = aVar5 != null ? aVar5.b.b : null;
                            String str4 = str3 == null ? "" : str3;
                            o3 o3Var = PullRequestState.Companion;
                            String str5 = cVar8 != null ? cVar8.a.r : null;
                            if (str5 == null) {
                                str5 = "";
                            }
                            o3Var.getClass();
                            PullRequestState b = o3.b(str5);
                            int i = cVar8 != null ? cVar8.e : 0;
                            String str6 = cVar8 != null ? cVar8.c : null;
                            String str7 = str6 == null ? "" : str6;
                            String str8 = cVar8 != null ? cVar8.d : null;
                            s6Var = new s6(timelineItem$LinkedItemConnectorType, str4, i, str7, str8 == null ? "" : str8, eVar2.e, b, cVar8 != null && cVar8.b, cVar8 != null && cVar8.f);
                        } else if (a0Var != null && (eVar = a0Var.y) != null) {
                            yq0.c cVar9 = eVar.d.c;
                            TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType2 = TimelineItem$LinkedItemConnectorType.UNLINKED;
                            yq0.a aVar6 = eVar.c;
                            String str9 = aVar6 != null ? aVar6.b.b : null;
                            String str10 = str9 == null ? "" : str9;
                            o3 o3Var2 = PullRequestState.Companion;
                            String str11 = cVar9 != null ? cVar9.a.r : null;
                            if (str11 == null) {
                                str11 = "";
                            }
                            o3Var2.getClass();
                            PullRequestState b2 = o3.b(str11);
                            int i2 = cVar9 != null ? cVar9.e : 0;
                            String str12 = cVar9 != null ? cVar9.c : null;
                            String str13 = str12 == null ? "" : str12;
                            String str14 = cVar9 != null ? cVar9.d : null;
                            s6Var = new s6(timelineItem$LinkedItemConnectorType2, str10, i2, str13, str14 == null ? "" : str14, eVar.e, b2, cVar9 != null && cVar9.b, cVar9 != null && cVar9.f);
                        } else if (a0Var == null || (dVar = a0Var.z) == null) {
                            if (a0Var != null && (lVar = a0Var.A) != null) {
                                lv0.k kVar = lVar.d;
                                lv0.i iVar2 = lVar.c;
                                String str15 = iVar2 != null ? iVar2.b.b : null;
                                if (str15 == null) {
                                    str15 = "";
                                }
                                int i3 = kVar != null ? kVar.c.d : 0;
                                String str16 = kVar != null ? kVar.c.b : null;
                                String str17 = str16 == null ? "" : str16;
                                String str18 = kVar != null ? kVar.c.c : null;
                                String str19 = str18 == null ? "" : str18;
                                ZonedDateTime zonedDateTime = lVar.e;
                                r01.e eVar5 = IssueState.Companion;
                                String str20 = kVar != null ? kVar.c.a.r : null;
                                str = str20 != null ? str20 : "";
                                eVar5.getClass();
                                l7Var2 = new l7(str15, i3, str17, str19, zonedDateTime, r01.e.b(str), b4.k0(kVar != null ? kVar.c.e : null));
                            }
                            l7Var = null;
                        } else {
                            lv0.c cVar10 = dVar.d;
                            lv0.a aVar7 = dVar.c;
                            String str21 = aVar7 != null ? aVar7.b.b : null;
                            if (str21 == null) {
                                str21 = "";
                            }
                            int i4 = cVar10 != null ? cVar10.c.d : 0;
                            String str22 = cVar10 != null ? cVar10.c.b : null;
                            String str23 = str22 == null ? "" : str22;
                            String str24 = cVar10 != null ? cVar10.c.c : null;
                            String str25 = str24 == null ? "" : str24;
                            ZonedDateTime zonedDateTime2 = dVar.e;
                            r01.e eVar6 = IssueState.Companion;
                            String str26 = cVar10 != null ? cVar10.c.a.r : null;
                            str = str26 != null ? str26 : "";
                            eVar6.getClass();
                            l7Var2 = new k7(str21, i4, str23, str25, zonedDateTime2, r01.e.b(str), b4.k0(cVar10 != null ? cVar10.c.e : null));
                        }
                        l7Var = s6Var;
                    } else {
                        String str27 = eVar3.b;
                        iq0.a aVar8 = eVar3.c;
                        String str28 = aVar8 != null ? aVar8.b.b : "";
                        iq0.b bVar10 = eVar3.d;
                        l7Var2 = new p6(str27, str28, bVar10 != null ? bVar10.a : 0, bVar10 != null ? bVar10.b : "", bVar10 != null ? bVar10.c.a.b : "", bVar10 != null ? bVar10.c.b : "", eVar3.e);
                    }
                    l7Var = l7Var2;
                } else {
                    l7Var = b4.B(cVar);
                }
            } else {
                l7Var = b4.p(eVar4);
            }
            if (l7Var != null) {
                arrayList.add(l7Var);
            }
        }
        return x61.m.F0(arrayList);
    }

    public static final y7 G(hc0 hc0Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        s bVar;
        jc0 jc0Var;
        jc0 jc0Var2;
        fc0 fc0Var;
        jc0 jc0Var3;
        jc0 jc0Var4;
        ic0 ic0Var;
        jc0 jc0Var5;
        jc0 jc0Var6;
        jc0 jc0Var7;
        jc0 jc0Var8;
        k.g(hc0Var, "<this>");
        kc0 kc0Var = hc0Var.a;
        String str = "";
        String str2 = (kc0Var == null || (jc0Var8 = kc0Var.b) == null) ? "" : jc0Var8.b;
        yp0.c cVar = null;
        gu guVar = (kc0Var == null || (jc0Var7 = kc0Var.b) == null) ? null : jc0Var7.d;
        int i = guVar == null ? -1 : q.a[guVar.ordinal()];
        if (i == -1) {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        } else if (i == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
        } else if (i == 2) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
        } else if (i == 3) {
            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        ArrayList d = k21.f.d((kc0Var == null || (jc0Var6 = kc0Var.b) == null) ? null : jc0Var6.h);
        List f = g.f((kc0Var == null || (jc0Var5 = kc0Var.b) == null) ? null : jc0Var5.i);
        kx0.g f2 = f((kc0Var == null || (jc0Var4 = kc0Var.b) == null || (ic0Var = jc0Var4.e) == null) ? null : ic0Var.c);
        if (kc0Var != null && (jc0Var3 = kc0Var.b) != null) {
            cVar = jc0Var3.j;
        }
        if (cVar == null) {
            s.Companion.getClass();
            bVar = yz0.r.b;
        } else {
            jc0 jc0Var9 = kc0Var.b;
            bVar = new kx0.b(cVar, jc0Var9.c, new b0(jc0Var9.b));
        }
        if (kc0Var != null && (fc0Var = kc0Var.a) != null) {
            str = fc0Var.b;
        }
        return new y7(str2, issueOrPullRequestState, d, f, r.r, f2, bVar, new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62), new ArrayList(), (kc0Var == null || (jc0Var2 = kc0Var.b) == null || !jc0Var2.f) ? false : true, (kc0Var == null || (jc0Var = kc0Var.b) == null || !jc0Var.g) ? false : true);
    }

    public static IOException H(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        String sb2 = sb.toString();
        k.f(sb2, "toString(...)");
        return new IOException(sb2, iOException);
    }

    public static IOException I(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            return parentFile.isFile() ? parentFile.canRead() ? parentFile.canWrite() ? H(file, iOException) : H(file, iOException) : parentFile.canWrite() ? H(file, iOException) : H(file, iOException) : parentFile.canRead() ? parentFile.canWrite() ? H(file, iOException) : H(file, iOException) : parentFile.canWrite() ? H(file, iOException) : H(file, iOException);
        }
        return H(file, iOException);
    }

    public static final y J(y71.i iVar, j jVar, j71.c cVar) {
        k.g(iVar, "<this>");
        k.g(jVar, "user");
        k.g(cVar, "onError");
        return new y(iVar, new g0(cVar, jVar, (a71.c) null, 4));
    }

    public static final y K(y71.i iVar, j jVar, j71.c cVar, j71.e eVar) {
        k.g(jVar, "user");
        k.g(cVar, "onError");
        return new y(iVar, new c00.m(eVar, cVar, jVar, (a71.c) null));
    }

    public static final n L(n nVar, a6.a aVar) {
        return nVar.d(new a6.b(aVar));
    }

    public static float[] M(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static q81.r N(String str, String str2, q81.y yVar) {
        StringBuilder p = f1.e.p("form-data; name=");
        q81.q qVar = q81.s.e;
        d5.s(str, p);
        if (str2 != null) {
            p.append("; filename=");
            d5.s(str2, p);
        }
        String sb = p.toString();
        ia.d dVar = new ia.d(4);
        dVar.d("Content-Disposition", sb);
        q81.n e = dVar.e();
        if (e.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (e.a("Content-Length") == null) {
            return new q81.r(e, yVar);
        }
        throw new IllegalArgumentException("Unexpected header: Content-Length");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static r4.d[] O(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i12 = i6; i12 < trim.length(); i12++) {
                                        char charAt2 = trim.charAt(i12);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i12 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i12) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i12));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i12 : i12 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i12) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = M(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e) {
                                throw new RuntimeException(f1.e.z("error in parsing \"", trim, "\""), e);
                            }
                        }
                        arrayList.add(new r4.d(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new r4.d(str.charAt(i3), new float[0]));
        }
        return (r4.d[]) arrayList.toArray(new r4.d[i]);
    }

    public static Path P(String str) {
        Path path = new Path();
        try {
            r4.d.b(O(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static final ArrayList Q(List list, List list2) {
        k.g(list, "<this>");
        k.g(list2, "that");
        ArrayList arrayList = new ArrayList(x61.n.F(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((o2) it.next()).getId());
        }
        Set K0 = x61.m.K0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!K0.contains(((o2) obj).getId())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static r4.d[] R(r4.d[] dVarArr) {
        r4.d[] dVarArr2 = new r4.d[dVarArr.length];
        for (int i = 0; i < dVarArr.length; i++) {
            dVarArr2[i] = new r4.d(dVarArr[i]);
        }
        return dVarArr2;
    }

    public static final ar0.r S(wn wnVar) {
        ao aoVar;
        xn xnVar;
        yn ynVar;
        zn znVar = wnVar.a;
        if (znVar == null || (aoVar = znVar.a) == null || (xnVar = aoVar.a) == null || (ynVar = xnVar.c) == null) {
            return null;
        }
        return ynVar.b;
    }

    public static String T(androidx.datastore.preferences.protobuf.g gVar) {
        StringBuilder sb = new StringBuilder(gVar.size());
        for (int i = 0; i < gVar.size(); i++) {
            byte a = gVar.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void V(String str, Bundle bundle) {
        k.g(str, "key");
        bundle.putString(str, null);
    }

    public static final void W(Intent intent, Bundle bundle) {
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
    }

    public static final void X(Bundle bundle, String str, Bundle bundle2) {
        k.g(str, "key");
        k.g(bundle2, "value");
        bundle.putBundle(str, bundle2);
    }

    public static final void Y(String str, String str2, Bundle bundle) {
        k.g(str, "key");
        k.g(str2, "value");
        bundle.putString(str, str2);
    }

    public static final void Z(Bundle bundle, String str, String[] strArr) {
        k.g(str, "key");
        k.g(strArr, "value");
        bundle.putStringArray(str, strArr);
    }

    public static final void a(n nVar, i6.c cVar, r1.d dVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        sVar.e0(227045628);
        int i4 = (sVar.f(nVar) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (sVar.f(cVar) ? 32 : 16);
        }
        if ((i3 & 147) == 146 && sVar.C()) {
            sVar.V();
        } else {
            if (i5 != 0) {
                cVar = i6.c.c;
            }
            sVar.d0(1849434622);
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = i6.d.z;
                sVar.n0(N);
            }
            sVar.q(false);
            j71.a aVar = (j71.a) ((k71.i) N);
            sVar.d0(-683746039);
            sVar.d0(-548224868);
            if (!(sVar.a instanceof z5.b)) {
                t.x();
                throw null;
            }
            sVar.a0();
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.q0();
            }
            t.I(sVar, new he.c(12), nVar);
            t.I(sVar, new he.c(13), cVar);
            dVar.s(sVar, 6);
            sVar.q(true);
            sVar.q(false);
            sVar.q(false);
        }
        i6.c cVar2 = cVar;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new v(nVar, cVar2, dVar, i, i2, 20);
        }
    }

    public static final void a0(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r5.j(r7, r6, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(com.github.service.wrapper.b bVar, j71.c cVar, c71.c cVar2) {
        z8 z8Var;
        int i;
        uk0.f fVar;
        if (cVar2 instanceof z8) {
            z8Var = (z8) cVar2;
            int i2 = z8Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z8Var.x = i2 - Integer.MIN_VALUE;
                Object obj = z8Var.w;
                b71.a aVar = b71.a.r;
                i = z8Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    s0 iVar = new uk0.i();
                    z8Var.u = bVar;
                    z8Var.v = cVar;
                    z8Var.x = 1;
                    obj = bVar.f(iVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = z8Var.v;
                    bVar = z8Var.u;
                    sy.y.j(obj);
                }
                fVar = (uk0.f) obj;
                if (fVar != null) {
                    h hVar = fVar.a;
                    uk0.f fVar2 = new uk0.f(new h(hVar.a, new uk0.g(((Number) cVar.k(new Integer(hVar.b.a))).intValue()), hVar.c));
                    uk0.i iVar2 = new uk0.i();
                    z8Var.u = null;
                    z8Var.v = null;
                    z8Var.x = 2;
                }
                return w61.a0.a;
            }
        }
        z8Var = new z8(cVar2);
        Object obj2 = z8Var.w;
        b71.a aVar2 = b71.a.r;
        i = z8Var.x;
        if (i != 0) {
        }
        fVar = (uk0.f) obj2;
        if (fVar != null) {
        }
        return w61.a0.a;
    }

    public static final Object b0(j71.e eVar) {
        Thread.interrupted();
        return v71.b0.D(a71.i.r, new androidx.lifecycle.n(eVar, (a71.c) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g01.a c(gi giVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool;
        Boolean bool2;
        com.github.service.models.response.a aVar;
        String str10;
        int i;
        int i2;
        int i3;
        hi hiVar;
        o.b bVar;
        com.github.service.models.response.a aVar2;
        k.g(giVar, "<this>");
        hi hiVar2 = giVar.a;
        boolean z = hiVar2.d;
        ArrayList arrayList = hiVar2.f.a;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            fw0.w wVar = (fw0.w) obj;
            com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(hiVar2.c, m7.y.L(hiVar2.e), (String) null, false, (String) null, 60);
            k.g(wVar, "<this>");
            p pVar = wVar.d;
            fw0.r rVar = pVar.c;
            fw0.s sVar = pVar.b;
            String str11 = "";
            if (rVar != null) {
                str2 = rVar.a;
            } else if (sVar != null) {
                str2 = sVar.a;
            } else {
                str = "";
                if (rVar == null) {
                    str4 = rVar.b;
                } else if (sVar != null) {
                    str4 = sVar.b;
                } else {
                    str3 = "";
                    if (rVar != null) {
                        str6 = rVar.c;
                    } else if (sVar != null) {
                        str6 = sVar.c;
                    } else {
                        str5 = "";
                        if (rVar == null) {
                            str8 = rVar.i.b;
                        } else if (sVar != null) {
                            str8 = sVar.k.b;
                        } else {
                            str7 = "";
                            if (rVar != null) {
                                str11 = rVar.i.c.c;
                            } else if (sVar != null) {
                                str11 = sVar.k.c.c;
                            }
                            String str12 = str11;
                            if (rVar != null || (bool2 = rVar.g) == null) {
                                if (sVar != null) {
                                    bool2 = sVar.h;
                                } else {
                                    str9 = str;
                                    bool = null;
                                    if (rVar == null) {
                                        i2 = rVar.d;
                                    } else if (sVar != null) {
                                        i2 = sVar.d;
                                    } else {
                                        aVar = aVar3;
                                        str10 = str3;
                                        i = 0;
                                        je jeVar = wVar.a;
                                        x1 x1Var = InteractionType.Companion;
                                        String str13 = jeVar.r;
                                        x1Var.getClass();
                                        InteractionType a = x1.a(str13);
                                        o oVar = wVar.c;
                                        g01.c cVar = new g01.c(a, oVar != null ? oVar.b : null, m7.y.L(oVar != null ? oVar.d : null), wVar.b, aVar);
                                        String str14 = str5;
                                        com.github.service.models.response.a aVar4 = aVar;
                                        if (rVar != null) {
                                            i3 = rVar.f.a;
                                        } else if (sVar != null) {
                                            Integer num = sVar.e;
                                            i3 = num != null ? num.intValue() : sVar.g.a;
                                        } else {
                                            i3 = 0;
                                        }
                                        if (rVar != null) {
                                            String str15 = rVar.a;
                                            String str16 = rVar.b;
                                            int i5 = rVar.d;
                                            r01.e eVar = IssueState.Companion;
                                            String str17 = rVar.e.r;
                                            eVar.getClass();
                                            IssueState b = r01.e.b(str17);
                                            x xVar = rVar.i;
                                            hiVar = hiVar2;
                                            bVar = new q4(str15, str16, i5, b, xVar.c.c, xVar.b, b4.k0(rVar.j));
                                        } else if (sVar != null) {
                                            String str18 = sVar.a;
                                            String str19 = sVar.b;
                                            boolean z2 = sVar.i;
                                            int i6 = sVar.d;
                                            PullRequestState Q = z3.Q(sVar.f);
                                            fw0.y yVar = sVar.k;
                                            hiVar = hiVar2;
                                            o.b r4Var = new r4(str18, str19, z2, i6, Q, yVar.c.c, yVar.b, sVar.l);
                                            aVar2 = aVar4;
                                            bVar = r4Var;
                                            arrayList2.add(new g01.f(aVar2, str9, str10, str14, str7, str12, bool, i, cVar, i3, bVar));
                                            hiVar2 = hiVar;
                                        } else {
                                            hiVar = hiVar2;
                                            bVar = z4.t;
                                        }
                                        aVar2 = aVar4;
                                        arrayList2.add(new g01.f(aVar2, str9, str10, str14, str7, str12, bool, i, cVar, i3, bVar));
                                        hiVar2 = hiVar;
                                    }
                                    aVar = aVar3;
                                    str10 = str3;
                                    i = i2;
                                    je jeVar2 = wVar.a;
                                    x1 x1Var2 = InteractionType.Companion;
                                    String str132 = jeVar2.r;
                                    x1Var2.getClass();
                                    InteractionType a2 = x1.a(str132);
                                    o oVar2 = wVar.c;
                                    g01.c cVar2 = new g01.c(a2, oVar2 != null ? oVar2.b : null, m7.y.L(oVar2 != null ? oVar2.d : null), wVar.b, aVar);
                                    String str142 = str5;
                                    com.github.service.models.response.a aVar42 = aVar;
                                    if (rVar != null) {
                                    }
                                    if (rVar != null) {
                                    }
                                    aVar2 = aVar42;
                                    arrayList2.add(new g01.f(aVar2, str9, str10, str142, str7, str12, bool, i, cVar2, i3, bVar));
                                    hiVar2 = hiVar;
                                }
                            }
                            str9 = str;
                            bool = bool2;
                            if (rVar == null) {
                            }
                            aVar = aVar3;
                            str10 = str3;
                            i = i2;
                            je jeVar22 = wVar.a;
                            x1 x1Var22 = InteractionType.Companion;
                            String str1322 = jeVar22.r;
                            x1Var22.getClass();
                            InteractionType a22 = x1.a(str1322);
                            o oVar22 = wVar.c;
                            g01.c cVar22 = new g01.c(a22, oVar22 != null ? oVar22.b : null, m7.y.L(oVar22 != null ? oVar22.d : null), wVar.b, aVar);
                            String str1422 = str5;
                            com.github.service.models.response.a aVar422 = aVar;
                            if (rVar != null) {
                            }
                            if (rVar != null) {
                            }
                            aVar2 = aVar422;
                            arrayList2.add(new g01.f(aVar2, str9, str10, str1422, str7, str12, bool, i, cVar22, i3, bVar));
                            hiVar2 = hiVar;
                        }
                        str7 = str8;
                        if (rVar != null) {
                        }
                        String str122 = str11;
                        if (rVar != null) {
                        }
                        if (sVar != null) {
                        }
                    }
                    str5 = str6;
                    if (rVar == null) {
                    }
                    str7 = str8;
                    if (rVar != null) {
                    }
                    String str1222 = str11;
                    if (rVar != null) {
                    }
                    if (sVar != null) {
                    }
                }
                str3 = str4;
                if (rVar != null) {
                }
                str5 = str6;
                if (rVar == null) {
                }
                str7 = str8;
                if (rVar != null) {
                }
                String str12222 = str11;
                if (rVar != null) {
                }
                if (sVar != null) {
                }
            }
            str = str2;
            if (rVar == null) {
            }
            str3 = str4;
            if (rVar != null) {
            }
            str5 = str6;
            if (rVar == null) {
            }
            str7 = str8;
            if (rVar != null) {
            }
            String str122222 = str11;
            if (rVar != null) {
            }
            if (sVar != null) {
            }
        }
        return new g01.a(arrayList2, z);
    }

    public static final y00 c0(ShortcutIcon shortcutIcon) {
        switch (shortcutIcon == null ? -1 : jx0.p.a[shortcutIcon.ordinal()]) {
            case -1:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                return y00.Y;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return y00.X;
            case 2:
                return y00.J;
            case 3:
                return y00.H;
            case 4:
                return y00.C;
            case 5:
                return y00.O;
            case 6:
                return y00.P;
            case 7:
                return y00.w;
            case 8:
                return y00.F;
            case 9:
                return y00.B;
            case 10:
                return y00.A;
            case 11:
                return y00.V;
            case 12:
                return y00.W;
            case 13:
                return y00.u;
            case 14:
                return y00.t;
            case 15:
                return y00.E;
            case 16:
                return y00.U;
            case 17:
                return y00.v;
            case 18:
                return y00.y;
            case 19:
                return y00.L;
            case 20:
                return y00.M;
            case 21:
                return y00.T;
            case 22:
                return y00.G;
            case 23:
                return y00.x;
            case 24:
                return y00.N;
            case 25:
                return y00.Q;
            case 26:
                return y00.S;
            case 27:
                return y00.I;
            case 28:
                return y00.D;
            case 29:
                return y00.z;
            case 30:
                return y00.K;
            case 31:
                return y00.R;
            case 32:
                return y00.P;
        }
    }

    public static final MergeCheckStatus d(StatusState statusState) {
        k.g(statusState, "<this>");
        switch (sy.g.a[statusState.ordinal()]) {
            case 1:
            case 2:
                return MergeCheckStatus.FAILURE;
            case 3:
                return MergeCheckStatus.SUCCESS;
            case 4:
            case 5:
            case 6:
                return MergeCheckStatus.PENDING;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CloseReason d0(zc zcVar) {
        int i = zcVar == null ? -1 : pl0.m.b[zcVar.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return CloseReason.Completed;
        }
        if (i == 2) {
            return CloseReason.NotPlanned;
        }
        if (i == 3 || i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final MergeCheckStatus e(t3 t3Var) {
        switch (t3Var.ordinal()) {
            case 0:
                return MergeCheckStatus.ACTION_REQUIRED;
            case 1:
                return MergeCheckStatus.CANCELLED;
            case 2:
            case 6:
            case 8:
                return MergeCheckStatus.FAILURE;
            case 3:
                return MergeCheckStatus.NEUTRAL;
            case 4:
                return MergeCheckStatus.SKIPPED;
            case 5:
                return MergeCheckStatus.STALE;
            case 7:
                return MergeCheckStatus.SUCCESS;
            case 9:
                return MergeCheckStatus.PENDING;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final DiscussionCategoryData e0(b01.e eVar) {
        k.g(eVar, "<this>");
        return new DiscussionCategoryData(eVar.a, eVar.b, eVar.c, eVar.d, eVar.e, eVar.f, eVar.g);
    }

    public static final kx0.g f(ws0.a aVar) {
        if (aVar != null) {
            return new kx0.g(aVar.b, aVar.c, w8.s.F(aVar.d), (int) aVar.e, aVar.f);
        }
        return null;
    }

    public static final WorkflowRunEvent f0(gh0 gh0Var) {
        switch (gh0Var == null ? -1 : dz.t.a[gh0Var.ordinal()]) {
            case -1:
            case 36:
            case 37:
            case 38:
                return WorkflowRunEvent.UNKNOWN__;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return WorkflowRunEvent.BRANCH_PROTECTION_RULE;
            case 2:
                return WorkflowRunEvent.CHECK_RUN;
            case 3:
                return WorkflowRunEvent.CHECK_SUITE;
            case 4:
                return WorkflowRunEvent.CREATE;
            case 5:
                return WorkflowRunEvent.DELETE;
            case 6:
                return WorkflowRunEvent.DEPLOYMENT;
            case 7:
                return WorkflowRunEvent.DEPLOYMENT_STATUS;
            case 8:
                return WorkflowRunEvent.DISCUSSION;
            case 9:
                return WorkflowRunEvent.DISCUSSION_COMMENT;
            case 10:
                return WorkflowRunEvent.DYNAMIC;
            case 11:
                return WorkflowRunEvent.FORK;
            case 12:
                return WorkflowRunEvent.GOLLUM;
            case 13:
                return WorkflowRunEvent.ISSUES;
            case 14:
                return WorkflowRunEvent.ISSUE_COMMENT;
            case 15:
                return WorkflowRunEvent.LABEL;
            case 16:
                return WorkflowRunEvent.MERGE_GROUP;
            case 17:
                return WorkflowRunEvent.MILESTONE;
            case 18:
                return WorkflowRunEvent.PAGE_BUILD;
            case 19:
                return WorkflowRunEvent.PROJECT;
            case 20:
                return WorkflowRunEvent.PROJECT_CARD;
            case 21:
                return WorkflowRunEvent.PROJECT_COLUMN;
            case 22:
                return WorkflowRunEvent.PUBLIC;
            case 23:
                return WorkflowRunEvent.PULL_REQUEST;
            case 24:
                return WorkflowRunEvent.PULL_REQUEST_REVIEW;
            case 25:
                return WorkflowRunEvent.PULL_REQUEST_REVIEW_COMMENT;
            case 26:
                return WorkflowRunEvent.PULL_REQUEST_TARGET;
            case 27:
                return WorkflowRunEvent.PUSH;
            case 28:
                return WorkflowRunEvent.REGISTRY_PACKAGE;
            case 29:
                return WorkflowRunEvent.RELEASE;
            case 30:
                return WorkflowRunEvent.REPOSITORY_DISPATCH;
            case 31:
                return WorkflowRunEvent.SCHEDULE;
            case 32:
                return WorkflowRunEvent.STATUS;
            case 33:
                return WorkflowRunEvent.WATCH;
            case 34:
                return WorkflowRunEvent.WORKFLOW_DISPATCH;
            case 35:
                return WorkflowRunEvent.WORKFLOW_RUN;
        }
    }

    public static final l01.v g(f00.e eVar, List list) {
        List list2;
        u uVar;
        u u0Var;
        g1 g1Var = eVar.d;
        p0 i = com.google.common.util.concurrent.a.i(g1Var);
        if (g1Var.f == ew.t) {
            uVar = new v0(g1Var.b);
        } else {
            f00.a aVar = eVar.c;
            if (aVar == null) {
                list2 = list;
                uVar = null;
                return new l01.v(i, uVar, list2);
            }
            f00.c cVar = aVar.b;
            if (cVar != null) {
                f00.q qVar = cVar.c;
                String str = qVar.b;
                String str2 = qVar.c;
                String str3 = qVar.e;
                int i2 = qVar.d;
                Integer num = qVar.i;
                int intValue = num != null ? num.intValue() : 0;
                IssueState O = i21.a.O(qVar.g);
                ZonedDateTime zonedDateTime = qVar.h;
                CloseReason w = sy.w.w(qVar.j);
                int i3 = qVar.k;
                int i4 = qVar.l;
                boolean z = qVar.f;
                boolean z2 = qVar.m;
                boolean z3 = qVar.n;
                boolean z4 = qVar.o;
                boolean z5 = qVar.q;
                boolean z6 = qVar.r;
                f00.n nVar = qVar.s;
                IssueType f = nVar != null ? z3.f(nVar.c) : null;
                h01.p e = sy.u.e(qVar.v);
                q0 q0Var = qVar.w.a;
                h01.j f2 = q0Var != null ? sy.s.f(q0Var) : null;
                f00.p pVar = qVar.t;
                String str4 = pVar.c.b;
                String str5 = pVar.b;
                f00.m mVar = qVar.u;
                u0Var = new l01.r(str, str2, str3, i2, zonedDateTime, intValue, i3, i4, z, z2, z3, z4, z5, z6, O, w, f, e, f2, str4, str5, mVar != null ? sy.c.j(mVar.c) : null);
            } else {
                f00.d dVar = aVar.c;
                if (dVar != null) {
                    f00.w wVar = dVar.c;
                    String str6 = wVar.b;
                    String str7 = wVar.c;
                    String str8 = wVar.e;
                    int i5 = wVar.d;
                    Integer num2 = wVar.l;
                    int intValue2 = num2 != null ? num2.intValue() : 0;
                    PullRequestState C = a.a.C(wVar.g);
                    u0Var = new u0(str6, str7, str8, i5, wVar.j, intValue2, wVar.m, wVar.n, wVar.f, wVar.q, wVar.r, wVar.s, wVar.t, wVar.u, sy.c.c(wVar.v), C, wVar.h, wVar.i, wVar.o, wVar.p);
                } else {
                    f00.b bVar = aVar.d;
                    if (bVar != null) {
                        f00.k kVar = bVar.c;
                        uVar = new l01.a(kVar.b, kVar.c, kVar.d);
                    } else {
                        uVar = null;
                    }
                }
            }
            uVar = u0Var;
        }
        list2 = list;
        return new l01.v(i, uVar, list2);
    }

    public static final DiffLineType g0(xc xcVar) {
        k.g(xcVar, "<this>");
        int ordinal = xcVar.ordinal();
        if (ordinal == 0) {
            return DiffLineType.ADDITION;
        }
        if (ordinal == 1) {
            return DiffLineType.CONTEXT;
        }
        if (ordinal == 2) {
            return DiffLineType.DELETION;
        }
        if (ordinal == 3) {
            return DiffLineType.HUNK;
        }
        if (ordinal == 4) {
            return DiffLineType.INJECTED_CONTEXT;
        }
        if (ordinal == 5) {
            return DiffLineType.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final l0 h(x0 x0Var) {
        f00.v0 v0Var;
        f00.v0 v0Var2;
        k.g(x0Var, "<this>");
        r0 r0Var = x0Var.h;
        ArrayList arrayList = null;
        List<t0> list = r0Var != null ? r0Var.a : null;
        List list2 = r.r;
        if (list == null) {
            list = list2;
        }
        ArrayList arrayList2 = new ArrayList();
        for (t0 t0Var : list) {
            String str = (t0Var == null || (v0Var2 = t0Var.b) == null) ? null : v0Var2.b.b;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        Set K0 = x61.m.K0(arrayList2);
        List<t0> list3 = r0Var != null ? r0Var.a : null;
        if (list3 == null) {
            list3 = list2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (t0 t0Var2 : list3) {
            ProjectFieldType R = z3.R((t0Var2 == null || (v0Var = t0Var2.b) == null) ? null : v0Var.b.a);
            if (R != null) {
                arrayList3.add(R);
            }
        }
        Set K02 = x61.m.K0(arrayList3);
        l01.r0 r0Var2 = ProjectViewLayoutType.Companion;
        String str2 = x0Var.d.r;
        r0Var2.getClass();
        ProjectViewLayoutType a = l01.r0.a(str2);
        f00.s0 s0Var = x0Var.f;
        if (s0Var != null) {
            LinkedHashMap Q = i4.Q(s0Var.b);
            arrayList = new ArrayList(Q.size());
            Iterator it = Q.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((j0) ((Map.Entry) it.next()).getValue());
            }
        }
        String str3 = x0Var.a;
        Integer num = x0Var.b;
        return new l0(str3, num != null ? num.intValue() : 0, x0Var.c, a, x0Var.e, arrayList == null ? list2 : arrayList, K0, K02);
    }

    public static final MilestoneState h0(of ofVar) {
        int ordinal = ofVar.ordinal();
        if (ordinal == 0) {
            return MilestoneState.CLOSED;
        }
        if (ordinal == 1) {
            return MilestoneState.OPEN;
        }
        if (ordinal == 2) {
            return MilestoneState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [yz0.r6] */
    /* JADX WARN: Type inference failed for: r10v4, types: [yz0.r6] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r5v11, types: [yz0.d7] */
    /* JADX WARN: Type inference failed for: r5v12, types: [yz0.s5] */
    /* JADX WARN: Type inference failed for: r5v13, types: [yz0.r7] */
    /* JADX WARN: Type inference failed for: r5v14, types: [yz0.x5] */
    /* JADX WARN: Type inference failed for: r5v15, types: [yz0.y5] */
    /* JADX WARN: Type inference failed for: r5v16, types: [yz0.w5] */
    /* JADX WARN: Type inference failed for: r5v17, types: [yz0.v5] */
    /* JADX WARN: Type inference failed for: r5v18, types: [yz0.k6] */
    /* JADX WARN: Type inference failed for: r5v19, types: [yz0.a6] */
    /* JADX WARN: Type inference failed for: r5v20, types: [yz0.n6] */
    /* JADX WARN: Type inference failed for: r5v28, types: [yz0.j6] */
    /* JADX WARN: Type inference failed for: r5v29, types: [yz0.u6] */
    /* JADX WARN: Type inference failed for: r5v30, types: [yz0.c6] */
    /* JADX WARN: Type inference failed for: r5v31, types: [yz0.d6] */
    /* JADX WARN: Type inference failed for: r5v32, types: [yz0.b7] */
    /* JADX WARN: Type inference failed for: r5v33, types: [yz0.a7] */
    /* JADX WARN: Type inference failed for: r5v34, types: [yz0.h7] */
    /* JADX WARN: Type inference failed for: r5v46, types: [yz0.l6] */
    /* JADX WARN: Type inference failed for: r5v47, types: [yz0.z6] */
    /* JADX WARN: Type inference failed for: r5v48, types: [yz0.v6] */
    /* JADX WARN: Type inference failed for: r5v51, types: [yz0.c7] */
    /* JADX WARN: Type inference failed for: r5v52, types: [yz0.h6] */
    /* JADX WARN: Type inference failed for: r5v53, types: [yz0.i6] */
    /* JADX WARN: Type inference failed for: r5v54, types: [yz0.w6] */
    /* JADX WARN: Type inference failed for: r5v55, types: [yz0.p7] */
    /* JADX WARN: Type inference failed for: r5v56, types: [yz0.t6] */
    /* JADX WARN: Type inference failed for: r5v57, types: [yz0.o7] */
    /* JADX WARN: Type inference failed for: r5v58, types: [yz0.q6] */
    /* JADX WARN: Type inference failed for: r5v59, types: [yz0.g7] */
    /* JADX WARN: Type inference failed for: r5v60, types: [yz0.b6] */
    /* JADX WARN: Type inference failed for: r5v61, types: [yz0.n7] */
    /* JADX WARN: Type inference failed for: r5v62, types: [yz0.u5] */
    /* JADX WARN: Type inference failed for: r5v63, types: [yz0.f7] */
    /* JADX WARN: Type inference failed for: r5v65, types: [yz0.o6] */
    /* JADX WARN: Type inference failed for: r9v10, types: [yz0.m6] */
    /* JADX WARN: Type inference failed for: r9v19, types: [yz0.i7] */
    /* JADX WARN: Type inference failed for: r9v21, types: [yz0.j7] */
    public static final h01.q i(xt0.b4 b4Var) {
        String str;
        qp0.a aVar;
        e eVar;
        Object r6Var;
        z5 z5Var;
        eq0.e eVar2;
        ss0.r rVar;
        ss0.b bVar;
        iw0.c cVar;
        mp0.b bVar2;
        op0.b bVar3;
        kp0.b bVar4;
        ip0.b bVar5;
        sq0.e eVar3;
        DeploymentStatusState deploymentStatusState;
        sp0.b bVar6;
        sr0.c cVar2;
        qr0.e eVar4;
        qq0.d dVar;
        os0.e eVar5;
        aq0.c cVar3;
        gq0.b bVar7;
        iu0.b bVar8;
        cu0.c cVar4;
        zu0.d dVar2;
        zu0.b bVar9;
        dv0.c cVar5;
        String str2;
        pv0.b bVar10;
        pv0.b bVar11;
        String str3;
        cp0.c cVar6;
        z5 z5Var2;
        fv0.c cVar7;
        String str4;
        pv0.b bVar12;
        pv0.b bVar13;
        String str5;
        cp0.c cVar8;
        or0.b bVar14;
        au0.d dVar3;
        us0.c cVar9;
        f fVar;
        i iVar;
        oq0.b bVar15;
        ys0.b bVar16;
        xv0.b bVar17;
        ms0.b bVar18;
        vv0.c cVar10;
        es0.c cVar11;
        ou0.b bVar19;
        m mVar;
        tv0.c cVar12;
        gp0.c cVar13;
        mu0.b bVar20;
        wr0.a aVar2;
        String str6 = b4Var.b;
        a4 a4Var = b4Var.c;
        int i = a4Var.b;
        Iterable<y3> iterable = a4Var.d;
        if (iterable == null) {
            iterable = r.r;
        }
        ArrayList arrayList = new ArrayList();
        for (y3 y3Var : iterable) {
            if (y3Var != null && (aVar2 = y3Var.c) != null) {
                z5Var = b4.k(aVar2);
            } else if (y3Var != null && (bVar20 = y3Var.d) != null) {
                z5Var = b4.u(bVar20);
            } else if (y3Var != null && (cVar13 = y3Var.e) != null) {
                z5Var = b4.f(cVar13);
            } else if (y3Var != null && (cVar12 = y3Var.f) != null) {
                z5Var = b4.y(cVar12);
            } else if (y3Var != null && (mVar = y3Var.g) != null) {
                z5Var = b4.g(mVar);
            } else if (y3Var != null && (bVar19 = y3Var.h) != null) {
                z5Var = b4.x(bVar19);
            } else if (y3Var != null && (cVar11 = y3Var.i) != null) {
                z5Var = b4.n(cVar11);
            } else if (y3Var != null && (cVar10 = y3Var.j) != null) {
                z5Var = b4.z(cVar10);
            } else if (y3Var != null && (bVar18 = y3Var.k) != null) {
                z5Var = b4.o(bVar18);
            } else if (y3Var != null && (bVar17 = y3Var.l) != null) {
                z5Var = b4.A(bVar17);
            } else if (y3Var != null && (bVar16 = y3Var.m) != null) {
                z5Var = b4.q(bVar16);
            } else if (y3Var != null && (bVar15 = y3Var.n) != null) {
                z5Var = b4.j(bVar15);
            } else if (y3Var == null || (iVar = y3Var.o) == null) {
                z5 z5Var3 = null;
                z5Var3 = null;
                r6 = null;
                cp0.c cVar14 = null;
                DeploymentState deploymentState = null;
                z5Var3 = null;
                if (y3Var == null || (fVar = y3Var.p) == null) {
                    str = "";
                    if (y3Var != null && (cVar9 = y3Var.q) != null) {
                        us0.b bVar21 = cVar9.e;
                        String str7 = bVar21 != null ? bVar21.b : "";
                        String str8 = cVar9.d;
                        us0.a aVar3 = cVar9.c;
                        z5Var = new v6(new com.github.service.models.response.a(aVar3 != null ? aVar3.b.b : "", m7.y.L(aVar3 != null ? aVar3.b.f : null), (String) null, false, (String) null, 60), str7, str8, cVar9.f);
                    } else if (y3Var != null && (dVar3 = y3Var.r) != null) {
                        z5Var = b4.r(dVar3);
                    } else if (y3Var == null || (bVar14 = y3Var.s) == null) {
                        if (y3Var != null && (cVar7 = y3Var.u) != null) {
                            fv0.b bVar22 = cVar7.d;
                            fv0.a aVar4 = cVar7.c;
                            com.github.service.models.response.a e = k41.b.e(aVar4 != null ? aVar4.b : null);
                            if (bVar22 == null || (cVar8 = bVar22.b) == null || (str4 = k41.b.e(cVar8).z) == null) {
                                str4 = (bVar22 == null || (bVar12 = bVar22.c) == null) ? "" : bVar12.b;
                            }
                            if (bVar22 != null && (bVar13 = bVar22.c) != null && (str5 = bVar13.c.b) != null) {
                                str = str5;
                            }
                            z5Var2 = new j7(e, str4, str, cVar7.e);
                        } else if (y3Var != null && (cVar5 = y3Var.v) != null) {
                            dv0.b bVar23 = cVar5.d;
                            dv0.a aVar5 = cVar5.c;
                            com.github.service.models.response.a e2 = k41.b.e(aVar5 != null ? aVar5.b : null);
                            if (bVar23 == null || (cVar6 = bVar23.b) == null || (str2 = k41.b.e(cVar6).z) == null) {
                                str2 = (bVar23 == null || (bVar10 = bVar23.c) == null) ? "" : bVar10.b;
                            }
                            if (bVar23 != null && (bVar11 = bVar23.c) != null && (str3 = bVar11.c.b) != null) {
                                str = str3;
                            }
                            z5Var2 = new i7(e2, str2, str, cVar5.e);
                        } else if (y3Var != null && (dVar2 = y3Var.w) != null) {
                            zu0.a aVar6 = dVar2.c;
                            com.github.service.models.response.a e3 = k41.b.e(aVar6 != null ? aVar6.b : null);
                            zu0.c cVar15 = dVar2.e;
                            if (cVar15 != null && (bVar9 = cVar15.b) != null) {
                                cVar14 = bVar9.b;
                            }
                            com.github.service.models.response.a e4 = k41.b.e(cVar14);
                            String str9 = dVar2.d;
                            z5Var = new h7(e3, e4, str9 != null ? str9 : "", dVar2.f);
                        } else if (y3Var != null && (cVar4 = y3Var.x) != null) {
                            z5Var = b4.s(cVar4);
                        } else if (y3Var != null && (bVar8 = y3Var.y) != null) {
                            iu0.a aVar7 = bVar8.c;
                            z5Var = new b7(aVar7 != null ? aVar7.b.b : "", bVar8.d);
                        } else if (y3Var != null && (bVar7 = y3Var.z) != null) {
                            gq0.a aVar8 = bVar7.c;
                            z5Var = new d6(aVar8 != null ? aVar8.b.b : "", bVar7.d);
                        } else if (y3Var != null && (cVar3 = y3Var.B) != null) {
                            z5Var = b4.h(cVar3);
                        } else if (y3Var != null && (eVar5 = y3Var.F) != null) {
                            z5Var = b4.p(eVar5);
                        } else if (y3Var != null && (dVar = y3Var.A) != null) {
                            qq0.a aVar9 = dVar.c;
                            str = aVar9 != null ? aVar9.b.b : "";
                            qq0.b bVar24 = dVar.d;
                            String str10 = bVar24.c;
                            g9 g9Var = bVar24.b;
                            if (g9Var != null) {
                                switch (g9Var.ordinal()) {
                                    case 0:
                                        deploymentState = DeploymentState.ABANDONED;
                                        break;
                                    case 1:
                                        deploymentState = DeploymentState.ACTIVE;
                                        break;
                                    case 2:
                                        deploymentState = DeploymentState.DESTROYED;
                                        break;
                                    case 3:
                                        deploymentState = DeploymentState.ERROR;
                                        break;
                                    case 4:
                                        deploymentState = DeploymentState.FAILURE;
                                        break;
                                    case 5:
                                        deploymentState = DeploymentState.INACTIVE;
                                        break;
                                    case 6:
                                        deploymentState = DeploymentState.IN_PROGRESS;
                                        break;
                                    case 7:
                                        deploymentState = DeploymentState.PENDING;
                                        break;
                                    case 8:
                                        deploymentState = DeploymentState.QUEUED;
                                        break;
                                    case 9:
                                        deploymentState = DeploymentState.SUCCESS;
                                        break;
                                    case 10:
                                        deploymentState = DeploymentState.WAITING;
                                        break;
                                    case 11:
                                        deploymentState = DeploymentState.UNKNOWN__;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                            }
                            z5Var = new j6(str, str10, deploymentState, dVar.e);
                        } else if (y3Var != null && (eVar4 = y3Var.C) != null) {
                            qr0.a aVar10 = eVar4.c;
                            String str11 = aVar10 != null ? aVar10.b.b : "";
                            qr0.c cVar16 = eVar4.f;
                            String str12 = cVar16 != null ? cVar16.b : "";
                            qr0.b bVar25 = eVar4.g;
                            z5Var2 = new m6(str11, str12, bVar25 != null ? bVar25.b : "", eVar4.e.b, eVar4.d);
                        } else if (y3Var != null && (cVar2 = y3Var.t) != null) {
                            sr0.a aVar11 = cVar2.c;
                            z5Var = new n6(aVar11 != null ? aVar11.b.b : "", cVar2.d.a, cVar2.e);
                        } else if (y3Var != null && (bVar6 = y3Var.E) != null) {
                            sp0.a aVar12 = bVar6.c;
                            z5Var = new a6(aVar12 != null ? aVar12.b.b : "", bVar6.e, bVar6.f, bVar6.d);
                        } else if (y3Var != null && (eVar3 = y3Var.G) != null) {
                            sq0.a aVar13 = eVar3.c;
                            str = aVar13 != null ? aVar13.b.b : "";
                            sq0.c cVar17 = eVar3.e;
                            String str13 = cVar17.d.c;
                            switch (cVar17.b.ordinal()) {
                                case 0:
                                    deploymentStatusState = DeploymentStatusState.ERROR;
                                    break;
                                case 1:
                                    deploymentStatusState = DeploymentStatusState.FAILURE;
                                    break;
                                case 2:
                                    deploymentStatusState = DeploymentStatusState.INACTIVE;
                                    break;
                                case 3:
                                    deploymentStatusState = DeploymentStatusState.IN_PROGRESS;
                                    break;
                                case 4:
                                    deploymentStatusState = DeploymentStatusState.PENDING;
                                    break;
                                case 5:
                                    deploymentStatusState = DeploymentStatusState.QUEUED;
                                    break;
                                case 6:
                                    deploymentStatusState = DeploymentStatusState.SUCCESS;
                                    break;
                                case 7:
                                    deploymentStatusState = DeploymentStatusState.WAITING;
                                    break;
                                case 8:
                                    deploymentStatusState = DeploymentStatusState.UNKNOWN__;
                                    break;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                            z5Var = new k6(str, str13, deploymentStatusState, eVar3.d);
                        } else if (y3Var != null && (bVar5 = y3Var.K) != null) {
                            ip0.a aVar14 = bVar5.b;
                            com.github.service.models.response.a aVar15 = new com.github.service.models.response.a(aVar14 != null ? aVar14.b.b : "", m7.y.L(aVar14 != null ? aVar14.b.f : null), (String) null, false, (String) null, 60);
                            String str14 = bVar5.d;
                            z5Var = new v5(aVar15, str14 != null ? str14 : "", bVar5.c);
                        } else if (y3Var != null && (bVar4 = y3Var.H) != null) {
                            kp0.a aVar16 = bVar4.b;
                            z5Var = new w5(new com.github.service.models.response.a(aVar16 != null ? aVar16.b.b : "", m7.y.L(aVar16 != null ? aVar16.b.f : null), (String) null, false, (String) null, 60), bVar4.c);
                        } else if (y3Var != null && (bVar3 = y3Var.I) != null) {
                            op0.a aVar17 = bVar3.b;
                            z5Var = new y5(new com.github.service.models.response.a(aVar17 != null ? aVar17.b.b : "", m7.y.L(aVar17 != null ? aVar17.b.f : null), (String) null, false, (String) null, 60), bVar3.c);
                        } else if (y3Var != null && (bVar2 = y3Var.J) != null) {
                            mp0.a aVar18 = bVar2.b;
                            z5Var = new x5(new com.github.service.models.response.a(aVar18 != null ? aVar18.b.b : "", m7.y.L(aVar18 != null ? aVar18.b.f : null), (String) null, false, (String) null, 60), bVar2.c);
                        } else if (y3Var != null && (cVar = y3Var.L) != null) {
                            z5Var = b4.B(cVar);
                        } else if (y3Var != null && (bVar = y3Var.M) != null) {
                            ss0.a aVar19 = bVar.b;
                            z5Var = new s5(aVar19 != null ? aVar19.a : "", bVar.a);
                        } else if (y3Var == null || (rVar = y3Var.N) == null) {
                            if (y3Var != null && (eVar2 = y3Var.O) != null) {
                                eq0.b bVar26 = eVar2.d.b;
                                TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType = TimelineItem$LinkedItemConnectorType.LINKED;
                                eq0.a aVar20 = eVar2.c;
                                String str15 = aVar20 != null ? aVar20.b.b : null;
                                String str16 = str15 == null ? "" : str15;
                                r01.e eVar6 = IssueState.Companion;
                                String str17 = bVar26 != null ? bVar26.a.r : null;
                                if (str17 == null) {
                                    str17 = "";
                                }
                                eVar6.getClass();
                                IssueState b = r01.e.b(str17);
                                int i2 = bVar26 != null ? bVar26.d : 0;
                                String str18 = bVar26 != null ? bVar26.b : null;
                                String str19 = str18 == null ? "" : str18;
                                String str20 = bVar26 != null ? bVar26.c : null;
                                r6Var = new r6(timelineItem$LinkedItemConnectorType, str16, i2, str19, str20 == null ? "" : str20, eVar2.e, b, b4.k0(bVar26 != null ? bVar26.e : null));
                            } else if (y3Var == null || (eVar = y3Var.P) == null) {
                                if (y3Var != null && (aVar = y3Var.Q) != null) {
                                    z5Var3 = new z5(aVar.b, aVar.d, aVar.e, aVar.c);
                                }
                                z5Var = z5Var3;
                            } else {
                                yq0.b bVar27 = eVar.d.b;
                                TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType2 = TimelineItem$LinkedItemConnectorType.UNLINKED;
                                yq0.a aVar21 = eVar.c;
                                String str21 = aVar21 != null ? aVar21.b.b : null;
                                String str22 = str21 == null ? "" : str21;
                                r01.e eVar7 = IssueState.Companion;
                                String str23 = bVar27 != null ? bVar27.a.r : null;
                                if (str23 == null) {
                                    str23 = "";
                                }
                                eVar7.getClass();
                                IssueState b2 = r01.e.b(str23);
                                int i3 = bVar27 != null ? bVar27.d : 0;
                                String str24 = bVar27 != null ? bVar27.b : null;
                                String str25 = str24 == null ? "" : str24;
                                String str26 = bVar27 != null ? bVar27.c : null;
                                r6Var = new r6(timelineItem$LinkedItemConnectorType2, str22, i3, str25, str26 == null ? "" : str26, eVar.e, b2, b4.k0(bVar27 != null ? bVar27.e : null));
                            }
                            z5Var = r6Var;
                        } else {
                            ss0.q qVar = rVar.b;
                            z5Var = new d7(qVar != null ? qVar.a : "", rVar.c, rVar.a);
                        }
                        z5Var = z5Var2;
                    } else {
                        String str27 = bVar14.d;
                        or0.a aVar22 = bVar14.c;
                        z5Var = new l6(new com.github.service.models.response.a(aVar22 != null ? aVar22.b.b : "", m7.y.L(aVar22 != null ? aVar22.b.f : null), (String) null, false, (String) null, 60), str27, bVar14.e);
                    }
                } else {
                    if (fVar.f != null) {
                        z5Var = b4.t(fVar);
                    }
                    z5Var = z5Var3;
                }
            } else {
                z5Var = b4.i(iVar);
            }
            if (z5Var != null) {
                arrayList.add(z5Var);
            }
        }
        List F0 = x61.m.F0(arrayList);
        xt0.z3 z3Var = a4Var.c;
        return new h01.q(str6, i, F0, z3Var.a, z3Var.b, z3Var.c, z3Var.d);
    }

    public static final wl0.f i0(qg0.a aVar) {
        return new wl0.f(aVar.c, aVar.b, aVar.d);
    }

    public static final t5 j(wd0.c cVar) {
        String str;
        String str2;
        ud0.a aVar;
        k.g(cVar, "<this>");
        wd0.a aVar2 = cVar.c;
        String str3 = "";
        if (aVar2 == null || (aVar = aVar2.b) == null || (str = aVar.b) == null) {
            str = "";
        }
        String str4 = cVar.d;
        wd0.b bVar = cVar.e;
        if (bVar != null && (str2 = bVar.b) != null) {
            str3 = str2;
        }
        return new t5(str, str4, str3, cVar.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j0(d8.m mVar, h1.u uVar, c71.c cVar) {
        k6.w wVar;
        int i;
        try {
            if (cVar instanceof k6.w) {
                wVar = (k6.w) cVar;
                int i2 = wVar.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    wVar.w = i2 - Integer.MIN_VALUE;
                    Object obj = wVar.v;
                    b71.a aVar = b71.a.r;
                    i = wVar.w;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h1.u uVar2 = wVar.u;
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                    wVar.u = uVar;
                    wVar.w = 1;
                    Object k = v71.b0.k(new h1.u(uVar, mVar, (a71.c) null, 5), wVar);
                    return k == aVar ? aVar : k;
                }
            }
            if (i == 0) {
            }
        } catch (TimeoutCancellationException e) {
            if (e.s == uVar.hashCode()) {
                return null;
            }
            throw e;
        }
        wVar = new k6.w(cVar);
        Object obj2 = wVar.v;
        b71.a aVar2 = b71.a.r;
        i = wVar.w;
    }

    public static final u5 k(ae0.c cVar) {
        ud0.a aVar;
        ud0.a aVar2;
        k.g(cVar, "<this>");
        ae0.a aVar3 = cVar.c;
        String str = "";
        ud0.c cVar2 = null;
        com.github.service.models.response.a aVar4 = new com.github.service.models.response.a(aVar3 != null ? aVar3.b.b : "", b41.b.O(aVar3 != null ? aVar3.b.d : null), (String) null, false, (String) null, 60);
        ae0.b bVar = cVar.d;
        if (bVar != null && (aVar2 = bVar.b) != null) {
            str = aVar2.b;
        }
        String str2 = str;
        if (bVar != null && (aVar = bVar.b) != null) {
            cVar2 = aVar.d;
        }
        return new u5(aVar4, new com.github.service.models.response.a(str2, b41.b.O(cVar2), (String) null, false, (String) null, 60), cVar.e);
    }

    public static int k0(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static final b6 l(qe0.m mVar) {
        k.w wVar;
        qe0.f fVar;
        IssueOrPullRequestState issueOrPullRequestState;
        IssueOrPullRequestState issueOrPullRequestState2;
        String str;
        qe0.e eVar;
        k.g(mVar, "<this>");
        String str2 = mVar.b;
        qe0.a aVar = mVar.d;
        com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", b41.b.O(aVar != null ? aVar.b.d : null), (String) null, false, (String) null, 60);
        qe0.d dVar = mVar.f;
        if (dVar != null && (eVar = dVar.b) != null) {
            String str3 = eVar.a;
            qe0.j jVar = eVar.e;
            String str4 = eVar.b;
            String str5 = eVar.c;
            qe0.b bVar = eVar.d;
            wVar = new o5(new Avatar(bVar != null ? bVar.b : "", bVar != null ? bVar.a : ""), str3, str4, str5, !jVar.a.equals(str2) ? String.format("%s/%s", Arrays.copyOf(new Object[]{jVar.c.b, jVar.b}, 2)) : null);
        } else if (dVar == null || (fVar = dVar.c) == null) {
            wVar = null;
        } else {
            qe0.g gVar = mVar.e.b;
            String str6 = gVar != null ? gVar.a.a : null;
            String str7 = fVar.b;
            qe0.k kVar = fVar.d;
            String str8 = kVar.b;
            qe0.h hVar = kVar.d;
            String str9 = hVar.b;
            int i = fVar.a;
            int ordinal = fVar.c.ordinal();
            if (ordinal == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
            } else if (ordinal == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
            } else if (ordinal == 2) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
            } else {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
            boolean z = kVar.c;
            boolean z2 = fVar.e;
            if (kVar.a.equals(str6)) {
                issueOrPullRequestState2 = issueOrPullRequestState;
                str = null;
            } else {
                issueOrPullRequestState2 = issueOrPullRequestState;
                str = String.format("%s/%s", Arrays.copyOf(new Object[]{hVar.b, str8}, 2));
            }
            wVar = new p5(str2, str7, str9, str8, i, issueOrPullRequestState2, z, z2, fVar.f, str);
        }
        return new b6(aVar2, wVar, mVar.g, d0(mVar.c), null, 16);
    }

    public static com.google.android.gms.internal.measurement.n l0(com.google.android.gms.internal.measurement.d dVar, w51.r rVar, ArrayList arrayList, boolean z) {
        com.google.android.gms.internal.measurement.n nVar;
        i21.a.W(1, "reduce", arrayList);
        i21.a.X(2, "reduce", arrayList);
        com.google.android.gms.internal.measurement.n c = ((com.google.android.gms.internal.measurement.t) rVar.t).c(rVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0));
        if (!(c instanceof com.google.android.gms.internal.measurement.h)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            nVar = ((com.google.android.gms.internal.measurement.t) rVar.t).c(rVar, (com.google.android.gms.internal.measurement.n) arrayList.get(1));
            if (nVar instanceof com.google.android.gms.internal.measurement.f) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (dVar.o() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            nVar = null;
        }
        com.google.android.gms.internal.measurement.h hVar = (com.google.android.gms.internal.measurement.h) c;
        int o = dVar.o();
        int i = z ? 0 : o - 1;
        int i2 = z ? o - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (nVar == null) {
            nVar = dVar.p(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (dVar.s(i)) {
                nVar = hVar.c(rVar, Arrays.asList(nVar, dVar.p(i), new com.google.android.gms.internal.measurement.g(Double.valueOf(i)), dVar));
                if (nVar instanceof com.google.android.gms.internal.measurement.f) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return nVar;
    }

    public static final c6 m(ue0.c cVar) {
        k.g(cVar, "<this>");
        ue0.b bVar = cVar.d;
        com.github.service.models.response.a d = aa1.b.d(bVar != null ? bVar.b : null);
        ue0.a aVar = cVar.c;
        return new c6(d, aa1.b.d(aVar != null ? aVar.b : null), cVar.e);
    }

    public static com.google.android.gms.internal.measurement.d m0(com.google.android.gms.internal.measurement.d dVar, w51.r rVar, com.google.android.gms.internal.measurement.m mVar, Boolean bool, Boolean bool2) {
        com.google.android.gms.internal.measurement.d dVar2 = new com.google.android.gms.internal.measurement.d();
        Iterator n = dVar.n();
        while (n.hasNext()) {
            int intValue = ((Integer) n.next()).intValue();
            if (dVar.s(intValue)) {
                com.google.android.gms.internal.measurement.n c = mVar.c(rVar, Arrays.asList(dVar.p(intValue), new com.google.android.gms.internal.measurement.g(Double.valueOf(intValue)), dVar));
                if (c.a().equals(bool)) {
                    break;
                }
                if (bool2 == null || c.a().equals(bool2)) {
                    dVar2.q(intValue, c);
                }
            }
        }
        return dVar2;
    }

    public static final h6 n(ef0.i iVar) {
        ud0.a aVar;
        IssueOrPullRequestState issueOrPullRequestState;
        boolean z;
        String str;
        String str2;
        IssueOrPullRequestState issueOrPullRequestState2;
        CloseReason closeReason;
        boolean z2;
        boolean z3;
        com.github.service.models.response.a aVar2;
        zc zcVar;
        ud0.a aVar3;
        k.g(iVar, "<this>");
        ef0.h hVar = iVar.e;
        ef0.b bVar = hVar.b;
        ef0.c cVar = hVar.c;
        ef0.a aVar4 = iVar.c;
        String str3 = "";
        Boolean bool = null;
        com.github.service.models.response.a aVar5 = new com.github.service.models.response.a(aVar4 != null ? aVar4.b.b : "", b41.b.O(aVar4 != null ? aVar4.b.d : null), (String) null, false, (String) null, 60);
        String str4 = iVar.b;
        boolean z4 = iVar.d;
        int i = bVar != null ? bVar.b : cVar != null ? cVar.b : 0;
        String str5 = bVar != null ? bVar.c : cVar != null ? cVar.c : "";
        String str6 = bVar != null ? bVar.e.b : cVar != null ? cVar.e.b : "";
        String str7 = (cVar == null || (aVar3 = cVar.e.d.b) == null) ? (bVar == null || (aVar = bVar.e.d.b) == null) ? "" : aVar.b : aVar3.b;
        if (cVar != null) {
            str3 = cVar.e.c;
        } else if (bVar != null) {
            str3 = bVar.e.c;
        }
        if (bVar != null) {
            int ordinal = bVar.d.ordinal();
            if (ordinal == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
            } else if (ordinal == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        } else if (cVar != null) {
            int ordinal2 = cVar.d.ordinal();
            if (ordinal2 == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
            } else if (ordinal2 == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
            } else if (ordinal2 == 2) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
            } else {
                if (ordinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        } else {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        CloseReason d0 = (bVar == null || (zcVar = bVar.f) == null) ? null : d0(zcVar);
        if (cVar == null) {
            if (bVar != null) {
                z = bVar.e.e;
            }
            boolean b = k.b(bool, Boolean.TRUE);
            if (cVar == null && cVar.f) {
                str = str3;
                str2 = str7;
                issueOrPullRequestState2 = issueOrPullRequestState;
                closeReason = d0;
                z2 = true;
            } else {
                str = str3;
                str2 = str7;
                issueOrPullRequestState2 = issueOrPullRequestState;
                closeReason = d0;
                z2 = false;
            }
            ZonedDateTime zonedDateTime = iVar.f;
            if (cVar == null && cVar.g) {
                aVar2 = aVar5;
                z3 = true;
            } else {
                z3 = false;
                aVar2 = aVar5;
            }
            return new h6(aVar2, str4, z4, i, str5, str6, str2, str, issueOrPullRequestState2, closeReason, b, z2, z3, zonedDateTime);
        }
        z = cVar.e.e;
        bool = Boolean.valueOf(z);
        boolean b2 = k.b(bool, Boolean.TRUE);
        if (cVar == null) {
        }
        str = str3;
        str2 = str7;
        issueOrPullRequestState2 = issueOrPullRequestState;
        closeReason = d0;
        z2 = false;
        ZonedDateTime zonedDateTime2 = iVar.f;
        if (cVar == null) {
        }
        z3 = false;
        aVar2 = aVar5;
        return new h6(aVar2, str4, z4, i, str5, str6, str2, str, issueOrPullRequestState2, closeReason, b2, z2, z3, zonedDateTime2);
    }

    public static final i6 o(if0.b bVar) {
        k.g(bVar, "<this>");
        if0.a aVar = bVar.c;
        return new i6(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", b41.b.O(aVar != null ? aVar.b.d : null), (String) null, false, (String) null, 60), bVar.d, bVar.e);
    }

    public static final o6 p(og0.a aVar) {
        k.g(aVar, "<this>");
        se0.c cVar = aVar.d;
        String str = aVar.b;
        String str2 = cVar.b;
        wl0.b bVar = new wl0.b(cVar, str, new d0(str2));
        aj0.c cVar2 = aVar.e;
        ArrayList p = aa1.b.p(cVar2, str2);
        boolean z = cVar2.c;
        x2 j = v8.l0.j(aVar.h);
        ZonedDateTime zonedDateTime = cVar.i;
        yh0.a aVar2 = aVar.f;
        return new o6(bVar, p, z, j, zonedDateTime, aVar2.b, aVar2.c);
    }

    public static final q6 q(ug0.c cVar) {
        int i;
        k.g(cVar, "<this>");
        qg0.a aVar = cVar.d.c;
        ug0.a aVar2 = cVar.c;
        com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(aVar2 != null ? aVar2.b.b : "", b41.b.O(aVar2 != null ? aVar2.b.d : null), (String) null, false, (String) null, 60);
        String C = w.C(aVar.c, " ", " ");
        try {
            String str = aVar.d;
            if (!w.F(str, "#", false)) {
                str = "#".concat(str);
            }
            i = Color.parseColor(str);
        } catch (Exception unused) {
            i = -16777216;
        }
        return new q6(aVar3, C, i, cVar.e);
    }

    public static final t6 r(ch0.b bVar) {
        k.g(bVar, "<this>");
        xd xdVar = bVar.d;
        int i = xdVar == null ? -1 : pl0.m.a[xdVar.ordinal()];
        TimelineItem$TimelineLockedEvent$Reason timelineItem$TimelineLockedEvent$Reason = i != 1 ? i != 2 ? i != 3 ? i != 4 ? TimelineItem$TimelineLockedEvent$Reason.UNKNOWN : TimelineItem$TimelineLockedEvent$Reason.RESOLVED : TimelineItem$TimelineLockedEvent$Reason.TOO_HEATED : TimelineItem$TimelineLockedEvent$Reason.SPAM : TimelineItem$TimelineLockedEvent$Reason.OFF_TOPIC;
        ch0.a aVar = bVar.c;
        return new t6(timelineItem$TimelineLockedEvent$Reason, new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", b41.b.O(aVar != null ? aVar.b.d : null), (String) null, false, (String) null, 60), bVar.e);
    }

    public static final u6 s(eh0.e eVar) {
        String str;
        String str2;
        String str3;
        eh0.d dVar;
        IssueOrPullRequestState issueOrPullRequestState;
        eh0.c cVar;
        String str4;
        eh0.c cVar2;
        eh0.c cVar3;
        boolean z;
        int i;
        IssueOrPullRequestState issueOrPullRequestState2;
        String str5;
        boolean z2;
        boolean z3;
        eh0.d dVar2;
        eh0.d dVar3;
        eh0.d dVar4;
        String str6;
        eh0.d dVar5;
        eh0.c cVar4;
        zc zcVar;
        eh0.d dVar6;
        eh0.c cVar5;
        qj0.c cVar6;
        qj0.b bVar;
        qj0.a aVar;
        ud0.a aVar2;
        qj0.c cVar7;
        qj0.b bVar2;
        ud0.a aVar3;
        k.g(eVar, "<this>");
        eh0.b bVar3 = eVar.f;
        String str7 = eVar.b;
        eh0.a aVar4 = eVar.c;
        String str8 = "";
        if (aVar4 == null || (aVar3 = aVar4.b) == null || (str = aVar3.b) == null) {
            str = "";
        }
        if (bVar3 == null || (cVar7 = bVar3.d) == null || (bVar2 = cVar7.b) == null || (str2 = bVar2.c) == null) {
            str2 = "";
        }
        if (bVar3 == null || (cVar6 = bVar3.d) == null || (bVar = cVar6.b) == null || (aVar = bVar.d) == null || (aVar2 = aVar.b) == null || (str3 = aVar2.b) == null) {
            str3 = "";
        }
        int i2 = (bVar3 == null || (cVar5 = bVar3.b) == null) ? (bVar3 == null || (dVar = bVar3.c) == null) ? 0 : dVar.c : cVar5.c;
        CloseReason closeReason = null;
        if (((bVar3 == null || (dVar6 = bVar3.c) == null) ? null : dVar6.e) != null) {
            int ordinal = bVar3.c.e.ordinal();
            if (ordinal == 0) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
            } else if (ordinal == 1) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
            } else if (ordinal == 2) {
                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
            } else {
                if (ordinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        } else {
            if (((bVar3 == null || (cVar = bVar3.b) == null) ? null : cVar.e) != null) {
                int ordinal2 = bVar3.b.e.ordinal();
                if (ordinal2 == 0) {
                    issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
                } else if (ordinal2 == 1) {
                    issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
                } else {
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                }
            } else {
                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
            }
        }
        if (bVar3 != null && (cVar4 = bVar3.b) != null && (zcVar = cVar4.f) != null) {
            closeReason = d0(zcVar);
        }
        if (bVar3 == null || (dVar5 = bVar3.c) == null || (str4 = dVar5.d) == null) {
            str4 = (bVar3 == null || (cVar2 = bVar3.b) == null) ? "" : cVar2.d;
        }
        boolean z4 = eVar.e;
        if (bVar3 != null && (dVar4 = bVar3.c) != null && (str6 = dVar4.b) != null) {
            str8 = str6;
        } else if (bVar3 != null && (cVar3 = bVar3.b) != null) {
            str8 = cVar3.b;
        }
        if (bVar3 == null || (dVar3 = bVar3.c) == null || !dVar3.f) {
            z = false;
            i = i2;
            issueOrPullRequestState2 = issueOrPullRequestState;
            str5 = str4;
            z2 = z4;
            z3 = false;
        } else {
            z = false;
            i = i2;
            issueOrPullRequestState2 = issueOrPullRequestState;
            str5 = str4;
            z2 = z4;
            z3 = true;
        }
        ZonedDateTime zonedDateTime = eVar.d;
        if (bVar3 != null && (dVar2 = bVar3.c) != null && dVar2.g) {
            z = true;
        }
        return new u6(str7, str, str2, str3, i, issueOrPullRequestState2, closeReason, str5, z2, str8, z3, z, zonedDateTime, null);
    }

    public static final w6 t(oh0.b bVar) {
        k.g(bVar, "<this>");
        oh0.a aVar = bVar.c;
        return new w6(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", b41.b.O(aVar != null ? aVar.b.d : null), (String) null, false, (String) null, 60), bVar.d, bVar.e);
    }

    public static final x6 u(uh0.c cVar) {
        String str;
        String str2;
        ud0.a aVar;
        k.g(cVar, "<this>");
        uh0.a aVar2 = cVar.c;
        if (aVar2 == null || (aVar = aVar2.b) == null || (str = aVar.b) == null) {
            str = "";
        }
        String str3 = cVar.e;
        String str4 = cVar.d;
        uh0.b bVar = cVar.f;
        if (bVar == null || (str2 = bVar.b) == null) {
            str2 = "";
        }
        return new x6(str, str3, str4, str2, cVar.g);
    }

    public static final z6 v(ui0.d dVar) {
        String str;
        String str2;
        k.g(dVar, "<this>");
        ui0.b bVar = dVar.c;
        String str3 = bVar.b;
        String str4 = bVar.d;
        ui0.a aVar = bVar.e;
        String str5 = "";
        if (aVar == null || (str = aVar.b) == null) {
            str = "";
        }
        if (aVar != null && (str2 = aVar.a) != null) {
            str5 = str2;
        }
        return new z6(str3, str4, new Avatar(str, str5), bVar.f);
    }

    public static final a7 w(wi0.c cVar) {
        TimelineItem$TimelinePullRequestReview$ReviewState timelineItem$TimelinePullRequestReview$ReviewState;
        k.g(cVar, "<this>");
        String str = cVar.i.a;
        boolean z = cVar.d;
        int i = cVar.g.b;
        se0.c cVar2 = cVar.j;
        String str2 = cVar.e;
        String str3 = cVar2.b;
        wl0.b bVar = new wl0.b(cVar2, str2, new k0(str3));
        aj0.c cVar3 = cVar.k;
        ArrayList p = aa1.b.p(cVar3, str3);
        boolean z2 = cVar3.c;
        int ordinal = cVar.f.ordinal();
        if (ordinal == 0) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.APPROVED;
        } else if (ordinal == 1) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.CHANGES_REQUESTED;
        } else if (ordinal == 2) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.COMMENTED;
        } else if (ordinal == 3) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.DISMISSED;
        } else if (ordinal == 4) {
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.PENDING;
        } else {
            if (ordinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            timelineItem$TimelinePullRequestReview$ReviewState = TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN;
        }
        TimelineItem$TimelinePullRequestReview$ReviewState timelineItem$TimelinePullRequestReview$ReviewState2 = timelineItem$TimelinePullRequestReview$ReviewState;
        ZonedDateTime zonedDateTime = cVar.h;
        yh0.a aVar = cVar.l;
        return new a7(str, z, i, bVar, p, z2, timelineItem$TimelinePullRequestReview$ReviewState2, zonedDateTime, aVar.b, aVar.c);
    }

    public static final c7 x(ej0.f fVar) {
        k.g(fVar, "<this>");
        ej0.a aVar = fVar.d;
        com.github.service.models.response.a aVar2 = new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", b41.b.O(aVar != null ? aVar.b.d : null), (String) null, false, (String) null, 60);
        ej0.b bVar = fVar.f;
        String str = bVar != null ? bVar.d : "";
        String str2 = bVar != null ? bVar.b : "";
        boolean z = fVar.c;
        ej0.c cVar = fVar.e;
        ud0.a aVar3 = cVar.d.b;
        return new c7(aVar2, str, str2, z, aVar3 != null ? aVar3.b : "", cVar.c, cVar.b, cVar.e, fVar.g);
    }

    public static final e7 y(gj0.c cVar) {
        String str;
        String str2;
        ud0.a aVar;
        k.g(cVar, "<this>");
        gj0.a aVar2 = cVar.c;
        String str3 = "";
        if (aVar2 == null || (aVar = aVar2.b) == null || (str = aVar.b) == null) {
            str = "";
        }
        String str4 = cVar.d;
        gj0.b bVar = cVar.e;
        if (bVar != null && (str2 = bVar.b) != null) {
            str3 = str2;
        }
        return new e7(str, str4, str3, cVar.f);
    }

    public static final f7 z(ij0.b bVar) {
        k.g(bVar, "<this>");
        ij0.a aVar = bVar.c;
        return new f7(new com.github.service.models.response.a(aVar != null ? aVar.b.b : "", b41.b.O(aVar != null ? aVar.b.d : null), (String) null, false, (String) null, 60), bVar.d, bVar.e, bVar.f);
    }

    public final ViewPropertyAnimator U(View view, int i) {
        switch (this.a) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
