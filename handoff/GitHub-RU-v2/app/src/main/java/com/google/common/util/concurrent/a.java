package com.google.common.util.concurrent;

import a0.y;
import a6.f;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.f2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.t;
import androidx.datastore.core.CorruptionException;
import bu.g;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.WorkflowState;
import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.home.NavLinkIdentifier;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.type.DiffSide;
import com.github.service.models.response.type.MinimizedStateReason;
import com.github.service.models.response.type.PatchStatus;
import com.github.service.models.response.type.StatusState;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.play_billing.k1;
import f0.p1;
import fw0.z0;
import gn0.xc;
import h0.h1;
import h0.z;
import hc0.pi;
import i6.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jk.d;
import k71.k;
import kc0.j60;
import kc0.k60;
import kc0.m60;
import kc0.n60;
import kc0.o60;
import kc0.p60;
import kc0.q60;
import kc0.s60;
import kotlin.NoWhenBranchMatchedException;
import l01.t0;
import l01.w0;
import l01.x0;
import m0.u;
import m10.ih0;
import m10.xz;
import m10.zc;
import n5.d0;
import oa.j;
import pz0.i90;
import pz0.ko;
import pz0.n30;
import q81.h0;
import sg0.h;
import t71.p;
import tz.u4;
import u10.bl;
import u10.cl;
import u10.dl;
import u10.el;
import u10.fl;
import v8.l0;
import w1.o;
import x01.i;
import x61.l;
import x61.m;
import x61.n;
import x61.r;
import x61.x;
import y41.t1;
import yz0.a0;
import yz0.e8;
import yz0.s;
import yz0.w7;
import yz0.x2;
import z.f1;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public a() {
        new ConcurrentHashMap();
    }

    public static boolean C(byte b) {
        return b > -65;
    }

    public static final ArrayList D(List list, j71.c cVar, j71.c cVar2) {
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (((Boolean) cVar.k(dVar)).booleanValue()) {
                dVar = (d) cVar2.k(dVar);
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    public static final boolean E(j jVar, String str) {
        List r;
        k.g(jVar, "<this>");
        String str2 = jVar.b;
        if (str2 == null || str2.length() == 0) {
            r = l.r(new String[]{"www.github.com", "github.com", "https://api.github.com"});
        } else {
            r = l.r(new String[]{str2, str2.length() != 0 ? xb.a.a(str2) ? String.format("https://api.%s", Arrays.copyOf(new Object[]{str2}, 1)) : String.format("https://%s/api/v3", Arrays.copyOf(new Object[]{str2}, 1)) : "https://api.github.com"});
        }
        return r.contains(str);
    }

    public static final f F(a6.d... dVarArr) {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        if (dVarArr.length <= 0) {
            w61.k[] kVarArr = (w61.k[]) arrayList.toArray(new w61.k[0]);
            return new f(x.v((w61.k[]) Arrays.copyOf(kVarArr, kVarArr.length)));
        }
        a6.d dVar = dVarArr[0];
        throw null;
    }

    public static final String M(List list) {
        k.g(list, "<this>");
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.github.domain.searchandfilter.filters.data.d) it.next()).r(list));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (!p.T((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return m.c0(m.u0(arrayList2), " ", null, null, 0, null, 62);
    }

    public static final void N(View view, s7.d dVar) {
        k.g(view, "<this>");
        view.setTag(2131363511, dVar);
    }

    public static final NavLinkIdentifier O(i90 i90Var) {
        switch (i90Var.ordinal()) {
            case 0:
                return NavLinkIdentifier.DISCUSSIONS;
            case 1:
                return NavLinkIdentifier.ISSUES;
            case 2:
                return NavLinkIdentifier.ORGANIZATIONS;
            case 3:
                return NavLinkIdentifier.PROJECTS;
            case 4:
                return NavLinkIdentifier.PULL_REQUESTS;
            case 5:
                return NavLinkIdentifier.REPOSITORIES;
            case 6:
                return NavLinkIdentifier.STARRED;
            case 7:
                return NavLinkIdentifier.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final zc P(DiffSide diffSide) {
        k.g(diffSide, "<this>");
        int i = dz.c.a[diffSide.ordinal()];
        if (i == 1) {
            return zc.s;
        }
        if (i == 2) {
            return zc.t;
        }
        if (i == 3) {
            return zc.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final xz Q(CommentLevelType commentLevelType) {
        k.g(commentLevelType, "<this>");
        int i = dz.c.b[commentLevelType.ordinal()];
        if (i == 1) {
            return xz.u;
        }
        if (i == 2) {
            return xz.t;
        }
        if (i == 3) {
            return xz.v;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final i01.b R(g gVar) {
        String str = gVar.a;
        com.github.service.models.response.a e = l0.e(gVar.b.b);
        Integer num = gVar.c;
        boolean z = gVar.d;
        boolean z2 = gVar.e;
        int i = gVar.f;
        bu.f fVar = gVar.g;
        return new i01.b(str, e, num, z, z2, i, fVar != null ? m71.a.h0(fVar.c) : null);
    }

    public static final x0 S(tz.c cVar) {
        k.g(cVar, "<this>");
        Iterable<tz.a> iterable = cVar.a;
        if (iterable == null) {
            iterable = r.r;
        }
        ArrayList arrayList = new ArrayList();
        for (tz.a aVar : iterable) {
            w0 S = aVar != null ? i21.a.S(aVar.c) : null;
            if (S != null) {
                arrayList.add(S);
            }
        }
        tz.b bVar = cVar.b;
        return new x0(arrayList, new i(bVar.b, bVar.a, false));
    }

    public static final WorkflowState T(ih0 ih0Var) {
        int ordinal = ih0Var.ordinal();
        if (ordinal == 0) {
            return WorkflowState.ACTIVE;
        }
        if (ordinal == 1) {
            return WorkflowState.DELETED;
        }
        if (ordinal == 2) {
            return WorkflowState.DISABLED_FORK;
        }
        if (ordinal == 3) {
            return WorkflowState.DISABLED_INACTIVITY;
        }
        if (ordinal == 4) {
            return WorkflowState.DISABLED_MANUALLY;
        }
        if (ordinal == 5) {
            return WorkflowState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ProjectFieldType U(ko koVar) {
        switch (koVar == null ? -1 : ix0.a.a[koVar.ordinal()]) {
            case -1:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return ProjectFieldType.UNKNOWN;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return ProjectFieldType.ASSIGNEES;
            case 2:
                return ProjectFieldType.DATE;
            case 3:
                return ProjectFieldType.ITERATION;
            case 4:
                return ProjectFieldType.LABELS;
            case 5:
                return ProjectFieldType.LINKED_PULL_REQUESTS;
            case 6:
                return ProjectFieldType.MILESTONE;
            case 7:
                return ProjectFieldType.NUMBER;
            case 8:
                return ProjectFieldType.REPOSITORY;
            case 9:
                return ProjectFieldType.REVIEWERS;
            case 10:
                return ProjectFieldType.SINGLE_SELECT;
            case 11:
                return ProjectFieldType.TEXT;
            case 12:
                return ProjectFieldType.TITLE;
            case 13:
                return ProjectFieldType.TRACKS;
        }
    }

    public static final PatchStatus V(pi piVar) {
        switch (piVar.ordinal()) {
            case 0:
                return PatchStatus.ADDED;
            case 1:
                return PatchStatus.CHANGED;
            case 2:
                return PatchStatus.COPIED;
            case 3:
                return PatchStatus.DELETED;
            case 4:
                return PatchStatus.MODIFIED;
            case 5:
                return PatchStatus.RENAMED;
            case 6:
                return PatchStatus.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StatusState W(n30 n30Var) {
        k.g(n30Var, "<this>");
        int ordinal = n30Var.ordinal();
        if (ordinal == 0) {
            return StatusState.ERROR;
        }
        if (ordinal == 1) {
            return StatusState.EXPECTED;
        }
        if (ordinal == 2) {
            return StatusState.FAILURE;
        }
        if (ordinal == 3) {
            return StatusState.PENDING;
        }
        if (ordinal == 4) {
            return StatusState.SUCCESS;
        }
        if (ordinal == 5) {
            return StatusState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final i90 X(NavLinkIdentifier navLinkIdentifier) {
        k.g(navLinkIdentifier, "<this>");
        switch (gx0.a.a[navLinkIdentifier.ordinal()]) {
            case 1:
                return i90.t;
            case 2:
                return i90.u;
            case 3:
                return i90.v;
            case 4:
                return i90.w;
            case 5:
                return i90.x;
            case 6:
                return i90.y;
            case 7:
                return i90.z;
            case 8:
                return i90.A;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final w7 Y(m60 m60Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        s bVar;
        ArrayList arrayList;
        boolean z;
        n60 n60Var;
        j60 j60Var;
        n60 n60Var2;
        n60 n60Var3;
        o60 o60Var;
        n60 n60Var4;
        n60 n60Var5;
        n60 n60Var6;
        n60 n60Var7;
        n60 n60Var8;
        k.g(m60Var, "<this>");
        s60 s60Var = m60Var.a;
        String str = "";
        String str2 = (s60Var == null || (n60Var8 = s60Var.b) == null) ? "" : n60Var8.b;
        xc xcVar = (s60Var == null || (n60Var7 = s60Var.b) == null) ? null : n60Var7.d;
        int i = xcVar == null ? -1 : pl0.n.a[xcVar.ordinal()];
        if (i == -1) {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        } else if (i == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
        } else if (i == 2) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        IssueOrPullRequestState issueOrPullRequestState2 = issueOrPullRequestState;
        ArrayList a = a.a.a((s60Var == null || (n60Var6 = s60Var.b) == null) ? null : n60Var6.i);
        List f = f((s60Var == null || (n60Var5 = s60Var.b) == null) ? null : n60Var5.j);
        List list = (s60Var == null || (n60Var4 = s60Var.b) == null) ? null : n60Var4.g.a;
        if (list == null) {
            list = r.r;
        }
        ArrayList S = m.S(list);
        ArrayList arrayList2 = new ArrayList(n.F(S, 10));
        int size = S.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = S.get(i2);
            i2++;
            p60 p60Var = (p60) obj;
            q60 q60Var = p60Var.b;
            k60 k60Var = p60Var.a;
            String str3 = str;
            arrayList2.add(new xz0.f(new SimpleLegacyProject(q60Var.b, q60Var.a, t1.R(q60Var.c), k60Var != null ? k60Var.a : null), k60Var != null ? k60Var.a : null));
            str = str3;
        }
        String str4 = str;
        wl0.g j = m71.a.j((s60Var == null || (n60Var3 = s60Var.b) == null || (o60Var = n60Var3.f) == null) ? null : o60Var.c);
        se0.c cVar = (s60Var == null || (n60Var2 = s60Var.b) == null) ? null : n60Var2.k;
        if (cVar == null) {
            s.Companion.getClass();
            bVar = yz0.r.b;
        } else {
            se0.c a2 = se0.c.a(cVar, s60Var.b.e, null, 4031);
            n60 n60Var9 = s60Var.b;
            bVar = new wl0.b(a2, n60Var9.c, new a0(n60Var9.b));
        }
        com.github.service.models.response.a aVar = new com.github.service.models.response.a((s60Var == null || (j60Var = s60Var.a) == null) ? str4 : j60Var.b, (Avatar) null, (String) null, false, (String) null, 62);
        ArrayList arrayList3 = new ArrayList();
        if (s60Var == null || (n60Var = s60Var.b) == null || !n60Var.h) {
            arrayList = a;
            z = false;
        } else {
            z = true;
            arrayList = a;
        }
        return new w7(str2, issueOrPullRequestState2, arrayList, f, arrayList2, j, bVar, aVar, arrayList3, z);
    }

    public static final e8 Z(z0 z0Var) {
        return new e8(z0Var.e.a, z0Var.a, z0Var.b, z0Var.f);
    }

    public static final void a(z5.n nVar, int i, int i2, r1.d dVar, androidx.compose.runtime.s sVar, int i3, int i4) {
        z5.n nVar2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        r1.d dVar2;
        z5.n nVar3;
        sVar.e0(-474572032);
        int i10 = i4 & 1;
        if (i10 != 0) {
            i5 = i3 | 6;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            i5 = i3 | (sVar.f(nVar2) ? 4 : 2);
        }
        int i12 = i4 & 2;
        if (i12 != 0) {
            i7 = i5 | 48;
            i6 = i;
        } else {
            i6 = i;
            i7 = i5 | (sVar.d(i6) ? 32 : 16);
        }
        int i13 = i4 & 4;
        if (i13 != 0) {
            i9 = i7 | 384;
            i8 = i2;
        } else {
            i8 = i2;
            i9 = i7 | (sVar.d(i8) ? 256 : 128);
        }
        if ((i9 & 1171) == 1170 && sVar.C()) {
            sVar.V();
            dVar2 = dVar;
            nVar3 = nVar2;
        } else {
            z5.n nVar4 = i10 != 0 ? z5.l.a : nVar2;
            if (i12 != 0) {
                i6 = 0;
            }
            if (i13 != 0) {
                i8 = 0;
            }
            sVar.d0(1849434622);
            Object N = sVar.N();
            if (N == androidx.compose.runtime.n.a) {
                N = i6.f.z;
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
            t.I(sVar, new he.c(14), nVar4);
            t.I(sVar, new he.c(15), new i6.a(i8));
            t.I(sVar, new he.c(16), new i6.b(i6));
            dVar2 = dVar;
            dVar2.f(i6.g.a, sVar, 54);
            sVar.q(true);
            sVar.q(false);
            sVar.q(false);
            nVar3 = nVar4;
        }
        int i14 = i6;
        int i15 = i8;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new e(nVar3, i14, i15, dVar2, i3, i4, 0);
        }
    }

    public static int a0(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0176, code lost:
    
        if (r8 == androidx.compose.runtime.n.a) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, m0.s sVar, d2 d2Var, androidx.compose.foundation.layout.k kVar, w1.d dVar, h1 h1Var, boolean z, f0.j jVar, j71.c cVar, androidx.compose.runtime.s sVar2, int i, int i2) {
        w1.r rVar2;
        int i3;
        m0.s sVar3;
        d2 d2Var2;
        androidx.compose.foundation.layout.k kVar2;
        int i4;
        w1.d dVar2;
        h1 h1Var2;
        int i5;
        f0.j jVar2;
        w1.r rVar3;
        m0.s sVar4;
        d2 d2Var3;
        androidx.compose.foundation.layout.k kVar3;
        w1.d dVar3;
        h1 h1Var3;
        boolean z2;
        b2 t;
        w1.r rVar4;
        d2 d2Var4;
        int i6;
        f0.j a;
        d2 d2Var5;
        boolean z3;
        Object obj;
        int i7;
        int i8;
        int i9;
        sVar2.e0(53695811);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar2.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                sVar3 = sVar;
                if (sVar2.f(sVar3)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                sVar3 = sVar;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            sVar3 = sVar;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            d2Var2 = d2Var;
            i3 |= sVar2.f(d2Var2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= sVar2.g(false) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    kVar2 = kVar;
                    if (sVar2.f(kVar2)) {
                        i8 = 16384;
                        i3 |= i8;
                    }
                } else {
                    kVar2 = kVar;
                }
                i8 = 8192;
                i3 |= i8;
            } else {
                kVar2 = kVar;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                dVar2 = dVar;
                i3 |= sVar2.f(dVar2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        h1Var2 = h1Var;
                        if (sVar2.f(h1Var2)) {
                            i7 = 1048576;
                            i3 |= i7;
                        }
                    } else {
                        h1Var2 = h1Var;
                    }
                    i7 = 524288;
                    i3 |= i7;
                } else {
                    h1Var2 = h1Var;
                }
                i5 = 12582912 | i3;
                if ((100663296 & i) == 0) {
                    i5 = 46137344 | i3;
                }
                if ((805306368 & i) == 0) {
                    i5 |= sVar2.h(cVar) ? 536870912 : 268435456;
                }
                if (sVar2.S(i5 & 1, (306783379 & i5) != 306783378)) {
                    sVar2.X();
                    if ((i & 1) == 0 || sVar2.A()) {
                        rVar4 = i10 != 0 ? o.a : rVar2;
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                            sVar3 = u.a(0, 3, sVar2);
                        }
                        if (i12 != 0) {
                            float f = 0;
                            d2Var4 = new f2(f, f, f, f);
                        } else {
                            d2Var4 = d2Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                            kVar2 = androidx.compose.foundation.layout.l.c;
                        }
                        if (i4 != 0) {
                            dVar2 = w1.c.D;
                        }
                        if ((i2 & 64) != 0) {
                            y a2 = f1.a(sVar2);
                            boolean f2 = sVar2.f(a2);
                            Object N = sVar2.N();
                            if (!f2) {
                                obj = N;
                            }
                            Object zVar = new z(a2);
                            sVar2.n0(zVar);
                            obj = zVar;
                            i5 &= -3670017;
                            h1Var2 = (z) obj;
                        }
                        i6 = i5 & (-234881025);
                        a = p1.a(sVar2);
                        d2Var5 = d2Var4;
                        z3 = true;
                    } else {
                        sVar2.V();
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        z3 = z;
                        i6 = i5 & (-234881025);
                        rVar4 = rVar2;
                        d2Var5 = d2Var2;
                        a = jVar;
                    }
                    androidx.compose.foundation.layout.k kVar4 = kVar2;
                    w1.d dVar4 = dVar2;
                    sVar2.r();
                    int i13 = i6 >> 3;
                    w1.r rVar5 = rVar4;
                    m0.s sVar5 = sVar3;
                    h1 h1Var4 = h1Var2;
                    i21.a.c(rVar5, sVar5, d2Var5, true, h1Var4, z3, a, dVar4, kVar4, null, null, cVar, sVar2, ((i6 << 12) & 1879048192) | (i6 & 14) | 24576 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (458752 & i13) | (i13 & 3670016), ((i6 >> 12) & 14) | ((i6 >> 18) & 7168), 6400);
                    f0.j jVar3 = a;
                    h1Var3 = h1Var4;
                    kVar3 = kVar4;
                    jVar2 = jVar3;
                    z2 = z3;
                    dVar3 = dVar4;
                    d2Var3 = d2Var5;
                    sVar4 = sVar5;
                    rVar3 = rVar5;
                } else {
                    sVar2.V();
                    jVar2 = jVar;
                    rVar3 = rVar2;
                    sVar4 = sVar3;
                    d2Var3 = d2Var2;
                    kVar3 = kVar2;
                    dVar3 = dVar2;
                    h1Var3 = h1Var2;
                    z2 = z;
                }
                t = sVar2.t();
                if (t != null) {
                    t.d = new com.github.rudroid.fileeditor.commitbox.c(rVar3, sVar4, d2Var3, kVar3, dVar3, h1Var3, z2, jVar2, cVar, i, i2, 3);
                    return;
                }
                return;
            }
            dVar2 = dVar;
            if ((1572864 & i) == 0) {
            }
            i5 = 12582912 | i3;
            if ((100663296 & i) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if (sVar2.S(i5 & 1, (306783379 & i5) != 306783378)) {
            }
            t = sVar2.t();
            if (t != null) {
            }
        }
        d2Var2 = d2Var;
        if ((i2 & 8) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        dVar2 = dVar;
        if ((1572864 & i) == 0) {
        }
        i5 = 12582912 | i3;
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if (sVar2.S(i5 & 1, (306783379 & i5) != 306783378)) {
        }
        t = sVar2.t();
        if (t != null) {
        }
    }

    public static String b0(k1 k1Var) {
        StringBuilder sb = new StringBuilder(k1Var.e());
        for (int i = 0; i < k1Var.e(); i++) {
            byte a = k1Var.a(i);
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

    /* JADX WARN: Code restructure failed: missing block: B:91:0x014e, code lost:
    
        if (r7 == androidx.compose.runtime.n.a) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(w1.r rVar, m0.s sVar, d2 d2Var, androidx.compose.foundation.layout.i iVar, w1.i iVar2, h1 h1Var, boolean z, f0.j jVar, j71.c cVar, androidx.compose.runtime.s sVar2, int i, int i2) {
        int i3;
        m0.s sVar3;
        d2 d2Var2;
        androidx.compose.foundation.layout.i iVar3;
        int i4;
        w1.i iVar4;
        h1 h1Var2;
        int i5;
        boolean z2;
        m0.s sVar4;
        d2 d2Var3;
        androidx.compose.foundation.layout.i iVar5;
        w1.i iVar6;
        h1 h1Var3;
        f0.j jVar2;
        b2 t;
        m0.s sVar5;
        d2 d2Var4;
        int i6;
        androidx.compose.foundation.layout.i iVar7;
        boolean z3;
        f0.j a;
        Object obj;
        int i7;
        int i8;
        int i9;
        sVar2.e0(-1884325601);
        if ((i & 6) == 0) {
            i3 = (sVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                sVar3 = sVar;
                if (sVar2.f(sVar3)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                sVar3 = sVar;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            sVar3 = sVar;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            d2Var2 = d2Var;
            i3 |= sVar2.f(d2Var2) ? 256 : 128;
            int i12 = i3 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    iVar3 = iVar;
                    if (sVar2.f(iVar3)) {
                        i8 = 16384;
                        i12 |= i8;
                    }
                } else {
                    iVar3 = iVar;
                }
                i8 = 8192;
                i12 |= i8;
            } else {
                iVar3 = iVar;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i12 |= 196608;
            } else if ((196608 & i) == 0) {
                iVar4 = iVar2;
                i12 |= sVar2.f(iVar4) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        h1Var2 = h1Var;
                        if (sVar2.f(h1Var2)) {
                            i7 = 1048576;
                            i12 |= i7;
                        }
                    } else {
                        h1Var2 = h1Var;
                    }
                    i7 = 524288;
                    i12 |= i7;
                } else {
                    h1Var2 = h1Var;
                }
                i5 = 12582912 | i12;
                if ((100663296 & i) == 0) {
                    i5 = 46137344 | i12;
                }
                if ((805306368 & i) == 0) {
                    i5 |= sVar2.h(cVar) ? 536870912 : 268435456;
                }
                if (sVar2.S(i5 & 1, (306783379 & i5) != 306783378)) {
                    sVar2.X();
                    if ((i & 1) == 0 || sVar2.A()) {
                        if ((i2 & 2) != 0) {
                            sVar5 = u.a(0, 3, sVar2);
                            i5 &= -113;
                        } else {
                            sVar5 = sVar3;
                        }
                        if (i10 != 0) {
                            float f = 0;
                            d2Var4 = new f2(f, f, f, f);
                        } else {
                            d2Var4 = d2Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                            iVar3 = androidx.compose.foundation.layout.l.a;
                        }
                        if (i4 != 0) {
                            iVar4 = w1.c.A;
                        }
                        if ((i2 & 64) != 0) {
                            y a2 = f1.a(sVar2);
                            boolean f2 = sVar2.f(a2);
                            Object N = sVar2.N();
                            if (!f2) {
                                obj = N;
                            }
                            Object zVar = new z(a2);
                            sVar2.n0(zVar);
                            obj = zVar;
                            i5 &= -3670017;
                            h1Var2 = (z) obj;
                        }
                        i6 = i5 & (-234881025);
                        iVar7 = iVar3;
                        z3 = true;
                        a = p1.a(sVar2);
                    } else {
                        sVar2.V();
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        i6 = i5 & (-234881025);
                        sVar5 = sVar3;
                        d2Var4 = d2Var2;
                        iVar7 = iVar3;
                        z3 = z;
                        a = jVar;
                    }
                    h1 h1Var4 = h1Var2;
                    w1.i iVar8 = iVar4;
                    sVar2.r();
                    int i13 = i6 >> 3;
                    m0.s sVar6 = sVar5;
                    d2 d2Var5 = d2Var4;
                    i21.a.c(rVar, sVar6, d2Var5, false, h1Var4, z3, a, null, null, iVar8, iVar7, cVar, sVar2, (i13 & 3670016) | (i6 & 14) | 24576 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (458752 & i13), ((i6 >> 12) & 112) | ((i6 >> 6) & 896) | ((i6 >> 18) & 7168), 1792);
                    d2Var3 = d2Var5;
                    z2 = z3;
                    jVar2 = a;
                    iVar6 = iVar8;
                    sVar4 = sVar6;
                    h1Var3 = h1Var4;
                    iVar5 = iVar7;
                } else {
                    sVar2.V();
                    z2 = z;
                    sVar4 = sVar3;
                    d2Var3 = d2Var2;
                    iVar5 = iVar3;
                    iVar6 = iVar4;
                    h1Var3 = h1Var2;
                    jVar2 = jVar;
                }
                t = sVar2.t();
                if (t != null) {
                    t.d = new com.github.rudroid.fileeditor.commitbox.c(rVar, sVar4, d2Var3, iVar5, iVar6, h1Var3, z2, jVar2, cVar, i, i2, 2);
                    return;
                }
                return;
            }
            iVar4 = iVar2;
            if ((1572864 & i) == 0) {
            }
            i5 = 12582912 | i12;
            if ((100663296 & i) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if (sVar2.S(i5 & 1, (306783379 & i5) != 306783378)) {
            }
            t = sVar2.t();
            if (t != null) {
            }
        }
        d2Var2 = d2Var;
        int i122 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        iVar4 = iVar2;
        if ((1572864 & i) == 0) {
        }
        i5 = 12582912 | i122;
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if (sVar2.S(i5 & 1, (306783379 & i5) != 306783378)) {
        }
        t = sVar2.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(File file, j71.c cVar, c71.c cVar2) {
        d0 d0Var;
        int i;
        try {
            if (cVar2 instanceof d0) {
                d0Var = (d0) cVar2;
                int i2 = d0Var.w;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    d0Var.w = i2 - Integer.MIN_VALUE;
                    Object obj = d0Var.v;
                    Object obj2 = b71.a.r;
                    i = d0Var.w;
                    if (i == 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        File file2 = d0Var.u;
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                    d0Var.u = file;
                    d0Var.w = 1;
                    Object k = cVar.k(d0Var);
                    return k == obj2 ? obj2 : k;
                }
            }
            if (i == 0) {
            }
        } catch (IOException e) {
            if (e instanceof CorruptionException) {
                throw e;
            }
            k.g(file, "file");
            if (!file.exists()) {
                throw b31.b.I(file, e);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw b31.b.I(file, e);
                    }
                    throw b31.b.I(file, e);
                }
                if (file.canWrite()) {
                    throw b31.b.I(file, e);
                }
                throw b31.b.I(file, e);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw b31.b.I(file, e);
                }
                throw b31.b.I(file, e);
            }
            if (file.canWrite()) {
                throw b31.b.I(file, e);
            }
            throw b31.b.I(file, e);
        }
        d0Var = new d0(cVar2);
        Object obj3 = d0Var.v;
        Object obj22 = b71.a.r;
        i = d0Var.w;
    }

    public static final fl.b e(ApiFailure apiFailure, j jVar) {
        fl.c cVar;
        k.g(apiFailure, "<this>");
        k.g(jVar, "user");
        ApiFailureType apiFailureType = apiFailure.r;
        k.g(apiFailureType, "<this>");
        switch (fl.d.a[apiFailureType.ordinal()]) {
            case 1:
                cVar = fl.c.r;
                break;
            case 2:
                cVar = fl.c.s;
                break;
            case 3:
                cVar = fl.c.t;
                break;
            case 4:
                cVar = fl.c.u;
                break;
            case 5:
                cVar = fl.c.v;
                break;
            case 6:
                cVar = fl.c.w;
                break;
            case 7:
                cVar = fl.c.x;
                break;
            case 8:
                cVar = fl.c.z;
                break;
            case 9:
                cVar = fl.c.B;
                break;
            case 10:
                cVar = fl.c.D;
                break;
            case 11:
                cVar = fl.c.E;
                break;
            case 12:
                cVar = fl.c.F;
                break;
            case 13:
                cVar = fl.c.G;
                break;
            case 14:
                cVar = fl.c.y;
                break;
            case 15:
                cVar = fl.c.H;
                break;
            case 16:
                cVar = fl.c.A;
                break;
            case 17:
                cVar = fl.c.I;
                break;
            case 18:
                cVar = fl.c.u;
                break;
            case 19:
                cVar = fl.c.J;
                break;
            case 20:
                cVar = fl.c.K;
                break;
            case 21:
                cVar = fl.c.L;
                break;
            case 22:
                cVar = fl.c.C;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new fl.b(cVar, apiFailure.s, apiFailure.u, apiFailure.w, jVar, apiFailure, 64);
    }

    public static final List f(sg0.j jVar) {
        ArrayList arrayList;
        sg0.g gVar;
        sg0.a aVar;
        List list;
        sg0.i iVar;
        sg0.b bVar;
        List list2;
        h hVar;
        sg0.c cVar;
        List list3;
        int i = 0;
        if (jVar != null && (hVar = jVar.b) != null && (cVar = hVar.b) != null && (list3 = cVar.b) != null) {
            ArrayList S = m.S(list3);
            ArrayList arrayList2 = new ArrayList(n.F(S, 10));
            int size = S.size();
            while (i < size) {
                Object obj = S.get(i);
                i++;
                arrayList2.add(b31.b.i0(((sg0.f) obj).c));
            }
            return arrayList2;
        }
        if (jVar != null && (iVar = jVar.d) != null && (bVar = iVar.b) != null && (list2 = bVar.b) != null) {
            ArrayList S2 = m.S(list2);
            ArrayList arrayList3 = new ArrayList(n.F(S2, 10));
            int size2 = S2.size();
            while (i < size2) {
                Object obj2 = S2.get(i);
                i++;
                arrayList3.add(b31.b.i0(((sg0.e) obj2).c));
            }
            return arrayList3;
        }
        if (jVar == null || (gVar = jVar.c) == null || (aVar = gVar.b) == null || (list = aVar.b) == null) {
            arrayList = null;
        } else {
            ArrayList S3 = m.S(list);
            arrayList = new ArrayList(n.F(S3, 10));
            int size3 = S3.size();
            while (i < size3) {
                Object obj3 = S3.get(i);
                i++;
                arrayList.add(b31.b.i0(((sg0.d) obj3).c));
            }
        }
        return arrayList == null ? r.r : arrayList;
    }

    public static final x2 g(at0.a aVar) {
        k.g(aVar, "<this>");
        boolean z = aVar.b;
        boolean z2 = aVar.d;
        r01.h hVar = MinimizedStateReason.Companion;
        String str = aVar.c;
        hVar.getClass();
        return new x2(z, z, z2, r01.h.a(str));
    }

    public static final l01.s h(dw.z0 z0Var) {
        return new l01.s(i(z0Var.d), j(z0Var.b.c));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static final l01.p0 i(f00.g1 r33) {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.a.i(f00.g1):l01.p0");
    }

    public static final t0 j(u4 u4Var) {
        return new t0(u4Var.b, u4Var.c, u4Var.d, u4Var.e, u4Var.f, i4.Q(u4Var.k.a.b), u4Var.h, u4Var.g, u4Var.j, u4Var.i);
    }

    public static final e50.p o(bl blVar) {
        fl flVar;
        cl clVar;
        dl dlVar;
        el elVar = blVar.a;
        if (elVar == null || (flVar = elVar.a) == null || (clVar = flVar.a) == null || (dlVar = clVar.c) == null) {
            return null;
        }
        return dlVar.b;
    }

    public static final boolean p(List list, List list2) {
        k.g(list, "<this>");
        k.g(list2, "that");
        return k.b(p.t0(M(list)).toString(), p.t0(M(list2)).toString());
    }

    public static a r(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new b4.i(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            b4.c cVar = new b4.c();
            cVar.a = d;
            cVar.b = dArr3;
            return cVar;
        }
        b4.h hVar = new b4.h();
        int length = dArr2[0].length;
        hVar.c = new double[length];
        hVar.a = dArr;
        hVar.b = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return hVar;
    }

    public static final s7.d s(View view) {
        k.g(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(2131363511);
            s7.d dVar = tag instanceof s7.d ? (s7.d) tag : null;
            if (dVar != null) {
                return dVar;
            }
            Object r = k21.f.r(view);
            view = r instanceof View ? (View) r : null;
        }
        return null;
    }

    public static Application t(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static final String u(j jVar) {
        String str = jVar != null ? jVar.b : null;
        return (str == null || str.length() == 0) ? "www.github.com" : str;
    }

    public static final String v(j jVar) {
        String str = jVar != null ? jVar.b : null;
        return (str == null || str.length() == 0) ? "github.com" : str;
    }

    public static final String w(j jVar) {
        String str = jVar != null ? jVar.b : null;
        return (str == null || str.length() == 0) ? "https://api.github.com/graphql" : xb.a.a(str) ? String.format("https://api.%s/graphql", Arrays.copyOf(new Object[]{str}, 1)) : String.format("https://%s/api/graphql", Arrays.copyOf(new Object[]{str}, 1));
    }

    public abstract void A(double d, double[] dArr);

    public abstract double[] B();

    public abstract void G(g91.f fVar, int i, String str);

    public abstract void H(h0 h0Var, int i, String str);

    public abstract void I(g91.f fVar, Exception exc, q81.a0 a0Var);

    public abstract void J(h0 h0Var, h91.k kVar);

    public abstract void K(h0 h0Var, String str);

    public abstract void L(h0 h0Var, q81.a0 a0Var);

    public abstract Typeface k(Context context, q4.e eVar, Resources resources, int i);

    public abstract Typeface l(Context context, x4.h[] hVarArr, int i);

    public Typeface m(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface n(Context context, Resources resources, int i, String str, int i2) {
        File t = i21.a.t(context);
        if (t == null) {
            return null;
        }
        try {
            if (i21.a.m(t, resources, i)) {
                return Typeface.createFromFile(t.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            t.delete();
        }
    }

    public x4.h q(x4.h[] hVarArr, int i) {
        new k50.c(8);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        x4.h hVar = null;
        int i3 = Integer.MAX_VALUE;
        for (x4.h hVar2 : hVarArr) {
            int abs = (Math.abs(hVar2.c - i2) * 2) + (hVar2.d == z ? 0 : 1);
            if (hVar == null || i3 > abs) {
                hVar = hVar2;
                i3 = abs;
            }
        }
        return hVar;
    }

    public abstract double x(double d);

    public abstract void y(double d, double[] dArr);

    public abstract void z(double d, float[] fArr);
}
