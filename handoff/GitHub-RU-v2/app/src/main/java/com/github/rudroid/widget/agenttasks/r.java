package com.github.rudroid.widget.agenttasks;

import android.content.Context;
import androidx.compose.runtime.b2;
import com.github.rudroid.activities.DeepLinkActivity;
import com.github.rudroid.issueorpullrequest.mergebox.ui.e0;
import com.github.service.models.response.PullRequestState;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

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
        }
    }

    public static final void a(z5.n nVar, com.github.rudroid.widget.agenttasks.model.a aVar, oa.j jVar, androidx.compose.runtime.s sVar, int i) {
        z5.n nVar2;
        sVar.e0(-1003938102);
        int i2 = i | 6 | (sVar.f(aVar) ? 32 : 16) | (sVar.h(jVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) sVar.j(z5.g.b);
            m6.e a2 = m6.e.a(com.github.rudroid.widget.o.a(sVar), (n6.a) null, (s3.o) null, (m6.b) null, new m6.c(4), 111);
            m6.e a3 = m6.e.a(com.github.rudroid.widget.o.a(sVar), com.github.rudroid.widget.k.j, new s3.o(ih.d.f(sVar).u.a.b), (m6.b) null, new m6.c(4), 108);
            nVar2 = z5.l.a;
            z5.n t = k41.b.t(nVar2);
            DeepLinkActivity.a aVar2 = DeepLinkActivity.Companion;
            String str = jVar.c;
            String str2 = aVar.g;
            aVar2.getClass();
            k21.f.a(i21.a.C(b31.b.L(t, c6.f.a(DeepLinkActivity.a.a(context, str2, "", str))), ih.a.l), 0, 1, r1.i.d(-549398810, new o(aVar, a3, a2, 0), sVar), sVar, 3072, 2);
        } else {
            sVar.V();
            nVar2 = nVar;
        }
        b2 t2 = sVar.t();
        if (t2 != null) {
            t2.d = new com.github.rudroid.widget.agenttasks.a(nVar2, aVar, jVar, i);
        }
    }

    public static final void b(z5.n nVar, com.github.rudroid.widget.agenttasks.model.b bVar, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        k71.k.g(bVar, "model");
        sVar.e0(-236158045);
        int i2 = i | 6 | (sVar.h(bVar) ? 32 : 16);
        if (sVar.S(i2 & 1, (i2 & 19) != 18)) {
            z5.n C = i21.a.C(com.github.rudroid.widget.j.a(sVar), ih.a.l);
            z5.n nVar2 = z5.l.a;
            sVar2 = sVar;
            b31.b.a(C.d(nVar2), i6.c.c, r1.i.d(754237189, new e0(13, bVar), sVar), sVar2, 384, 0);
            nVar = nVar2;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new com.github.rudroid.settings.copilot.debug.q(nVar, bVar, i, 16);
        }
    }
}
