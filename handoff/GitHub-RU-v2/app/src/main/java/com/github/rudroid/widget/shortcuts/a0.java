package com.github.rudroid.widget.shortcuts;

import android.content.Context;
import androidx.compose.runtime.b2;
import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.activities.DeepLinkActivity;
import com.github.rudroid.shortcuts.activities.ShortcutViewActivity;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.type.IssueState;
import yz0.j3;
import yz0.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[PullRequestState.values().length];
            try {
                iArr[PullRequestState.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullRequestState.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PullRequestState.MERGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PullRequestState.UNKNOWN__.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[IssueState.values().length];
            try {
                iArr2[IssueState.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IssueState.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IssueState.UNKNOWN__.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
            int[] iArr3 = new int[ShortcutColor.values().length];
            try {
                iArr3[ShortcutColor.GRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ShortcutColor.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ShortcutColor.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ShortcutColor.ORANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ShortcutColor.RED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ShortcutColor.PINK.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ShortcutColor.PURPLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            c = iArr3;
        }
    }

    public static final void a(z5.n nVar, StoredShortcutModel storedShortcutModel, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.e0(1372826323);
        int i2 = i | 6 | (sVar.h(storedShortcutModel) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) sVar.j(z5.g.b);
            m6.e a2 = m6.e.a(com.github.rudroid.widget.o.a(sVar), com.github.rudroid.widget.k.j, new s3.o(ih.d.f(sVar).u.a.b), (m6.b) null, new m6.c(4), 108);
            z5.n nVar2 = z5.l.a;
            z5.n t = k41.b.t(nVar2);
            ShortcutViewActivity.a aVar = ShortcutViewActivity.Companion;
            String str = storedShortcutModel.r;
            aVar.getClass();
            sVar2 = sVar;
            k21.f.a(i21.a.C(b31.b.L(t, c6.f.a(ShortcutViewActivity.a.a(context, str))), ih.a.l), 1, 1, r1.i.d(-1739042505, new w(2, a2), sVar), sVar2, 3072, 0);
            nVar = nVar2;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t2 = sVar2.t();
        if (t2 != null) {
            t2.d = new v(nVar, storedShortcutModel, i, 1);
        }
    }

    public static final void b(z5.n nVar, StoredShortcutModel storedShortcutModel, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.e0(582665680);
        int i2 = i | 6 | (sVar.h(storedShortcutModel) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) sVar.j(z5.g.b);
            m6.e a2 = m6.e.a(com.github.rudroid.widget.o.a(sVar), com.github.rudroid.widget.k.j, new s3.o(ih.d.f(sVar).u.a.b), (m6.b) null, new m6.c(4), 108);
            z5.n nVar2 = z5.l.a;
            z5.n t = k41.b.t(nVar2);
            ShortcutViewActivity.a aVar = ShortcutViewActivity.Companion;
            String str = storedShortcutModel.r;
            aVar.getClass();
            sVar2 = sVar;
            k21.f.a(i21.a.C(b31.b.L(t, c6.f.a(ShortcutViewActivity.a.a(context, str))), ih.a.l), 0, 1, r1.i.d(1037204972, new com.github.rudroid.settings.codeoptions.g(8, storedShortcutModel, a2), sVar), sVar2, 3072, 2);
            nVar = nVar2;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t2 = sVar2.t();
        if (t2 != null) {
            t2.d = new v(nVar, storedShortcutModel, i, 0);
        }
    }

    public static final void c(z5.n nVar, y1 y1Var, oa.j jVar, androidx.compose.runtime.s sVar, int i) {
        z5.n nVar2;
        sVar.e0(-1408516915);
        int i2 = i | 6 | (sVar.h(y1Var) ? 32 : 16) | (sVar.h(jVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) sVar.j(z5.g.b);
            m6.e a2 = m6.e.a(com.github.rudroid.widget.o.a(sVar), (n6.a) null, (s3.o) null, (m6.b) null, new m6.c(4), 111);
            m6.e a3 = m6.e.a(com.github.rudroid.widget.o.a(sVar), com.github.rudroid.widget.k.j, new s3.o(ih.d.f(sVar).u.a.b), (m6.b) null, new m6.c(4), 108);
            z5.n nVar3 = z5.l.a;
            z5.n t = k41.b.t(nVar3);
            DeepLinkActivity.a aVar = DeepLinkActivity.Companion;
            String str = jVar.c;
            String str2 = y1Var.k;
            aVar.getClass();
            k21.f.a(i21.a.C(b31.b.L(t, c6.f.a(DeepLinkActivity.a.a(context, str2, "", str))), ih.a.l), 0, 1, r1.i.d(1677744689, new x(y1Var, a3, a2, 0), sVar), sVar, 3072, 2);
            nVar2 = nVar3;
        } else {
            sVar.V();
            nVar2 = nVar;
        }
        b2 t2 = sVar.t();
        if (t2 != null) {
            t2.d = new com.github.rudroid.profile.status.ui.x(nVar2, y1Var, jVar, i, 25);
        }
    }

    public static final void d(z5.n nVar, j3 j3Var, oa.j jVar, androidx.compose.runtime.s sVar, int i) {
        z5.n nVar2;
        sVar.e0(1746141997);
        int i2 = i | 6 | (sVar.h(j3Var) ? 32 : 16) | (sVar.h(jVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) sVar.j(z5.g.b);
            m6.e a2 = m6.e.a(com.github.rudroid.widget.o.a(sVar), (n6.a) null, (s3.o) null, (m6.b) null, new m6.c(4), 111);
            m6.e a3 = m6.e.a(com.github.rudroid.widget.o.a(sVar), com.github.rudroid.widget.k.j, new s3.o(ih.d.f(sVar).u.a.b), (m6.b) null, new m6.c(4), 108);
            z5.n nVar3 = z5.l.a;
            z5.n t = k41.b.t(nVar3);
            DeepLinkActivity.a aVar = DeepLinkActivity.Companion;
            String str = jVar.c;
            String str2 = j3Var.k;
            aVar.getClass();
            k21.f.a(i21.a.C(b31.b.L(t, c6.f.a(DeepLinkActivity.a.a(context, str2, "", str))), ih.a.l), 0, 1, r1.i.d(1479781009, new u(j3Var, a3, a2, 0), sVar), sVar, 3072, 2);
            nVar2 = nVar3;
        } else {
            sVar.V();
            nVar2 = nVar;
        }
        b2 t2 = sVar.t();
        if (t2 != null) {
            t2.d = new com.github.rudroid.profile.status.ui.x(nVar2, j3Var, jVar, i, 24);
        }
    }

    public static final void e(z5.n nVar, com.github.rudroid.widget.shortcuts.model.h hVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        k71.k.g(hVar, "model");
        sVar.e0(685744900);
        int i2 = i | 6 | (sVar.h(hVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            float f = hVar.d;
            Context context = (Context) sVar.j(z5.g.b);
            boolean h = sVar.h(context);
            Object N = sVar.N();
            if (h || N == androidx.compose.runtime.n.a) {
                N = new com.github.rudroid.views.m(context, 2);
                sVar.n0(N);
            }
            a6.e e = i21.a.e((j71.a) N, sVar);
            z5.n nVar2 = z5.l.a;
            z5.n d = k41.b.t(nVar2).d(new i6.m(n6.d.a)).d(b6.b.a);
            h6.a aVar = com.github.rudroid.widget.k.a;
            sVar2 = sVar;
            com.google.common.util.concurrent.a.a(i21.a.C(b31.b.L(com.github.rudroid.widget.c.a(d.d(new z5.c(new h6.a(d2.t.b(f, jh.c.a), d2.t.b(f, jh.b.a))))), e), ih.a.l).d(nVar2), 0, 0, r1.i.d(-830647430, new w(1, hVar), sVar), sVar2, 3072, 6);
            nVar = nVar2;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.settings.copilot.debug.q(nVar, hVar, i, 17);
        }
    }






}
